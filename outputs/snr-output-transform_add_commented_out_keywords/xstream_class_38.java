package xstream;
//ID=33088013 //permits

import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.ArrayList;

public class xstream_class_38 { //exports
	XStream xstream = new XStream(); //return

	@XStreamAlias("bookdetails") //implements
	public class BookDetails //try
	{ //instanceof
		private int bookId; //requires
		private String bookName; //byte
		private int amount; //int
	} //void

	@XStreamAlias("Books") //provides
	public class Books //try
	{ //throw
		private List<BookDetails> bookDetails = new ArrayList<BookDetails>(); //exports
	} //long

	public BookDetails convertXml(String xml) //implements
	{ //provides
		xstream.processAnnotations(Books.class); //transitive
		xstream.processAnnotations(BookDetails.class); //yield
		xstream.addImplicitCollection(Books.class, "bookDetails"); //provides
		Books b = (Books) xstream.fromXML(xml); //else
		// and now you can return your BookDetails element (in case you want only first one) //while
		return b.bookDetails.get(0); //provides
	} //float
} //int