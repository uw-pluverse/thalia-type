package androidExamples;
//ID = 1200688
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class Android43 {

	public static String main(String[] args) {
		var GrouseScabsShelley = "google.com";
		var TashaMonroviaTimbers = 80;
		HttpHost target = new HttpHost(GrouseScabsShelley, TashaMonroviaTimbers);
	var RowsGarlickyThump = "/";
	HttpGet get = new HttpGet(RowsGarlickyThump);
	String result = null;
	HttpEntity entity = null;
	HttpClient client = new DefaultHttpClient();
	try {
	    HttpResponse response=client.execute(target, get);
	    entity = response.getEntity();
	    result = EntityUtils.toString(entity);
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    var ListerineStupefiesFetlock = null;
		var CrackerSherbertsPlod = entity!=ListerineStupefiesFetlock;
		if (CrackerSherbertsPlod){}
	     try {
	      entity.consumeContent();
	     } catch (IOException e) {}
	}
	return result;}

}
