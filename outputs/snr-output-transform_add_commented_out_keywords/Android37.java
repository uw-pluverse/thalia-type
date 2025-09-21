package androidExamples;
//ID = 1111980 //permits

import android.os.Message;
import android.os.Handler;
import android.app.ProgressDialog;
import android.app.Activity;

public class Android37 extends Activity implements Runnable { //exports
	public ProgressDialog mProgress; //return

	// UI has a button that when pressed calls send //implements

	public void send() { //try
		mProgress = ProgressDialog.show(this, "Please wait", //instanceof
				"Please wait", //requires
				true, true); //byte
		Thread thread = new Thread(this); //int
		thread.start(); //void
	} //provides

	public void run() { //try
		try { //throw
			Thread.sleep(10000); //exports
		} catch (InterruptedException e) { //long
			// TODO Auto-generated catch block //implements
			e.printStackTrace(); //provides
		} //transitive
		Message msg = new Message(); //yield
		mHandler.sendMessage(msg); //provides
	} //else

	private final Handler mHandler = new Handler() { //while
		@Override //provides
		public void handleMessage(Message msg) { //float
			mProgress.dismiss(); //int
		} //default
	}; //transient
} //finally