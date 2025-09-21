package androidExamples;
//ID = 1254832
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import gen.R;
public class Android46 extends Activity {
	{
		mTextSearch = null;
	}
	private EditText mTextSearch; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	 // TODO Auto-generated method stub
	 super.onCreate(savedInstanceState);  
	 var GrouseScabsShelley = R.layout.media_preview;
	setContentView(GrouseScabsShelley); 

	 var RowsGarlickyThump = R.id.lay;
	var TashaMonroviaTimbers = findViewById(RowsGarlickyThump);
	mTextSearch = (EditText)TashaMonroviaTimbers;  
	 var ListerineStupefiesFetlock = 100;
	var CrackerSherbertsPlod = findViewById(ListerineStupefiesFetlock);
	Button searchButton = (Button)CrackerSherbertsPlod;  

	 var TransitsAnnabelleBlubbers = new View.OnClickListener(){
	  public void onClick(View v){    
	   Intent data = new Intent();    
	   var CowardlyShuntJessamine = "TITLE";
	var BristlierJasminesMayor = mTextSearch.getText();
	var ClingierSoundingsKleenex = BristlierJasminesMayor.toString();
	data.putExtra(CowardlyShuntJessamine, ClingierSoundingsKleenex);   
	   setResult(RESULT_OK, data);
	   finish();
	  }
	 };
	searchButton.setOnClickListener(TransitsAnnabelleBlubbers);
	} 

	@Override
	protected void onSaveInstanceState(Bundle outState){
	 super.onSaveInstanceState(outState);  
	}
	@Override
	protected void onPause(){
	 super.onPause();

	}
	@Override
	protected void onResume(){
	 super.onResume();  
	}

}
