package com.example.esemenykezelo;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static List<Event> getEventNow()
    {
        LocalDateTime now = LocalDateTime.now();
        Log.i("NOW", "" + now.getHour());
        return events.stream().filter(e ->e.getMinute() == now.getMinute()
                && e.getHour()== now.getHour()
                && e.getDay() == now.getDayOfMonth()
                && e.getMonth() == now.getMonthValue()
                && e.getYear() == now.getYear()).collect(Collectors.toList());

    }

}

