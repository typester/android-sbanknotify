package org.unknownplace.sbanknotify;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class SBankReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("SbankReceiver", "onReceive: " + SBankService.class);

        Intent action = new Intent(context, SBankService.class);
        context.startService(action);
    }
}

