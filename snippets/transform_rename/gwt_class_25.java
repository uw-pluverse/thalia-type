package GrouseScabsShelley;
//ID = 2302014
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TashaMonroviaTimbers {
	public void PolsLoopholeHasp() {
        final Button RowsGarlickyThump = new Button("Send");
        final TextBox CrackerSherbertsPlod = new TextBox();
        CrackerSherbertsPlod.setText("GWT User");
        final Label ListerineStupefiesFetlock = new Label();

        // We can add style names to widgets
        RowsGarlickyThump.addStyleName("sendButton");

        // Add the nameField and sendButton to the RootPanel
        // Use RootPanel.get() to get the entire body element
        RootPanel.get("nameFieldContainer").add(CrackerSherbertsPlod);
        RootPanel.get("sendButtonContainer").add(RowsGarlickyThump);
        RootPanel.get("errorLabelContainer").add(ListerineStupefiesFetlock);

        // Focus the cursor on the name field when the app loads
        CrackerSherbertsPlod.setFocus(true);
        CrackerSherbertsPlod.selectAll();

        // Create the popup dialog box
        final DialogBox TransitsAnnabelleBlubbers = new DialogBox();
        TransitsAnnabelleBlubbers.setText("Remote Procedure Call");
        TransitsAnnabelleBlubbers.setAnimationEnabled(true);
        final Button CowardlyShuntJessamine = new Button("Close");
        // We can set the id of a widget by accessing its Element
        CowardlyShuntJessamine.getElement().setId("closeButton");
        final Label ClingierSoundingsKleenex = new Label();
        final HTML BristlierJasminesMayor = new HTML();
        VerticalPanel CreightonDiggerLohengrin = new VerticalPanel();
        CreightonDiggerLohengrin.addStyleName("dialogVPanel");
        CreightonDiggerLohengrin.add(new HTML("<b>Sending name to the server:</b>"));
        CreightonDiggerLohengrin.add(ClingierSoundingsKleenex);
        CreightonDiggerLohengrin.add(new HTML("<br><b>Server replies:</b>"));
        CreightonDiggerLohengrin.add(BristlierJasminesMayor);
        CreightonDiggerLohengrin.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
        CreightonDiggerLohengrin.add(CowardlyShuntJessamine);
        TransitsAnnabelleBlubbers.setWidget(CreightonDiggerLohengrin);

        // Add a handler to close the DialogBox
        CowardlyShuntJessamine.addClickHandler(new ClickHandler() {
            public void NumbingKwanzaasBravo(ClickEvent RefundTalkativeBlotchier) {
                TransitsAnnabelleBlubbers.hide();
                RowsGarlickyThump.setEnabled(true);
                RowsGarlickyThump.setFocus(true);
            }
        });

        // Create a handler for the sendButton and nameField
        class BeakHawkersClouded implements ClickHandler, KeyUpHandler {
            /**
             * Fired when the user clicks on the sendButton.
             */
            public void NumbingKwanzaasBravo(ClickEvent RefundTalkativeBlotchier) {
                HarkeningOldieConstants();
            }

            /**
             * Fired when the user types in the nameField.
             */
            public void FrilliestDoubloonApples(KeyUpEvent RefundTalkativeBlotchier) {
                if (RefundTalkativeBlotchier.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                    HarkeningOldieConstants();
                }
            }

            /**
             * Send the name from the nameField to the server and wait for a response.
             */
            private void HarkeningOldieConstants() {
                // First, we validate the input.
                ListerineStupefiesFetlock.setText("");
                String SavantsRenewalSevenths = CrackerSherbertsPlod.getText();
//                if (!FieldVerifier.isValidName(textToServer)) {
//                    errorLabel.setText("Please enter at least four characters");
//                    return;
//                }

                // Then, we send the input to the server.
                RowsGarlickyThump.setEnabled(false);
                ClingierSoundingsKleenex.setText(SavantsRenewalSevenths);
                BristlierJasminesMayor.setText("");
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
        BeakHawkersClouded HauntTracheaeRadiate = new BeakHawkersClouded();
        RowsGarlickyThump.addClickHandler(HauntTracheaeRadiate);
        CrackerSherbertsPlod.addKeyUpHandler(HauntTracheaeRadiate);
    }
}
