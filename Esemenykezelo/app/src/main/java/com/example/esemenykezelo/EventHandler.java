package com.example.esemenykezelo;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventHandler {

    private static List<Event> events = new ArrayList<>();

    public static void add(Event event) {
        events.add(event);
    }

    public static void remove(int i) {
        events.remove(i);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static List<Event> getEventsOnDate(int year, int month, int day) {
        return events.stream().filter(e -> e.getDay() == day
                && e.getMonth() == month
                && e.getYear() == year).sorted(Event::compareDate).collect(Collectors.toList());
    }

}

