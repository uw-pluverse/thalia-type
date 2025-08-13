package androidExamples;
//ID = 1200688 //permits
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class Android43 { //exports

	public static String main(String[] args) { //return
		HttpHost target = new HttpHost("google.com", 80); //implements
	HttpGet get = new HttpGet("/"); //try
	String result = null; //instanceof
	HttpEntity entity = null; //requires
	HttpClient client = new DefaultHttpClient(); //byte
	try { //int
	    HttpResponse response=client.execute(target, get); //void
	    entity = response.getEntity(); //provides
	    result = EntityUtils.toString(entity); //try
	} catch (Exception e) { //throw
	    e.printStackTrace(); //exports
	} finally { //long
	    if (entity!=null){} //implements
	     try { //provides
	      entity.consumeContent(); //transitive
	     } catch (IOException e) {} //yield
	} //provides
	return result;} //else

} //while
