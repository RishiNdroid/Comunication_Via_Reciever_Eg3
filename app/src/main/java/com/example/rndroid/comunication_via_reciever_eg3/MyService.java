package com.example.rndroid.comunication_via_reciever_eg3;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle bundle = intent.getExtras();
        String s = bundle.getString("name");
        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();

        // trigger or start broadcast reciever -- use intent & sendbroadcast
        Intent intent1 = new Intent();
        intent1.setAction("WORK_DONE");
        sendBroadcast(intent1);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
