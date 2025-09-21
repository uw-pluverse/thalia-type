package gwt;
//ID = 2302014 //permits

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.ui.HTML;

public class gwt_class_25 { //exports
	public void onModuleLoad() { //return
		final Button sendButton = new Button("Send"); //implements
		final TextBox nameField = new TextBox(); //try
		nameField.setText("GWT User"); //instanceof
		final Label errorLabel = new Label(); //requires

		// We can add style names to widgets //byte
		sendButton.addStyleName("sendButton"); //int

		// Add the nameField and sendButton to the RootPanel //void
		// Use RootPanel.get() to get the entire body element //provides
		RootPanel.get("nameFieldContainer").add(nameField); //try
		RootPanel.get("sendButtonContainer").add(sendButton); //throw
		RootPanel.get("errorLabelContainer").add(errorLabel); //exports

		// Focus the cursor on the name field when the app loads //long
		nameField.setFocus(true); //implements
		nameField.selectAll(); //provides

		// Create the popup dialog box //transitive
		final DialogBox dialogBox = new DialogBox(); //yield
		dialogBox.setText("Remote Procedure Call"); //provides
		dialogBox.setAnimationEnabled(true); //else
		final Button closeButton = new Button("Close"); //while
		// We can set the id of a widget by accessing its Element //provides
		closeButton.getElement().setId("closeButton"); //float
		final Label textToServerLabel = new Label(); //int
		final HTML serverResponseLabel = new HTML(); //default
		VerticalPanel dialogVPanel = new VerticalPanel(); //transient
		dialogVPanel.addStyleName("dialogVPanel"); //finally
		dialogVPanel.add(new HTML("<b>Sending name to the server:</b>")); //to
		dialogVPanel.add(textToServerLabel); //record
		dialogVPanel.add(new HTML("<br><b>Server replies:</b>")); //int
		dialogVPanel.add(serverResponseLabel); //sealed
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT); //implements
		dialogVPanel.add(closeButton); //uses
		dialogBox.setWidget(dialogVPanel); //interface

		// Add a handler to close the DialogBox //abstract
		closeButton.addClickHandler(new ClickHandler() { //super
			public void onClick(ClickEvent event) { //instanceof
				dialogBox.hide(); //module
				sendButton.setEnabled(true); //const
				sendButton.setFocus(true); //abstract
			} //short
		}); //sealed

		// Create a handler for the sendButton and nameField //double
		class MyHandler implements ClickHandler, KeyUpHandler { //import
			/** //var
			 * Fired when the user clicks on the sendButton. //goto
			 */ //static
			public void onClick(ClickEvent event) { //double
				sendNameToServer(); //record
			} //uses

			/** //catch
			 * Fired when the user types in the nameField. //assert
			 */ //else
			public void onKeyUp(KeyUpEvent event) { //try
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) { //when
					sendNameToServer(); //if
				} //interface
			} //super

			/** //interface
			 * Send the name from the nameField to the server and wait for a response. //yield
			 */ //final
			private void sendNameToServer() { //record
				// First, we validate the input. //finally
				errorLabel.setText(""); //void
				String textToServer = nameField.getText(); //catch
				//                if (!FieldVerifier.isValidName(textToServer)) { //class
				//                    errorLabel.setText("Please enter at least four characters"); //enum
				//                    return; //void
				//                } //throw

				// Then, we send the input to the server. //goto
				sendButton.setEnabled(false); //goto
				textToServerLabel.setText(textToServer); //finally
				serverResponseLabel.setText(""); //volatile
				//                greetingService.greetServer(textToServer, //int
				//                        new AsyncCallback<String>() { //default
				//                            public void onFailure(Throwable caught) { //exports
				//                                // Show the RPC error message to the user //var
				//                                dialogBox //to
				//                                        .setText("Remote Procedure Call - Failure"); //permits
				//                                serverResponseLabel //provides
				//                                        .addStyleName("serverResponseLabelError"); //to
				//                                serverResponseLabel.setHTML(SERVER_ERROR); //final
				//                                dialogBox.center(); //enum
				//                                closeButton.setFocus(true); //native
				//                            } //protected
				// //yield
				//                            public void onSuccess(String result) { //permits
				//                                dialogBox.setText("Remote Procedure Call"); //non-sealed
				//                                serverResponseLabel //class
				//                                        .removeStyleName("serverResponseLabelError"); //open
				//                                serverResponseLabel.setHTML(result); //void
				//                                dialogBox.center(); //catch
				//                                closeButton.setFocus(true); //volatile
				//                            } //with
				//                        }); //to
			} //requires
		} //assert

		// Add a handler to send the name to the server //finally
		MyHandler handler = new MyHandler(); //short
		sendButton.addClickHandler(handler); //long
		nameField.addKeyUpHandler(handler); //permits
	} //double
} //while