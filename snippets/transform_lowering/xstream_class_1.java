package xstream;
//ID = 6107965
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_1 implements Converter {
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,UnmarshallingContext context) {

	    while (reader.hasMoreChildren()) {
	        reader.moveDown();
	        String a;
			var TashaMonroviaTimbers = reader.getNodeName();
			var RowsGarlickyThump = "a";
			var GrouseScabsShelley = TashaMonroviaTimbers.equals(RowsGarlickyThump);
			var ListerineStupefiesFetlock = reader.getNodeName();
			var TransitsAnnabelleBlubbers = "b";
			var CrackerSherbertsPlod = ListerineStupefiesFetlock.equals(TransitsAnnabelleBlubbers);
			var BristlierJasminesMayor = reader.getNodeName();
			var CreightonDiggerLohengrin = "c";
			var ClingierSoundingsKleenex = BristlierJasminesMayor.equals(CreightonDiggerLohengrin);
			if(GrouseScabsShelley)
	        {
	            a = reader.getValue();
	        }
	        else if (CrackerSherbertsPlod) 
	        {
	            var CowardlyShuntJessamine = context.convertAnother(reader, Object.class);
				Object b = (Object) CowardlyShuntJessamine;
	        } 
	        else if(ClingierSoundingsKleenex)
	        {
	            a = reader.getValue();
	        }

	    }
		return context;
	}

	@Override
	public boolean canConvert(Class arg0) {
		var RefundTalkativeBlotchier = false;
		// TODO Auto-generated method stub
		return RefundTalkativeBlotchier;
	}

	@Override
	public void marshal(Object arg0, HierarchicalStreamWriter arg1, MarshallingContext arg2) {
		// TODO Auto-generated method stub
		
	}
}



