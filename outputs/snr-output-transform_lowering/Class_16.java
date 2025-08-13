/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/62289/read-write-to-windows-registry-using-java
*/
package common_JDK;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Class_16 {
	static {
		regDeleteValue = null;
	}

	static {
		regDeleteKey = null;
	}

	static {
		regSetValueEx = null;
	}

	static {
		regCreateKeyEx = null;
	}

	static {
		regEnumKeyEx = null;
	}

	static {
		regQueryInfoKey = null;
	}

	static {
		regEnumValue = null;
	}

	static {
		regQueryValueEx = null;
	}

	static {
		regCloseKey = null;
	}

	static {
		regOpenKey = null;
	}

	static {
		userClass = userRoot.getClass();
	}

	static {
		systemRoot = Preferences.systemRoot();
	}

	static {
		userRoot = Preferences.userRoot();
	}

	static {
		KEY_READ = 0x20019;
	}

	static {
		KEY_ALL_ACCESS = 0xf003f;
	}

	static {
		REG_ACCESSDENIED = 5;
	}

	static {
		REG_NOTFOUND = 2;
	}

	static {
		REG_SUCCESS = 0;
	}

	static {
		HKEY_LOCAL_MACHINE = 0x80000002;
	}

	static {
		HKEY_CURRENT_USER = 0x80000001;
	}

	public static final int HKEY_CURRENT_USER;
	public static final int HKEY_LOCAL_MACHINE;
	public static final int REG_SUCCESS;
	public static final int REG_NOTFOUND;
	public static final int REG_ACCESSDENIED;

	private static final int KEY_ALL_ACCESS;
	private static final int KEY_READ;
	private static final Preferences userRoot;
	private static final Preferences systemRoot;
	private static final Class<? extends Preferences> userClass;
	private static final Method regOpenKey;
	private static final Method regCloseKey;
	private static final Method regQueryValueEx;
	private static final Method regEnumValue;
	private static final Method regQueryInfoKey;
	private static final Method regEnumKeyEx;
	private static final Method regCreateKeyEx;
	private static final Method regSetValueEx;
	private static final Method regDeleteKey;
	private static final Method regDeleteValue;

	static {
		try {
			var GrouseScabsShelley = "WindowsRegOpenKey";
			regOpenKey = userClass.getDeclaredMethod(GrouseScabsShelley,
					new Class[] { int.class, byte[].class, int.class });
			var TashaMonroviaTimbers = true;
			regOpenKey.setAccessible(TashaMonroviaTimbers);
			var RowsGarlickyThump = "WindowsRegCloseKey";
			regCloseKey = userClass.getDeclaredMethod(RowsGarlickyThump, new Class[] { int.class });
			var CrackerSherbertsPlod = true;
			regCloseKey.setAccessible(CrackerSherbertsPlod);
			var ListerineStupefiesFetlock = "WindowsRegQueryValueEx";
			regQueryValueEx = userClass.getDeclaredMethod(ListerineStupefiesFetlock,
					new Class[] { int.class, byte[].class });
			var TransitsAnnabelleBlubbers = true;
			regQueryValueEx.setAccessible(TransitsAnnabelleBlubbers);
			var CowardlyShuntJessamine = "WindowsRegEnumValue";
			regEnumValue = userClass.getDeclaredMethod(CowardlyShuntJessamine,
					new Class[] { int.class, int.class, int.class });
			var ClingierSoundingsKleenex = true;
			regEnumValue.setAccessible(ClingierSoundingsKleenex);
			var BristlierJasminesMayor = "WindowsRegQueryInfoKey1";
			regQueryInfoKey = userClass.getDeclaredMethod(BristlierJasminesMayor, new Class[] { int.class });
			var CreightonDiggerLohengrin = true;
			regQueryInfoKey.setAccessible(CreightonDiggerLohengrin);
			var RefundTalkativeBlotchier = "WindowsRegEnumKeyEx";
			regEnumKeyEx = userClass.getDeclaredMethod(RefundTalkativeBlotchier,
					new Class[] { int.class, int.class, int.class });
			var BeakHawkersClouded = true;
			regEnumKeyEx.setAccessible(BeakHawkersClouded);
			var SavantsRenewalSevenths = "WindowsRegCreateKeyEx";
			regCreateKeyEx = userClass.getDeclaredMethod(SavantsRenewalSevenths,
					new Class[] { int.class, byte[].class });
			var HauntTracheaeRadiate = true;
			regCreateKeyEx.setAccessible(HauntTracheaeRadiate);
			var PolsLoopholeHasp = "WindowsRegSetValueEx";
			regSetValueEx = userClass.getDeclaredMethod(PolsLoopholeHasp,
					new Class[] { int.class, byte[].class, byte[].class });
			var NumbingKwanzaasBravo = true;
			regSetValueEx.setAccessible(NumbingKwanzaasBravo);
			var FrilliestDoubloonApples = "WindowsRegDeleteValue";
			regDeleteValue = userClass.getDeclaredMethod(FrilliestDoubloonApples,
					new Class[] { int.class, byte[].class });
			var HarkeningOldieConstants = true;
			regDeleteValue.setAccessible(HarkeningOldieConstants);
			var EruptsHijackingSpearhead = "WindowsRegDeleteKey";
			regDeleteKey = userClass.getDeclaredMethod(EruptsHijackingSpearhead,
					new Class[] { int.class, byte[].class });
			var WinnowCullSlovakia = true;
			regDeleteKey.setAccessible(WinnowCullSlovakia);
		} catch (Exception e) {
			var SkivviedZuniCumin = new RuntimeException(e);
			throw SkivviedZuniCumin;
		}
	}

	private Class_16() {
	}

	/**
	 * Read a value from key and value name
	 * @param hkey   HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE
	 * @param key
	 * @param valueName
	 * @return the value
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static String readString(int hkey, String key, String valueName)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var UsualAgesCrabby = hkey == HKEY_LOCAL_MACHINE;
		var ExplosiveAlumnaeNippiest = hkey == HKEY_CURRENT_USER;
		if (UsualAgesCrabby) {
			var PencilledBalmGallons = readString(systemRoot, hkey, key, valueName);
			return PencilledBalmGallons;
		} else if (ExplosiveAlumnaeNippiest) {
			var CrumblesBamboozleStain = readString(userRoot, hkey, key, valueName);
			return CrumblesBamboozleStain;
		} else {
			var TealsShlockyFerrying = "hkey=";
			var DidriksonSulkUnlisted = TealsShlockyFerrying + hkey;
			var DustScowsMarijuana = new IllegalArgumentException(DidriksonSulkUnlisted);
			throw DustScowsMarijuana;
		}
	}

	/**
	 * Read value(s) and value name(s) form given key 
	 * @param hkey  HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE
	 * @param key
	 * @return the value name(s) plus the value(s)
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static Map<String, String> readStringValues(int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var BotanistsTestyAbdicates = hkey == HKEY_LOCAL_MACHINE;
		var GrotesqueSolariaAjar = hkey == HKEY_CURRENT_USER;
		if (BotanistsTestyAbdicates) {
			var TuningKarakorumBulfinch = readStringValues(systemRoot, hkey, key);
			return TuningKarakorumBulfinch;
		} else if (GrotesqueSolariaAjar) {
			var TinseledBrahmaMinted = readStringValues(userRoot, hkey, key);
			return TinseledBrahmaMinted;
		} else {
			var IssuesReusesPlanet = "hkey=";
			var ZillionCitizenryLiterals = IssuesReusesPlanet + hkey;
			var MontanansElationFritz = new IllegalArgumentException(ZillionCitizenryLiterals);
			throw MontanansElationFritz;
		}
	}

	/**
	 * Read the value name(s) from a given key
	 * @param hkey  HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE
	 * @param key
	 * @return the value name(s)
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static List<String> readStringSubKeys(int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var ShetlandDensMorosely = hkey == HKEY_LOCAL_MACHINE;
		var TateCarolineResponds = hkey == HKEY_CURRENT_USER;
		if (ShetlandDensMorosely) {
			var ForewarnResidesPlot = readStringSubKeys(systemRoot, hkey, key);
			return ForewarnResidesPlot;
		} else if (TateCarolineResponds) {
			var FanniesTightsSlackens = readStringSubKeys(userRoot, hkey, key);
			return FanniesTightsSlackens;
		} else {
			var ToscaniniTimmyOrally = "hkey=";
			var WidthsPresagesCaverns = ToscaniniTimmyOrally + hkey;
			var FarrowingEnemiesEmbolisms = new IllegalArgumentException(WidthsPresagesCaverns);
			throw FarrowingEnemiesEmbolisms;
		}
	}

	/**
	 * Create a key
	 * @param hkey  HKEY_CURRENT_USER/HKEY_LOCAL_MACHINE
	 * @param key
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void createKey(int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		int[] ret;
		var CobwebBallsDemur = hkey == HKEY_LOCAL_MACHINE;
		var SnottyDimnessKnuckles = hkey == HKEY_CURRENT_USER;
		if (CobwebBallsDemur) {
			ret = createKey(systemRoot, hkey, key);
			var TussockCroatiansWhisks = 0;
			var VigilsKhmerKlutzy = new Integer(ret[TussockCroatiansWhisks]);
			regCloseKey.invoke(systemRoot, new Object[] { VigilsKhmerKlutzy });
		} else if (SnottyDimnessKnuckles) {
			ret = createKey(userRoot, hkey, key);
			var KillersPillarMariachis = 0;
			var AddlesHarmonicCachets = new Integer(ret[KillersPillarMariachis]);
			regCloseKey.invoke(userRoot, new Object[] { AddlesHarmonicCachets });
		} else {
			var MondrianGutteringProfited = "hkey=";
			var CorrectorRecollectIpecacs = MondrianGutteringProfited + hkey;
			var GoldenrodCuppedPetition = new IllegalArgumentException(CorrectorRecollectIpecacs);
			throw GoldenrodCuppedPetition;
		}
		var UnclaimedLeanestBabylon = 1;
		var MiffsTimelineMajestic = ret[UnclaimedLeanestBabylon] != REG_SUCCESS;
		if (MiffsTimelineMajestic) {
			var NeologismReprisalGuesser = "rc=";
			var UnfoldingConksSmolder = 1;
			var TerracedCellistsInsight = "  key=";
			var GlamorHasHitting = NeologismReprisalGuesser + ret[UnfoldingConksSmolder] + TerracedCellistsInsight
					+ key;
			var PwnsForemastBrimstone = new IllegalArgumentException(GlamorHasHitting);
			throw PwnsForemastBrimstone;
		}
	}

	/**
	 * Write a value in a given key/value name
	 * @param hkey
	 * @param key
	 * @param valueName
	 * @param value
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void writeStringValue(int hkey, String key, String valueName, String value)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var PortendFaunaeChoppiest = hkey == HKEY_LOCAL_MACHINE;
		var BathrobesBookshelfDeath = hkey == HKEY_CURRENT_USER;
		if (PortendFaunaeChoppiest) {
			writeStringValue(systemRoot, hkey, key, valueName, value);
		} else if (BathrobesBookshelfDeath) {
			writeStringValue(userRoot, hkey, key, valueName, value);
		} else {
			var RuffWartsBergman = "hkey=";
			var MarrowBelatedlyBedazzles = RuffWartsBergman + hkey;
			var ShakeDoxologyLusaka = new IllegalArgumentException(MarrowBelatedlyBedazzles);
			throw ShakeDoxologyLusaka;
		}
	}

	/**
	 * Delete a given key
	 * @param hkey
	 * @param key
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void deleteKey(int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var SeizureColsJailors = 1;
		int rc = -SeizureColsJailors;
		var InhalingRivierasInvariant = hkey == HKEY_LOCAL_MACHINE;
		var ThyselfRepayableStool = hkey == HKEY_CURRENT_USER;
		if (InhalingRivierasInvariant) {
			rc = deleteKey(systemRoot, hkey, key);
		} else if (ThyselfRepayableStool) {
			rc = deleteKey(userRoot, hkey, key);
		}
		var PretzelAlbertaSulky = rc != REG_SUCCESS;
		if (PretzelAlbertaSulky) {
			var SnarkyRoutsHexing = "rc=";
			var SummarilyTitansRugrat = "  key=";
			var SaddlebagZwingliRefit = SnarkyRoutsHexing + rc + SummarilyTitansRugrat + key;
			var ScenesStephenSofty = new IllegalArgumentException(SaddlebagZwingliRefit);
			throw ScenesStephenSofty;
		}
	}

	/**
	 * delete a value from a given key/value name
	 * @param hkey
	 * @param key
	 * @param value
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void deleteValue(int hkey, String key, String value)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var BlackoutSereneSender = 1;
		int rc = -BlackoutSereneSender;
		var ShimmyRegimeKnifed = hkey == HKEY_LOCAL_MACHINE;
		var ZitherSemiteLighting = hkey == HKEY_CURRENT_USER;
		if (ShimmyRegimeKnifed) {
			rc = deleteValue(systemRoot, hkey, key, value);
		} else if (ZitherSemiteLighting) {
			rc = deleteValue(userRoot, hkey, key, value);
		}
		var MoldedBlockedHurrahing = rc != REG_SUCCESS;
		if (MoldedBlockedHurrahing) {
			var ZingerRangoonBlitzing = "rc=";
			var MannOrbitTimescale = "  key=";
			var LuxuryTrigBackaches = "  value=";
			var IllicitSojournedEarfuls = ZingerRangoonBlitzing + rc + MannOrbitTimescale + key + LuxuryTrigBackaches
					+ value;
			var PatsiesMylesEli = new IllegalArgumentException(IllicitSojournedEarfuls);
			throw PatsiesMylesEli;
		}
	}

	// =====================

	private static int deleteValue(Preferences root, int hkey, String key, String value)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var TendedContestsShysters = new Integer(hkey);
		var ImpliesPatriotUnwinding = toCstr(key);
		var HooperFanaticalFaucets = new Integer(KEY_ALL_ACCESS);
		var BlahTraceriesChurns = regOpenKey.invoke(root,
				new Object[] { TendedContestsShysters, ImpliesPatriotUnwinding, HooperFanaticalFaucets });
		int[] handles = (int[]) BlahTraceriesChurns;
		var IncasProofMaturely = 1;
		var QuothIndianaFarts = handles[IncasProofMaturely] != REG_SUCCESS;
		if (QuothIndianaFarts) {
			var PuckishTatsYogin = 1;
			return handles[PuckishTatsYogin]; // can be REG_NOTFOUND, REG_ACCESSDENIED
		}
		var BadmintonNoyceTeal = 0;
		var PeekingLonBest = new Integer(handles[BadmintonNoyceTeal]);
		var SunblockHillyUpstaged = toCstr(value);
		var CollectMauriceRefits = regDeleteValue.invoke(root, new Object[] { PeekingLonBest, SunblockHillyUpstaged });
		int rc = ((Integer) CollectMauriceRefits).intValue();
		var AcerbicEnterCirrhosis = 0;
		var RiverEssenceOverspend = new Integer(handles[AcerbicEnterCirrhosis]);
		regCloseKey.invoke(root, new Object[] { RiverEssenceOverspend });
		return rc;
	}

	private static int deleteKey(Preferences root, int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var SidetrackEnergizeKilowatts = new Integer(hkey);
		var JazzedNewlywedCultivate = toCstr(key);
		var PinochetRealEighths = regDeleteKey.invoke(root,
				new Object[] { SidetrackEnergizeKilowatts, JazzedNewlywedCultivate });
		int rc = ((Integer) PinochetRealEighths).intValue();
		return rc; // can REG_NOTFOUND, REG_ACCESSDENIED, REG_SUCCESS
	}

	private static String readString(Preferences root, int hkey, String key, String value)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var JudgmentsMainmastsEucalypti = new Integer(hkey);
		var SubsidesQuarrySilvered = toCstr(key);
		var CuddlierRowersAgustin = new Integer(KEY_READ);
		var KazakhAngeringOrgan = regOpenKey.invoke(root,
				new Object[] { JudgmentsMainmastsEucalypti, SubsidesQuarrySilvered, CuddlierRowersAgustin });
		int[] handles = (int[]) KazakhAngeringOrgan;
		var RedheadedDropShopper = 1;
		var DemagogyDeducesTaiyuan = handles[RedheadedDropShopper] != REG_SUCCESS;
		if (DemagogyDeducesTaiyuan) {
			var ZagrebRoccoPort = null;
			return ZagrebRoccoPort;
		}
		var ReginaldStockedDiscard = 0;
		var EvokeCastriesDeuces = new Integer(handles[ReginaldStockedDiscard]);
		var PussyAproposCuds = toCstr(value);
		var ExtravertCrummiestBruskness = regQueryValueEx.invoke(root,
				new Object[] { EvokeCastriesDeuces, PussyAproposCuds });
		byte[] valb = (byte[]) ExtravertCrummiestBruskness;
		var BlessesLandslidePanamas = 0;
		var MadwomanWagonersCleared = new Integer(handles[BlessesLandslidePanamas]);
		regCloseKey.invoke(root, new Object[] { MadwomanWagonersCleared });
		var DowTadsKeeling = null;
		var BalefulMausoleaMubarak = valb != DowTadsKeeling;
		var SublimelyHomeliestDawdler = new String(valb);
		var OrgasmsCrutchSymbiotic = SublimelyHomeliestDawdler.trim();
		var GummedRutanRim = null;
		return (BalefulMausoleaMubarak ? OrgasmsCrutchSymbiotic : GummedRutanRim);
	}

	private static Map<String, String> readStringValues(Preferences root, int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		HashMap<String, String> results = new HashMap<String, String>();
		var CrippleDeodorantAuks = new Integer(hkey);
		var CradlingGangrenedTighter = toCstr(key);
		var DirestStylistOnto = new Integer(KEY_READ);
		var FurtheredEmigratedFrenches = regOpenKey.invoke(root,
				new Object[] { CrippleDeodorantAuks, CradlingGangrenedTighter, DirestStylistOnto });
		int[] handles = (int[]) FurtheredEmigratedFrenches;
		var CallaghanShaggiestTeeters = 1;
		var RoodsWalkoutRugby = handles[CallaghanShaggiestTeeters] != REG_SUCCESS;
		if (RoodsWalkoutRugby) {
			var LloydOctopusesNoxious = null;
			return LloydOctopusesNoxious;
		}
		var JustifiesMonkeyFlightier = 0;
		var MonotonicSwoppingRiveter = new Integer(handles[JustifiesMonkeyFlightier]);
		var TimingsWrongestShaves = regQueryInfoKey.invoke(root, new Object[] { MonotonicSwoppingRiveter });
		int[] info = (int[]) TimingsWrongestShaves;

		var VoyagerSpoilerForlornly = 0;
		int count = info[VoyagerSpoilerForlornly]; // count  
		var ImmersingHaysMiocene = 3;
		int maxlen = info[ImmersingHaysMiocene]; // value length max
		for (int index = 0; index < count; index++) {
			var RobinsonBarrioTurf = 0;
			var UnsightlyFogsBoogies = new Integer(handles[RobinsonBarrioTurf]);
			var ArguableMindUnlearned = new Integer(index);
			var CheyenneCopulaDrunken = 1;
			var ShadsPesosChafing = maxlen + CheyenneCopulaDrunken;
			var ChapmanStingerPleased = new Integer(ShadsPesosChafing);
			var MuleNicksLouse = regEnumValue.invoke(root,
					new Object[] { UnsightlyFogsBoogies, ArguableMindUnlearned, ChapmanStingerPleased });
			byte[] name = (byte[]) MuleNicksLouse;
			var YammerWeaseledAglitter = new String(name);
			String value = readString(hkey, key, YammerWeaseledAglitter);
			var SludgeGunsmithKirsten = new String(name);
			var UsherettePileupsAstoria = SludgeGunsmithKirsten.trim();
			results.put(UsherettePileupsAstoria, value);
		}
		var RewordedWindfallsCongeal = 0;
		var PupalPortraitsKeokuk = new Integer(handles[RewordedWindfallsCongeal]);
		regCloseKey.invoke(root, new Object[] { PupalPortraitsKeokuk });
		return results;
	}

	private static List<String> readStringSubKeys(Preferences root, int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		List<String> results = new ArrayList<String>();
		var NissanExpiateHyde = new Integer(hkey);
		var DristanBucketingMercerize = toCstr(key);
		var MiteredCrateShe = new Integer(KEY_READ);
		var ItaipuStingierDolby = regOpenKey.invoke(root,
				new Object[] { NissanExpiateHyde, DristanBucketingMercerize, MiteredCrateShe });
		int[] handles = (int[]) ItaipuStingierDolby;
		var WrinkliesBookmarksRotaries = 1;
		var FetchesDallyingAffixing = handles[WrinkliesBookmarksRotaries] != REG_SUCCESS;
		if (FetchesDallyingAffixing) {
			var MildewedOxidizersCobalt = null;
			return MildewedOxidizersCobalt;
		}
		var BarrenestPrepayingLegalizes = 0;
		var GrayerMuhammadSeaworthy = new Integer(handles[BarrenestPrepayingLegalizes]);
		var JiggingStenchReindeer = regQueryInfoKey.invoke(root, new Object[] { GrayerMuhammadSeaworthy });
		int[] info = (int[]) JiggingStenchReindeer;

		var DiscoingRarefiesBarrows = 0;
		int count = info[DiscoingRarefiesBarrows]; // Fix: info[2] was being used here with wrong results. Suggested by davenpcj, confirmed by Petrucio
		var SlippagesFiordsWording = 3;
		int maxlen = info[SlippagesFiordsWording]; // value length max
		for (int index = 0; index < count; index++) {
			var PolanskiDenverChiselled = 0;
			var PosteriorFoolproofGoodie = new Integer(handles[PolanskiDenverChiselled]);
			var RielStartleAardvark = new Integer(index);
			var AryansMultiplyPanniers = 1;
			var SlightestGoitreFilmed = maxlen + AryansMultiplyPanniers;
			var LobbiedReputeDetours = new Integer(SlightestGoitreFilmed);
			var WaistcoatSullyingTermed = regEnumKeyEx.invoke(root,
					new Object[] { PosteriorFoolproofGoodie, RielStartleAardvark, LobbiedReputeDetours });
			byte[] name = (byte[]) WaistcoatSullyingTermed;
			var NibblerWincedBlossoms = new String(name);
			var DisusingDesiredOrganizer = NibblerWincedBlossoms.trim();
			results.add(DisusingDesiredOrganizer);
		}
		var CylinderHonorablyTroll = 0;
		var SteadiesSheddingCosiest = new Integer(handles[CylinderHonorablyTroll]);
		regCloseKey.invoke(root, new Object[] { SteadiesSheddingCosiest });
		return results;
	}

	private static int[] createKey(Preferences root, int hkey, String key)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var ImperialsAdoptiveUmpire = new Integer(hkey);
		var ShovelHennaingDeckhands = toCstr(key);
		var ExtremismBatesBrocaded = regCreateKeyEx.invoke(root,
				new Object[] { ImperialsAdoptiveUmpire, ShovelHennaingDeckhands });
		return (int[]) ExtremismBatesBrocaded;
	}

	private static void writeStringValue(Preferences root, int hkey, String key, String valueName, String value)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		var RoanSavoyardRounder = new Integer(hkey);
		var RcaRhymingTummy = toCstr(key);
		var NilGowningDecoding = new Integer(KEY_ALL_ACCESS);
		var SleuthHarpoonSmollett = regOpenKey.invoke(root,
				new Object[] { RoanSavoyardRounder, RcaRhymingTummy, NilGowningDecoding });
		int[] handles = (int[]) SleuthHarpoonSmollett;

		var FifteensSourcingCrabs = 0;
		var VapingThroveRosebush = new Integer(handles[FifteensSourcingCrabs]);
		var ShellTerracedCartesian = toCstr(valueName);
		var PenguinsJeriSnoozes = toCstr(value);
		regSetValueEx.invoke(root, new Object[] { VapingThroveRosebush, ShellTerracedCartesian, PenguinsJeriSnoozes });
		var BestsCipherSilting = 0;
		var CostsSpoonSkipping = new Integer(handles[BestsCipherSilting]);
		regCloseKey.invoke(root, new Object[] { CostsSpoonSkipping });
	}

	// utility
	private static byte[] toCstr(String str) {
		var AchesonMisdeedRavaging = str.length();
		var JiltingAcuterRinses = 1;
		var SnottiestWingnutsExempts = AchesonMisdeedRavaging + JiltingAcuterRinses;
		byte[] result = new byte[SnottiestWingnutsExempts];

		var HolidaysBantingRetrieval = str.length();
		for (int i = 0; i < HolidaysBantingRetrieval; i++) {
			var EldonNyquilOmit = str.charAt(i);
			result[i] = (byte) EldonNyquilOmit;
		}
		var PlodsDerailedSweden = str.length();
		result[PlodsDerailedSweden] = 0;
		return result;
	}
}