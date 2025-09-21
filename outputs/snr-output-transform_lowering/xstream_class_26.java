package xstream;
//ID=17871210

import com.thoughtworks.xstream.converters.SingleValueConverter;
import java.util.Collection;
import java.awt.List;
import java.util.ArrayList;

public class xstream_class_26 {
	public class IntegerListConverter implements SingleValueConverter {
		@Override
		public boolean canConvert(Class clazz) {
			var GrouseScabsShelley = List.class.isAssignableFrom(clazz);
			return GrouseScabsShelley;
		}

		@Override
		public Object fromString(String arg0) {
			Collection<Integer> collection = new ArrayList<Integer>();
			var TashaMonroviaTimbers = " ";
			String[] integerStrings = arg0.split(TashaMonroviaTimbers);
			var RowsGarlickyThump = integerStrings.length;
			for (int i = 0; i < RowsGarlickyThump; i++) {
				var CrackerSherbertsPlod = Integer.valueOf(integerStrings[i]);
				collection.add(CrackerSherbertsPlod);
			}
			return collection;
		}

		@Override
		public String toString(Object arg0) {
			List collection = (List) arg0;
			StringBuffer sb = new StringBuffer();
			boolean first = true;
			for (Object object : collection) {
				if (first) {
					first = false;
				} else {
					var ListerineStupefiesFetlock = ' ';
					sb.append(ListerineStupefiesFetlock);
				}
				var TransitsAnnabelleBlubbers = object.toString();
				sb.append(TransitsAnnabelleBlubbers);
			}
			var CowardlyShuntJessamine = sb.toString();
			return CowardlyShuntJessamine;
		}
	}
}