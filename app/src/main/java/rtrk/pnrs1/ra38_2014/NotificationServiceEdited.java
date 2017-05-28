package rtrk.pnrs1.ra38_2014;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.RemoteException;

/**
 * Created by Radenko on 21/05/2017.
 */

public class NotificationServiceEdited extends AidlInterface.Stub {
    private NotificationManager mNotificationManager;
    private Notification.Builder mBuilder;
    private Context mContext;

    NotificationServiceEdited(Context context){
        mContext = context;
		mNotificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
		mBuilder = new Notification.Builder(mContext)
                .setContentTitle(mContext.getString(R.string.notificationTitle2))
                .setSmallIcon(R.drawable.reminder);
    }

    @Override
    public void notifyEdit() throws RemoteException {
        mNotificationManager = (NotificationManager)mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        mBuilder = new Notification.Builder(mContext)
                .setContentTitle("Task alert")
                .setContentText("Task edited!");
                mNotificationManager.notify(1, mBuilder.build());
    }

    @Override
    public void notifyAdd() throws RemoteException {
        mNotificationManager = (NotificationManager)mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        mBuilder = new Notification.Builder(mContext)
                .setContentTitle("Task alert")
                .setContentText("Task added!");
        mNotificationManager.notify(1, mBuilder.build());
    }

    @Override
    public void notifyDelete() throws RemoteException {
        mNotificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        mBuilder = new Notification.Builder(mContext)
                .setContentTitle("Task alert")
                .setContentText("Task deleted!");
        mNotificationManager.notify(1, mBuilder.build());
    }
}
