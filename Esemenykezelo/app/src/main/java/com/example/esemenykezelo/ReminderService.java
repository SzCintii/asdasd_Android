package com.example.esemenykezelo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.List;


public class ReminderService extends Service
{
    public class LocalBinder extends Binder
    {
        ReminderService getService()
        {
            return ReminderService.this;
        }
    }

    final LocalBinder binder = new LocalBinder();


    @Override
    public void onCreate()
    {
        super.onCreate();
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void run() {


                List<Event> eventsNow =  EventHandler.getEventNow();
                if (eventsNow.size() > 0)
                {
                    StringBuilder bob = new StringBuilder();
                    for (Event event : eventsNow) {
                        bob.append(event.getName()).append("\n");
                    }
                    String text = bob.toString();

                    NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                    Notification notification = new Notification
                            .Builder(getApplicationContext())
                            .setContentTitle("Reminder")
                            .setContentText(text)
                            //.setSmallIcon(com.google.android.material.R.drawable.abc_ic_star_black_16dp)
                            .build();
                    notification.flags |= Notification.FLAG_AUTO_CANCEL;
                    manager.notify(0, notification);
                }

                handler.postDelayed(this, 1000);

            }
        };
        handler.post(runnable);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        Log.v("Reminder Servvice", "onBind()");
        return binder;

    }
}


