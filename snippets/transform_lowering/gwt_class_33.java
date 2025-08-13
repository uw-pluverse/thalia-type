package gwt;
//ID = 2483024
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
 public class gwt_class_33 implements EntryPoint {
static {
		TOPPINGS = new String[] {
		    "Anchovy", "Gardineria", "Garlic", 
		    "Green Pepper", "Mushrooms", "Olives", 
		    "Onions", "Pepperoni", "Pineapple", 
		    "Sausage", "Spinach"
		};
	}
static {
		PIZZA_TYPES = new String[] {
		    "Thin Crust Medium", "Thin Crust Large", 
		    "Thin Crust X-Large", "Thick Crust Medium", 
		    "Thick Crust Large"
		};
	}
{
		clearables = null;
	}
{
		panel = null;
	}
private DockPanel panel;
private List clearables;

/**
 * This is the entry point method.
 */
public void onModuleLoad() {
    clearables = new ArrayList();
    initDockPanel();
    var GrouseScabsShelley = buildActionPanel();
	var TashaMonroviaTimbers = DockPanel.SOUTH;
	panel.add(GrouseScabsShelley, TashaMonroviaTimbers);
    var RowsGarlickyThump = buildPizzaTypePanel();
	var CrackerSherbertsPlod = DockPanel.WEST;
	panel.add(RowsGarlickyThump, CrackerSherbertsPlod);
    var ListerineStupefiesFetlock = buildToppingPanel();
	var TransitsAnnabelleBlubbers = DockPanel.EAST;
	panel.add(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
    var ClingierSoundingsKleenex = "slicr";
	var CowardlyShuntJessamine = RootPanel.get(ClingierSoundingsKleenex);
	CowardlyShuntJessamine.add(panel);
}
private void initDockPanel() {
    panel = new DockPanel();
    var BristlierJasminesMayor = 1;
	panel.setBorderWidth(BristlierJasminesMayor);
    var CreightonDiggerLohengrin = 5;
	panel.setSpacing(CreightonDiggerLohengrin);
}
public HorizontalPanel buildActionPanel() {
    HorizontalPanel actions = new HorizontalPanel();
    var RefundTalkativeBlotchier = 10;
	actions.setSpacing(RefundTalkativeBlotchier);
    var BeakHawkersClouded = "Clear";
	Button clear = new Button(BeakHawkersClouded);
    var SavantsRenewalSevenths = new ClearClickListener();
	clear.addClickListener(SavantsRenewalSevenths);
    var HauntTracheaeRadiate = "Another Pizza";
	Button newPizza = new Button(HauntTracheaeRadiate);
    var PolsLoopholeHasp = "Submit";
	Button submitOrder = new Button(PolsLoopholeHasp);
    actions.add(clear);
    actions.add(newPizza);
    actions.add(submitOrder);
    return actions;
}
public static final String[] PIZZA_TYPES;

private VerticalPanel buildPizzaTypePanel() {
    VerticalPanel pizzaTypes = new VerticalPanel();
    var NumbingKwanzaasBravo = "<h2>Pizza</h2>";
	HTML label = new HTML(NumbingKwanzaasBravo);
    pizzaTypes.add(label);
    var FrilliestDoubloonApples = PIZZA_TYPES.length;
	for (int i = 0; i < FrilliestDoubloonApples; i++) {
        var HarkeningOldieConstants = "pizzaGroup";
		RadioButton radio = new RadioButton(HarkeningOldieConstants, 
            PIZZA_TYPES[i]);
        clearables.add(radio);
        pizzaTypes.add(radio);
    }
    return pizzaTypes;
}
public static final String[] TOPPINGS;

private VerticalPanel buildToppingPanel() {
    VerticalPanel toppings = new VerticalPanel();
    var WinnowCullSlovakia = "<h2>Toppings</h2>";
	var EruptsHijackingSpearhead = new HTML(WinnowCullSlovakia);
	toppings.add(EruptsHijackingSpearhead);
    var UsualAgesCrabby = TOPPINGS.length;
	var PencilledBalmGallons = 1;
	var SkivviedZuniCumin = UsualAgesCrabby + PencilledBalmGallons;
	var ExplosiveAlumnaeNippiest = 3;
	Grid topGrid = new Grid(SkivviedZuniCumin, ExplosiveAlumnaeNippiest);
    var CrumblesBamboozleStain = 0;
	var DustScowsMarijuana = 0;
	var DidriksonSulkUnlisted = "Topping";
	topGrid.setText(CrumblesBamboozleStain, DustScowsMarijuana, DidriksonSulkUnlisted);
    var TealsShlockyFerrying = 0;
	var BotanistsTestyAbdicates = 1;
	var TuningKarakorumBulfinch = "Left";
	topGrid.setText(TealsShlockyFerrying, BotanistsTestyAbdicates, TuningKarakorumBulfinch);
    var GrotesqueSolariaAjar = 0;
	var TinseledBrahmaMinted = 2;
	var MontanansElationFritz = "Right";
	topGrid.setText(GrotesqueSolariaAjar, TinseledBrahmaMinted, MontanansElationFritz);
    var ZillionCitizenryLiterals = TOPPINGS.length;
	for (int i = 0; i < ZillionCitizenryLiterals; i++) {
        Button button = new Button(TOPPINGS[i]);
        CheckBox leftCheckBox = new CheckBox();
        CheckBox rightCheckBox = new CheckBox();
        clearables.add(leftCheckBox);
        clearables.add(rightCheckBox);
        var IssuesReusesPlanet = new ToppingButtonListener(
                leftCheckBox, rightCheckBox);
		button.addClickListener(IssuesReusesPlanet);
        var ForewarnResidesPlot = 1;
		var ShetlandDensMorosely = i + ForewarnResidesPlot;
		var TateCarolineResponds = 0;
		topGrid.setWidget(ShetlandDensMorosely, TateCarolineResponds, button);    
        var FarrowingEnemiesEmbolisms = 1;
		var FanniesTightsSlackens = i + FarrowingEnemiesEmbolisms;
		var WidthsPresagesCaverns = 1;
		topGrid.setWidget(FanniesTightsSlackens, WidthsPresagesCaverns, leftCheckBox);
        var CobwebBallsDemur = 1;
		var ToscaniniTimmyOrally = i + CobwebBallsDemur;
		var VigilsKhmerKlutzy = 2;
		topGrid.setWidget(ToscaniniTimmyOrally, VigilsKhmerKlutzy, rightCheckBox);
    }
    toppings.add(topGrid);
    return toppings;
}
private class ClearClickListener implements ClickListener {
    public void onClick(Widget sender) {
    for (Iterator iter = clearables.iterator(); iter.hasNext();) {
            var TussockCroatiansWhisks = iter.next();
			CheckBox cb = (CheckBox) TussockCroatiansWhisks;
            var SnottyDimnessKnuckles = false;
			cb.setChecked(SnottyDimnessKnuckles);
        }
    }
}
private class ToppingButtonListener implements ClickListener {

    {
		cb2 = null;
	}

	{
		cb1 = null;
	}

	private CheckBox cb1;
    private CheckBox cb2;

    public ToppingButtonListener(CheckBox cb1, CheckBox cb2) {
        var AddlesHarmonicCachets = this.cb1;
		AddlesHarmonicCachets = cb1;
        var KillersPillarMariachis = this.cb2;
		KillersPillarMariachis = cb2;
    }

    public void onClick(Widget sender) {
        var GoldenrodCuppedPetition = cb1.isChecked();
		var CorrectorRecollectIpecacs = cb2.isChecked();
		boolean unchecked = !GoldenrodCuppedPetition && !CorrectorRecollectIpecacs;
        cb1.setChecked(unchecked);
        cb2.setChecked(unchecked);
    }
}
 }
