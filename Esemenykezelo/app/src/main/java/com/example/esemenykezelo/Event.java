package com.example.esemenykezelo;



public class Event {
    private final String name;
    private final int day, month, year, hour, minute;

    public Event(String name, int minute, int hour, int day, int month, int year) {
        this.name = name;
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    /**
     * Taken from LocalDate::compare
     */
    public int compareDate(Event other) {
        int cmp = (year - other.year);
        if (cmp == 0) {
            cmp = (month - other.month);
            if (cmp == 0) {
                cmp = (day - other.day);
            }
        }
        return cmp;
    }

}
