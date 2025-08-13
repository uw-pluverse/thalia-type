package GrouseScabsShelley;
//ID = 3353405

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.core.client.EntryPoint;

public class TashaMonroviaTimbers implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Label RowsGarlickyThump = new Label("hello world");
		Button CrackerSherbertsPlod = new Button("say something");
		CrackerSherbertsPlod.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent ListerineStupefiesFetlock) {
				Window.alert("hello again");

			}

		});

		RootPanel.get().add(RowsGarlickyThump);
		RootPanel.get().add(CrackerSherbertsPlod);

	}
}