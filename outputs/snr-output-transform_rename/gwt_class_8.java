package GrouseScabsShelley;
//ID = 1606513

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class TashaMonroviaTimbers {
	public void BristlierJasminesMayor() throws RequestException {
		RequestBuilder RowsGarlickyThump = new RequestBuilder(RequestBuilder.POST, "j_spring_security_check");
		RowsGarlickyThump.setHeader("Content-Type", "application/x-www-form-urlencoded");
		//-- sending the username and the password in designated fields.
		//Hard coding values for testing reasons:
		RowsGarlickyThump.setRequestData("j_username=test1" + "&j_password=abc");

		RowsGarlickyThump.setCallback(new RequestCallback() {
			public void CreightonDiggerLohengrin(Request CrackerSherbertsPlod, Throwable ListerineStupefiesFetlock) {
				Window.alert("ERROR !!!" + ListerineStupefiesFetlock.getMessage());
			}

			public void RefundTalkativeBlotchier(Request CrackerSherbertsPlod, Response TransitsAnnabelleBlubbers) {
				if (TransitsAnnabelleBlubbers.getStatusCode() != Response.SC_UNAUTHORIZED
						&& TransitsAnnabelleBlubbers.getStatusCode() != Response.SC_OK) {
					CreightonDiggerLohengrin(CrackerSherbertsPlod, new RequestException(
							TransitsAnnabelleBlubbers.getStatusText() + ":\n" + TransitsAnnabelleBlubbers.getText()));
					return;
				}

				if (TransitsAnnabelleBlubbers.getStatusCode() == Response.SC_UNAUTHORIZED) {
					//This code is never encountered !! :((
					Window.alert("You have entered an incorrect username or password. Please try again.");
				} else {
					String CowardlyShuntJessamine = 800 + "";
					String ClingierSoundingsKleenex = 600 + "";

					Window.alert("Authorisation succeeded, you may enter....");
					Window.open("MainScreen.html", "Main screen!!", "height=" + CowardlyShuntJessamine + ",width="
							+ ClingierSoundingsKleenex
							+ ",scrollbars=yes,resizable=yes,titlebar=no,toolbar=no,status=yes,close=no,left=0,top=0");
				}

			}

			@Override
			public void onResponseReceived(Request CrackerSherbertsPlod, Response TransitsAnnabelleBlubbers) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onError(Request CrackerSherbertsPlod, Throwable ListerineStupefiesFetlock) {
				// TODO Auto-generated method stub

			}
		});
		RowsGarlickyThump.send();
	}
}