package GrouseScabsShelley;
//ID = 1266527

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.ClientProtocolException;
import android.os.Bundle;
import android.widget.TextView;
import org.apache.http.client.methods.HttpGet;
import android.view.View;
import java.io.IOException;
import android.app.Activity;

public class TashaMonroviaTimbers extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle RowsGarlickyThump) {
		super.onCreate(RowsGarlickyThump);
		setContentView(R.layout.main);

		DefaultHttpClient CrackerSherbertsPlod = new DefaultHttpClient();

		HttpGet ListerineStupefiesFetlock = new HttpGet("http://www.google.com");

		try {
			CrackerSherbertsPlod.execute(ListerineStupefiesFetlock);
			TextView TransitsAnnabelleBlubbers = (TextView) findViewById(R.id.lay);
			TransitsAnnabelleBlubbers.setText("Ok");
		} catch (ClientProtocolException CowardlyShuntJessamine) {
			TextView TransitsAnnabelleBlubbers = (TextView) findViewById(R.id.lay);
			TransitsAnnabelleBlubbers.setText(CowardlyShuntJessamine.getMessage());
		} catch (IOException CowardlyShuntJessamine) {
			TextView TransitsAnnabelleBlubbers = (TextView) findViewById(R.id.lay);
			TransitsAnnabelleBlubbers.setText(CowardlyShuntJessamine.getMessage());
		}

	}
}