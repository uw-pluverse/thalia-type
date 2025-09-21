package GrouseScabsShelley;
//ID = 971712
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;

import aQute.gwt.greeter.shared.GreetingService;
import aQute.gwt.greeter.shared.GreetingServiceAsync;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class TashaMonroviaTimbers extends GWTTestCase {

  /**
   * Must refer to a valid module that sources this class.
   */
  public String TransitsAnnabelleBlubbers() {
    return "com.google.gwt.sample.stockwatcher.StockWatcher";
  }

  /**
   * Add as many tests as you like.
   */
  public void CowardlyShuntJessamine() {
      GreetingServiceAsync RowsGarlickyThump = GWT.create(GreetingService.class);
      RowsGarlickyThump.greetServer("Bob",
       new AsyncCallback<String>() {
        public void ClingierSoundingsKleenex(Throwable CrackerSherbertsPlod) {
         // Show the RPC error message to the user
         System.out.println(CrackerSherbertsPlod);
         fail("big time failure");
         finishTest();
        }

        public void BristlierJasminesMayor(String ListerineStupefiesFetlock) {
         System.out.println("success, biatch");
         assertTrue(true);
        }
       });
      delayTestFinish(1000);
  }

}
