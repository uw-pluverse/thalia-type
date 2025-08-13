package androidExamples;
//ID = 724419
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import gen.R;
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
