package rtrk.pnrs1.ra38_2014;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Radenko on 21/05/2017.
 */

public class NotificationService extends Service {

	private NotificationServiceEdited mNotificationServiceEdited;
	private NotificationThread mNotificationThread;

    @Override
    public void onCreate() {
		mNotificationServiceEdited = new NotificationServiceEdited(this);
		mNotificationThread = new NotificationThread(this);
		mNotificationThread.start();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
		mNotificationThread.exit();
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mNotificationServiceEdited;
    }
}


