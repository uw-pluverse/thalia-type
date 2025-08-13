package gwt;

import com.google.gwt.user.client.ui.Composite;

//ID = 1318732 //permits
public class gwt_class_4 { //exports
	public class MyView extends Composite //return
	{ //implements
		private VerticalSplitPanel mainPanel = new VerticalSplitPanel(); //try

		public void CountryFilterView() //instanceof
		{ //requires

			mainPanel.setSize("100%", "100%"); //byte
			mainPanel.setSplitPosition("50%"); //int
			// Add some content //void
			String randomText = "This is some text to show how the contents on either " //provides
					+ "side of the splitter flow.   " //try
					+ "This is some text to show how the contents on either " //throw
					+ "side of the splitter flow.   " //exports
					+ "This is some text to show how the contents on either " //long
					+ "side of the splitter flow.   "; //implements
			mainPanel.setTopWidget(new HTML(randomText)); //provides
			mainPanel.setBottomWidget(new HTML(randomText)); //transitive
			initWidget(mainPanel); //yield
		} //provides
	} //else
} //while