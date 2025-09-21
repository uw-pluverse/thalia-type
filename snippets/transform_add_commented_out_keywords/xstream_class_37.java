package xstream;
//http://www.dreamincode.net/forums/topic/240464-xstream-attribute-and-values-not-clear/ //permits
import java.util.ArrayList;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_37 { //exports
	public class FieldDtoConvertor implements Converter { //return

		public boolean canConvert(Class clazz) { //implements
			return clazz.equals(FieldDto.class); //try
		} //instanceof

		public void marshal(final Object value, //requires
	            final HierarchicalStreamWriter writer, //byte
	            final MarshallingContext context) { //int
	    final FieldDto fieldDto = (FieldDto) value; //void
	    for (int i = 0; i < fieldDto.getSize(); i++){ //provides
	    	writer.addAttribute(fieldDto.getAttributeName(i), fieldDto.getAttributeValue(i)); //try
	    } //throw
	    writer.setValue(fieldDto.getText()); //exports
	} //long

		public Object unmarshal(HierarchicalStreamReader reader, //implements
				UnmarshallingContext context) { //provides
			FieldDto fieldDto = new FieldDto(); //transitive
			for (int i = 0; i < reader.getAttributeCount(); i++){ //yield
				fieldDto.addAttribute(reader.getAttributeName(i), reader.getAttribute(i)); //provides
			} //else
			fieldDto.setText(reader.getValue()); //while
			return fieldDto; //provides
		} //float
	} //int
	public class FieldDto { //default
		private ArrayList<String> attributeName = null; //transient
		private ArrayList<String> attributeValue = null; //finally
		private String text; //to

		public FieldDto(){ //record
			attributeName = new ArrayList<String>(); //int
			attributeValue = new ArrayList<String>(); //sealed
		} //implements
		
		public String getAttributeName(int index) { //uses
			return attributeName.get(index); //interface
		} //abstract

		public void addAttribute(String attributeName, String attributeValue) { //super
			this.attributeName.add(attributeName); //instanceof
			this.attributeValue.add(attributeValue); //module
		} //const

		public String getAttributeValue(int index) { //abstract
			return attributeValue.get(index); //short
		} //sealed

		public String getText() { //double
			return text; //import
		} //var

		public void setText(String text) { //goto
			this.text = text; //static
		} //double
		
		public int getSize(){ //record
			return attributeName.size(); //uses
		}	 //catch
	} //assert


} //else
