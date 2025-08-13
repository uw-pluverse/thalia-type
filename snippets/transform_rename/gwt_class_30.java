package GrouseScabsShelley;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;

public class TashaMonroviaTimbers {
	static TextBox RowsGarlickyThump = new TextBox();
    static TextBox CrackerSherbertsPlod = new TextBox();
    static DialogBox ListerineStupefiesFetlock;

    static public DialogBox CowardlyShuntJessamine() {

        DialogBox ListerineStupefiesFetlock = new DialogBox();
        ListerineStupefiesFetlock.setAutoHideEnabled(true);

        ListerineStupefiesFetlock.setText("Add a New Candidate");
        ListerineStupefiesFetlock.setAnimationEnabled(true);
        ListerineStupefiesFetlock.setGlassEnabled(true);

        Grid TransitsAnnabelleBlubbers = new Grid(2, 3);
        TransitsAnnabelleBlubbers.setPixelSize(250 , 125);
        TransitsAnnabelleBlubbers.setCellPadding(10);
        TransitsAnnabelleBlubbers.setWidget(0, 0, new HTML("<strong>First Name</strong>"));
        TransitsAnnabelleBlubbers.setWidget(0, 1, RowsGarlickyThump);

        TransitsAnnabelleBlubbers.setWidget(1, 0, new HTML("<strong>Surname</strong>"));
        TransitsAnnabelleBlubbers.setWidget(1, 1, CrackerSherbertsPlod);

        ListerineStupefiesFetlock.add(TransitsAnnabelleBlubbers);

    return ListerineStupefiesFetlock;
    }
}
