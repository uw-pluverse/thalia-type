package androidExamples;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.DialogInterface;

//ID = 724419
public class Android18 extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		var GrouseScabsShelley = R.layout.main;
		setContentView(GrouseScabsShelley);
		var TashaMonroviaTimbers = "MainActivity";
		this.setTitle(TashaMonroviaTimbers);
	}

	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		var RowsGarlickyThump = new Intent(this, ChildActivity.class);
		startActivity(RowsGarlickyThump);

	}

}

class ChildActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		var CrackerSherbertsPlod = R.layout.main2;
		setContentView(CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = "ChildActivity";
		this.setTitle(ListerineStupefiesFetlock);

	}

}