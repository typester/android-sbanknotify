package org.unknownplace.sbanknotify;

import android.app.Service;
import android.content.Intent;
import android.util.Log;
import android.os.IBinder;
import android.os.Vibrator;

public class SBankService extends Service {
    @Override
    public void onStart(Intent intent, int startId) {
        Vibrator v = (Vibrator)this.getSystemService(VIBRATOR_SERVICE);
        long[] pattern = { 0, 1000, 200, 1000, 200, 1000 };
        v.vibrate(pattern, -1);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
