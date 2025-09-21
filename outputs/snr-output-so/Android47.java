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
		setContentView(R.layout.main);

		DefaultHttpClient client = new DefaultHttpClient();

		HttpGet method = new HttpGet("http://www.google.com");

		try {
			client.execute(method);
			TextView t = (TextView) findViewById(R.id.lay);
			t.setText("Ok");
		} catch (ClientProtocolException e) {
			TextView t = (TextView) findViewById(R.id.lay);
			t.setText(e.getMessage());
		} catch (IOException e) {
			TextView t = (TextView) findViewById(R.id.lay);
			t.setText(e.getMessage());
		}

	}
}