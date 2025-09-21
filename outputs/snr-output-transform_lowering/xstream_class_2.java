package xstream;

import com.thoughtworks.xstream.XStream;
import java.io.BufferedReader;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileReader;
import java.io.IOException;

//ID = 7491195
public class xstream_class_2 {
	public static void main(String arg[]) throws IOException {
		var GrouseScabsShelley = new DomDriver();
		XStream xstream = new XStream(GrouseScabsShelley);
		var TashaMonroviaTimbers = "path_to_file.xml";
		FileReader fin = new FileReader(TashaMonroviaTimbers);
		BufferedReader br = new BufferedReader(fin);

		String str = null;
		while (br.ready()) {
			var RowsGarlickyThump = br.readLine();
			var CrackerSherbertsPlod = "\n";
			str += RowsGarlickyThump + CrackerSherbertsPlod;
		}

	}
}