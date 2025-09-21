/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/4637215/can-a-progress-bar-be-used-in-a-class-outside-main
*/
package common_JDK;

import java.util.List;
import java.awt.EventQueue;
import javax.swing.JLabel;
import java.text.DecimalFormat;
import javax.swing.JProgressBar;
import java.awt.Container;
import javax.swing.JFrame;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingWorker;

public class Class_22 {
	{
		iterations = null;
	}

	{
		i = 0;
	}

	{
		amountSaved = 0;
	}

	{
		pane = null;
	}

	{
		label = new JLabel("Calculating...");
	}

	{
		progressBar = null;
	}

	{
		progressFrame = null;
	}

	/** @see http://stackoverflow.com/questions/4637215 */
	public class TwoRoot extends JFrame {

		static {
			s = "0.000000000000000";
		}

		{
			label = new JLabel(s, JLabel.CENTER);
		}

		{
			progressBar = new JProgressBar(0, 100);
		}

		private static final String s;
		private JProgressBar progressBar;
		private JLabel label;

		public TwoRoot() {
			var TashaMonroviaTimbers = 0;
			var RowsGarlickyThump = 1;
			var GrouseScabsShelley = new GridLayout(TashaMonroviaTimbers, RowsGarlickyThump);
			this.setLayout(GrouseScabsShelley);
			var CrackerSherbertsPlod = "√2";
			this.setTitle(CrackerSherbertsPlod);
			var ListerineStupefiesFetlock = JFrame.EXIT_ON_CLOSE;
			this.setDefaultCloseOperation(ListerineStupefiesFetlock);
			this.add(progressBar);
			this.add(label);
			var TransitsAnnabelleBlubbers = 161;
			var CowardlyShuntJessamine = 100;
			this.setSize(TransitsAnnabelleBlubbers, CowardlyShuntJessamine);
			var ClingierSoundingsKleenex = null;
			this.setLocationRelativeTo(ClingierSoundingsKleenex);
			var BristlierJasminesMayor = true;
			this.setVisible(BristlierJasminesMayor);
		}

		public void runCalc() {
			var CreightonDiggerLohengrin = true;
			progressBar.setIndeterminate(CreightonDiggerLohengrin);
			TwoWorker task = new TwoWorker();
			var RefundTalkativeBlotchier = new PropertyChangeListener() {

				@Override
				public void propertyChange(PropertyChangeEvent e) {
					var SavantsRenewalSevenths = "progress";
					var HauntTracheaeRadiate = e.getPropertyName();
					var BeakHawkersClouded = SavantsRenewalSevenths.equals(HauntTracheaeRadiate);
					if (BeakHawkersClouded) {
						var PolsLoopholeHasp = false;
						progressBar.setIndeterminate(PolsLoopholeHasp);
						var NumbingKwanzaasBravo = e.getNewValue();
						progressBar.setValue((Integer) NumbingKwanzaasBravo);
					}
				}
			};
			task.addPropertyChangeListener(RefundTalkativeBlotchier);
			task.execute();
		}

		private class TwoWorker extends SwingWorker<Double, Double> {

			static {
				N = 5;
			}

			{
				x = 1;
			}

			{
				df = new DecimalFormat(s);
			}

			private static final int N;
			private final DecimalFormat df;
			double x;

			@Override
			protected Double doInBackground() throws Exception {
				for (int i = 1; i <= N; i++) {
					var EruptsHijackingSpearhead = x * x;
					var WinnowCullSlovakia = 2;
					var HarkeningOldieConstants = EruptsHijackingSpearhead - WinnowCullSlovakia;
					var UsualAgesCrabby = 2;
					var SkivviedZuniCumin = UsualAgesCrabby * x;
					var FrilliestDoubloonApples = (HarkeningOldieConstants) / (SkivviedZuniCumin);
					x = x - ((FrilliestDoubloonApples));
					var CrumblesBamboozleStain = 100;
					var ExplosiveAlumnaeNippiest = CrumblesBamboozleStain / N;
					var PencilledBalmGallons = i * (ExplosiveAlumnaeNippiest);
					setProgress(PencilledBalmGallons);
					var DustScowsMarijuana = Double.valueOf(x);
					publish(DustScowsMarijuana);
					var DidriksonSulkUnlisted = 1000;
					Thread.sleep(DidriksonSulkUnlisted); // simulate latency
				}
				var TealsShlockyFerrying = Double.valueOf(x);
				return TealsShlockyFerrying;
			}

			@Override
			protected void process(List<Double> chunks) {
				for (double d : chunks) {
					var BotanistsTestyAbdicates = df.format(d);
					label.setText(BotanistsTestyAbdicates);
				}
			}
		}

