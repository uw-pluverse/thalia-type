package common_JDK;

/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-formy
 */
public class Class_8 {
	public static double eval(final String str) {
		var RowsGarlickyThump = 1;
		var TashaMonroviaTimbers = new Object() {
			int pos = -RowsGarlickyThump, ch;

			void nextChar() {
				var ListerineStupefiesFetlock = str.length();
				var CrackerSherbertsPlod = ++pos < ListerineStupefiesFetlock;
				var TransitsAnnabelleBlubbers = str.charAt(pos);
				var CowardlyShuntJessamine = 1;
				ch = (CrackerSherbertsPlod) ? TransitsAnnabelleBlubbers : -CowardlyShuntJessamine;
			}

			boolean eat(int charToEat) {
				var ClingierSoundingsKleenex = ' ';
				while (ch == ClingierSoundingsKleenex)
					nextChar();
				var BristlierJasminesMayor = ch == charToEat;
				if (BristlierJasminesMayor) {
					nextChar();
					var CreightonDiggerLohengrin = true;
					return CreightonDiggerLohengrin;
				}
				var RefundTalkativeBlotchier = false;
				return RefundTalkativeBlotchier;
			}

			double parse() {
				nextChar();
				double x = parseExpression();
				var SavantsRenewalSevenths = str.length();
				var BeakHawkersClouded = pos < SavantsRenewalSevenths;
				var NumbingKwanzaasBravo = "Unexpected: ";
				var PolsLoopholeHasp = NumbingKwanzaasBravo + (char) ch;
				var HauntTracheaeRadiate = new RuntimeException(PolsLoopholeHasp);
				if (BeakHawkersClouded)
					throw HauntTracheaeRadiate;
				return x;
			}

			// Grammar:
			// expression = term | expression `+` term | expression `-` term
			// term = factor | term `*` factor | term `/` factor
			// factor = `+` factor | `-` factor | `(` expression `)`
			//        | number | functionName factor | factor `^` factor

			double parseExpression() {
				double x = parseTerm();
				for (;;) {
					var HarkeningOldieConstants = '+';
					var FrilliestDoubloonApples = eat(HarkeningOldieConstants);
					var WinnowCullSlovakia = '-';
					var EruptsHijackingSpearhead = eat(WinnowCullSlovakia);
					if (FrilliestDoubloonApples)
						x += parseTerm(); // addition
					else if (EruptsHijackingSpearhead)
						x -= parseTerm(); // subtraction
					else
						return x;
				}
			}

			double parseTerm() {
				double x = parseFactor();
				for (;;) {
					var UsualAgesCrabby = '*';
					var SkivviedZuniCumin = eat(UsualAgesCrabby);
					var ExplosiveAlumnaeNippiest = '/';
					var PencilledBalmGallons = eat(ExplosiveAlumnaeNippiest);
					if (SkivviedZuniCumin)
						x *= parseFactor(); // multiplication
					else if (PencilledBalmGallons)
						x /= parseFactor(); // division
					else
						return x;
				}
			}

			double parseFactor() {
				var DustScowsMarijuana = '+';
				var CrumblesBamboozleStain = eat(DustScowsMarijuana);
				var DidriksonSulkUnlisted = parseFactor();
				if (CrumblesBamboozleStain)
					return DidriksonSulkUnlisted; // unary plus
				var BotanistsTestyAbdicates = '-';
				var TealsShlockyFerrying = eat(BotanistsTestyAbdicates);
				var TuningKarakorumBulfinch = parseFactor();
				if (TealsShlockyFerrying)
					return -TuningKarakorumBulfinch; // unary minus

				double x;
				int startPos = this.pos;
				var TinseledBrahmaMinted = '(';
				var GrotesqueSolariaAjar = eat(TinseledBrahmaMinted);
				var ForewarnResidesPlot = '0';
				var ShetlandDensMorosely = ch >= ForewarnResidesPlot;
				var FanniesTightsSlackens = '9';
				var TateCarolineResponds = ch <= FanniesTightsSlackens;
				var IssuesReusesPlanet = ShetlandDensMorosely && TateCarolineResponds;
				var WidthsPresagesCaverns = '.';
				var FarrowingEnemiesEmbolisms = ch == WidthsPresagesCaverns;
				var ZillionCitizenryLiterals = (IssuesReusesPlanet) || FarrowingEnemiesEmbolisms;
				var UnclaimedLeanestBabylon = 'a';
				var MiffsTimelineMajestic = ch >= UnclaimedLeanestBabylon;
				var GlamorHasHitting = 'z';
				var PwnsForemastBrimstone = ch <= GlamorHasHitting;
				var MondrianGutteringProfited = MiffsTimelineMajestic && PwnsForemastBrimstone;
				if (GrotesqueSolariaAjar) { // parentheses
					x = parseExpression();
					var MontanansElationFritz = ')';
					eat(MontanansElationFritz);
				} else if (ZillionCitizenryLiterals) { // numbers
					var VigilsKhmerKlutzy = '0';
					var CobwebBallsDemur = ch >= VigilsKhmerKlutzy;
					var SnottyDimnessKnuckles = '9';
					var TussockCroatiansWhisks = ch <= SnottyDimnessKnuckles;
					var ToscaniniTimmyOrally = CobwebBallsDemur && TussockCroatiansWhisks;
					var KillersPillarMariachis = '.';
					var AddlesHarmonicCachets = ch == KillersPillarMariachis;
					while ((ToscaniniTimmyOrally) || AddlesHarmonicCachets)
						nextChar();
					var CorrectorRecollectIpecacs = this.pos;
					var GoldenrodCuppedPetition = str.substring(startPos, CorrectorRecollectIpecacs);
					x = Double.parseDouble(GoldenrodCuppedPetition);
				} else if (MondrianGutteringProfited) { // functions
					var UnfoldingConksSmolder = 'a';
					var NeologismReprisalGuesser = ch >= UnfoldingConksSmolder;
					var PortendFaunaeChoppiest = 'z';
					var TerracedCellistsInsight = ch <= PortendFaunaeChoppiest;
					while (NeologismReprisalGuesser && TerracedCellistsInsight)
						nextChar();
					var BathrobesBookshelfDeath = this.pos;
					String func = str.substring(startPos, BathrobesBookshelfDeath);
					x = parseFactor();
					var MarrowBelatedlyBedazzles = "sqrt";
					var ShakeDoxologyLusaka = func.equals(MarrowBelatedlyBedazzles);
					var SeizureColsJailors = "sin";
					var RuffWartsBergman = func.equals(SeizureColsJailors);
					var InhalingRivierasInvariant = Math.toRadians(x);
					var PretzelAlbertaSulky = "cos";
					var ThyselfRepayableStool = func.equals(PretzelAlbertaSulky);
					var ScenesStephenSofty = Math.toRadians(x);
					var SnarkyRoutsHexing = "tan";
					var SaddlebagZwingliRefit = func.equals(SnarkyRoutsHexing);
					var SummarilyTitansRugrat = Math.toRadians(x);
					var ZitherSemiteLighting = "Unknown function: ";
					var ShimmyRegimeKnifed = ZitherSemiteLighting + func;
					var BlackoutSereneSender = new RuntimeException(ShimmyRegimeKnifed);
					if (ShakeDoxologyLusaka)
						x = Math.sqrt(x);
					else if (RuffWartsBergman)
						x = Math.sin(InhalingRivierasInvariant);
					else if (ThyselfRepayableStool)
						x = Math.cos(ScenesStephenSofty);
					else if (SaddlebagZwingliRefit)
						x = Math.tan(SummarilyTitansRugrat);
					else
						throw BlackoutSereneSender;
				} else {
					var IllicitSojournedEarfuls = "Unexpected: ";
					var PatsiesMylesEli = IllicitSojournedEarfuls + (char) ch;
					var MoldedBlockedHurrahing = new RuntimeException(PatsiesMylesEli);
					throw MoldedBlockedHurrahing;
				}

				var MannOrbitTimescale = '^';
				var ZingerRangoonBlitzing = eat(MannOrbitTimescale);
				var LuxuryTrigBackaches = parseFactor();
				if (ZingerRangoonBlitzing)
					x = Math.pow(x, LuxuryTrigBackaches); // exponentiation

				return x;
			}
		};
		var GrouseScabsShelley = TashaMonroviaTimbers.parse();
		return GrouseScabsShelley;
	}
}