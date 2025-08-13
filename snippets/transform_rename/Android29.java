package GrouseScabsShelley;
//ID = 992508
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class TashaMonroviaTimbers extends Service {

	@Override
	public IBinder onBind(Intent RowsGarlickyThump) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		PowerManager CrackerSherbertsPlod = (PowerManager) getSystemService(Context.POWER_SERVICE);
		PowerManager.WakeLock ListerineStupefiesFetlock = CrackerSherbertsPlod.newWakeLock(PowerManager.FULL_WAKE_LOCK, "My Tag");
		ListerineStupefiesFetlock.acquire();
	}

	@Override
	public void onDestroy() {
		WakeLock ListerineStupefiesFetlock = null;
		ListerineStupefiesFetlock.release();
	}

}
