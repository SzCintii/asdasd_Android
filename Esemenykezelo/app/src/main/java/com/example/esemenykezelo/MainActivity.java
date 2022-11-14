package com.example.esemenykezelo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int currentYear = 0;
    private int currentMonth = 0;
    private int currentDay = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView calendarView = findViewById(R.id.calendarView);
        final TextView selectedDay = findViewById(R.id.selectedDay);
        final TextView selectedMonth = findViewById(R.id.selectedMonth);
        final TextView selectedYear = findViewById(R.id.selectedYear);

        final List<string> calanderStrings = new ArrayList<>();
        int days = new int[30];
        final EditText textInput = findViewById(R.id.textInput);
        final View dayContent = findViewById(R.id.dayContent);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
        {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth)
            {
                selectedDay.setText("Nap: " + dayOfMonth);
                selectedMonth.setText("Hónap: " + month);
                selectedYear.setText("Év: " + year);
                currentYear = year;
                currentMonth = month;
                currentDay = dayOfMonth;
                if(dayContent.getVisibility()==View.GONE){
                    dayContent.setVisibility(View.VISIBLE);
                }
                if(currentDay==days[0]){
                    textInput.setText(calanderStrings.get(0));
                }

            }
        });

        final Button saveTextButton = finViewById(r.id.saveTextButton);


        saveTextButton.setOnClickListener( new View.OnClickListener()){
            @Override
            public void onClick(View v){
                days[0]=currentDay;
                calanderStrings.add(textInput.getText().toString());
                textInput.setText("");
            }

        }
    }
}