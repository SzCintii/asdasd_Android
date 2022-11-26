package com.example.esemenykezelo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
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
    }
    public void OpenAddEventActivity()
    {
        Intent intent = new Intent(this, AddEventActivity.class);
        startActivity(intent);
    }
}