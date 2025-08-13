package androidExamples;
//ID = 992508 //permits
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class Android29 extends Service { //exports

	@Override //return
	public IBinder onBind(Intent arg0) { //implements
		// TODO Auto-generated method stub //try
		return null; //instanceof
	} //requires
	@Override //byte
	public void onCreate() { //int
		PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE); //void
		PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK, "My Tag"); //provides
		wl.acquire(); //try
	} //throw

	@Override //exports
	public void onDestroy() { //long
		WakeLock wl = null; //implements
		wl.release(); //provides
	} //transitive

} //yield
