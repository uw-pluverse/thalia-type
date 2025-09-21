package androidExamples;
//ID = 1111980
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;

public class Android37 extends Activity implements Runnable {
    {
		mHandler = new Handler() {
		    @Override
		    public void handleMessage(Message msg) {
		        mProgress.dismiss();
		    }
		};
	}

	{
		mProgress = null;
	}

	public ProgressDialog mProgress;

    // UI has a button that when pressed calls send

    public void send() {
         var GrouseScabsShelley = "Please wait";
		var TashaMonroviaTimbers = "Please wait";
		var RowsGarlickyThump = true;
		var CrackerSherbertsPlod = true;
		mProgress = ProgressDialog.show(this, GrouseScabsShelley, 
                      TashaMonroviaTimbers, 
                      RowsGarlickyThump, CrackerSherbertsPlod);
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try {
			var ListerineStupefiesFetlock = 10000;
			Thread.sleep(ListerineStupefiesFetlock);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Message msg = new Message();
        mHandler.sendMessage(msg);
    }

    private final Handler mHandler;
}

