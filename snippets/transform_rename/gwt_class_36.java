package GrouseScabsShelley;
//ID = 2679247
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class TashaMonroviaTimbers {
	public static void CreightonDiggerLohengrin(String RowsGarlickyThump[]){
		int CrackerSherbertsPlod = 200;
	    int ListerineStupefiesFetlock = 200;
	    int TransitsAnnabelleBlubbers = 40;

	    AbsolutePanel CowardlyShuntJessamine = new AbsolutePanel();
	    CowardlyShuntJessamine.setSize(CrackerSherbertsPlod + "px", ListerineStupefiesFetlock + "px");      

	    SimplePanel ClingierSoundingsKleenex = new SimplePanel();
	    ClingierSoundingsKleenex.setWidth(CrackerSherbertsPlod + "px");
	    ClingierSoundingsKleenex.setHeight(ListerineStupefiesFetlock + "px");
	    ClingierSoundingsKleenex.getElement().getStyle().setBackgroundColor("red");           

	    SimplePanel BristlierJasminesMayor = new SimplePanel();
	    BristlierJasminesMayor.setWidth(CrackerSherbertsPlod + "px");
	    BristlierJasminesMayor.setHeight(TransitsAnnabelleBlubbers + "px");
	    BristlierJasminesMayor.getElement().getStyle().setBackgroundColor("black");
	    //Setting the IE opacity to 20% on the black element in order to obtain the see through effect.
	    BristlierJasminesMayor.getElement().getStyle().setProperty("filter", "alpha(opacity=20)"); 

	    CowardlyShuntJessamine.add(ClingierSoundingsKleenex, 0, 0);
	    CowardlyShuntJessamine.add(BristlierJasminesMayor, 0, 0);

	    RootPanel.get("test").add(CowardlyShuntJessamine);

	    //The next line causes the problem. 
	    CowardlyShuntJessamine.getElement().getStyle().setProperty("filter", "alpha(opacity=100)");
	}
}
