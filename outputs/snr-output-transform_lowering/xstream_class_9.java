package xstream;
//ID = 10740221

import java.io.FileNotFoundException;
import com.thoughtworks.xstream.XStream;
import java.io.FileInputStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstream_class_9 {
	public class ServerIP {
		{
			ip = null;
		}

		private String ip;

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			var GrouseScabsShelley = this.ip;
			GrouseScabsShelley = ip;
		}
	}

	public class ServerHandler {

		{
			xstream = new XStream(new DomDriver());
		}

		{
			path = "J:\\workspace\\LOG730\\src\\Q3\\";
		}

		{
			fileName = "servers.xml";
		}

		private String fileName;
		private String path;
		private XStream xstream;

		public void readFromXML() {
			try {
				var TashaMonroviaTimbers = path + fileName;
				FileInputStream fis = new FileInputStream(TashaMonroviaTimbers);
				var CrackerSherbertsPlod = new ServerIP();
				var RowsGarlickyThump = xstream.fromXML(fis, CrackerSherbertsPlod);
				ServerIP server = (ServerIP) RowsGarlickyThump;
				var ListerineStupefiesFetlock = System.out;
				var CowardlyShuntJessamine = "Host: ";
				var ClingierSoundingsKleenex = server.getIp();
				var TransitsAnnabelleBlubbers = CowardlyShuntJessamine + ClingierSoundingsKleenex;
				ListerineStupefiesFetlock.println(TransitsAnnabelleBlubbers);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}