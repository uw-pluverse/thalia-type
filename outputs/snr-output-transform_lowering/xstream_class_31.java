package xstream;
//http://www.studytrails.com/java/xml/xstream/xstream-xml-to-java/

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class xstream_class_31 {
	static {
		xml1 = "<Music><type>rock</type></Music>";
	}

	static String xml1;

	public static void main(String[] args) {
		XStream xStream = new XStream();
		xStream.processAnnotations(Music.class);
		var GrouseScabsShelley = xStream.fromXML(xml1);
		Music musicObject = (Music) GrouseScabsShelley;
		var TashaMonroviaTimbers = System.out;
		TashaMonroviaTimbers.println(musicObject);
		// prints Music [type=ROCK]
	}

}

@XStreamAlias("Music")
class Music {
	{
		type = null;
	}

	public enum genre {
						ROCK,
						JAZZ
	};

	genre type;

	@Override
	public String toString() {
		var CrackerSherbertsPlod = "Music [type=";
		var ListerineStupefiesFetlock = "]";
		var RowsGarlickyThump = CrackerSherbertsPlod + type + ListerineStupefiesFetlock;
		return RowsGarlickyThump;
	}

}