		public void main(String[] args) {
			var TuningKarakorumBulfinch = new Runnable() {

				@Override
				public void run() {
					TwoRoot t = new TwoRoot();
					t.runCalc();
				}
			};
			EventQueue.invokeLater(TuningKarakorumBulfinch);
		}
	}

	JFrame progressFrame;
	JProgressBar progressBar;
	JLabel label;;
	Container pane;

	double amountSaved;
	int i;
	int iterations;

	public void createGui(int iterations) {
		var GrotesqueSolariaAjar = "Calculation Progress";
		//Create all components
		progressFrame = new JFrame(GrotesqueSolariaAjar);
		var TinseledBrahmaMinted = 300;
		var MontanansElationFritz = 100;
		progressFrame.setSize(TinseledBrahmaMinted, MontanansElationFritz);
		pane = progressFrame.getContentPane();
		var ZillionCitizenryLiterals = null;
		pane.setLayout(ZillionCitizenryLiterals);
		var IssuesReusesPlanet = "Calculating...";
		label = new JLabel(IssuesReusesPlanet);
		var ShetlandDensMorosely = 115;
		var ForewarnResidesPlot = 35;
		var TateCarolineResponds = 200;
		var FanniesTightsSlackens = 25;
		label.setBounds(ShetlandDensMorosely, ForewarnResidesPlot, TateCarolineResponds, FanniesTightsSlackens);
		var FarrowingEnemiesEmbolisms = 0;
		progressBar = new JProgressBar(FarrowingEnemiesEmbolisms, iterations);
		var WidthsPresagesCaverns = 10;
		var ToscaniniTimmyOrally = 10;
		var CobwebBallsDemur = 280;
		var VigilsKhmerKlutzy = 20;
		progressBar.setBounds(WidthsPresagesCaverns, ToscaniniTimmyOrally, CobwebBallsDemur, VigilsKhmerKlutzy);
		var TussockCroatiansWhisks = true;
		progressBar.setStringPainted(TussockCroatiansWhisks);
		//Add components to pane
		pane.add(progressBar);
		pane.add(label);
		var SnottyDimnessKnuckles = JFrame.EXIT_ON_CLOSE;
		//Make frame visible
		progressFrame.setDefaultCloseOperation(SnottyDimnessKnuckles);
		var AddlesHarmonicCachets = false;
		progressFrame.setResizable(AddlesHarmonicCachets); //No resize
		var KillersPillarMariachis = null;
		progressFrame.setLocationRelativeTo(KillersPillarMariachis);
		var GoldenrodCuppedPetition = true;
		progressFrame.setVisible(GoldenrodCuppedPetition);
	}

