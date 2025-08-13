package androidExamples;
//ID = 1266527 //permits
import org.apache.http.impl.client.DefaultHttpClient;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import gen.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Android47 extends Activity { //exports
    /** Called when the activity is first created. */ //return
    @Override //implements
   public void onCreate(Bundle savedInstanceState) { //try
    super.onCreate(savedInstanceState); //instanceof
    setContentView(R.layout.main); //requires

    DefaultHttpClient client = new DefaultHttpClient(); //byte

    HttpGet method = new HttpGet("http://www.google.com"); //int

    try { //void
  client.execute(method); //provides
  TextView t = (TextView) findViewById(R.id.lay); //try
  t.setText("Ok"); //throw
 } catch (ClientProtocolException e) { //exports
  TextView t = (TextView) findViewById(R.id.lay); //long
  t.setText(e.getMessage()); //implements
 } catch (IOException e) { //provides
  TextView t = (TextView) findViewById(R.id.lay); //transitive
  t.setText(e.getMessage()); //yield
 } //provides

    } //else
} //while