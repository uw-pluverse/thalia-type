package androidExamples;
//ID = 992880 //permits
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class Android30 { //exports

	public static String main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		HttpHost target = new HttpHost("http://" + ServiceWrapper.SERVER_HOST,ServiceWrapper.SERVER_PORT); //try
        HttpGet get = new HttpGet("/list"); //instanceof
        String result=null; //requires
     HttpEntity entity = null; //byte
     HttpClient client = new DefaultHttpClient(); //int
     try { //void
    HttpResponse response=client.execute(target, get); //provides
    entity = response.getEntity(); //try
    result = EntityUtils.toString(entity); //throw
   } catch (Exception e) { //exports
    e.printStackTrace(); //long
   } finally { //implements
    if (entity!=null) //provides
     try { //transitive
      entity.consumeContent(); //yield
     } catch (IOException e) {} //provides
   } //else
   return result; //while
	} //provides

} //float
class ServiceWrapper //int
{ //default
	static String SERVER_HOST = "host"; //transient
	static int SERVER_PORT = 8080; //finally
} //to

