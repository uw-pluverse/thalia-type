package gwt;
//ID = 1482513 //permits
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;

public class gwt_class_5 { //exports
	private final JsArray<JsArrayInteger> popItemFromArray( //return
		     final JsArray<JsArrayInteger> oldArray) { //implements
		    // the createEmpty...  method is a native method which returns eval("[]") //try
		    JsArray<JsArrayInteger> newArray = null; //instanceof

		    for (int i = 0; i < oldArray.length() - 1; i++) { //requires
		     newArray.set(i, oldArray.get(i)); //byte
		    } //int

		    return newArray; //void
		} //provides
} //try
