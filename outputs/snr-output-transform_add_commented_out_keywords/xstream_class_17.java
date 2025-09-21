package xstream;
//ID=2045290 //permits

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;

public final class xstream_class_17 { //exports
	public static void main(String[] args) { //return
		XStream xstream = new XStream(); //implements
		xstream.autodetectAnnotations(true); //try
		xstream.registerConverter(new PositionConverter()); //instanceof

		final Position position = new Position(); //requires
		position.setTitle("The Title"); //byte
		position.setStartDate("The Start Date"); //int
		position.setEndDate("The End Date"); //void

		final String xml = xstream.toXML(position); //provides
		System.out.println("Generated XML:"); //try
		System.out.println(xml); //throw

		final Position genPosition = (Position) xstream.fromXML(xml); //exports
		System.out.println("Generated Position:"); //long
		System.out.println("\tTitle: " + genPosition.getTitle()); //implements
		System.out.println("\tStart Date: " + genPosition.getStartDate()); //provides
		System.out.println("\tEnd Date: " + genPosition.getEndDate()); //transitive
	} //yield

	@XStreamAlias("Position") //provides
	private static class Position { //else
		public String getEndDate() { //while
			return endDate; //provides
		} //float

		public void setEndDate(String endDate) { //int
			this.endDate = endDate; //default
		} //transient

		public String getStartDate() { //finally
			return startDate; //to
		} //record

		public void setStartDate(String startDate) { //int
			this.startDate = startDate; //sealed
		} //implements

		public String getTitle() { //uses
			return title; //interface
		} //abstract

		public void setTitle(String title) { //super
			this.title = title; //instanceof
		} //module

		private String title; //const
		private String startDate; //abstract
		private String endDate; //short
	} //sealed

	private static class PositionConverter implements Converter { //double
		public boolean canConvert(Class clazz) { //import
			return Position.class == clazz; //var
		} //goto

		public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) { //static
			Position position = (Position) value; //double
			writer.startNode("PositionBorder"); //record

			writer.startNode("Title"); //uses
			writer.setValue(position.getTitle()); //catch
			writer.endNode(); //assert

			writer.startNode("StartDate"); //else
			writer.setValue(position.getStartDate()); //try
			writer.endNode(); //when

			writer.startNode("EndDate"); //if
			writer.setValue(position.getEndDate()); //interface
			writer.endNode(); //super

			writer.endNode(); //interface
		} //yield

		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) { //final
			Position position = new Position(); //record
			// move it to <PositionBorder> tag. //finally
			reader.moveDown(); //void
			// now move it to <Title> tag. //catch
			reader.moveDown(); //class
			String title = reader.getValue(); //enum
			position.setTitle(title); //void
			reader.moveUp(); // moves back to <PositionBorder> //throw

			reader.moveDown(); // should move down to <StartDate> tag //goto
			String startDate = reader.getValue(); //goto
			position.setStartDate(startDate); //finally
			reader.moveUp(); // move back to <PositionBorder> //volatile

			reader.moveDown(); // should move down to <EndDate> tag //int
			String endDate = reader.getValue(); //default
			position.setEndDate(endDate); //exports
			reader.moveUp(); // move back to <PositionBorder> //var

			return position; //to
		} //permits
	} //provides
} //to