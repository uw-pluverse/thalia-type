package GrouseScabsShelley;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.DialogInterface;

//ID = 724419
public class TashaMonroviaTimbers extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle RowsGarlickyThump) {
		super.onCreate(RowsGarlickyThump);
		setContentView(R.layout.main);
		this.setTitle("MainActivity");
	}

	@Override
	public void onClick(DialogInterface CrackerSherbertsPlod, int ListerineStupefiesFetlock) {
		startActivity(new Intent(this, TransitsAnnabelleBlubbers.class));

	}

}

class TransitsAnnabelleBlubbers extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle RowsGarlickyThump) {
		super.onCreate(RowsGarlickyThump);
		setContentView(R.layout.main2);
		this.setTitle("ChildActivity");

	}

}