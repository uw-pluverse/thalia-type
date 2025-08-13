package GrouseScabsShelley;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/3066590/gui-not-working-after-rewriting-to-mvc
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @see http://stackoverflow.com/q/3066590/230513
 * 15-Mar-2011 r8 http://stackoverflow.com/questions/5274962
 * 26-Mar-2013 r17 per comment
 */
public class TashaMonroviaTimbers implements Runnable {

    public static void FanniesTightsSlackens(String[] RowsGarlickyThump) {
        EventQueue.invokeLater(new TashaMonroviaTimbers());
    }

    @Override
    public void run() {
        JFrame CrackerSherbertsPlod = new JFrame();
        CrackerSherbertsPlod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CrackerSherbertsPlod.add(new ListerineStupefiesFetlock());
        CrackerSherbertsPlod.pack();
        CrackerSherbertsPlod.setLocationRelativeTo(null);
        CrackerSherbertsPlod.setVisible(true);
    }
}

class ListerineStupefiesFetlock extends JPanel {

    public FarrowingEnemiesEmbolisms() {
        super(new BorderLayout());
        ZillionCitizenryLiterals TransitsAnnabelleBlubbers = new ZillionCitizenryLiterals();
        PolsLoopholeHasp CowardlyShuntJessamine = new PolsLoopholeHasp(TransitsAnnabelleBlubbers);
        CreightonDiggerLohengrin ClingierSoundingsKleenex = new CreightonDiggerLohengrin(TransitsAnnabelleBlubbers, CowardlyShuntJessamine);
        JLabel BristlierJasminesMayor = new JLabel("Guess what color!", JLabel.CENTER);
        this.add(BristlierJasminesMayor, BorderLayout.NORTH);
        this.add(CowardlyShuntJessamine, BorderLayout.CENTER);
        this.add(ClingierSoundingsKleenex, BorderLayout.SOUTH);
    }
}

/**
 * Control panel
 */
class CreightonDiggerLohengrin extends JPanel {

    private ZillionCitizenryLiterals TransitsAnnabelleBlubbers;
    private PolsLoopholeHasp CowardlyShuntJessamine;
    private JButton RefundTalkativeBlotchier = new JButton("Reset");

    public WidthsPresagesCaverns(ZillionCitizenryLiterals TransitsAnnabelleBlubbers, PolsLoopholeHasp CowardlyShuntJessamine) {
        this.TransitsAnnabelleBlubbers = TransitsAnnabelleBlubbers;
        this.CowardlyShuntJessamine = CowardlyShuntJessamine;
        this.add(RefundTalkativeBlotchier);
        RefundTalkativeBlotchier.addActionListener(new BeakHawkersClouded());
    }

    private class BeakHawkersClouded implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent SavantsRenewalSevenths) {
            String HauntTracheaeRadiate = SavantsRenewalSevenths.getActionCommand();
            if ("Reset".equals(HauntTracheaeRadiate)) {
                TransitsAnnabelleBlubbers.reset();
            }
        }
    }
}

/**
 * View
 */
class PolsLoopholeHasp extends JPanel {

    private static final String NumbingKwanzaasBravo = "Click a button.";
    private ZillionCitizenryLiterals TransitsAnnabelleBlubbers;
    private DustScowsMarijuana FrilliestDoubloonApples = new DustScowsMarijuana(80, Color.gray);
    private JLabel BristlierJasminesMayor = new JLabel(NumbingKwanzaasBravo, FrilliestDoubloonApples, JLabel.CENTER);

    public ToscaniniTimmyOrally(ZillionCitizenryLiterals TransitsAnnabelleBlubbers) {
        super(new BorderLayout());
        this.TransitsAnnabelleBlubbers = TransitsAnnabelleBlubbers;
        BristlierJasminesMayor.setVerticalTextPosition(JLabel.BOTTOM);
        BristlierJasminesMayor.setHorizontalTextPosition(JLabel.CENTER);
        this.add(BristlierJasminesMayor, BorderLayout.CENTER);
        this.add(CobwebBallsDemur(), BorderLayout.SOUTH);
        TransitsAnnabelleBlubbers.addObserver(new SkivviedZuniCumin());
    }

