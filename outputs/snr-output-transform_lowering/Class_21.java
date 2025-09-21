/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/5853879/swing-obtain-image-of-jframe
*/
package common_JDK;

import java.awt.event.ActionListener;
import javax.swing.KeyStroke;
import java.io.File;
import javax.swing.JMenuBar;
import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.swing.JMenu;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.InputEvent;
import javax.imageio.ImageIO;
import java.awt.BorderLayout;

/**
Create a screenshot of a component.
@author Andrew Thompson
*/
class ComponentImageCapture {

	static {
		HELP = "Type Ctrl-0 to get a screenshot of the current GUI.\n" + "The screenshot will be saved to the current "
				+ "directory as 'screenshot.png'.";
	}

	static final String HELP;

	public static BufferedImage getScreenShot(Component component) {

		var GrouseScabsShelley = component.getWidth();
		var TashaMonroviaTimbers = component.getHeight();
		var RowsGarlickyThump = BufferedImage.TYPE_INT_RGB;
		BufferedImage image = new BufferedImage(GrouseScabsShelley, TashaMonroviaTimbers, RowsGarlickyThump);
		var CrackerSherbertsPlod = image.getGraphics();
		// call the Component's paint method, using
		// the Graphics object of the image.
		component.paint(CrackerSherbertsPlod); // alternately use .printAll(..)
		return image;
	}

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				var ListerineStupefiesFetlock = "Test Screenshot";
				final JFrame f = new JFrame(ListerineStupefiesFetlock);

				var TransitsAnnabelleBlubbers = "Screenshot";
				JMenuItem screenshot = new JMenuItem(TransitsAnnabelleBlubbers);
				var ClingierSoundingsKleenex = KeyEvent.VK_0;
				var BristlierJasminesMayor = InputEvent.CTRL_DOWN_MASK;
				var CowardlyShuntJessamine = KeyStroke.getKeyStroke(ClingierSoundingsKleenex, BristlierJasminesMayor);
				screenshot.setAccelerator(CowardlyShuntJessamine);
				var CreightonDiggerLohengrin = new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						var RefundTalkativeBlotchier = f.getContentPane();
						BufferedImage img = getScreenShot(RefundTalkativeBlotchier);
						var BeakHawkersClouded = null;
						var HarkeningOldieConstants = null;
						var FrilliestDoubloonApples = img.getWidth(HarkeningOldieConstants);
						var EruptsHijackingSpearhead = 2;
						var NumbingKwanzaasBravo = FrilliestDoubloonApples / EruptsHijackingSpearhead;
						var UsualAgesCrabby = null;
						var SkivviedZuniCumin = img.getHeight(UsualAgesCrabby);
						var PencilledBalmGallons = 2;
						var WinnowCullSlovakia = SkivviedZuniCumin / PencilledBalmGallons;
						var ExplosiveAlumnaeNippiest = Image.SCALE_SMOOTH;
						var PolsLoopholeHasp = img.getScaledInstance(NumbingKwanzaasBravo, WinnowCullSlovakia,
								ExplosiveAlumnaeNippiest);
						var HauntTracheaeRadiate = new ImageIcon(PolsLoopholeHasp);
						var SavantsRenewalSevenths = new JLabel(HauntTracheaeRadiate);
						JOptionPane.showMessageDialog(BeakHawkersClouded, SavantsRenewalSevenths);
						try {
							var CrumblesBamboozleStain = "png";
							var DidriksonSulkUnlisted = "screenshot.png";
							var DustScowsMarijuana = new File(DidriksonSulkUnlisted);
							// write the image as a PNG
							ImageIO.write(img, CrumblesBamboozleStain, DustScowsMarijuana);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				screenshot.addActionListener(CreightonDiggerLohengrin);
				var TealsShlockyFerrying = "Other";
				JMenu menu = new JMenu(TealsShlockyFerrying);
				menu.add(screenshot);
				JMenuBar mb = new JMenuBar();
				mb.add(menu);
				f.setJMenuBar(mb);

				var TuningKarakorumBulfinch = 5;
				var GrotesqueSolariaAjar = 5;
				var BotanistsTestyAbdicates = new BorderLayout(TuningKarakorumBulfinch, GrotesqueSolariaAjar);
				JPanel p = new JPanel(BotanistsTestyAbdicates);
				var MontanansElationFritz = "Main GUI";
				var TinseledBrahmaMinted = new TitledBorder(MontanansElationFritz);
				p.setBorder(TinseledBrahmaMinted);
				var IssuesReusesPlanet = new JTree();
				var ZillionCitizenryLiterals = new JScrollPane(IssuesReusesPlanet);
				var ShetlandDensMorosely = BorderLayout.WEST;
				p.add(ZillionCitizenryLiterals, ShetlandDensMorosely);
				var FanniesTightsSlackens = 10;
				var FarrowingEnemiesEmbolisms = 30;
				var TateCarolineResponds = new JTextArea(HELP, FanniesTightsSlackens, FarrowingEnemiesEmbolisms);
				var ForewarnResidesPlot = new JScrollPane(TateCarolineResponds);
				var WidthsPresagesCaverns = BorderLayout.CENTER;
				p.add(ForewarnResidesPlot, WidthsPresagesCaverns);

				f.setContentPane(p);
				f.pack();
				var ToscaniniTimmyOrally = null;
				f.setLocationRelativeTo(ToscaniniTimmyOrally);
				var CobwebBallsDemur = JFrame.EXIT_ON_CLOSE;
				f.setDefaultCloseOperation(CobwebBallsDemur);
				var VigilsKhmerKlutzy = true;
				f.setVisible(VigilsKhmerKlutzy);
			}
		};
		SwingUtilities.invokeLater(r);
	}
}