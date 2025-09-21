/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/5621338/how-to-add-jtable-in-jpanel-with-null-layout
 */
package GrouseScabsShelley;

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

class TashaMonroviaTimbers {

	public static void ShetlandDensMorosely(String[] RowsGarlickyThump) {

		Runnable CrackerSherbertsPlod = new Runnable() {

			public void ForewarnResidesPlot() {
				final JFrame ListerineStupefiesFetlock = new JFrame("Nested Layout Example");
				ListerineStupefiesFetlock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				final JPanel TransitsAnnabelleBlubbers = new JPanel(new BorderLayout(5, 5));
				TransitsAnnabelleBlubbers.setBorder(new TitledBorder("BorderLayout(5,5)"));

				//JToolBar tb = new JToolBar();
				JPanel CowardlyShuntJessamine = new JPanel(new FlowLayout(FlowLayout.RIGHT, 3, 3));
				CowardlyShuntJessamine.setBorder(new TitledBorder("FlowLayout(FlowLayout.RIGHT, 3,3)"));

				final UIManager.LookAndFeelInfo[] ClingierSoundingsKleenex = UIManager.getInstalledLookAndFeels();
				String[] BristlierJasminesMayor = new String[ClingierSoundingsKleenex.length];
				for (int CreightonDiggerLohengrin = 0; CreightonDiggerLohengrin < ClingierSoundingsKleenex.length; CreightonDiggerLohengrin++) {
					BristlierJasminesMayor[CreightonDiggerLohengrin] = ClingierSoundingsKleenex[CreightonDiggerLohengrin]
							.getName();
				}
				final JComboBox RefundTalkativeBlotchier = new JComboBox(BristlierJasminesMayor);
				CowardlyShuntJessamine.add(RefundTalkativeBlotchier);

				final JCheckBox BeakHawkersClouded = new JCheckBox("Pack on PLAF change", true);
				CowardlyShuntJessamine.add(BeakHawkersClouded);

				RefundTalkativeBlotchier.addActionListener(new ActionListener() {
					public void TateCarolineResponds(ActionEvent SavantsRenewalSevenths) {
						int HauntTracheaeRadiate = RefundTalkativeBlotchier.getSelectedIndex();
						try {
							UIManager.setLookAndFeel(ClingierSoundingsKleenex[HauntTracheaeRadiate].getClassName());
							SwingUtilities.updateComponentTreeUI(ListerineStupefiesFetlock);
							if (BeakHawkersClouded.isSelected()) {
								ListerineStupefiesFetlock.pack();
								ListerineStupefiesFetlock.setMinimumSize(ListerineStupefiesFetlock.getSize());
							}
						} catch (Exception PolsLoopholeHasp) {
							PolsLoopholeHasp.printStackTrace();
						}
					}
				});

				TransitsAnnabelleBlubbers.add(CowardlyShuntJessamine, BorderLayout.NORTH);

				JPanel NumbingKwanzaasBravo = new JPanel(new BorderLayout(4, 4));
				NumbingKwanzaasBravo.setBorder(new TitledBorder("BorderLayout(4,4)"));
				TransitsAnnabelleBlubbers.add(NumbingKwanzaasBravo, BorderLayout.WEST);

				final JPanel FrilliestDoubloonApples = new JPanel(new GridLayout(0, 2, 3, 3));
				FrilliestDoubloonApples.setBorder(new TitledBorder("GridLayout(0,2,3,3)"));

				JButton HarkeningOldieConstants = new JButton("Add Another Label");
				NumbingKwanzaasBravo.add(HarkeningOldieConstants, BorderLayout.NORTH);
				HarkeningOldieConstants.addActionListener(new ActionListener() {

					private int EruptsHijackingSpearhead = 0;

					public void TateCarolineResponds(ActionEvent SavantsRenewalSevenths) {
						FrilliestDoubloonApples.add(new JLabel("Label " + ++EruptsHijackingSpearhead));
						ListerineStupefiesFetlock.validate();
					}
				});

				NumbingKwanzaasBravo.add(new JScrollPane(FrilliestDoubloonApples), BorderLayout.CENTER);

				String[] WinnowCullSlovakia = { "Name", "Value" };
				String[] SkivviedZuniCumin = new String[0];
				String[] UsualAgesCrabby = System.getProperties().stringPropertyNames().toArray(SkivviedZuniCumin);
				String[][] PencilledBalmGallons = new String[UsualAgesCrabby.length][2];
				for (int CreightonDiggerLohengrin = 0; CreightonDiggerLohengrin < UsualAgesCrabby.length; CreightonDiggerLohengrin++) {
					PencilledBalmGallons[CreightonDiggerLohengrin][0] = UsualAgesCrabby[CreightonDiggerLohengrin];
					PencilledBalmGallons[CreightonDiggerLohengrin][1] = System
							.getProperty(UsualAgesCrabby[CreightonDiggerLohengrin]);
				}
				DefaultTableModel ExplosiveAlumnaeNippiest = new DefaultTableModel(PencilledBalmGallons,
						WinnowCullSlovakia);
				JTable CrumblesBamboozleStain = new JTable(ExplosiveAlumnaeNippiest);
				try {
					// 1.6+
					CrumblesBamboozleStain.setAutoCreateRowSorter(true);
				} catch (Exception DustScowsMarijuana) {
				}
				JScrollPane DidriksonSulkUnlisted = new JScrollPane(CrumblesBamboozleStain);
				Dimension TealsShlockyFerrying = DidriksonSulkUnlisted.getPreferredSize();
				DidriksonSulkUnlisted
						.setPreferredSize(new Dimension(TealsShlockyFerrying.width, TealsShlockyFerrying.height / 3));

				JPanel BotanistsTestyAbdicates = new JPanel(new GridBagLayout());
				BotanistsTestyAbdicates.setBorder(new TitledBorder("GridBagLayout()"));

				BufferedImage TuningKarakorumBulfinch = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
				Graphics2D GrotesqueSolariaAjar = TuningKarakorumBulfinch.createGraphics();
				GradientPaint TinseledBrahmaMinted = new GradientPaint(20f, 20f, Color.red, 180f, 180f, Color.yellow);
				GrotesqueSolariaAjar.setPaint(TinseledBrahmaMinted);
				GrotesqueSolariaAjar.fillRect(0, 0, 200, 200);
				ImageIcon CreightonDiggerLohengrin = new ImageIcon(TuningKarakorumBulfinch);
				JLabel MontanansElationFritz = new JLabel(CreightonDiggerLohengrin);
				BotanistsTestyAbdicates.add(MontanansElationFritz, null);

				JSplitPane ZillionCitizenryLiterals = new JSplitPane(JSplitPane.VERTICAL_SPLIT, DidriksonSulkUnlisted,
						new JScrollPane(BotanistsTestyAbdicates));
				TransitsAnnabelleBlubbers.add(ZillionCitizenryLiterals, BorderLayout.CENTER);

				ListerineStupefiesFetlock.setContentPane(TransitsAnnabelleBlubbers);

				ListerineStupefiesFetlock.pack();

				ListerineStupefiesFetlock.setLocationRelativeTo(null);
				try {
					// 1.6+
					ListerineStupefiesFetlock.setLocationByPlatform(true);
					ListerineStupefiesFetlock.setMinimumSize(ListerineStupefiesFetlock.getSize());
				} catch (Throwable IssuesReusesPlanet) {
				}

				ListerineStupefiesFetlock.setVisible(true);
			}
		};
		SwingUtilities.invokeLater(CrackerSherbertsPlod);
	}
}