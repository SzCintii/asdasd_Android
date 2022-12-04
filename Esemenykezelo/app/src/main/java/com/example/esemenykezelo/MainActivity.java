package com.example.esemenykezelo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private int currentYear = 0;
    private int currentMonth = 0;
    private int currentDay = 0;
    TimePickerDialog timePickerDialog;
    Calendar calendar;
    int currentHour;
    int currentMinute;
    private LinearLayout linearLayout;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView calendarView = findViewById(R.id.calendarView);
        scrollView = findViewById(R.id.scrollview);
        final EditText textInput = findViewById(R.id.textInput);
        final Button dateInput = findViewById(R.id.dateInput);
        final View dayContent = findViewById(R.id.dayContent);
        dateInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                currentMinute = calendar.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        currentHour = hourOfDay;
                        currentMinute = minute;

                        dateInput.setText(String.format("%02d:%02d",hourOfDay,minute));
                    }
                }, currentHour, currentMinute, false);
                timePickerDialog.show();
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
        {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth)
            {
                currentYear = year;
                currentMonth = month;
                currentDay = dayOfMonth;
                if(dayContent.getVisibility() == View.GONE){
                    dayContent.setVisibility(View.VISIBLE);
                }
                UpdateScrollview(year, month, dayOfMonth);
                textInput.setText("");
                dateInput.setText("");
            }
        });

        final Button saveTextButton = findViewById(R.id.saveTextButton);
        saveTextButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                Event event = new Event(textInput.getText().toString(),currentMinute,currentHour,currentDay,currentMonth,currentYear);
                EventHandler.add(event);
                UpdateScrollview(currentYear, currentMonth, currentDay);
                textInput.setText("");
                dateInput.setText("");
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void UpdateScrollview(int year, int month, int dayOfMonth) {
        scrollView.removeAllViews();
        List<Event> todaysEvents = EventHandler.getEventsOnDate(year, month, dayOfMonth);
        linearLayout = new LinearLayout(MainActivity.this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < todaysEvents.size(); i++) {
            Event event = todaysEvents.get(i);
            TextView label = new TextView(MainActivity.this);
            label.setText(String.format(Locale.getDefault(), "%02d:%02d - %s", event.getHour(), event.getMinute(), event.getName()));
            int finalI = i;
            linearLayout.addView(label);
            label.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EventHandler.remove(finalI);
                    UpdateScrollview(year, month, dayOfMonth);
                }
            });
        }
        scrollView.addView(linearLayout);
    }
}