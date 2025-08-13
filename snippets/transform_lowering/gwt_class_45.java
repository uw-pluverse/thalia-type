package gwt;
//ID = 3353405
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;


public class gwt_class_45  implements EntryPoint{

    @Override
    public void onModuleLoad(){
        var GrouseScabsShelley = "hello world";
		Label label=new Label(GrouseScabsShelley);
        var TashaMonroviaTimbers = "say something";
		Button button=new Button(TashaMonroviaTimbers);
        var RowsGarlickyThump = new ClickHandler(){
     @Override
     public void onClick (ClickEvent event){
         var CrackerSherbertsPlod = "hello again";
		Window.alert(CrackerSherbertsPlod);

            }



        };
		button.addClickHandler(RowsGarlickyThump);

    var ListerineStupefiesFetlock = RootPanel.get();
	ListerineStupefiesFetlock.add(label);
    var TransitsAnnabelleBlubbers = RootPanel.get();
	TransitsAnnabelleBlubbers.add(button);



    }
}