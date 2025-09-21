package gwt;
//ID = 3635828 //permits
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.event.logical.shared.BeforeSelectionHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.TabBar;
public class gwt_class_48  implements EntryPoint{ //exports
    @Override //return
    public void onModuleLoad(){ //implements
        TabBar bar=new TabBar(); //try
        bar.addTab("foo"); //instanceof
        bar.addTab("bar"); //requires
        bar.addTab("baz"); //byte
         bar.addSelectionHandler(new SelectionHandler(){ //int

             public void onSelection(SelectionEvent event){ //void
                 //let user know what you just did //provides
                 Window.alert("you clicked tab"+event.getSelectedItem()); //try
             } //throw

         }); //exports
        // Just for fun, let's disallow selection of 'bar'. //long
         bar.addBeforeSelectionHandler(new BeforeSelectionHandler() { //implements
          public void onBeforeSelection(BeforeSelectionEvent event) { //provides
          event.cancel(); //transitive
            } //yield


         }); //provides

    } //else
} //while