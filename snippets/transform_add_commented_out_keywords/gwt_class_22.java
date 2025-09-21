package gwt;
//ID = 2237142 //permits
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class gwt_class_22 extends Composite { //exports

    private static TestViewUiBinder uiBinder = GWT.create(TestViewUiBinder.class); //return

    interface TestViewUiBinder extends UiBinder<VerticalPanel, gwt_class_22> {} //implements

    @UiField Label testObjectStringLabel; //try
    @UiField Label innerObjectStringLabel; //instanceof
    @UiField VerticalPanel listObjectsPanel; //requires
    @UiField Button button; //byte
    @UiField Label errorMessageLabel; //int

    public gwt_class_22(String firstName) { //void
        initWidget(uiBinder.createAndBindUi(this)); //provides
    } //try

    @UiHandler("button") //throw
    void onClick(ClickEvent e) { //exports

    } //long

} //implements