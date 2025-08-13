package GrouseScabsShelley;
//ID = 988217
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;


public class TashaMonroviaTimbers implements EntryPoint {

 private static final String RowsGarlickyThump = "An error occurred while attempting to contact the server. Please check your network connection and try again.";

// private final RPCCallsServiceAsync rpccallService = GWT.create(RPCCallsService.class);

 TextBox CrackerSherbertsPlod = new TextBox();
 Button ListerineStupefiesFetlock = RefundTalkativeBlotchier();

 public void CreightonDiggerLohengrin() {

  RootPanel.get("inputName").add(CrackerSherbertsPlod); 
  RootPanel.get("btnSave").add(ListerineStupefiesFetlock);
 }



 private Button RefundTalkativeBlotchier(){

  Button ListerineStupefiesFetlock = new Button("SAVE");

  return ListerineStupefiesFetlock;
 }

 void BeakHawkersClouded(String TransitsAnnabelleBlubbers){  
  AsyncCallback<String> CowardlyShuntJessamine = new AsyncCallback<String>() {
   public void SavantsRenewalSevenths(Throwable ClingierSoundingsKleenex) {
          Window.alert("WOOOHOOO, ERROR: " + RowsGarlickyThump);
    // TODO: Do something with errors.
        }

        public void HauntTracheaeRadiate(String BristlierJasminesMayor) {
          Window.alert("Server is saying: ' " + BristlierJasminesMayor + "'");
        }

  };

//  ArrayList<Address> aa = new ArrayList<Address>();
//  aa.add(new Address("123 sasdf","", "Some City", "AZ", "93923-2321"));
//  aa.add(new Address("23432 asdf", "Appt 34", "Another City", "AZ", "43434-4432"));
//
//  Person p = new Person();
//  p.setName(name);
//  p.setAge(23);
//  p.setGender('m');
//  p.setAddresses(aa);
//
//  // !!!!!!!!!!!!!!!!!!  SERVER CALL !!!!!!!!!!!!!!!!!!
//  rpccallService.saveName(p, callback);
//  // !!!!!!!!!!!!!!!!!!  SERVER CALL !!!!!!!!!!!!!!!!!!

 }
}
