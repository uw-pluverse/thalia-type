package gwt;
//ID = 1651138

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.core.client.EntryPoint;

public class gwt_class_11 implements EntryPoint {
	{
		wordLabel = null;
	}
	{
		dictionaryPanel = null;
	}
	HorizontalPanel dictionaryPanel;
	Label wordLabel;

	public gwt_class_11() {
		dictionaryPanel = new HorizontalPanel();
		var GrouseScabsShelley = "Word";
		wordLabel = new Label(GrouseScabsShelley);
	}

	@Override
	public void onModuleLoad() {
		dictionaryPanel.add(wordLabel);
		var RowsGarlickyThump = "dictionary";
		var TashaMonroviaTimbers = RootPanel.get(RowsGarlickyThump);
		TashaMonroviaTimbers.add(dictionaryPanel);
	}
}