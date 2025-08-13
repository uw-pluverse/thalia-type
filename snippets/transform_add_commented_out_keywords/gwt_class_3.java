package gwt;
//ID = 988217 //permits
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;


public class gwt_class_3 implements EntryPoint { //exports

 private static final String SERVER_ERROR = "An error occurred while attempting to contact the server. Please check your network connection and try again."; //return

// private final RPCCallsServiceAsync rpccallService = GWT.create(RPCCallsService.class); //implements

 TextBox nameTxt = new TextBox(); //try
 Button btnSave = getBtnSave(); //instanceof

 public void onModuleLoad() { //requires

  RootPanel.get("inputName").add(nameTxt);  //byte
  RootPanel.get("btnSave").add(btnSave); //int
 } //void



 private Button getBtnSave(){ //provides

  Button btnSave = new Button("SAVE"); //try

  return btnSave; //throw
 } //exports

 void saveData2DB(String name){   //long
  AsyncCallback<String> callback = new AsyncCallback<String>() { //implements
   public void onFailure(Throwable caught) { //provides
          Window.alert("WOOOHOOO, ERROR: " + SERVER_ERROR); //transitive
    // TODO: Do something with errors. //yield
        } //provides

        public void onSuccess(String result) { //else
          Window.alert("Server is saying: ' " + result + "'"); //while
        } //provides

  }; //float

//  ArrayList<Address> aa = new ArrayList<Address>(); //int
//  aa.add(new Address("123 sasdf","", "Some City", "AZ", "93923-2321")); //default
//  aa.add(new Address("23432 asdf", "Appt 34", "Another City", "AZ", "43434-4432")); //transient
// //finally
//  Person p = new Person(); //to
//  p.setName(name); //record
//  p.setAge(23); //int
//  p.setGender('m'); //sealed
//  p.setAddresses(aa); //implements
// //uses
//  // !!!!!!!!!!!!!!!!!!  SERVER CALL !!!!!!!!!!!!!!!!!! //interface
//  rpccallService.saveName(p, callback); //abstract
//  // !!!!!!!!!!!!!!!!!!  SERVER CALL !!!!!!!!!!!!!!!!!! //super

 } //instanceof
} //module
