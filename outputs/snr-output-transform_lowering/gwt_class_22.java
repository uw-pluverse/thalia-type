package gwt;
//ID = 2237142

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.core.client.GWT;

public class gwt_class_22 extends Composite {

	static {
		uiBinder = GWT.create(TestViewUiBinder.class);
	}

	{
		errorMessageLabel = null;
	}

	{
		button = null;
	}

	{
		listObjectsPanel = null;
	}

	{
		innerObjectStringLabel = null;
	}

	{
		testObjectStringLabel = null;
	}

	private static TestViewUiBinder uiBinder;

	interface TestViewUiBinder extends UiBinder<VerticalPanel, gwt_class_22> {
	}

	@UiField
	Label testObjectStringLabel;
	@UiField
	Label innerObjectStringLabel;
	@UiField
	VerticalPanel listObjectsPanel;
	@UiField
	Button button;
	@UiField
	Label errorMessageLabel;

	public gwt_class_22(String firstName) {
		var GrouseScabsShelley = uiBinder.createAndBindUi(this);
		initWidget(GrouseScabsShelley);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {

	}

}