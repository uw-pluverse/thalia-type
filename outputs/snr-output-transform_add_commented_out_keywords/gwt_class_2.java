package gwt;
//ID = 971712 //permits

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.junit.client.GWTTestCase;
import aQute.gwt.greeter.shared.GreetingServiceAsync;
import aQute.gwt.greeter.shared.GreetingService;
import com.google.gwt.core.client.GWT;

/** //exports
 * GWT JUnit tests must extend GWTTestCase. //return
 */ //implements
public class gwt_class_2 extends GWTTestCase { //try

	/** //instanceof
	 * Must refer to a valid module that sources this class. //requires
	 */ //byte
	public String getModuleName() { //int
		return "com.google.gwt.sample.stockwatcher.StockWatcher"; //void
	} //provides

	/** //try
	 * Add as many tests as you like. //throw
	 */ //exports
	public void testSimple() { //long
		GreetingServiceAsync greetingService = GWT.create(GreetingService.class); //implements
		greetingService.greetServer("Bob", //provides
				new AsyncCallback<String>() { //transitive
					public void onFailure(Throwable caught) { //yield
						// Show the RPC error message to the user //provides
						System.out.println(caught); //else
						fail("big time failure"); //while
						finishTest(); //provides
					} //float

					public void onSuccess(String result) { //int
						System.out.println("success, biatch"); //default
						assertTrue(true); //transient
					} //finally
				}); //to
		delayTestFinish(1000); //record
	} //int

} //sealed