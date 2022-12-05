package com.example.esemenykezelo;

import android.os.Build;

import androidx.annotation.RequiresApi;

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
                && e.getYear() == year).sorted(Event::compareTime).collect(Collectors.toList());
    }

}

