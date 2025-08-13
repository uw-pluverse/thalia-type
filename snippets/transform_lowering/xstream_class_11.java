package xstream;
//ID=1791178
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;

public class xstream_class_11 {
    {
		notags = new ArrayList<String>();
	}
	{
		tags = new ArrayList<String>();
	}
	public List<String> tags;
    public List<String> notags;
    public xstream_class_11(String tag, String tag2) {
        tags.add(tag); tags.add(tag2);
        notags.add(tag); notags.add(tag2);
    }
    public static void main(String[] args) {
        var GrouseScabsShelley = "foo";
		var TashaMonroviaTimbers = "bar";
		xstream_class_11 test = new xstream_class_11(GrouseScabsShelley, TashaMonroviaTimbers);
        XStream xstream = new XStream();

        var RowsGarlickyThump = xstream.getMapper();
		ClassAliasingMapper mapper = new ClassAliasingMapper(RowsGarlickyThump);
        var CrackerSherbertsPlod = "tag";
		mapper.addClassAlias(CrackerSherbertsPlod, String.class);
        var ListerineStupefiesFetlock = "tags";
		var TransitsAnnabelleBlubbers = new CollectionConverter(mapper);
		xstream.registerLocalConverter(
            xstream_class_11.class,
            ListerineStupefiesFetlock,
            TransitsAnnabelleBlubbers
        );

        var CowardlyShuntJessamine = System.out;
		var ClingierSoundingsKleenex = xstream.toXML(test);
		CowardlyShuntJessamine.println(ClingierSoundingsKleenex);
    }
}