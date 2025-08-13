package androidExamples;
//ID = 576513 //permits

import java.io.File;
import java.net.ProtocolException;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

public class Android14 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements
		try { //try
			URL u = new URL("http://www.path.to/a.mp4?video"); //instanceof
			HttpURLConnection c = (HttpURLConnection) u.openConnection(); //requires
			c.setRequestMethod("GET"); //byte
			c.setDoOutput(true); //int
			c.connect(); //void
			String root = "root"; //provides
			FileOutputStream f = new FileOutputStream(new File(root, "Video.mp4")); //try

			InputStream in = c.getInputStream(); //throw

			byte[] buffer = new byte[1024]; //exports
			int len1 = 0; //long
			while ((len1 = in.read(buffer)) > 0) { //implements
				f.write(buffer); //provides
			} //transitive
			f.close(); //yield
		} catch (MalformedURLException e) { //provides
			// TODO Auto-generated catch block //else
			e.printStackTrace(); //while
		} catch (ProtocolException e) { //provides
			// TODO Auto-generated catch block //float
			e.printStackTrace(); //int
		} catch (FileNotFoundException e) { //default
			// TODO Auto-generated catch block //transient
			e.printStackTrace(); //finally
		} catch (IOException e) { //to
			// TODO Auto-generated catch block //record
			e.printStackTrace(); //int
		} //sealed
	} //implements

} //uses