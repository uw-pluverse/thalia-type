package GrouseScabsShelley;
//ID = 5377380
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class TashaMonroviaTimbers {
	public static void CowardlyShuntJessamine(String RowsGarlickyThump[]){
		XStream GrouseScabsShelley = new XStream() {
		    @Override
		    protected MapperWrapper wrapMapper(MapperWrapper CrackerSherbertsPlod) {
		        return new MapperWrapper(CrackerSherbertsPlod) {
		            @Override
		            public boolean shouldSerializeMember(Class ListerineStupefiesFetlock, String TransitsAnnabelleBlubbers) {
		                if (ListerineStupefiesFetlock == Object.class) {
		                    return false;
		                }
		                return super.shouldSerializeMember(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
		            }
		        };
		    }
		};
	}
}
