package GrouseScabsShelley;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.widget.EditText;

//ID = 1254832
public class TashaMonroviaTimbers extends Activity {
	private EditText RowsGarlickyThump;

	@Override
	protected void onCreate(Bundle CrackerSherbertsPlod) {
		// TODO Auto-generated method stub
		super.onCreate(CrackerSherbertsPlod);
		setContentView(R.layout.media_preview);

		RowsGarlickyThump = (EditText) findViewById(R.id.lay);
		Button ListerineStupefiesFetlock = (Button) findViewById(100);

		ListerineStupefiesFetlock.setOnClickListener(new View.OnClickListener() {
			public void BristlierJasminesMayor(View TransitsAnnabelleBlubbers, int RESULT_OK) {
				Intent CowardlyShuntJessamine = new Intent();
				CowardlyShuntJessamine.putExtra("TITLE", RowsGarlickyThump.getText().toString());
				setResult(RESULT_OK, CowardlyShuntJessamine);
				finish();
			}
		});
	}

	@Override
	protected void onSaveInstanceState(Bundle ClingierSoundingsKleenex) {
		super.onSaveInstanceState(ClingierSoundingsKleenex);
	}

	@Override
	protected void onPause() {
		super.onPause();

	}

	@Override
	protected void onResume() {
		super.onResume();
	}

}