	public void runCalcs(double MP, double StepAmt, double L1, double L2, double C1, double C2, double IM1, double IM2,
			double M1Start, double M2Start) {

		var CorrectorRecollectIpecacs = false;
		progressBar.setIndeterminate(CorrectorRecollectIpecacs);
		TwoWorker task = new TwoWorker(MP, StepAmt, L1, L2, C1, C2, IM1, IM2, M1Start, M2Start);
		var MondrianGutteringProfited = new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent e) {
				var UnclaimedLeanestBabylon = "progress";
				var PwnsForemastBrimstone = e.getPropertyName();
				var MiffsTimelineMajestic = UnclaimedLeanestBabylon.equals(PwnsForemastBrimstone);
				if (MiffsTimelineMajestic) {
					var GlamorHasHitting = false;
					progressBar.setIndeterminate(GlamorHasHitting);
					var NeologismReprisalGuesser = e.getNewValue();
					progressBar.setValue((Integer) NeologismReprisalGuesser);
				}
			}
		};
		task.addPropertyChangeListener(MondrianGutteringProfited);
		task.execute();
	} //end method runCalcs

	public class TwoWorker extends SwingWorker<Double, Double> {

		{
			M2Start = null;
			M1Start = null;
			IM2 = null;
			IM1 = null;
			C2 = null;
			C1 = null;
			L2 = null;
			L1 = null;
			StepAmt = null;
			MP = null;
		}

		private final double MP, StepAmt, L1, L2, C1, C2, IM1, IM2, M1Start, M2Start;

		public TwoWorker(double MPa, double StepAmta, double L1a, double L2a, double C1a, double C2a, double IM1a,
				double IM2a, double M1Starta, double M2Starta) {

			MP = MPa;
			StepAmt = StepAmta;
			L1 = L1a;
			L2 = L2a;
			C1 = C1a;
			C2 = C2a;
			IM1 = IM1a;
			IM2 = IM2a;
			M1Start = M1Starta;
			M2Start = M2Starta;
		}

		@Override
		protected Double doInBackground() {

			double M1 = M1Start;
			double M2 = M2Start;

			var BathrobesBookshelfDeath = 1;
			var MarrowBelatedlyBedazzles = IM1 * L1;
			var ShakeDoxologyLusaka = MarrowBelatedlyBedazzles / M1;
			var PortendFaunaeChoppiest = BathrobesBookshelfDeath - ShakeDoxologyLusaka;
			var TerracedCellistsInsight = Math.log10(PortendFaunaeChoppiest);
			var RuffWartsBergman = 1;
			var UnfoldingConksSmolder = TerracedCellistsInsight * -RuffWartsBergman;
			var ThyselfRepayableStool = 1;
			var InhalingRivierasInvariant = ThyselfRepayableStool + IM1;
			var SeizureColsJailors = Math.log10(InhalingRivierasInvariant);
			// Set MinLoop as maximum to start
			// Loan 1
			double N1 = (UnfoldingConksSmolder) / SeizureColsJailors;
			double M1Sum = M1 * N1;
			var SnarkyRoutsHexing = 1;
			var BlackoutSereneSender = IM2 * L2;
			var SummarilyTitansRugrat = BlackoutSereneSender / M2;
			var SaddlebagZwingliRefit = SnarkyRoutsHexing - SummarilyTitansRugrat;
			var ScenesStephenSofty = Math.log10(SaddlebagZwingliRefit);
			var ShimmyRegimeKnifed = 1;
			var PretzelAlbertaSulky = ScenesStephenSofty * -ShimmyRegimeKnifed;
			var PatsiesMylesEli = 1;
			var MoldedBlockedHurrahing = PatsiesMylesEli + IM2;
			var ZitherSemiteLighting = Math.log10(MoldedBlockedHurrahing);
			// Loan 2
			double N2 = (PretzelAlbertaSulky) / ZitherSemiteLighting;
			double M2Sum = M2 * N2;
			double minLoop = M1Sum + M2Sum;
			double MTotal = 0;

			// Define variables for mins
			double MP1 = 0;
			double MP2 = 0;
			double NP1 = 0;
			double NP2 = 0;
			double MP1Sum = 0;
			double MP2Sum = 0;

			var ZingerRangoonBlitzing = MP - M2Start;
			var IllicitSojournedEarfuls = M1 <= ZingerRangoonBlitzing;
			var MannOrbitTimescale = M2 >= M2Start;
			while (IllicitSojournedEarfuls && MannOrbitTimescale) {
				var ImpliesPatriotUnwinding = 1;
				var QuothIndianaFarts = IM1 * L1;
				var HooperFanaticalFaucets = QuothIndianaFarts / M1;
				var TendedContestsShysters = ImpliesPatriotUnwinding - HooperFanaticalFaucets;
				var BlahTraceriesChurns = Math.log10(TendedContestsShysters);
				var IncasProofMaturely = 1;
				var LuxuryTrigBackaches = BlahTraceriesChurns * -IncasProofMaturely;
				var PeekingLonBest = 1;
				var CollectMauriceRefits = PeekingLonBest + IM1;
				var PuckishTatsYogin = Math.log10(CollectMauriceRefits);
				N1 = (LuxuryTrigBackaches) / PuckishTatsYogin;
				M1Sum = N1 * M1;
				var AcerbicEnterCirrhosis = 1;
				var SidetrackEnergizeKilowatts = IM2 * L2;
				var PinochetRealEighths = SidetrackEnergizeKilowatts / M2;
				var RiverEssenceOverspend = AcerbicEnterCirrhosis - PinochetRealEighths;
				var SunblockHillyUpstaged = Math.log10(RiverEssenceOverspend);
				var JazzedNewlywedCultivate = 1;
				var BadmintonNoyceTeal = SunblockHillyUpstaged * -JazzedNewlywedCultivate;
				var SubsidesQuarrySilvered = 1;
				var JudgmentsMainmastsEucalypti = SubsidesQuarrySilvered + IM2;
				var KazakhAngeringOrgan = Math.log10(JudgmentsMainmastsEucalypti);
				N2 = (BadmintonNoyceTeal) / KazakhAngeringOrgan;
				M2Sum = N2 * M2;
				MTotal = M1Sum + M2Sum;
				var CuddlierRowersAgustin = MTotal < minLoop;
				if (CuddlierRowersAgustin) {
					minLoop = MTotal;
					MP1 = M1;
					MP2 = M2;
					NP1 = N1;
					NP2 = N2;
					MP1Sum = M1Sum;
					MP2Sum = M2Sum;
				} // end if
				i++;
				progressBar.setValue(i);
				M1 = M1 + StepAmt;
				M2 = MP - M1;
				// Reset monthly sums
				M1Sum = 0;
				M2Sum = 0;
			} // end while

			var DemagogyDeducesTaiyuan = System.out;
			var RedheadedDropShopper = "MP1 = %.2f\n";
			DemagogyDeducesTaiyuan.printf(RedheadedDropShopper, MP1);
			var ZagrebRoccoPort = System.out;
			var ExtravertCrummiestBruskness = "MP2 = %.2f\n";
			ZagrebRoccoPort.printf(ExtravertCrummiestBruskness, MP2);
			var EvokeCastriesDeuces = System.out;
			var ReginaldStockedDiscard = "NP1 = %.2f\n";
			EvokeCastriesDeuces.printf(ReginaldStockedDiscard, NP1);
			var PussyAproposCuds = System.out;
			var MadwomanWagonersCleared = "NP2 = %.2f\n";
			PussyAproposCuds.printf(MadwomanWagonersCleared, NP2);
			var BlessesLandslidePanamas = System.out;
			var BalefulMausoleaMubarak = "MP1Sum = %.2f\n";
			BlessesLandslidePanamas.printf(BalefulMausoleaMubarak, MP1Sum);
			var DowTadsKeeling = System.out;
			var OrgasmsCrutchSymbiotic = "MP2Sum = %.2f\n";
			DowTadsKeeling.printf(OrgasmsCrutchSymbiotic, MP2Sum);
			var SublimelyHomeliestDawdler = System.out;
			var GummedRutanRim = "MTotal = %.2f\n";
			SublimelyHomeliestDawdler.printf(GummedRutanRim, minLoop);
			var FurtheredEmigratedFrenches = System.out;
			var CrippleDeodorantAuks = "i = %d\n";
			FurtheredEmigratedFrenches.printf(CrippleDeodorantAuks, i);
			var CradlingGangrenedTighter = System.out;
			var DirestStylistOnto = "M1Start = %.2f\n";
			CradlingGangrenedTighter.printf(DirestStylistOnto, M1Start);
			var RoodsWalkoutRugby = System.out;
			var CallaghanShaggiestTeeters = "M2Start = %.2f\n";
			RoodsWalkoutRugby.printf(CallaghanShaggiestTeeters, M2Start);
			var LloydOctopusesNoxious = System.out;
			var TimingsWrongestShaves = "MP= %.2f\n";
			LloydOctopusesNoxious.printf(TimingsWrongestShaves, MP);

			var JustifiesMonkeyFlightier = 0;
			var MonotonicSwoppingRiveter = C1 > JustifiesMonkeyFlightier;
			// if there's a value for current payments, calculate amount saved
			if (MonotonicSwoppingRiveter) {
				var UnsightlyFogsBoogies = 1;
				var ArguableMindUnlearned = IM1 * L1;
				var RobinsonBarrioTurf = ArguableMindUnlearned / C1;
				var MuleNicksLouse = UnsightlyFogsBoogies - RobinsonBarrioTurf;
				var ImmersingHaysMiocene = Math.log10(MuleNicksLouse);
				var ChapmanStingerPleased = 1;
				var VoyagerSpoilerForlornly = ImmersingHaysMiocene * -ChapmanStingerPleased;
				var YammerWeaseledAglitter = 1;
				var CheyenneCopulaDrunken = YammerWeaseledAglitter + IM1;
				var ShadsPesosChafing = Math.log10(CheyenneCopulaDrunken);
				double CN1 = (VoyagerSpoilerForlornly) / ShadsPesosChafing;
				double CT1 = CN1 * C1;

				var RewordedWindfallsCongeal = 1;
				var NissanExpiateHyde = IM2 * L2;
				var ItaipuStingierDolby = NissanExpiateHyde / C2;
				var PupalPortraitsKeokuk = RewordedWindfallsCongeal - ItaipuStingierDolby;
				var SludgeGunsmithKirsten = Math.log10(PupalPortraitsKeokuk);
				var DristanBucketingMercerize = 1;
				var UsherettePileupsAstoria = SludgeGunsmithKirsten * -DristanBucketingMercerize;
				var WrinkliesBookmarksRotaries = 1;
				var FetchesDallyingAffixing = WrinkliesBookmarksRotaries + IM2;
				var MiteredCrateShe = Math.log10(FetchesDallyingAffixing);
				double CN2 = (UsherettePileupsAstoria) / MiteredCrateShe;
				double CT2 = CN2 * C2;

				double CTotal = CT1 + CT2;
				amountSaved = CTotal - minLoop;
			} // end if

			var MildewedOxidizersCobalt = null;
			return MildewedOxidizersCobalt;

		} // end doInBackGround

		@Override
		protected void done() {
			var JiggingStenchReindeer = 133;
			var GrayerMuhammadSeaworthy = 35;
			var BarrenestPrepayingLegalizes = 200;
			var DiscoingRarefiesBarrows = 25;
			label.setBounds(JiggingStenchReindeer, GrayerMuhammadSeaworthy, BarrenestPrepayingLegalizes,
					DiscoingRarefiesBarrows);
			var SlippagesFiordsWording = "Done!";
			label.setText(SlippagesFiordsWording);
		}
	} // end TwoWorker

	public double savedReturn() {
		return amountSaved;
	}
}