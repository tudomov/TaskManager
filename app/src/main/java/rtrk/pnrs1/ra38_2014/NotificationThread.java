package rtrk.pnrs1.ra38_2014;

/**
 * Created by Radenko on 21/05/2017.
 */

public class NotificationThread extends Thread {
	
	private boolean mRun;
    private long PERIOD = 5000;
	private SimpleDateFormat format;
	private Context mContext;
    private NotificationManager mNotificationManager;
    private Notification.Builder mBuilder;

	
	
	
	
    @Override
    public synchronized void start() {
        super.start();
    }

    public synchronized void exit(){

    }

    @Override
    public void run() {
        super.run();
    }
}
