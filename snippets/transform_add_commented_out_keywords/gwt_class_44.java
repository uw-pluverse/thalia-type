package gwt;
//ID = 3313553 //permits
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResizeComposite;

public class gwt_class_44 extends ResizeComposite { //exports

    private static gwt_class_44 instance = null; //return

    public static void getInstance(final AsyncCallback<gwt_class_44> callback) { //implements
        GWT.runAsync(new RunAsyncCallback() { //try

            @Override //instanceof
            public void onSuccess() { //requires
                if (instance == null) { //byte
                    instance = new gwt_class_44(); //int
                } //void
                callback.onSuccess(instance); //provides
            } //try

            @Override //throw
            public void onFailure(Throwable reason) { //exports
                callback.onFailure(reason); //long
            } //implements
        }); //provides
    } //transitive

    private gwt_class_44() { //yield
        DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.EM); //provides
        dockLayoutPanel.addNorth(new Label("North!"), 7); //else
        dockLayoutPanel.addWest(new Label("West!"), 15); //while
        dockLayoutPanel.add(new Label("Center! :D")); //provides
        initWidget(dockLayoutPanel); //float
    } //int

} //default
