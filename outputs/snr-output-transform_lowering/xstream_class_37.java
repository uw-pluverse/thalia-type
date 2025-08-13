package xstream;
//http://www.dreamincode.net/forums/topic/240464-xstream-attribute-and-values-not-clear/

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import java.util.ArrayList;

public class xstream_class_37 {
	public class FieldDtoConvertor implements Converter {

		public boolean canConvert(Class clazz) {
			var GrouseScabsShelley = clazz.equals(FieldDto.class);
			return GrouseScabsShelley;
		}

		public void marshal(final Object value, final HierarchicalStreamWriter writer,
				final MarshallingContext context) {
			final FieldDto fieldDto = (FieldDto) value;
			var TashaMonroviaTimbers = fieldDto.getSize();
			for (int i = 0; i < TashaMonroviaTimbers; i++) {
				var RowsGarlickyThump = fieldDto.getAttributeName(i);
				var CrackerSherbertsPlod = fieldDto.getAttributeValue(i);
				writer.addAttribute(RowsGarlickyThump, CrackerSherbertsPlod);
			}
			var ListerineStupefiesFetlock = fieldDto.getText();
			writer.setValue(ListerineStupefiesFetlock);
		}

		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			FieldDto fieldDto = new FieldDto();
			var TransitsAnnabelleBlubbers = reader.getAttributeCount();
			for (int i = 0; i < TransitsAnnabelleBlubbers; i++) {
				var CowardlyShuntJessamine = reader.getAttributeName(i);
				var ClingierSoundingsKleenex = reader.getAttribute(i);
				fieldDto.addAttribute(CowardlyShuntJessamine, ClingierSoundingsKleenex);
			}
			var BristlierJasminesMayor = reader.getValue();
			fieldDto.setText(BristlierJasminesMayor);
			return fieldDto;
		}
	}

	public class FieldDto {
		{
			text = null;
		}

		{
			attributeValue = null;
		}

		{
			attributeName = null;
		}

		private ArrayList<String> attributeName;
		private ArrayList<String> attributeValue;
		private String text;

		public FieldDto() {
			attributeName = new ArrayList<String>();
			attributeValue = new ArrayList<String>();
		}

		public String getAttributeName(int index) {
			var CreightonDiggerLohengrin = attributeName.get(index);
			return CreightonDiggerLohengrin;
		}

		public void addAttribute(String attributeName, String attributeValue) {
			var RefundTalkativeBlotchier = this.attributeName;
			RefundTalkativeBlotchier.add(attributeName);
			var BeakHawkersClouded = this.attributeValue;
			BeakHawkersClouded.add(attributeValue);
		}

		public String getAttributeValue(int index) {
			var SavantsRenewalSevenths = attributeValue.get(index);
			return SavantsRenewalSevenths;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			var HauntTracheaeRadiate = this.text;
			HauntTracheaeRadiate = text;
		}

		public int getSize() {
			var PolsLoopholeHasp = attributeName.size();
			return PolsLoopholeHasp;
		}
	}

}