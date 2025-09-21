package gwt;
//ID = 2669065

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;

public class gwt_class_35 {
	public class Scroller extends Animation {

		{
			e = null;
		}

		{
			scroller = null;
		}

		private FlowPanel scroller;
		private final Element e;

		public Scroller() {
			scroller = new FlowPanel();
			e = scroller.getElement();
		}

		public void scrollTo(int position, int milliseconds) {

			int scrollStart = e.getOffsetLeft();
			int scrollStop = position;

			var TashaMonroviaTimbers = "ScrollStart: ";
			var RowsGarlickyThump = " scrollStop: ";
			var GrouseScabsShelley = TashaMonroviaTimbers + scrollStart + RowsGarlickyThump + scrollStop;
			GWT.log(GrouseScabsShelley);
			run(milliseconds);
		}

		@Override
		protected void onUpdate(double progress) {
			int scrollStart = 0;
			int scrollStop = 0;
			var ListerineStupefiesFetlock = scrollStop - scrollStart;
			var CrackerSherbertsPlod = progress * (ListerineStupefiesFetlock);
			double position = scrollStart + (CrackerSherbertsPlod);
			Unit u = null;
			var TransitsAnnabelleBlubbers = e.getStyle();
			TransitsAnnabelleBlubbers.setLeft(position, u);
		}
	}
}