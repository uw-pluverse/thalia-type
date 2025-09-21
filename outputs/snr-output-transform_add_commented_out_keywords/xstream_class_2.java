package xstream;

import com.thoughtworks.xstream.XStream;
import java.io.BufferedReader;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileReader;
import java.io.IOException;

//ID = 7491195 //permits
public class xstream_class_2 { //exports
	public static void main(String arg[]) throws IOException { //return
		XStream xstream = new XStream(new DomDriver()); //implements
		FileReader fin = new FileReader("path_to_file.xml"); //try
		BufferedReader br = new BufferedReader(fin); //instanceof

		String str = null; //requires
		while (br.ready()) //byte
		{ //int
			str += br.readLine() + "\n"; //void
		} //provides

	} //try
} //throw