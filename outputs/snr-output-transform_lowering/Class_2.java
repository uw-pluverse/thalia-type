/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/5621338/how-to-add-jtable-in-jpanel-with-null-layout
 */
package common_JDK;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.image.BufferedImage;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import java.awt.GradientPaint;
import javax.swing.JSplitPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

class Class_2 {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			public void run() {
				var GrouseScabsShelley = "Nested Layout Example";
				final JFrame frame = new JFrame(GrouseScabsShelley);
				var TashaMonroviaTimbers = JFrame.EXIT_ON_CLOSE;
				frame.setDefaultCloseOperation(TashaMonroviaTimbers);

				var CrackerSherbertsPlod = 5;
				var ListerineStupefiesFetlock = 5;
				var RowsGarlickyThump = new BorderLayout(CrackerSherbertsPlod, ListerineStupefiesFetlock);
				final JPanel gui = new JPanel(RowsGarlickyThump);
				var CowardlyShuntJessamine = "BorderLayout(5,5)";
				var TransitsAnnabelleBlubbers = new TitledBorder(CowardlyShuntJessamine);
				gui.setBorder(TransitsAnnabelleBlubbers);

				var BristlierJasminesMayor = FlowLayout.RIGHT;
				var CreightonDiggerLohengrin = 3;
				var RefundTalkativeBlotchier = 3;
				var ClingierSoundingsKleenex = new FlowLayout(BristlierJasminesMayor, CreightonDiggerLohengrin,
						RefundTalkativeBlotchier);
				//JToolBar tb = new JToolBar();
				JPanel plafComponents = new JPanel(ClingierSoundingsKleenex);
				var SavantsRenewalSevenths = "FlowLayout(FlowLayout.RIGHT, 3,3)";
				var BeakHawkersClouded = new TitledBorder(SavantsRenewalSevenths);
				plafComponents.setBorder(BeakHawkersClouded);

				final UIManager.LookAndFeelInfo[] plafInfos = UIManager.getInstalledLookAndFeels();
				var HauntTracheaeRadiate = plafInfos.length;
				String[] plafNames = new String[HauntTracheaeRadiate];
				var PolsLoopholeHasp = plafInfos.length;
				for (int ii = 0; ii < PolsLoopholeHasp; ii++) {
					plafNames[ii] = plafInfos[ii].getName();
				}
				final JComboBox plafChooser = new JComboBox(plafNames);
				plafComponents.add(plafChooser);

				var NumbingKwanzaasBravo = "Pack on PLAF change";
				var FrilliestDoubloonApples = true;
				final JCheckBox pack = new JCheckBox(NumbingKwanzaasBravo, FrilliestDoubloonApples);
				plafComponents.add(pack);

