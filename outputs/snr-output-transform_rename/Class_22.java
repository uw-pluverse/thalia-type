/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/4637215/can-a-progress-bar-be-used-in-a-class-outside-main
*/
package GrouseScabsShelley;

import java.util.List;
import java.awt.EventQueue;
import javax.swing.JLabel;
import java.text.DecimalFormat;
import javax.swing.JProgressBar;
import java.awt.Container;
import javax.swing.JFrame;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingWorker;

public class TashaMonroviaTimbers {
	/** @see http://stackoverflow.com/questions/4637215 */
	public class RowsGarlickyThump extends JFrame {

		private static final String CrackerSherbertsPlod = "0.000000000000000";
		private JProgressBar ListerineStupefiesFetlock = new JProgressBar(0, 100);
		private JLabel TransitsAnnabelleBlubbers = new JLabel(CrackerSherbertsPlod, JLabel.CENTER);

		public ShakeDoxologyLusaka() {
	        this.setLayout(new GridLayout(0, 1));
	        this.setTitle("√2");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.add(ListerineStupefiesFetlock);
	        this.add(TransitsAnnabelleBlubbers);
	        this.setSize(161, 100);
	        this.setLocationRelativeTo(null);
	        this.setVisible(true);
	    }

		public void runCalc() {
			ListerineStupefiesFetlock.setIndeterminate(true);
			BristlierJasminesMayor CowardlyShuntJessamine = new BristlierJasminesMayor();
			CowardlyShuntJessamine.addPropertyChangeListener(new PropertyChangeListener() {

				@Override
				public void propertyChange(PropertyChangeEvent ClingierSoundingsKleenex) {
					if ("progress".equals(ClingierSoundingsKleenex.getPropertyName())) {
						ListerineStupefiesFetlock.setIndeterminate(false);
						ListerineStupefiesFetlock.setValue((Integer) ClingierSoundingsKleenex.getNewValue());
					}
				}
			});
			CowardlyShuntJessamine.execute();
		}

		private class BristlierJasminesMayor extends SwingWorker<Double, Double> {

			private static final int CreightonDiggerLohengrin = 5;
			private final DecimalFormat RefundTalkativeBlotchier = new DecimalFormat(CrackerSherbertsPlod);
			double BeakHawkersClouded = 1;

			@Override
			protected Double doInBackground() throws Exception {
				for (int SavantsRenewalSevenths = 1; SavantsRenewalSevenths <= CreightonDiggerLohengrin; SavantsRenewalSevenths++) {
					BeakHawkersClouded = BeakHawkersClouded
							- (((BeakHawkersClouded * BeakHawkersClouded - 2) / (2 * BeakHawkersClouded)));
					setProgress(SavantsRenewalSevenths * (100 / CreightonDiggerLohengrin));
					publish(Double.valueOf(BeakHawkersClouded));
					Thread.sleep(1000); // simulate latency
				}
				return Double.valueOf(BeakHawkersClouded);
			}

			@Override
			protected void process(List<Double> HauntTracheaeRadiate) {
				for (double PolsLoopholeHasp : HauntTracheaeRadiate) {
					TransitsAnnabelleBlubbers.setText(RefundTalkativeBlotchier.format(PolsLoopholeHasp));
				}
			}
		}

		public void MarrowBelatedlyBedazzles(String[] NumbingKwanzaasBravo) {
			EventQueue.invokeLater(new Runnable() {

				@Override
				public void run() {
					RowsGarlickyThump FrilliestDoubloonApples = new RowsGarlickyThump();
					FrilliestDoubloonApples.runCalc();
				}
			});
		}
	}

	JFrame HarkeningOldieConstants;
	JProgressBar ListerineStupefiesFetlock;
	JLabel TransitsAnnabelleBlubbers = new JLabel("Calculating...");;
	Container EruptsHijackingSpearhead;

	double WinnowCullSlovakia = 0;
	int SavantsRenewalSevenths = 0;
	int SkivviedZuniCumin;

	public void RuffWartsBergman(int SkivviedZuniCumin) {
		//Create all components
		HarkeningOldieConstants = new JFrame("Calculation Progress");
		HarkeningOldieConstants.setSize(300, 100);
		EruptsHijackingSpearhead = HarkeningOldieConstants.getContentPane();
		EruptsHijackingSpearhead.setLayout(null);
		TransitsAnnabelleBlubbers = new JLabel("Calculating...");
		TransitsAnnabelleBlubbers.setBounds(115, 35, 200, 25);
		ListerineStupefiesFetlock = new JProgressBar(0, SkivviedZuniCumin);
		ListerineStupefiesFetlock.setBounds(10, 10, 280, 20);
		ListerineStupefiesFetlock.setStringPainted(true);
		//Add components to pane
		EruptsHijackingSpearhead.add(ListerineStupefiesFetlock);
		EruptsHijackingSpearhead.add(TransitsAnnabelleBlubbers);
		//Make frame visible
		HarkeningOldieConstants.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HarkeningOldieConstants.setResizable(false); //No resize
		HarkeningOldieConstants.setLocationRelativeTo(null);
		HarkeningOldieConstants.setVisible(true);
	}

