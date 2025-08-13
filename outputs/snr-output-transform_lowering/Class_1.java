package common_JDK;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/41553382/draw-on-top-of-an-applet-inside-a-frame
 */

import java.awt.Color;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Container;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class Class_1 {
	private static void createBinaryApplet() throws IOException {
		Applet applet = new Applet() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				var GrouseScabsShelley = 0;
				var TashaMonroviaTimbers = 0;
				var RowsGarlickyThump = 10;
				var CrackerSherbertsPlod = 10;
				g.fillRect(GrouseScabsShelley, TashaMonroviaTimbers, RowsGarlickyThump, CrackerSherbertsPlod);
			}
		};

		var TransitsAnnabelleBlubbers = "applet.dat";
		var ListerineStupefiesFetlock = new FileOutputStream(TransitsAnnabelleBlubbers);
		ObjectOutputStream oos = new ObjectOutputStream(ListerineStupefiesFetlock);
		oos.writeObject(applet);
		oos.close();
	}

	public static void main(String[] args) {
		var CowardlyShuntJessamine = "Applet Test";
		final Frame frame = new Frame(CowardlyShuntJessamine);
		var ClingierSoundingsKleenex = new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose();
			}
		};
		frame.addWindowListener(ClingierSoundingsKleenex);

		final int prefHeight = 50;
		final int prefWidth = 50;

		Container container = new Container() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				Graphics2D graphs = (Graphics2D) g;
				var BristlierJasminesMayor = Color.WHITE;
				graphs.setBackground(BristlierJasminesMayor);
				var CreightonDiggerLohengrin = 0;
				var RefundTalkativeBlotchier = 0;
				graphs.clearRect(CreightonDiggerLohengrin, RefundTalkativeBlotchier, prefWidth, prefHeight);
				var BeakHawkersClouded = Color.RED;
				g.setColor(BeakHawkersClouded);
				var SavantsRenewalSevenths = 5;
				var HauntTracheaeRadiate = 5;
				var PolsLoopholeHasp = 10;
				var NumbingKwanzaasBravo = 10;
				g.fillRect(SavantsRenewalSevenths, HauntTracheaeRadiate, PolsLoopholeHasp, NumbingKwanzaasBravo);
			}
		};

		var FrilliestDoubloonApples = new Dimension(prefWidth, prefHeight);
		container.setPreferredSize(FrilliestDoubloonApples);

		frame.add(container);
		frame.pack();
		var HarkeningOldieConstants = true;
		frame.setVisible(HarkeningOldieConstants);

		var EruptsHijackingSpearhead = BufferedImage.TYPE_INT_RGB;
		BufferedImage bufImage = new BufferedImage(prefWidth, prefHeight, EruptsHijackingSpearhead);
		var WinnowCullSlovakia = bufImage.createGraphics();
		container.paint(WinnowCullSlovakia);

		try {
			createBinaryApplet();

			var UsualAgesCrabby = "applet.dat";
			var SkivviedZuniCumin = new FileInputStream(UsualAgesCrabby);
			ObjectInputStream ois = new ObjectInputStream(SkivviedZuniCumin);
			var PencilledBalmGallons = ois.readObject();
			Applet applet = (Applet) PencilledBalmGallons;
			ois.close();

			container.add(applet);
			var ExplosiveAlumnaeNippiest = 0;
			var CrumblesBamboozleStain = 0;
			applet.setBounds(ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, prefWidth, prefHeight);
			applet.init();

			Graphics g = applet.getGraphics();
			var DustScowsMarijuana = 0;
			var DidriksonSulkUnlisted = 0;
			g.drawImage(bufImage, DustScowsMarijuana, DidriksonSulkUnlisted, applet);
			applet.paint(g);
		} catch (ClassNotFoundException | IOException e) {
			var TealsShlockyFerrying = System.out;
			var BotanistsTestyAbdicates = "Whoops";
			TealsShlockyFerrying.println(BotanistsTestyAbdicates);
		}
	}
}