				var HarkeningOldieConstants = new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						int index = plafChooser.getSelectedIndex();
						try {
							var EruptsHijackingSpearhead = plafInfos[index].getClassName();
							UIManager.setLookAndFeel(EruptsHijackingSpearhead);
							SwingUtilities.updateComponentTreeUI(frame);
							var WinnowCullSlovakia = pack.isSelected();
							if (WinnowCullSlovakia) {
								frame.pack();
								var SkivviedZuniCumin = frame.getSize();
								frame.setMinimumSize(SkivviedZuniCumin);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				plafChooser.addActionListener(HarkeningOldieConstants);

				var UsualAgesCrabby = BorderLayout.NORTH;
				gui.add(plafComponents, UsualAgesCrabby);

				var ExplosiveAlumnaeNippiest = 4;
				var CrumblesBamboozleStain = 4;
				var PencilledBalmGallons = new BorderLayout(ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
				JPanel dynamicLabels = new JPanel(PencilledBalmGallons);
				var DidriksonSulkUnlisted = "BorderLayout(4,4)";
				var DustScowsMarijuana = new TitledBorder(DidriksonSulkUnlisted);
				dynamicLabels.setBorder(DustScowsMarijuana);
				var TealsShlockyFerrying = BorderLayout.WEST;
				gui.add(dynamicLabels, TealsShlockyFerrying);

				var TuningKarakorumBulfinch = 0;
				var GrotesqueSolariaAjar = 2;
				var TinseledBrahmaMinted = 3;
				var MontanansElationFritz = 3;
				var BotanistsTestyAbdicates = new GridLayout(TuningKarakorumBulfinch, GrotesqueSolariaAjar,
						TinseledBrahmaMinted, MontanansElationFritz);
				final JPanel labels = new JPanel(BotanistsTestyAbdicates);
				var IssuesReusesPlanet = "GridLayout(0,2,3,3)";
				var ZillionCitizenryLiterals = new TitledBorder(IssuesReusesPlanet);
				labels.setBorder(ZillionCitizenryLiterals);

				var ShetlandDensMorosely = "Add Another Label";
				JButton addNew = new JButton(ShetlandDensMorosely);
				var ForewarnResidesPlot = BorderLayout.NORTH;
				dynamicLabels.add(addNew, ForewarnResidesPlot);
				var TateCarolineResponds = new ActionListener() {

					private int labelCount = 0;

					public void actionPerformed(ActionEvent ae) {
						var WidthsPresagesCaverns = "Label ";
						var FarrowingEnemiesEmbolisms = WidthsPresagesCaverns + ++labelCount;
						var FanniesTightsSlackens = new JLabel(FarrowingEnemiesEmbolisms);
						labels.add(FanniesTightsSlackens);
						frame.validate();
					}
				};
				addNew.addActionListener(TateCarolineResponds);

				var ToscaniniTimmyOrally = new JScrollPane(labels);
				var CobwebBallsDemur = BorderLayout.CENTER;
				dynamicLabels.add(ToscaniniTimmyOrally, CobwebBallsDemur);

				var VigilsKhmerKlutzy = "Name";
				var TussockCroatiansWhisks = "Value";
				String[] header = { VigilsKhmerKlutzy, TussockCroatiansWhisks };
				var SnottyDimnessKnuckles = 0;
				String[] a = new String[SnottyDimnessKnuckles];
				var KillersPillarMariachis = System.getProperties();
				var AddlesHarmonicCachets = KillersPillarMariachis.stringPropertyNames();
				String[] names = AddlesHarmonicCachets.toArray(a);
				var GoldenrodCuppedPetition = names.length;
				var CorrectorRecollectIpecacs = 2;
				String[][] data = new String[GoldenrodCuppedPetition][CorrectorRecollectIpecacs];
				var MondrianGutteringProfited = names.length;
				for (int ii = 0; ii < MondrianGutteringProfited; ii++) {
					var MiffsTimelineMajestic = 0;
					data[ii][MiffsTimelineMajestic] = names[ii];
					var UnclaimedLeanestBabylon = 1;
					data[ii][UnclaimedLeanestBabylon] = System.getProperty(names[ii]);
				}
				DefaultTableModel model = new DefaultTableModel(data, header);
				JTable table = new JTable(model);
				try {
					var PwnsForemastBrimstone = true;
					// 1.6+
					table.setAutoCreateRowSorter(PwnsForemastBrimstone);
				} catch (Exception continuewithNoSort) {
				}
				JScrollPane tableScroll = new JScrollPane(table);
				Dimension tablePreferred = tableScroll.getPreferredSize();
				var NeologismReprisalGuesser = tablePreferred.width;
				var TerracedCellistsInsight = tablePreferred.height;
				var PortendFaunaeChoppiest = 3;
				var UnfoldingConksSmolder = TerracedCellistsInsight / PortendFaunaeChoppiest;
				var GlamorHasHitting = new Dimension(NeologismReprisalGuesser, UnfoldingConksSmolder);
				tableScroll.setPreferredSize(GlamorHasHitting);

				var BathrobesBookshelfDeath = new GridBagLayout();
				JPanel imagePanel = new JPanel(BathrobesBookshelfDeath);
				var MarrowBelatedlyBedazzles = "GridBagLayout()";
				var ShakeDoxologyLusaka = new TitledBorder(MarrowBelatedlyBedazzles);
				imagePanel.setBorder(ShakeDoxologyLusaka);

				var RuffWartsBergman = 200;
				var SeizureColsJailors = 200;
				var InhalingRivierasInvariant = BufferedImage.TYPE_INT_ARGB;
				BufferedImage bi = new BufferedImage(RuffWartsBergman, SeizureColsJailors, InhalingRivierasInvariant);
				Graphics2D g = bi.createGraphics();
				var ThyselfRepayableStool = 20f;
				var PretzelAlbertaSulky = 20f;
				var ScenesStephenSofty = Color.red;
				var SaddlebagZwingliRefit = 180f;
				var SnarkyRoutsHexing = 180f;
				var SummarilyTitansRugrat = Color.yellow;
				GradientPaint gp = new GradientPaint(ThyselfRepayableStool, PretzelAlbertaSulky, ScenesStephenSofty,
						SaddlebagZwingliRefit, SnarkyRoutsHexing, SummarilyTitansRugrat);
				g.setPaint(gp);
				var BlackoutSereneSender = 0;
				var ShimmyRegimeKnifed = 0;
				var ZitherSemiteLighting = 200;
				var MoldedBlockedHurrahing = 200;
				g.fillRect(BlackoutSereneSender, ShimmyRegimeKnifed, ZitherSemiteLighting, MoldedBlockedHurrahing);
				ImageIcon ii = new ImageIcon(bi);
				JLabel imageLabel = new JLabel(ii);
				var PatsiesMylesEli = null;
				imagePanel.add(imageLabel, PatsiesMylesEli);

				var IllicitSojournedEarfuls = JSplitPane.VERTICAL_SPLIT;
				var ZingerRangoonBlitzing = new JScrollPane(imagePanel);
				JSplitPane splitPane = new JSplitPane(IllicitSojournedEarfuls, tableScroll, ZingerRangoonBlitzing);
				var MannOrbitTimescale = BorderLayout.CENTER;
				gui.add(splitPane, MannOrbitTimescale);

				frame.setContentPane(gui);

				frame.pack();

				var LuxuryTrigBackaches = null;
				frame.setLocationRelativeTo(LuxuryTrigBackaches);
				try {
					var BlahTraceriesChurns = true;
					// 1.6+
					frame.setLocationByPlatform(BlahTraceriesChurns);
					var TendedContestsShysters = frame.getSize();
					frame.setMinimumSize(TendedContestsShysters);
				} catch (Throwable ignoreAndContinue) {
				}

				var ImpliesPatriotUnwinding = true;
				frame.setVisible(ImpliesPatriotUnwinding);
			}
		};
		SwingUtilities.invokeLater(r);
	}
}