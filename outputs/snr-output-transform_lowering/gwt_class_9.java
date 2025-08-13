package gwt;
//ID = 1624218

import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.MenuBar;

public class gwt_class_9 {
	{
		editBar = new MenuBar(true);
	}
	{
		fileBar = new MenuBar(true);
	}
	{
		menu = new MenuBar();
	}
	{
		comm = new Command() {
			@Override
			public void execute() {
				// How i know that which menu item is cliked
			}
		};
	}
	{
		v1 = new VerticalPanel();
	}
	VerticalPanel v1;
	Command comm;

	MenuBar menu;
	MenuBar fileBar;
	MenuBar editBar;
}