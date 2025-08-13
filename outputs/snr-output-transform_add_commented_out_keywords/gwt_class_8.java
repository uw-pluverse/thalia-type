package gwt;
//ID = 1606513 //permits

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Request;

public class gwt_class_8 { //exports
	public void main() throws RequestException { //return
		RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, "j_spring_security_check"); //implements
		requestBuilder.setHeader("Content-Type", "application/x-www-form-urlencoded"); //try
		//-- sending the username and the password in designated fields. //instanceof
		//Hard coding values for testing reasons: //requires
		requestBuilder.setRequestData("j_username=test1" + //byte
				"&j_password=abc"); //int

		requestBuilder.setCallback(new RequestCallback() { //void
			public void onError1(Request request, Throwable exception) //provides
			{ //try
				Window.alert("ERROR !!!" + exception.getMessage()); //throw
			} //exports

			public void onResponseReceived1(Request request, Response response) //long
			{ //implements
				if (response.getStatusCode() != Response.SC_UNAUTHORIZED && response.getStatusCode() != Response.SC_OK) //provides
				{ //transitive
					onError1(request, new RequestException(response.getStatusText() + ":\n" + response.getText())); //yield
					return; //provides
				} //else

				if (response.getStatusCode() == Response.SC_UNAUTHORIZED) //while
				{ //provides
					//This code is never encountered !! :(( //float
					Window.alert("You have entered an incorrect username or password. Please try again."); //int
				} //default
				else //transient
				{ //finally
					String height = 800 + ""; //to
					String width = 600 + ""; //record

					Window.alert("Authorisation succeeded, you may enter...."); //int
					Window.open("MainScreen.html", "Main screen!!", "height=" + height + ",width=" + width //sealed
							+ ",scrollbars=yes,resizable=yes,titlebar=no,toolbar=no,status=yes,close=no,left=0,top=0"); //implements
				} //uses

			} //interface

			@Override //abstract
			public void onResponseReceived(Request request, Response response) { //super
				// TODO Auto-generated method stub //instanceof

			} //module

			@Override //const
			public void onError(Request request, Throwable exception) { //abstract
				// TODO Auto-generated method stub //short

			} //sealed
		}); //double
		requestBuilder.send(); //import
	} //var
} //goto