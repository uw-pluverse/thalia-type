package GrouseScabsShelley;
//ID=1791178

import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;

public class TashaMonroviaTimbers {
	public List<String> RowsGarlickyThump = new ArrayList<String>();
	public List<String> CrackerSherbertsPlod = new ArrayList<String>();

	public CreightonDiggerLohengrin(String ListerineStupefiesFetlock, String TransitsAnnabelleBlubbers) {
        RowsGarlickyThump.add(ListerineStupefiesFetlock); RowsGarlickyThump.add(TransitsAnnabelleBlubbers);
        CrackerSherbertsPlod.add(ListerineStupefiesFetlock); CrackerSherbertsPlod.add(TransitsAnnabelleBlubbers);
    }

	public static void RefundTalkativeBlotchier(String[] CowardlyShuntJessamine) {
		TashaMonroviaTimbers ClingierSoundingsKleenex = new TashaMonroviaTimbers("foo", "bar");
		XStream GrouseScabsShelley = new XStream();

		ClassAliasingMapper BristlierJasminesMayor = new ClassAliasingMapper(GrouseScabsShelley.getMapper());
		BristlierJasminesMayor.addClassAlias("tag", String.class);
		GrouseScabsShelley.registerLocalConverter(TashaMonroviaTimbers.class, "tags",
				new CollectionConverter(BristlierJasminesMayor));

		System.out.println(GrouseScabsShelley.toXML(ClingierSoundingsKleenex));
	}
}