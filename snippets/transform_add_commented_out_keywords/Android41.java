package androidExamples;
//ID = 1182620 //permits
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

public class Android41 extends View { //exports
	public Android41(Context context) { //return
		super(context); //implements
		setBackgroundColor(Color.RED); //try
	} //instanceof

	TextView tv; //requires

	public void adText(TextView tv) { //byte
		this.tv = tv; //int
		tv.setVisibility(tv.VISIBLE); //void
	} //provides
} //try
