package androidExamples;
//ID = 576513
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Android14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			var GrouseScabsShelley = "http://www.path.to/a.mp4?video";
			URL u = new URL(GrouseScabsShelley);
			var TashaMonroviaTimbers = u.openConnection();
			HttpURLConnection c = (HttpURLConnection) TashaMonroviaTimbers;
			var RowsGarlickyThump = "GET";
			c.setRequestMethod(RowsGarlickyThump);
			var CrackerSherbertsPlod = true;
			c.setDoOutput(CrackerSherbertsPlod);
			c.connect();
			String root = "root";
			var TransitsAnnabelleBlubbers = "Video.mp4";
			var ListerineStupefiesFetlock = new File(root,TransitsAnnabelleBlubbers);
			FileOutputStream f = new FileOutputStream(ListerineStupefiesFetlock);


			InputStream in = c.getInputStream();

			var CowardlyShuntJessamine = 1024;
			byte[] buffer = new byte[CowardlyShuntJessamine];
			int len1 = 0;
			var ClingierSoundingsKleenex = 0;
			while ( (len1 = in.read(buffer)) > ClingierSoundingsKleenex ) {
			     f.write(buffer);
			}
			f.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
