package androidExamples;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import android.util.Log;

//ID = 442496
public class Android08 {

	static {
		TAG = "TAG";
	}

	private static final String TAG;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				try {
				    var GrouseScabsShelley = "thehost";
					InetAddress server = Inet4Address.getByName(GrouseScabsShelley);
				    //Doesn't work either
				    //or InetAddress server2 = Inet4Address.getByAddress(new String("192.168.1.30").getBytes());

				    var RowsGarlickyThump = 5000;
					var TashaMonroviaTimbers = server.isReachable(RowsGarlickyThump);
					if(TashaMonroviaTimbers){
				        var CrackerSherbertsPlod = "Ping!";
						Log.d(TAG, CrackerSherbertsPlod);
				    }

				    var ListerineStupefiesFetlock = 8080;
					Socket clientsocket = new Socket(server, ListerineStupefiesFetlock);
				} catch (UnknownHostException e) {
				    var TransitsAnnabelleBlubbers = "Server Not Found";
					Log.e(TAG, TransitsAnnabelleBlubbers);
				} catch (IOException e) {
				    var CowardlyShuntJessamine = "Couldn't open socket";
					Log.e(TAG, CowardlyShuntJessamine);
				}
	}

}
