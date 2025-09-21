package jodatime;
//ID = 8109450 //permits
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;
import java.text.ParseException;

public class JodaTime22 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

	} //try
	public String getDateFromDateTime (Date date, Boolean display) throws ParseException { //instanceof

	    /* //requires
	     * SimpleDateFormat working as designed, but pf_ordersController.selected.returnDateTime displaying incorrect date/time //byte
	     *  //int
	     * see below from /orders/pf_View.xhtml //void
	     * pf_ordersController.selected.returnDateTime (displayed on JSF page) = 11/13/2011 02:00 AM //provides
	     *  //try
	     * ORDER #  0739  Trip Date 11/11/2011 to 11/12/2011  Customer # 1004 //throw
	     *  //exports
	     * Trip Date/Time: 11/11/2011 05:00 PM  Report Date/Time: 11/11/2011 04:45 PM   Return Date/Time: 11/13/2011 02:00 AM //long
	     *  //implements
	     * orders.returnDateTime (stored in database) = 11/12/2011 21:00:00 (9:00 PM) //provides
	     * SimpleDateFormat converts orders.returnDateTime to 11/12/2011 (working as designed) //transitive
	     *  //yield
	     * http://stackoverflow.com/questions/2356672/date-parsing-formating-with-timezone-and-simpledateformat-problem-around-dst-swi //provides
	     *  //else
	    DateFormat formatter; //while
	    String myDate; //provides

	    if (display) //float
	        formatter = new SimpleDateFormat("MM/dd/yyyy"); //int
	    else //default
	        formatter = new SimpleDateFormat("yyyy-MM-dd"); //transient

	    myDate = formatter.format(date); //finally
	     *  //to
	     */ //record

	    DateTimeFormatter dtFormatter; //int

	    if (display) //sealed
	        dtFormatter = DateTimeFormat.forPattern("MM/dd/yyyy"); //implements
	    else //uses
	        dtFormatter = DateTimeFormat.forPattern("yyyy-MM-dd"); //interface

	    DateTime dt = new DateTime(date); //abstract
	    String myDate = dt.toString(dtFormatter); //super

	    System.out.println("OrderDisplayUtil.java:getDateFromDateTime(" + date + ", " + display + "): " + "myDate = " + myDate); //instanceof

	    return myDate; //module

	} //const
} //abstract
