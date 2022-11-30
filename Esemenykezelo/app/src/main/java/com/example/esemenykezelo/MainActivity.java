package com.example.esemenykezelo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private int currentYear = 0;
    private int currentMonth = 0;
    private int currentDay = 0;
    private int daysIndex = 0;
    private int monthIndex = 0;
    private int yearIndex = 0;
    EditText chooseTime;
    TimePickerDialog timePickerDialog;
    Calendar calendar;
    int currentHour;
    int currentMinute;
    String amPm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView calendarView = findViewById(R.id.calendarView);

        final List<String> calanderStrings = new ArrayList<>();
        final List<String> calendarDates = new ArrayList<>();
        final int[] days = new int[30];
        final int[] months = new int[12];
        final int[] years = new int[10];

        final EditText textInput = findViewById(R.id.textInput);
        final EditText dateInput = findViewById(R.id.dateInput);
        final View dayContent = findViewById(R.id.dayContent);
        chooseTime = findViewById(R.id.dateInput);
        chooseTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                currentMinute = calendar.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        if(hourOfDay>=12)
                        {
                            amPm = "PM";
                        }
                        else
                        {
                            amPm = "AM";
                        }
                        chooseTime.setText(String.format("%02d:%02d",hourOfDay,minute)+amPm);
                    }
                }, currentHour, currentMinute, false);
                timePickerDialog.show();
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
        {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth)
            {
                currentYear = year;
                currentMonth = month;
                currentDay = dayOfMonth;
                if(dayContent.getVisibility() == View.GONE){
                    dayContent.setVisibility(View.VISIBLE);
                }
                for(int i = 0; i < 30; i++)
                {
                    if(currentDay==days[i])
                    {
                        for (int j = 0; j < 12; j++)
                        {
                            if (currentMonth==months[j])
                            {
                                textInput.setText(calanderStrings.get(i));
                                dateInput.setText(calendarDates.get(i));
                                return;
                            }
                        }
                    }
                }
                textInput.setText("");
                dateInput.setText("");
            }
        });

        final Button saveTextButton = findViewById(R.id.saveTextButton);
        saveTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                days[daysIndex] = currentDay;
                months[monthIndex] = currentMonth;
                years[yearIndex] = currentYear;
                calanderStrings.add(daysIndex, textInput.getText().toString());
                calendarDates.add(daysIndex, dateInput.getText().toString());
                //(Esemeny[])calanderStrings.stream().filter(e -> e.nap == daysIndex).toArray();
                daysIndex++;
                monthIndex++;
                yearIndex++;
                textInput.setText("");
                dateInput.setText("");
            }
        });
        final Button deleteEventButton = findViewById(R.id.deleteEventButton);
        deleteEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //days[daysIndex] = currentDay;
                //months[monthIndex] = currentMonth;
                //years[yearIndex] = currentYear;
                calanderStrings.remove(textInput.getText().toString());;
                calendarDates.remove(dateInput.getText().toString());
                //daysIndex--;
                //monthIndex--;
                //yearIndex--;
                dateInput.setText("");
                textInput.setText("");
            }
        });

    }

    public void OpenAddEventActivity()
    {
        Intent intent = new Intent(this, AddEventActivity.class);
        startActivity(intent);
    }
}