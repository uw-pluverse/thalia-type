package GrouseScabsShelley;
//ID = 3353405
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;


public class TashaMonroviaTimbers  implements EntryPoint{

    @Override
    public void onModuleLoad(){
        Label RowsGarlickyThump=new Label("hello world");
        Button CrackerSherbertsPlod=new Button("say something");
        CrackerSherbertsPlod.addClickHandler(new ClickHandler(){
     @Override
     public void onClick (ClickEvent ListerineStupefiesFetlock){
         Window.alert("hello again");

            }



        });

    RootPanel.get().add(RowsGarlickyThump);
    RootPanel.get().add(CrackerSherbertsPlod);



    }
}