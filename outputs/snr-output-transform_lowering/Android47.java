package androidExamples;
//ID = 1266527

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.ClientProtocolException;
import android.os.Bundle;
import android.widget.TextView;
import org.apache.http.client.methods.HttpGet;
import android.view.View;
import java.io.IOException;
import android.app.Activity;

public class Android47 extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		var GrouseScabsShelley = R.layout.main;
		setContentView(GrouseScabsShelley);

		DefaultHttpClient client = new DefaultHttpClient();

		var TashaMonroviaTimbers = "http://www.google.com";
		HttpGet method = new HttpGet(TashaMonroviaTimbers);

		try {
			client.execute(method);
			var CrackerSherbertsPlod = R.id.lay;
			var RowsGarlickyThump = findViewById(CrackerSherbertsPlod);
			TextView t = (TextView) RowsGarlickyThump;
			var ListerineStupefiesFetlock = "Ok";
			t.setText(ListerineStupefiesFetlock);
		} catch (ClientProtocolException e) {
			var CowardlyShuntJessamine = R.id.lay;
			var TransitsAnnabelleBlubbers = findViewById(CowardlyShuntJessamine);
			TextView t = (TextView) TransitsAnnabelleBlubbers;
			var ClingierSoundingsKleenex = e.getMessage();
			t.setText(ClingierSoundingsKleenex);
		} catch (IOException e) {
			var CreightonDiggerLohengrin = R.id.lay;
			var BristlierJasminesMayor = findViewById(CreightonDiggerLohengrin);
			TextView t = (TextView) BristlierJasminesMayor;
			var RefundTalkativeBlotchier = e.getMessage();
			t.setText(RefundTalkativeBlotchier);
		}

	}
}