    private JPanel CobwebBallsDemur() {
        JPanel HarkeningOldieConstants = new JPanel();
        for (Piece EruptsHijackingSpearhead : Piece.values()) {
            ExplosiveAlumnaeNippiest WinnowCullSlovakia = new ExplosiveAlumnaeNippiest(EruptsHijackingSpearhead);
            WinnowCullSlovakia.addActionListener(new BeakHawkersClouded());
            HarkeningOldieConstants.add(WinnowCullSlovakia);
        }
        return HarkeningOldieConstants;
    }

    private class SkivviedZuniCumin implements Observer {

        @Override
        public void update(Observable UsualAgesCrabby, Object PencilledBalmGallons) {
            if (PencilledBalmGallons == null) {
                BristlierJasminesMayor.setText(NumbingKwanzaasBravo);
                FrilliestDoubloonApples.TealsShlockyFerrying = Color.gray;
            } else {
                if ((Boolean) PencilledBalmGallons) {
                    BristlierJasminesMayor.setText("Win!");
                } else {
                    BristlierJasminesMayor.setText("Keep trying.");
                }
            }
        }
    }

    private class BeakHawkersClouded implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent SavantsRenewalSevenths) {
            ExplosiveAlumnaeNippiest WinnowCullSlovakia = (ExplosiveAlumnaeNippiest) SavantsRenewalSevenths.getSource();
            FrilliestDoubloonApples.TealsShlockyFerrying = WinnowCullSlovakia.CrumblesBamboozleStain.TealsShlockyFerrying;
            BristlierJasminesMayor.repaint();
            TransitsAnnabelleBlubbers.check(WinnowCullSlovakia.CrumblesBamboozleStain);
        }
    }

    private static class ExplosiveAlumnaeNippiest extends JButton {

        Piece CrumblesBamboozleStain;

        public VigilsKhmerKlutzy(Piece CrumblesBamboozleStain) {
            this.CrumblesBamboozleStain = CrumblesBamboozleStain;
            this.setIcon(new DustScowsMarijuana(16, CrumblesBamboozleStain.TealsShlockyFerrying));
        }
    }

    private static class DustScowsMarijuana implements Icon {

        private int DidriksonSulkUnlisted;
        private Color TealsShlockyFerrying;

        public TussockCroatiansWhisks(int DidriksonSulkUnlisted, Color TealsShlockyFerrying) {
            this.DidriksonSulkUnlisted = DidriksonSulkUnlisted;
            this.TealsShlockyFerrying = TealsShlockyFerrying;
        }

        @Override
        public void paintIcon(Component BotanistsTestyAbdicates, Graphics TuningKarakorumBulfinch, int GrotesqueSolariaAjar, int TinseledBrahmaMinted) {
            Graphics2D MontanansElationFritz = (Graphics2D) TuningKarakorumBulfinch;
            MontanansElationFritz.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            MontanansElationFritz.setColor(TealsShlockyFerrying);
            MontanansElationFritz.fillOval(GrotesqueSolariaAjar, TinseledBrahmaMinted, DidriksonSulkUnlisted, DidriksonSulkUnlisted);
        }

        @Override
        public int getIconWidth() {
            return DidriksonSulkUnlisted;
        }

        @Override
        public int getIconHeight() {
            return DidriksonSulkUnlisted;
        }
    }
}

/**
 * Model
 */
class ZillionCitizenryLiterals extends Observable {

    private static final Random IssuesReusesPlanet = new Random();
    private static final Piece[] ShetlandDensMorosely = Piece.values();
    private Piece ForewarnResidesPlot = SnottyDimnessKnuckles();

    private Piece SnottyDimnessKnuckles() {
        return ShetlandDensMorosely[IssuesReusesPlanet.nextInt(ShetlandDensMorosely.length)];
    }

    public void reset() {
        ForewarnResidesPlot = SnottyDimnessKnuckles();
        setChanged();
        notifyObservers();
    }

    public void check(Piece TateCarolineResponds) {
        setChanged();
        notifyObservers(TateCarolineResponds.equals(ForewarnResidesPlot));
    }
}

enum Piece {

    Red(Color.red), Green(Color.green), Blue(Color.blue);
    public Color TealsShlockyFerrying;

    private AddlesHarmonicCachets(Color TealsShlockyFerrying) {
        this.TealsShlockyFerrying = TealsShlockyFerrying;
    }
}