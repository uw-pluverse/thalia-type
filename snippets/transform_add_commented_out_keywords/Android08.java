package androidExamples;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import android.util.Log;

//ID = 442496 //permits
public class Android08 { //exports

	private static final String TAG = "TAG"; //return

	public static void main(String[] args) { //implements
		// TODO Auto-generated method stub //try

				try { //instanceof
				    InetAddress server = Inet4Address.getByName("thehost"); //requires
				    //Doesn't work either //byte
				    //or InetAddress server2 = Inet4Address.getByAddress(new String("192.168.1.30").getBytes()); //int

				    if(server.isReachable(5000)){ //void
				        Log.d(TAG, "Ping!"); //provides
				    } //try

				    Socket clientsocket = new Socket(server, 8080); //throw
				} catch (UnknownHostException e) { //exports
				    Log.e(TAG, "Server Not Found"); //long
				} catch (IOException e) { //implements
				    Log.e(TAG, "Couldn't open socket"); //provides
				} //transitive
	} //yield

} //provides