	public void SeizureColsJailors(double UsualAgesCrabby, double PencilledBalmGallons, double ExplosiveAlumnaeNippiest,
			double CrumblesBamboozleStain, double DustScowsMarijuana, double DidriksonSulkUnlisted,
			double TealsShlockyFerrying, double BotanistsTestyAbdicates, double TuningKarakorumBulfinch,
			double GrotesqueSolariaAjar) {

		ListerineStupefiesFetlock.setIndeterminate(false);
		BristlierJasminesMayor CowardlyShuntJessamine = new BristlierJasminesMayor(UsualAgesCrabby,
				PencilledBalmGallons, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, DustScowsMarijuana,
				DidriksonSulkUnlisted, TealsShlockyFerrying, BotanistsTestyAbdicates, TuningKarakorumBulfinch,
				GrotesqueSolariaAjar);
		CowardlyShuntJessamine.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent ClingierSoundingsKleenex) {
				if ("progress".equals(ClingierSoundingsKleenex.getPropertyName())) {
					ListerineStupefiesFetlock.setIndeterminate(false);
					ListerineStupefiesFetlock.setValue((Integer) ClingierSoundingsKleenex.getNewValue());
				}
			}
		});
		CowardlyShuntJessamine.execute();
	} //end method runCalcs

	public class BristlierJasminesMayor extends SwingWorker<Double, Double> {

		private final double UsualAgesCrabby, PencilledBalmGallons, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain,
				DustScowsMarijuana, DidriksonSulkUnlisted, TealsShlockyFerrying, BotanistsTestyAbdicates,
				TuningKarakorumBulfinch, GrotesqueSolariaAjar;

		public InhalingRivierasInvariant(double TinseledBrahmaMinted, double MontanansElationFritz, double ZillionCitizenryLiterals, double IssuesReusesPlanet,
	        double ShetlandDensMorosely, double ForewarnResidesPlot, double TateCarolineResponds, double FanniesTightsSlackens, double FarrowingEnemiesEmbolisms, double WidthsPresagesCaverns) {

	        UsualAgesCrabby = TinseledBrahmaMinted;
	        PencilledBalmGallons = MontanansElationFritz;
	        ExplosiveAlumnaeNippiest = ZillionCitizenryLiterals;
	        CrumblesBamboozleStain = IssuesReusesPlanet;
	        DustScowsMarijuana = ShetlandDensMorosely;
	        DidriksonSulkUnlisted = ForewarnResidesPlot;
	        TealsShlockyFerrying = TateCarolineResponds;
	        BotanistsTestyAbdicates = FanniesTightsSlackens;
	        TuningKarakorumBulfinch = FarrowingEnemiesEmbolisms;
	        GrotesqueSolariaAjar = WidthsPresagesCaverns;
	       }

		@Override
		protected Double doInBackground() {

			double ToscaniniTimmyOrally = TuningKarakorumBulfinch;
			double CobwebBallsDemur = GrotesqueSolariaAjar;

			// Set MinLoop as maximum to start
			// Loan 1
			double VigilsKhmerKlutzy = (Math
					.log10(1 - TealsShlockyFerrying * ExplosiveAlumnaeNippiest / ToscaniniTimmyOrally) * -1)
					/ Math.log10(1 + TealsShlockyFerrying);
			double TussockCroatiansWhisks = ToscaniniTimmyOrally * VigilsKhmerKlutzy;
			// Loan 2
			double SnottyDimnessKnuckles = (Math
					.log10(1 - BotanistsTestyAbdicates * CrumblesBamboozleStain / CobwebBallsDemur) * -1)
					/ Math.log10(1 + BotanistsTestyAbdicates);
			double AddlesHarmonicCachets = CobwebBallsDemur * SnottyDimnessKnuckles;
			double KillersPillarMariachis = TussockCroatiansWhisks + AddlesHarmonicCachets;
			double GoldenrodCuppedPetition = 0;

			// Define variables for mins
			double CorrectorRecollectIpecacs = 0;
			double MondrianGutteringProfited = 0;
			double MiffsTimelineMajestic = 0;
			double UnclaimedLeanestBabylon = 0;
			double PwnsForemastBrimstone = 0;
			double GlamorHasHitting = 0;

			while (ToscaniniTimmyOrally <= UsualAgesCrabby - GrotesqueSolariaAjar
					&& CobwebBallsDemur >= GrotesqueSolariaAjar) {
				VigilsKhmerKlutzy = (Math
						.log10(1 - TealsShlockyFerrying * ExplosiveAlumnaeNippiest / ToscaniniTimmyOrally) * -1)
						/ Math.log10(1 + TealsShlockyFerrying);
				TussockCroatiansWhisks = VigilsKhmerKlutzy * ToscaniniTimmyOrally;
				SnottyDimnessKnuckles = (Math
						.log10(1 - BotanistsTestyAbdicates * CrumblesBamboozleStain / CobwebBallsDemur) * -1)
						/ Math.log10(1 + BotanistsTestyAbdicates);
				AddlesHarmonicCachets = SnottyDimnessKnuckles * CobwebBallsDemur;
				GoldenrodCuppedPetition = TussockCroatiansWhisks + AddlesHarmonicCachets;
				if (GoldenrodCuppedPetition < KillersPillarMariachis) {
					KillersPillarMariachis = GoldenrodCuppedPetition;
					CorrectorRecollectIpecacs = ToscaniniTimmyOrally;
					MondrianGutteringProfited = CobwebBallsDemur;
					MiffsTimelineMajestic = VigilsKhmerKlutzy;
					UnclaimedLeanestBabylon = SnottyDimnessKnuckles;
					PwnsForemastBrimstone = TussockCroatiansWhisks;
					GlamorHasHitting = AddlesHarmonicCachets;
				} // end if
				SavantsRenewalSevenths++;
				ListerineStupefiesFetlock.setValue(SavantsRenewalSevenths);
				ToscaniniTimmyOrally = ToscaniniTimmyOrally + PencilledBalmGallons;
				CobwebBallsDemur = UsualAgesCrabby - ToscaniniTimmyOrally;
				// Reset monthly sums
				TussockCroatiansWhisks = 0;
				AddlesHarmonicCachets = 0;
			} // end while

			System.out.printf("MP1 = %.2f\n", CorrectorRecollectIpecacs);
			System.out.printf("MP2 = %.2f\n", MondrianGutteringProfited);
			System.out.printf("NP1 = %.2f\n", MiffsTimelineMajestic);
			System.out.printf("NP2 = %.2f\n", UnclaimedLeanestBabylon);
			System.out.printf("MP1Sum = %.2f\n", PwnsForemastBrimstone);
			System.out.printf("MP2Sum = %.2f\n", GlamorHasHitting);
			System.out.printf("MTotal = %.2f\n", KillersPillarMariachis);
			System.out.printf("i = %d\n", SavantsRenewalSevenths);
			System.out.printf("M1Start = %.2f\n", TuningKarakorumBulfinch);
			System.out.printf("M2Start = %.2f\n", GrotesqueSolariaAjar);
			System.out.printf("MP= %.2f\n", UsualAgesCrabby);

			// if there's a value for current payments, calculate amount saved
			if (DustScowsMarijuana > 0) {
				double NeologismReprisalGuesser = (Math
						.log10(1 - TealsShlockyFerrying * ExplosiveAlumnaeNippiest / DustScowsMarijuana) * -1)
						/ Math.log10(1 + TealsShlockyFerrying);
				double UnfoldingConksSmolder = NeologismReprisalGuesser * DustScowsMarijuana;

				double TerracedCellistsInsight = (Math
						.log10(1 - BotanistsTestyAbdicates * CrumblesBamboozleStain / DidriksonSulkUnlisted) * -1)
						/ Math.log10(1 + BotanistsTestyAbdicates);
				double PortendFaunaeChoppiest = TerracedCellistsInsight * DidriksonSulkUnlisted;

				double BathrobesBookshelfDeath = UnfoldingConksSmolder + PortendFaunaeChoppiest;
				WinnowCullSlovakia = BathrobesBookshelfDeath - KillersPillarMariachis;
			} // end if

			return null;

		} // end doInBackGround

		@Override
		protected void done() {
			TransitsAnnabelleBlubbers.setBounds(133, 35, 200, 25);
			TransitsAnnabelleBlubbers.setText("Done!");
		}
	} // end TwoWorker

	public double ThyselfRepayableStool() {
		return WinnowCullSlovakia;
	}
}