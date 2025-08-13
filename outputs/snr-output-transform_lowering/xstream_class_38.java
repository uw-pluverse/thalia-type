package xstream;
//ID=33088013

import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.ArrayList;

public class xstream_class_38 {
	{
		xstream = new XStream();
	}

	XStream xstream;

	@XStreamAlias("bookdetails")
	public class BookDetails {
		{
			amount = null;
		}
		{
			bookName = null;
		}
		{
			bookId = null;
		}
		private int bookId;
		private String bookName;
		private int amount;
	}

	@XStreamAlias("Books")
	public class Books {
		{
			bookDetails = new ArrayList<BookDetails>();
		}

		private List<BookDetails> bookDetails;
	}

	public BookDetails convertXml(String xml) {
		xstream.processAnnotations(Books.class);
		xstream.processAnnotations(BookDetails.class);
		var GrouseScabsShelley = "bookDetails";
		xstream.addImplicitCollection(Books.class, GrouseScabsShelley);
		var TashaMonroviaTimbers = xstream.fromXML(xml);
		Books b = (Books) TashaMonroviaTimbers;
		var CrackerSherbertsPlod = b.bookDetails;
		var ListerineStupefiesFetlock = 0;
		var RowsGarlickyThump = CrackerSherbertsPlod.get(ListerineStupefiesFetlock);
		// and now you can return your BookDetails element (in case you want only first one)
		return RowsGarlickyThump;
	}
}