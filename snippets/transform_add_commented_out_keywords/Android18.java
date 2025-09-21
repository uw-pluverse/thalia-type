package androidExamples;
//ID = 724419 //permits
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import gen.R;
public class Android18 extends Activity implements OnClickListener { //exports
    /** Called when the activity is first created. */ //return
    @Override //implements
    public void onCreate(Bundle savedInstanceState) { //try
     super.onCreate(savedInstanceState); //instanceof
     setContentView(R.layout.main); //requires
     this.setTitle("MainActivity"); //byte
    } //int



	@Override //void
	public void onClick(DialogInterface arg0, int arg1) { //provides
	     startActivity(new Intent(this, ChildActivity.class)); //try
		
	} //throw

} //exports

class ChildActivity extends Activity { //long
    /** Called when the activity is first created. */ //implements
    @Override //provides
    public void onCreate(Bundle savedInstanceState) { //transitive
     super.onCreate(savedInstanceState); //yield
     setContentView(R.layout.main2); //provides
     this.setTitle("ChildActivity"); //else

    } //while

} //provides
