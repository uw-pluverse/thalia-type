package common_JDK;
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
public class Class_6 implements Runnable {

    public static void main(String[] args) {
        var GrouseScabsShelley = new Class_6();
		EventQueue.invokeLater(GrouseScabsShelley);
    }

    @Override
    public void run() {
        JFrame f = new JFrame();
        var TashaMonroviaTimbers = JFrame.EXIT_ON_CLOSE;
		f.setDefaultCloseOperation(TashaMonroviaTimbers);
        var RowsGarlickyThump = new MainPanel();
		f.add(RowsGarlickyThump);
        f.pack();
        var CrackerSherbertsPlod = null;
		f.setLocationRelativeTo(CrackerSherbertsPlod);
        var ListerineStupefiesFetlock = true;
		f.setVisible(ListerineStupefiesFetlock);
    }
}

class MainPanel extends JPanel {

    public MainPanel() {
        var TransitsAnnabelleBlubbers = new BorderLayout();
		super(TransitsAnnabelleBlubbers);
        Model model = new Model();
        View view = new View(model);
        Control control = new Control(model, view);
        var CowardlyShuntJessamine = "Guess what color!";
		var ClingierSoundingsKleenex = JLabel.CENTER;
		JLabel label = new JLabel(CowardlyShuntJessamine, ClingierSoundingsKleenex);
        var BristlierJasminesMayor = BorderLayout.NORTH;
		this.add(label, BristlierJasminesMayor);
        var CreightonDiggerLohengrin = BorderLayout.CENTER;
		this.add(view, CreightonDiggerLohengrin);
        var RefundTalkativeBlotchier = BorderLayout.SOUTH;
		this.add(control, RefundTalkativeBlotchier);
    }
}

/**
 * Control panel
 */
class Control extends JPanel {

    {
		reset = new JButton("Reset");
	}

	{
		view = null;
	}

	{
		model = null;
	}

	private Model model;
    private View view;
    private JButton reset;

    public Control(Model model, View view) {
        var BeakHawkersClouded = this.model;
		BeakHawkersClouded = model;
        var SavantsRenewalSevenths = this.view;
		SavantsRenewalSevenths = view;
        this.add(reset);
        var HauntTracheaeRadiate = new ButtonHandler();
		reset.addActionListener(HauntTracheaeRadiate);
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            var NumbingKwanzaasBravo = "Reset";
			var PolsLoopholeHasp = NumbingKwanzaasBravo.equals(cmd);
			if (PolsLoopholeHasp) {
                model.reset();
            }
        }
    }
}

/**
 * View
 */
class View extends JPanel {

    static {
		s = "Click a button.";
	}

	{
		label = new JLabel(s, icon, JLabel.CENTER);
	}

	{
		icon = new ColorIcon(80, Color.gray);
	}

	{
		model = null;
	}

	private static final String s;
    private Model model;
    private ColorIcon icon;
    private JLabel label;

    public View(Model model) {
        var FrilliestDoubloonApples = new BorderLayout();
		super(FrilliestDoubloonApples);
        var HarkeningOldieConstants = this.model;
		HarkeningOldieConstants = model;
        var EruptsHijackingSpearhead = JLabel.BOTTOM;
		label.setVerticalTextPosition(EruptsHijackingSpearhead);
        var WinnowCullSlovakia = JLabel.CENTER;
		label.setHorizontalTextPosition(WinnowCullSlovakia);
        var SkivviedZuniCumin = BorderLayout.CENTER;
		this.add(label, SkivviedZuniCumin);
        var UsualAgesCrabby = genButtonPanel();
		var PencilledBalmGallons = BorderLayout.SOUTH;
		this.add(UsualAgesCrabby, PencilledBalmGallons);
        var ExplosiveAlumnaeNippiest = new ModelObserver();
		model.addObserver(ExplosiveAlumnaeNippiest);
    }

