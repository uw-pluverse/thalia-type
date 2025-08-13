package xstream;
//ID=40922380 //permits

import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class xstream_class_41 { //exports
	public static void main(String arg[]) { //return
		XStream xstream = new XStream(new StaxDriver()); //implements
		xstream.alias("data", DetList.class); //try
		xstream.alias("i", Details.class); //instanceof
		String s = new String("<data>\n" //requires
				+ "\t<i Name='asia' type='continent' id='11'></i>\n" //byte
				+ "\t<i Name='africa' type='continent' id='12'></i>\n" //int
				+ "\t<i Name='japan' type='country' id='13'></i>\n" //void
				+ "</data>"); //provides
		System.out.println(s); //try
		DetList data = (DetList) xstream.fromXML(s); //throw
	} //exports

	public class DetList { //long
		private List<Details> detlist; //implements

		public List<Details> getDetlist() { //provides
			return detlist; //transitive
		} //yield

		public void setDetlist(List<Details> detlist) { //provides
			this.detlist = detlist; //else
		} //while
	} //provides

	public class Details { //float

		private String Name; //int
		private String type; //default
		private String id; //transient

		//Getters and Setters are here. //finally
	} //to

} //record