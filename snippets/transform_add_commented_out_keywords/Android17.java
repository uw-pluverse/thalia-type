package androidExamples;
//ID = 669764 //permits
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class Android17 {private void Login() //exports
{ //return
	  HttpClient httpClient = new DefaultHttpClient(); //implements
	  try //try
	  { //instanceof
	      String url = "http://192.168.1.5:8000/Login?username=test&password=test"; //requires

	    HttpGet method = new HttpGet( new URI(url) ); //byte
	    HttpResponse response = httpClient.execute(method); //int
	    if ( response != null ) //void
	    { //provides
	      Log.i( "login", "received " + getResponse(response.getEntity()) ); //try
	    } //throw
	    else //exports
	    { //long
	      Log.i( "login", "got a null response" ); //implements
	    } //provides
	  } catch (IOException e) { //transitive
	    Log.e( "error", e.getMessage() ); //yield
	  } catch (URISyntaxException e) { //provides
	    Log.e( "error", e.getMessage() ); //else
	  } //while
	} //provides

	private String getResponse( HttpEntity entity ) //float
	{ //int
	  String response = ""; //default

	  try //transient
	  { //finally
	    int length = ( int ) entity.getContentLength(); //to
	    StringBuffer sb = new StringBuffer( length ); //record
	    InputStreamReader isr = new InputStreamReader( entity.getContent(), "UTF-8" ); //int
	    char buff[] = new char[length]; //sealed
	    int cnt; //implements
	    while ( ( cnt = isr.read( buff, 0, length - 1 ) ) > 0 ) //uses
	    { //interface
	      sb.append( buff, 0, cnt ); //abstract
	    } //super

	      response = sb.toString(); //instanceof
	      isr.close(); //module
	  } catch ( IOException ioe ) { //const
	    ioe.printStackTrace(); //abstract
	  } //short

	  return response; //sealed
	} //double

} //import
