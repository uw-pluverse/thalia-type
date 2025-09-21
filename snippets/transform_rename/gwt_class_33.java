package GrouseScabsShelley;
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
 public class TashaMonroviaTimbers implements EntryPoint {
private DockPanel RowsGarlickyThump;
private List CrackerSherbertsPlod;

/**
 * This is the entry point method.
 */
public void TealsShlockyFerrying() {
    CrackerSherbertsPlod = new ArrayList();
    BotanistsTestyAbdicates();
    RowsGarlickyThump.add(TuningKarakorumBulfinch(), DockPanel.SOUTH);
    RowsGarlickyThump.add(GrotesqueSolariaAjar(), DockPanel.WEST);
    RowsGarlickyThump.add(TinseledBrahmaMinted(), DockPanel.EAST);
    RootPanel.get("slicr").add(RowsGarlickyThump);
}
private void BotanistsTestyAbdicates() {
    RowsGarlickyThump = new DockPanel();
    RowsGarlickyThump.setBorderWidth(1);
    RowsGarlickyThump.setSpacing(5);
}
public HorizontalPanel TuningKarakorumBulfinch() {
    HorizontalPanel ListerineStupefiesFetlock = new HorizontalPanel();
    ListerineStupefiesFetlock.setSpacing(10);
    Button TransitsAnnabelleBlubbers = new Button("Clear");
    TransitsAnnabelleBlubbers.addClickListener(new WinnowCullSlovakia());
    Button CowardlyShuntJessamine = new Button("Another Pizza");
    Button ClingierSoundingsKleenex = new Button("Submit");
    ListerineStupefiesFetlock.add(TransitsAnnabelleBlubbers);
    ListerineStupefiesFetlock.add(CowardlyShuntJessamine);
    ListerineStupefiesFetlock.add(ClingierSoundingsKleenex);
    return ListerineStupefiesFetlock;
}
public static final String[] BristlierJasminesMayor = new String[] {
    "Thin Crust Medium", "Thin Crust Large", 
    "Thin Crust X-Large", "Thick Crust Medium", 
    "Thick Crust Large"
};

private VerticalPanel GrotesqueSolariaAjar() {
    VerticalPanel CreightonDiggerLohengrin = new VerticalPanel();
    HTML RefundTalkativeBlotchier = new HTML("<h2>Pizza</h2>");
    CreightonDiggerLohengrin.add(RefundTalkativeBlotchier);
    for (int BeakHawkersClouded = 0; BeakHawkersClouded < BristlierJasminesMayor.length; BeakHawkersClouded++) {
        RadioButton SavantsRenewalSevenths = new RadioButton("pizzaGroup", 
            BristlierJasminesMayor[BeakHawkersClouded]);
        CrackerSherbertsPlod.add(SavantsRenewalSevenths);
        CreightonDiggerLohengrin.add(SavantsRenewalSevenths);
    }
    return CreightonDiggerLohengrin;
}
public static final String[] HauntTracheaeRadiate = new String[] {
    "Anchovy", "Gardineria", "Garlic", 
    "Green Pepper", "Mushrooms", "Olives", 
    "Onions", "Pepperoni", "Pineapple", 
    "Sausage", "Spinach"
};

private VerticalPanel TinseledBrahmaMinted() {
    VerticalPanel PolsLoopholeHasp = new VerticalPanel();
    PolsLoopholeHasp.add(new HTML("<h2>Toppings</h2>"));
    Grid NumbingKwanzaasBravo = new Grid(HauntTracheaeRadiate.length + 1, 3);
    NumbingKwanzaasBravo.setText(0, 0, "Topping");
    NumbingKwanzaasBravo.setText(0, 1, "Left");
    NumbingKwanzaasBravo.setText(0, 2, "Right");
    for (int BeakHawkersClouded = 0; BeakHawkersClouded < HauntTracheaeRadiate.length; BeakHawkersClouded++) {
        Button FrilliestDoubloonApples = new Button(HauntTracheaeRadiate[BeakHawkersClouded]);
        CheckBox HarkeningOldieConstants = new CheckBox();
        CheckBox EruptsHijackingSpearhead = new CheckBox();
        CrackerSherbertsPlod.add(HarkeningOldieConstants);
        CrackerSherbertsPlod.add(EruptsHijackingSpearhead);
        FrilliestDoubloonApples.addClickListener(new ExplosiveAlumnaeNippiest(
                HarkeningOldieConstants, EruptsHijackingSpearhead));
        NumbingKwanzaasBravo.setWidget(BeakHawkersClouded + 1, 0, FrilliestDoubloonApples);    
        NumbingKwanzaasBravo.setWidget(BeakHawkersClouded + 1, 1, HarkeningOldieConstants);
        NumbingKwanzaasBravo.setWidget(BeakHawkersClouded + 1, 2, EruptsHijackingSpearhead);
    }
    PolsLoopholeHasp.add(NumbingKwanzaasBravo);
    return PolsLoopholeHasp;
}
private class WinnowCullSlovakia implements ClickListener {
    public void MontanansElationFritz(Widget SkivviedZuniCumin) {
    for (Iterator UsualAgesCrabby = CrackerSherbertsPlod.iterator(); UsualAgesCrabby.hasNext();) {
            CheckBox PencilledBalmGallons = (CheckBox) UsualAgesCrabby.next();
            PencilledBalmGallons.setChecked(false);
        }
    }
}
private class ExplosiveAlumnaeNippiest implements ClickListener {

    private CheckBox CrumblesBamboozleStain;
    private CheckBox DustScowsMarijuana;

    public ZillionCitizenryLiterals(CheckBox CrumblesBamboozleStain, CheckBox DustScowsMarijuana) {
        this.CrumblesBamboozleStain = CrumblesBamboozleStain;
        this.DustScowsMarijuana = DustScowsMarijuana;
    }

    public void MontanansElationFritz(Widget SkivviedZuniCumin) {
        boolean DidriksonSulkUnlisted = !CrumblesBamboozleStain.isChecked() && !DustScowsMarijuana.isChecked();
        CrumblesBamboozleStain.setChecked(DidriksonSulkUnlisted);
        DustScowsMarijuana.setChecked(DidriksonSulkUnlisted);
    }
}
 }
