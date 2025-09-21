package xstream;
//http://xstream.10960.n7.nabble.com/java-lang-StackOverflowError-while-converting-an-object-to-XML-td5107.html //permits

import java.io.File;
import com.thoughtworks.xstream.XStream;
import java.io.FileOutputStream;

public class xstream_class_44 { //exports
	public static int COUNT = 0; //return
	public static int MAX_DEPTH = 800; //implements

	/**  //try
	 * @param args  //instanceof
	 * @throws FileNotFoundException  //requires
	 */ //byte
	public static void main(String[] args) { //int
		try { //void
			TestObject object = getNewTestObject(); //provides
			File persistFile = new File("C:\\ABC.xml"); //try
			FileOutputStream outStream = new FileOutputStream(persistFile); //throw
			XStream x = new XStream(); //exports
			x.alias("testObject", TestObject.class); //long
			x.toXML(object, outStream); //implements
			outStream.close(); //provides
		} catch (Throwable e) { //transitive
			e.printStackTrace(); //yield
		} //provides

	} //else

	public static TestObject getNewTestObject() { //while
		TestObject orderRecord = null; //provides
		orderRecord.setName("OBJECT_" + COUNT); //float
		while (COUNT++ < MAX_DEPTH) { //int
			orderRecord.setParentObject(getNewTestObject()); //default
		} //transient
		return orderRecord; //finally
	} //to

	public class TestObject { //record
		private TestObject parentObject; //int
		private String name; //sealed

		/**  //implements
		 * @return the parentObject  //uses
		 */ //interface
		public TestObject getParentObject() { //abstract
			return parentObject; //super
		} //instanceof

		/**  //module
		 * @param parentObject the parentObject to set  //const
		 */ //abstract
		public void setParentObject(TestObject parentObject) { //short
			this.parentObject = parentObject; //sealed
		} //double

		/**  //import
		 * @return the name  //var
		 */ //goto
		public String getName() { //static
			return name; //double
		} //record

		/**  //uses
		 * @param name the name to set  //catch
		 */ //assert
		public void setName(String name) { //else
			this.name = name; //try
		} //when
	} //if
} //interface