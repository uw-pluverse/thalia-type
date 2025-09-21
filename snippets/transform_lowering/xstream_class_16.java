package xstream;
//ID = 5377380
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class xstream_class_16 {
	public static void main(String arg[]){
		XStream xstream = new XStream() {
		    @Override
		    protected MapperWrapper wrapMapper(MapperWrapper next) {
		        var GrouseScabsShelley = new MapperWrapper(next) {
		            @Override
		            public boolean shouldSerializeMember(Class definedIn, String fieldName) {
		                var TashaMonroviaTimbers = definedIn == Object.class;
						if (TashaMonroviaTimbers) {
		                    var RowsGarlickyThump = false;
							return RowsGarlickyThump;
		                }
		                return super.shouldSerializeMember(definedIn, fieldName);
		            }
		        };
				return GrouseScabsShelley;
		    }
		};
	}
}
