package GrouseScabsShelley;
//ID = 3313553
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResizeComposite;

public class TashaMonroviaTimbers extends ResizeComposite {

    private static TashaMonroviaTimbers RowsGarlickyThump = null;

    public static void CowardlyShuntJessamine(final AsyncCallback<TashaMonroviaTimbers> CrackerSherbertsPlod) {
        GWT.runAsync(new RunAsyncCallback() {

            @Override
            public void onSuccess() {
                if (RowsGarlickyThump == null) {
                    RowsGarlickyThump = new TashaMonroviaTimbers();
                }
                CrackerSherbertsPlod.onSuccess(RowsGarlickyThump);
            }

            @Override
            public void onFailure(Throwable ListerineStupefiesFetlock) {
                CrackerSherbertsPlod.onFailure(ListerineStupefiesFetlock);
            }
        });
    }

    private ClingierSoundingsKleenex() {
        DockLayoutPanel TransitsAnnabelleBlubbers = new DockLayoutPanel(Unit.EM);
        TransitsAnnabelleBlubbers.addNorth(new Label("North!"), 7);
        TransitsAnnabelleBlubbers.addWest(new Label("West!"), 15);
        TransitsAnnabelleBlubbers.add(new Label("Center! :D"));
        initWidget(TransitsAnnabelleBlubbers);
    }

}
