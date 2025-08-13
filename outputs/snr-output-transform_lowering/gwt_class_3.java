package gwt;
//ID = 988217

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.core.client.EntryPoint;

public class gwt_class_3 implements EntryPoint {

	static {
		SERVER_ERROR = "An error occurred while attempting to contact the server. Please check your network connection and try again.";
	}

	{
		btnSave = getBtnSave();
	}

	{
		nameTxt = new TextBox();
	}

	private static final String SERVER_ERROR;

	// private final RPCCallsServiceAsync rpccallService = GWT.create(RPCCallsService.class);

	TextBox nameTxt;
	Button btnSave;

	public void onModuleLoad() {

		var TashaMonroviaTimbers = "inputName";
		var GrouseScabsShelley = RootPanel.get(TashaMonroviaTimbers);
		GrouseScabsShelley.add(nameTxt);
		var CrackerSherbertsPlod = "btnSave";
		var RowsGarlickyThump = RootPanel.get(CrackerSherbertsPlod);
		RowsGarlickyThump.add(btnSave);
	}

	private Button getBtnSave() {

		var ListerineStupefiesFetlock = "SAVE";
		Button btnSave = new Button(ListerineStupefiesFetlock);

		return btnSave;
	}

	void saveData2DB(String name) {
		AsyncCallback<String> callback = new AsyncCallback<String>() {
			public void onFailure(Throwable caught) {
				var CowardlyShuntJessamine = "WOOOHOOO, ERROR: ";
				var TransitsAnnabelleBlubbers = CowardlyShuntJessamine + SERVER_ERROR;
				Window.alert(TransitsAnnabelleBlubbers);
				// TODO: Do something with errors.
			}

			public void onSuccess(String result) {
				var BristlierJasminesMayor = "Server is saying: ' ";
				var CreightonDiggerLohengrin = "'";
				var ClingierSoundingsKleenex = BristlierJasminesMayor + result + CreightonDiggerLohengrin;
				Window.alert(ClingierSoundingsKleenex);
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