    private JPanel genButtonPanel() {
        JPanel panel = new JPanel();
        var CrumblesBamboozleStain = Piece.values();
		for (Piece p : CrumblesBamboozleStain) {
            PieceButton pb = new PieceButton(p);
            var DustScowsMarijuana = new ButtonHandler();
			pb.addActionListener(DustScowsMarijuana);
            panel.add(pb);
        }
        return panel;
    }

    private class ModelObserver implements Observer {

        @Override
        public void update(Observable o, Object arg) {
            var TealsShlockyFerrying = null;
			var DidriksonSulkUnlisted = arg == TealsShlockyFerrying;
			if (DidriksonSulkUnlisted) {
                label.setText(s);
                var BotanistsTestyAbdicates = icon.color;
				BotanistsTestyAbdicates = Color.gray;
            } else {
                if ((Boolean) arg) {
                    var TuningKarakorumBulfinch = "Win!";
					label.setText(TuningKarakorumBulfinch);
                } else {
                    var GrotesqueSolariaAjar = "Keep trying.";
					label.setText(GrotesqueSolariaAjar);
                }
            }
        }
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            var TinseledBrahmaMinted = e.getSource();
			PieceButton pb = (PieceButton) TinseledBrahmaMinted;
            var MontanansElationFritz = icon.color;
			MontanansElationFritz = pb.piece.color;
            label.repaint();
            var ZillionCitizenryLiterals = pb.piece;
			model.check(ZillionCitizenryLiterals);
        }
    }

    private static class PieceButton extends JButton {

        {
			piece = null;
		}

		Piece piece;

        public PieceButton(Piece piece) {
            var IssuesReusesPlanet = this.piece;
			IssuesReusesPlanet = piece;
            var ForewarnResidesPlot = 16;
			var TateCarolineResponds = piece.color;
			var ShetlandDensMorosely = new ColorIcon(ForewarnResidesPlot, TateCarolineResponds);
			this.setIcon(ShetlandDensMorosely);
        }
    }

    private static class ColorIcon implements Icon {

        {
			color = null;
		}

		{
			size = null;
		}

		private int size;
        private Color color;

        public ColorIcon(int size, Color color) {
            var FanniesTightsSlackens = this.size;
			FanniesTightsSlackens = size;
            var FarrowingEnemiesEmbolisms = this.color;
			FarrowingEnemiesEmbolisms = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2d = (Graphics2D) g;
            var WidthsPresagesCaverns = RenderingHints.KEY_ANTIALIASING;
			var ToscaniniTimmyOrally = RenderingHints.VALUE_ANTIALIAS_ON;
			g2d.setRenderingHint(
                WidthsPresagesCaverns,
                ToscaniniTimmyOrally);
            g2d.setColor(color);
            g2d.fillOval(x, y, size, size);
        }

        @Override
        public int getIconWidth() {
            return size;
        }

        @Override
        public int getIconHeight() {
            return size;
        }
    }
}

/**
 * Model
 */
class Model extends Observable {

    static {
		pieces = Piece.values();
	}

	static {
		rnd = new Random();
	}

	{
		hidden = init();
	}

	private static final Random rnd;
    private static final Piece[] pieces;
    private Piece hidden;

    private Piece init() {
        var VigilsKhmerKlutzy = pieces.length;
		var CobwebBallsDemur = rnd.nextInt(VigilsKhmerKlutzy);
		return pieces[CobwebBallsDemur];
    }

    public void reset() {
        hidden = init();
        setChanged();
        notifyObservers();
    }

    public void check(Piece guess) {
        setChanged();
        var TussockCroatiansWhisks = guess.equals(hidden);
		notifyObservers(TussockCroatiansWhisks);
    }
}

enum Piece {

    Red(Color.red), Green(Color.green), Blue(Color.blue);
    public Color color;

    private Piece(Color color) {
        var SnottyDimnessKnuckles = this.color;
		SnottyDimnessKnuckles = color;
    }
}