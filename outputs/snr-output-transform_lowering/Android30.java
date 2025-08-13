package androidExamples;
//ID = 992880

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;
import java.io.IOException;
import org.apache.http.util.EntityUtils;

public class Android30 {

	public static String main(String[] args) {
		var TashaMonroviaTimbers = "http://";
		var RowsGarlickyThump = ServiceWrapper.SERVER_HOST;
		var GrouseScabsShelley = TashaMonroviaTimbers + RowsGarlickyThump;
		var CrackerSherbertsPlod = ServiceWrapper.SERVER_PORT;
		// TODO Auto-generated method stub
		HttpHost target = new HttpHost(GrouseScabsShelley, CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = "/list";
		HttpGet get = new HttpGet(ListerineStupefiesFetlock);
		String result = null;
		HttpEntity entity = null;
		HttpClient client = new DefaultHttpClient();
		try {
			HttpResponse response = client.execute(target, get);
			entity = response.getEntity();
			result = EntityUtils.toString(entity);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			var CowardlyShuntJessamine = null;
			var TransitsAnnabelleBlubbers = entity != CowardlyShuntJessamine;
			if (TransitsAnnabelleBlubbers)
				try {
					entity.consumeContent();
				} catch (IOException e) {
				}
		}
		return result;
	}

}

class ServiceWrapper {
	static {
		SERVER_PORT = 8080;
	}
	static {
		SERVER_HOST = "host";
	}
	static String SERVER_HOST;
	static int SERVER_PORT;
}