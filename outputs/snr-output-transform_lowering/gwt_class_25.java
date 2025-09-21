package gwt;
//ID = 2302014

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.ui.HTML;

public class gwt_class_25 {
	public void onModuleLoad() {
		var GrouseScabsShelley = "Send";
		final Button sendButton = new Button(GrouseScabsShelley);
		final TextBox nameField = new TextBox();
		var TashaMonroviaTimbers = "GWT User";
		nameField.setText(TashaMonroviaTimbers);
		final Label errorLabel = new Label();

		var RowsGarlickyThump = "sendButton";
		// We can add style names to widgets
		sendButton.addStyleName(RowsGarlickyThump);

		var ListerineStupefiesFetlock = "nameFieldContainer";
		var CrackerSherbertsPlod = RootPanel.get(ListerineStupefiesFetlock);
		// Add the nameField and sendButton to the RootPanel
		// Use RootPanel.get() to get the entire body element
		CrackerSherbertsPlod.add(nameField);
		var CowardlyShuntJessamine = "sendButtonContainer";
		var TransitsAnnabelleBlubbers = RootPanel.get(CowardlyShuntJessamine);
		TransitsAnnabelleBlubbers.add(sendButton);
		var BristlierJasminesMayor = "errorLabelContainer";
		var ClingierSoundingsKleenex = RootPanel.get(BristlierJasminesMayor);
		ClingierSoundingsKleenex.add(errorLabel);

		var CreightonDiggerLohengrin = true;
		// Focus the cursor on the name field when the app loads
		nameField.setFocus(CreightonDiggerLohengrin);
		nameField.selectAll();

		// Create the popup dialog box
		final DialogBox dialogBox = new DialogBox();
		var RefundTalkativeBlotchier = "Remote Procedure Call";
		dialogBox.setText(RefundTalkativeBlotchier);
		var BeakHawkersClouded = true;
		dialogBox.setAnimationEnabled(BeakHawkersClouded);
		var SavantsRenewalSevenths = "Close";
		final Button closeButton = new Button(SavantsRenewalSevenths);
		var HauntTracheaeRadiate = closeButton.getElement();
		var PolsLoopholeHasp = "closeButton";
		// We can set the id of a widget by accessing its Element
		HauntTracheaeRadiate.setId(PolsLoopholeHasp);
		final Label textToServerLabel = new Label();
		final HTML serverResponseLabel = new HTML();
		VerticalPanel dialogVPanel = new VerticalPanel();
		var NumbingKwanzaasBravo = "dialogVPanel";
		dialogVPanel.addStyleName(NumbingKwanzaasBravo);
		var HarkeningOldieConstants = "<b>Sending name to the server:</b>";
		var FrilliestDoubloonApples = new HTML(HarkeningOldieConstants);
		dialogVPanel.add(FrilliestDoubloonApples);
		dialogVPanel.add(textToServerLabel);
		var WinnowCullSlovakia = "<br><b>Server replies:</b>";
		var EruptsHijackingSpearhead = new HTML(WinnowCullSlovakia);
		dialogVPanel.add(EruptsHijackingSpearhead);
		dialogVPanel.add(serverResponseLabel);
		var SkivviedZuniCumin = VerticalPanel.ALIGN_RIGHT;
		dialogVPanel.setHorizontalAlignment(SkivviedZuniCumin);
		dialogVPanel.add(closeButton);
		dialogBox.setWidget(dialogVPanel);

		var UsualAgesCrabby = new ClickHandler() {
			public void onClick(ClickEvent event) {
				dialogBox.hide();
				var PencilledBalmGallons = true;
				sendButton.setEnabled(PencilledBalmGallons);
				var ExplosiveAlumnaeNippiest = true;
				sendButton.setFocus(ExplosiveAlumnaeNippiest);
			}
		};
		// Add a handler to close the DialogBox
		closeButton.addClickHandler(UsualAgesCrabby);

		// Create a handler for the sendButton and nameField
		class MyHandler implements ClickHandler, KeyUpHandler {
			/**
			 * Fired when the user clicks on the sendButton.
			 */
			public void onClick(ClickEvent event) {
				sendNameToServer();
			}

			/**
			 * Fired when the user types in the nameField.
			 */
			public void onKeyUp(KeyUpEvent event) {
				var DustScowsMarijuana = event.getNativeKeyCode();
				var DidriksonSulkUnlisted = KeyCodes.KEY_ENTER;
				var CrumblesBamboozleStain = DustScowsMarijuana == DidriksonSulkUnlisted;
				if (CrumblesBamboozleStain) {
					sendNameToServer();
				}
			}

			/**
			 * Send the name from the nameField to the server and wait for a response.
			 */
			private void sendNameToServer() {
				var TealsShlockyFerrying = "";
				// First, we validate the input.
				errorLabel.setText(TealsShlockyFerrying);
				String textToServer = nameField.getText();
				//                if (!FieldVerifier.isValidName(textToServer)) {
				//                    errorLabel.setText("Please enter at least four characters");
				//                    return;
				//                }

				var BotanistsTestyAbdicates = false;
				// Then, we send the input to the server.
				sendButton.setEnabled(BotanistsTestyAbdicates);
				textToServerLabel.setText(textToServer);
				var TuningKarakorumBulfinch = "";
				serverResponseLabel.setText(TuningKarakorumBulfinch);
				//                greetingService.greetServer(textToServer,
				//                        new AsyncCallback<String>() {
				//                            public void onFailure(Throwable caught) {
				//                                // Show the RPC error message to the user
				//                                dialogBox
				//                                        .setText("Remote Procedure Call - Failure");
				//                                serverResponseLabel
				//                                        .addStyleName("serverResponseLabelError");
				//                                serverResponseLabel.setHTML(SERVER_ERROR);
				//                                dialogBox.center();
				//                                closeButton.setFocus(true);
				//                            }
				//
				//                            public void onSuccess(String result) {
				//                                dialogBox.setText("Remote Procedure Call");
				//                                serverResponseLabel
				//                                        .removeStyleName("serverResponseLabelError");
				//                                serverResponseLabel.setHTML(result);
				//                                dialogBox.center();
				//                                closeButton.setFocus(true);
				//                            }
				//                        });
			}
		}

		// Add a handler to send the name to the server
		MyHandler handler = new MyHandler();
		sendButton.addClickHandler(handler);
		nameField.addKeyUpHandler(handler);
	}
}