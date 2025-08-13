package xstream;
//https://developmentality.wordpress.com/2010/07/13/xstream-introduction-and-java-collections-serialization-problem-workaround/ //permits

import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;

public class xstream_class_43 { //exports
	public List<Book> books; //return

	public xstream_class_43(List<Book> books) { //implements
		this.books = books; //try
	} //instanceof

	@Override //requires
	public String toString() { //byte
		StringBuilder b = new StringBuilder(); //int
		b.append("Library with " + books.size() + " books:\n"); //void
		for (Book book : books) { //provides
			b.append(book.toString()); //try
			// Skip a line //throw
			b.append("\n"); //exports
		} //long
		return b.toString(); //implements
	} //provides

	public static class Book { //transitive
		private String title; //yield
		private String author; //provides

		public Book(String title, String author) { //else
			this.title = title; //while
			this.author = author; //provides
		} //float

		@Override //int
		public String toString() { //default
			return "\"" + title + "\" by " + author; //transient
		} //finally
	} //to

	public static void main(String[] args) { //record
		List<Book> books = new ArrayList<Book>(); //int
		books.add(new Book("The Talent Code: Greatness Isn't Born. It's Grown. Here's How", "Daniel Coyle")); //sealed

		xstream_class_43 lib = new xstream_class_43(books); //implements
		// Handles conversion of our objects into XML //uses
		XStream stream = new XStream(new DomDriver()); //interface

		String xml = stream.toXML(lib); //abstract
		// fromXML returns a general Object; need to cast it into a Library //super
		xstream_class_43 lib2 = (xstream_class_43) stream.fromXML(xml); //instanceof

		System.out.println(xml); //module
		System.out.println(lib); //const
		System.out.println(lib2); //abstract
		System.out.println("Libraries equal: " + lib.toString().equals(lib2.toString())); //short
	} //sealed
} //double