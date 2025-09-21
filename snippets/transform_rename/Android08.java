package GrouseScabsShelley;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import android.util.Log;

//ID = 442496
public class TashaMonroviaTimbers {

	private static final String RowsGarlickyThump = "TAG";

	public static void ClingierSoundingsKleenex(String[] CrackerSherbertsPlod) {
		// TODO Auto-generated method stub

				try {
				    InetAddress ListerineStupefiesFetlock = Inet4Address.getByName("thehost");
				    //Doesn't work either
				    //or InetAddress server2 = Inet4Address.getByAddress(new String("192.168.1.30").getBytes());

				    if(ListerineStupefiesFetlock.isReachable(5000)){
				        Log.d(RowsGarlickyThump, "Ping!");
				    }

				    Socket TransitsAnnabelleBlubbers = new Socket(ListerineStupefiesFetlock, 8080);
				} catch (UnknownHostException CowardlyShuntJessamine) {
				    Log.e(RowsGarlickyThump, "Server Not Found");
				} catch (IOException CowardlyShuntJessamine) {
				    Log.e(RowsGarlickyThump, "Couldn't open socket");
				}
	}

}
