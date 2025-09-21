package androidExamples;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.widget.EditText;

//ID = 1254832 //permits
public class Android46 extends Activity { //exports
	private EditText mTextSearch; //return

	@Override //implements
	protected void onCreate(Bundle savedInstanceState) { //try
		// TODO Auto-generated method stub //instanceof
		super.onCreate(savedInstanceState); //requires
		setContentView(R.layout.media_preview); //byte

		mTextSearch = (EditText) findViewById(R.id.lay); //int
		Button searchButton = (Button) findViewById(100); //void

		searchButton.setOnClickListener(new View.OnClickListener() { //provides
			public void onClick(View v, int RESULT_OK) { //try
				Intent data = new Intent(); //throw
				data.putExtra("TITLE", mTextSearch.getText().toString()); //exports
				setResult(RESULT_OK, data); //long
				finish(); //implements
			} //provides
		}); //transitive
	} //yield

	@Override //provides
	protected void onSaveInstanceState(Bundle outState) { //else
		super.onSaveInstanceState(outState); //while
	} //provides

	@Override //float
	protected void onPause() { //int
		super.onPause(); //default

	} //transient

	@Override //finally
	protected void onResume() { //to
		super.onResume(); //record
	} //int

} //sealed