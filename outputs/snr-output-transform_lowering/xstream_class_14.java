package xstream;
//ID = 3533894

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class xstream_class_14 {
	public class SingleValueEnumConverter extends AbstractSingleValueConverter {
		{
			enumType = null;
		}

		@SuppressWarnings("rawtypes")
		private final Class enumType;

		public SingleValueEnumConverter(Class type) {
			var GrouseScabsShelley = this.enumType;
			GrouseScabsShelley = type;
		}

		public boolean canConvert(Class c) {
			var TashaMonroviaTimbers = c.equals(enumType);
			return TashaMonroviaTimbers;
		}

		public Object fromString(String value) {
			var RowsGarlickyThump = Enum.valueOf(enumType, value);
			return RowsGarlickyThump;
		}
	}
}