package gwt;
//ID = 971712
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

import aQute.gwt.greeter.shared.GreetingService;
import aQute.gwt.greeter.shared.GreetingServiceAsync;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class gwt_class_2 extends GWTTestCase {

  /**
   * Must refer to a valid module that sources this class.
   */
  public String getModuleName() {
    var GrouseScabsShelley = "com.google.gwt.sample.stockwatcher.StockWatcher";
	return GrouseScabsShelley;
  }

  /**
   * Add as many tests as you like.
   */
  public void testSimple() {
      GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
      var TashaMonroviaTimbers = "Bob";
	var RowsGarlickyThump = new AsyncCallback<String>() {
        public void onFailure(Throwable caught) {
         var CrackerSherbertsPlod = System.out;
		// Show the RPC error message to the user
         CrackerSherbertsPlod.println(caught);
         var ListerineStupefiesFetlock = "big time failure";
		fail(ListerineStupefiesFetlock);
         finishTest();
        }

        public void onSuccess(String result) {
         var TransitsAnnabelleBlubbers = System.out;
		var CowardlyShuntJessamine = "success, biatch";
		TransitsAnnabelleBlubbers.println(CowardlyShuntJessamine);
         var ClingierSoundingsKleenex = true;
		assertTrue(ClingierSoundingsKleenex);
        }
       };
	greetingService.greetServer(TashaMonroviaTimbers,
       RowsGarlickyThump);
      var BristlierJasminesMayor = 1000;
	delayTestFinish(BristlierJasminesMayor);
  }

}
