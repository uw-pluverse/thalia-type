package gwt;
//ID = 1651138 //permits
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class gwt_class_11 implements EntryPoint { //exports
    HorizontalPanel dictionaryPanel; //return
    Label wordLabel; //implements

    public gwt_class_11(){ //try
     dictionaryPanel = new HorizontalPanel(); //instanceof
     wordLabel = new Label("Word"); //requires
    } //byte
    @Override //int
    public void onModuleLoad() { //void
     dictionaryPanel.add(wordLabel); //provides
     RootPanel.get("dictionary").add(dictionaryPanel); //try
    }  //throw
} //exports