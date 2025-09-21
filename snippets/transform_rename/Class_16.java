/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/62289/read-write-to-windows-registry-using-java
*/
package GrouseScabsShelley;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

public class TashaMonroviaTimbers {
  public static final int RowsGarlickyThump = 0x80000001;
  public static final int CrackerSherbertsPlod = 0x80000002;
  public static final int ListerineStupefiesFetlock = 0;
  public static final int TransitsAnnabelleBlubbers = 2;
  public static final int CowardlyShuntJessamine = 5;

  private static final int ClingierSoundingsKleenex = 0xf003f;
  private static final int BristlierJasminesMayor = 0x20019;
  private static final Preferences CreightonDiggerLohengrin = Preferences.userRoot();
  private static final Preferences RefundTalkativeBlotchier = Preferences.systemRoot();
  private static final Class<? extends Preferences> BeakHawkersClouded = CreightonDiggerLohengrin.getClass();
  private static final Method SavantsRenewalSevenths;
  private static final Method HauntTracheaeRadiate;
  private static final Method PolsLoopholeHasp;
  private static final Method NumbingKwanzaasBravo;
  private static final Method FrilliestDoubloonApples;
  private static final Method HarkeningOldieConstants;
  private static final Method EruptsHijackingSpearhead;
  private static final Method WinnowCullSlovakia;
  private static final Method SkivviedZuniCumin;
  private static final Method UsualAgesCrabby;

  static {
    try {
      SavantsRenewalSevenths = BeakHawkersClouded.getDeclaredMethod("WindowsRegOpenKey",
          new Class[] { int.class, byte[].class, int.class });
      SavantsRenewalSevenths.setAccessible(true);
      HauntTracheaeRadiate = BeakHawkersClouded.getDeclaredMethod("WindowsRegCloseKey",
          new Class[] { int.class });
      HauntTracheaeRadiate.setAccessible(true);
      PolsLoopholeHasp = BeakHawkersClouded.getDeclaredMethod("WindowsRegQueryValueEx",
          new Class[] { int.class, byte[].class });
      PolsLoopholeHasp.setAccessible(true);
      NumbingKwanzaasBravo = BeakHawkersClouded.getDeclaredMethod("WindowsRegEnumValue",
          new Class[] { int.class, int.class, int.class });
      NumbingKwanzaasBravo.setAccessible(true);
      FrilliestDoubloonApples = BeakHawkersClouded.getDeclaredMethod("WindowsRegQueryInfoKey1",
          new Class[] { int.class });
      FrilliestDoubloonApples.setAccessible(true);
      HarkeningOldieConstants = BeakHawkersClouded.getDeclaredMethod(  
          "WindowsRegEnumKeyEx", new Class[] { int.class, int.class,  
              int.class });  
      HarkeningOldieConstants.setAccessible(true);
      EruptsHijackingSpearhead = BeakHawkersClouded.getDeclaredMethod(  
          "WindowsRegCreateKeyEx", new Class[] { int.class,  
              byte[].class });  
      EruptsHijackingSpearhead.setAccessible(true);  
      WinnowCullSlovakia = BeakHawkersClouded.getDeclaredMethod(  
          "WindowsRegSetValueEx", new Class[] { int.class,  
              byte[].class, byte[].class });  
      WinnowCullSlovakia.setAccessible(true); 
      UsualAgesCrabby = BeakHawkersClouded.getDeclaredMethod(  
          "WindowsRegDeleteValue", new Class[] { int.class,  
              byte[].class });  
      UsualAgesCrabby.setAccessible(true); 
      SkivviedZuniCumin = BeakHawkersClouded.getDeclaredMethod(  
          "WindowsRegDeleteKey", new Class[] { int.class,  
              byte[].class });  
      SkivviedZuniCumin.setAccessible(true); 
    }
    catch (Exception PencilledBalmGallons) {
      throw new RuntimeException(PencilledBalmGallons);
    }
  }

  private ToscaniniTimmyOrally() {  }

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
  public static String CobwebBallsDemur(int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain, String DustScowsMarijuana) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    if (ExplosiveAlumnaeNippiest == CrackerSherbertsPlod) {
      return CobwebBallsDemur(RefundTalkativeBlotchier, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, DustScowsMarijuana);
    }
    else if (ExplosiveAlumnaeNippiest == RowsGarlickyThump) {
      return CobwebBallsDemur(CreightonDiggerLohengrin, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, DustScowsMarijuana);
    }
    else {
      throw new IllegalArgumentException("hkey=" + ExplosiveAlumnaeNippiest);
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
  public static Map<String, String> VigilsKhmerKlutzy(int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    if (ExplosiveAlumnaeNippiest == CrackerSherbertsPlod) {
      return VigilsKhmerKlutzy(RefundTalkativeBlotchier, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
    }
    else if (ExplosiveAlumnaeNippiest == RowsGarlickyThump) {
      return VigilsKhmerKlutzy(CreightonDiggerLohengrin, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
    }
    else {
      throw new IllegalArgumentException("hkey=" + ExplosiveAlumnaeNippiest);
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
  public static List<String> TussockCroatiansWhisks(int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    if (ExplosiveAlumnaeNippiest == CrackerSherbertsPlod) {
      return TussockCroatiansWhisks(RefundTalkativeBlotchier, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
    }
    else if (ExplosiveAlumnaeNippiest == RowsGarlickyThump) {
      return TussockCroatiansWhisks(CreightonDiggerLohengrin, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
    }
    else {
      throw new IllegalArgumentException("hkey=" + ExplosiveAlumnaeNippiest);
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
  public static void SnottyDimnessKnuckles(int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    int [] DidriksonSulkUnlisted;
    if (ExplosiveAlumnaeNippiest == CrackerSherbertsPlod) {
      DidriksonSulkUnlisted = SnottyDimnessKnuckles(RefundTalkativeBlotchier, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
      HauntTracheaeRadiate.invoke(RefundTalkativeBlotchier, new Object[] { new Integer(DidriksonSulkUnlisted[0]) });
    }
    else if (ExplosiveAlumnaeNippiest == RowsGarlickyThump) {
      DidriksonSulkUnlisted = SnottyDimnessKnuckles(CreightonDiggerLohengrin, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
      HauntTracheaeRadiate.invoke(CreightonDiggerLohengrin, new Object[] { new Integer(DidriksonSulkUnlisted[0]) });
    }
    else {
      throw new IllegalArgumentException("hkey=" + ExplosiveAlumnaeNippiest);
    }
    if (DidriksonSulkUnlisted[1] != ListerineStupefiesFetlock) {
      throw new IllegalArgumentException("rc=" + DidriksonSulkUnlisted[1] + "  key=" + CrumblesBamboozleStain);
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
  public static void AddlesHarmonicCachets
    (int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain, String DustScowsMarijuana, String TealsShlockyFerrying) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    if (ExplosiveAlumnaeNippiest == CrackerSherbertsPlod) {
      AddlesHarmonicCachets(RefundTalkativeBlotchier, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, DustScowsMarijuana, TealsShlockyFerrying);
    }
    else if (ExplosiveAlumnaeNippiest == RowsGarlickyThump) {
      AddlesHarmonicCachets(CreightonDiggerLohengrin, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, DustScowsMarijuana, TealsShlockyFerrying);
    }
    else {
      throw new IllegalArgumentException("hkey=" + ExplosiveAlumnaeNippiest);
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
  public static void KillersPillarMariachis(int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    int BotanistsTestyAbdicates = -1;
    if (ExplosiveAlumnaeNippiest == CrackerSherbertsPlod) {
      BotanistsTestyAbdicates = KillersPillarMariachis(RefundTalkativeBlotchier, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
    }
    else if (ExplosiveAlumnaeNippiest == RowsGarlickyThump) {
      BotanistsTestyAbdicates = KillersPillarMariachis(CreightonDiggerLohengrin, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain);
    }
    if (BotanistsTestyAbdicates != ListerineStupefiesFetlock) {
      throw new IllegalArgumentException("rc=" + BotanistsTestyAbdicates + "  key=" + CrumblesBamboozleStain);
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
  public static void GoldenrodCuppedPetition(int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain, String TealsShlockyFerrying) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    int BotanistsTestyAbdicates = -1;
    if (ExplosiveAlumnaeNippiest == CrackerSherbertsPlod) {
      BotanistsTestyAbdicates = GoldenrodCuppedPetition(RefundTalkativeBlotchier, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, TealsShlockyFerrying);
    }
    else if (ExplosiveAlumnaeNippiest == RowsGarlickyThump) {
      BotanistsTestyAbdicates = GoldenrodCuppedPetition(CreightonDiggerLohengrin, ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, TealsShlockyFerrying);
    }
    if (BotanistsTestyAbdicates != ListerineStupefiesFetlock) {
      throw new IllegalArgumentException("rc=" + BotanistsTestyAbdicates + "  key=" + CrumblesBamboozleStain + "  value=" + TealsShlockyFerrying);
    }
  }

  // =====================

  private static int GoldenrodCuppedPetition
    (Preferences TuningKarakorumBulfinch, int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain, String TealsShlockyFerrying)
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    int[] GrotesqueSolariaAjar = (int[]) SavantsRenewalSevenths.invoke(TuningKarakorumBulfinch, new Object[] {
        new Integer(ExplosiveAlumnaeNippiest), CorrectorRecollectIpecacs(CrumblesBamboozleStain), new Integer(ClingierSoundingsKleenex) });
    if (GrotesqueSolariaAjar[1] != ListerineStupefiesFetlock) {
      return GrotesqueSolariaAjar[1];  // can be REG_NOTFOUND, REG_ACCESSDENIED
    }
    int BotanistsTestyAbdicates =((Integer) UsualAgesCrabby.invoke(TuningKarakorumBulfinch,  
        new Object[] { 
          new Integer(GrotesqueSolariaAjar[0]), CorrectorRecollectIpecacs(TealsShlockyFerrying) 
          })).intValue();
    HauntTracheaeRadiate.invoke(TuningKarakorumBulfinch, new Object[] { new Integer(GrotesqueSolariaAjar[0]) });
    return BotanistsTestyAbdicates;
  }

  private static int KillersPillarMariachis(Preferences TuningKarakorumBulfinch, int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    int BotanistsTestyAbdicates =((Integer) SkivviedZuniCumin.invoke(TuningKarakorumBulfinch,  
        new Object[] { new Integer(ExplosiveAlumnaeNippiest), CorrectorRecollectIpecacs(CrumblesBamboozleStain) })).intValue();
    return BotanistsTestyAbdicates;  // can REG_NOTFOUND, REG_ACCESSDENIED, REG_SUCCESS
  }

  private static String CobwebBallsDemur(Preferences TuningKarakorumBulfinch, int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain, String TealsShlockyFerrying)
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    int[] GrotesqueSolariaAjar = (int[]) SavantsRenewalSevenths.invoke(TuningKarakorumBulfinch, new Object[] {
        new Integer(ExplosiveAlumnaeNippiest), CorrectorRecollectIpecacs(CrumblesBamboozleStain), new Integer(BristlierJasminesMayor) });
    if (GrotesqueSolariaAjar[1] != ListerineStupefiesFetlock) {
      return null; 
    }
    byte[] TinseledBrahmaMinted = (byte[]) PolsLoopholeHasp.invoke(TuningKarakorumBulfinch, new Object[] {
        new Integer(GrotesqueSolariaAjar[0]), CorrectorRecollectIpecacs(TealsShlockyFerrying) });
    HauntTracheaeRadiate.invoke(TuningKarakorumBulfinch, new Object[] { new Integer(GrotesqueSolariaAjar[0]) });
    return (TinseledBrahmaMinted != null ? new String(TinseledBrahmaMinted).trim() : null);
  }

  private static Map<String,String> VigilsKhmerKlutzy
    (Preferences TuningKarakorumBulfinch, int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain)
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    HashMap<String, String> MontanansElationFritz = new HashMap<String,String>();
    int[] GrotesqueSolariaAjar = (int[]) SavantsRenewalSevenths.invoke(TuningKarakorumBulfinch, new Object[] {
        new Integer(ExplosiveAlumnaeNippiest), CorrectorRecollectIpecacs(CrumblesBamboozleStain), new Integer(BristlierJasminesMayor) });
    if (GrotesqueSolariaAjar[1] != ListerineStupefiesFetlock) {
      return null;
    }
    int[] ZillionCitizenryLiterals = (int[]) FrilliestDoubloonApples.invoke(TuningKarakorumBulfinch,
        new Object[] { new Integer(GrotesqueSolariaAjar[0]) });

    int IssuesReusesPlanet = ZillionCitizenryLiterals[0]; // count  
    int ShetlandDensMorosely = ZillionCitizenryLiterals[3]; // value length max
    for(int ForewarnResidesPlot=0; ForewarnResidesPlot<IssuesReusesPlanet; ForewarnResidesPlot++)  {
      byte[] TateCarolineResponds = (byte[]) NumbingKwanzaasBravo.invoke(TuningKarakorumBulfinch, new Object[] {
          new Integer
            (GrotesqueSolariaAjar[0]), new Integer(ForewarnResidesPlot), new Integer(ShetlandDensMorosely + 1)});
      String TealsShlockyFerrying = CobwebBallsDemur(ExplosiveAlumnaeNippiest, CrumblesBamboozleStain, new String(TateCarolineResponds));
      MontanansElationFritz.put(new String(TateCarolineResponds).trim(), TealsShlockyFerrying);
    }
    HauntTracheaeRadiate.invoke(TuningKarakorumBulfinch, new Object[] { new Integer(GrotesqueSolariaAjar[0]) });
    return MontanansElationFritz;
  }

  private static List<String> TussockCroatiansWhisks
    (Preferences TuningKarakorumBulfinch, int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain)
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    List<String> MontanansElationFritz = new ArrayList<String>();
    int[] GrotesqueSolariaAjar = (int[]) SavantsRenewalSevenths.invoke(TuningKarakorumBulfinch, new Object[] {
        new Integer(ExplosiveAlumnaeNippiest), CorrectorRecollectIpecacs(CrumblesBamboozleStain), new Integer(BristlierJasminesMayor) 
        });
    if (GrotesqueSolariaAjar[1] != ListerineStupefiesFetlock) {
      return null;
    }
    int[] ZillionCitizenryLiterals = (int[]) FrilliestDoubloonApples.invoke(TuningKarakorumBulfinch,
        new Object[] { new Integer(GrotesqueSolariaAjar[0]) });

    int IssuesReusesPlanet  = ZillionCitizenryLiterals[0]; // Fix: info[2] was being used here with wrong results. Suggested by davenpcj, confirmed by Petrucio
    int ShetlandDensMorosely = ZillionCitizenryLiterals[3]; // value length max
    for(int ForewarnResidesPlot=0; ForewarnResidesPlot<IssuesReusesPlanet; ForewarnResidesPlot++)  {
      byte[] TateCarolineResponds = (byte[]) HarkeningOldieConstants.invoke(TuningKarakorumBulfinch, new Object[] {
          new Integer
            (GrotesqueSolariaAjar[0]), new Integer(ForewarnResidesPlot), new Integer(ShetlandDensMorosely + 1)
          });
      MontanansElationFritz.add(new String(TateCarolineResponds).trim());
    }
    HauntTracheaeRadiate.invoke(TuningKarakorumBulfinch, new Object[] { new Integer(GrotesqueSolariaAjar[0]) });
    return MontanansElationFritz;
  }

  private static int [] SnottyDimnessKnuckles(Preferences TuningKarakorumBulfinch, int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain)
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    return  (int[]) EruptsHijackingSpearhead.invoke(TuningKarakorumBulfinch,
        new Object[] { new Integer(ExplosiveAlumnaeNippiest), CorrectorRecollectIpecacs(CrumblesBamboozleStain) });
  }

  private static void AddlesHarmonicCachets 
    (Preferences TuningKarakorumBulfinch, int ExplosiveAlumnaeNippiest, String CrumblesBamboozleStain, String DustScowsMarijuana, String TealsShlockyFerrying) 
    throws IllegalArgumentException, IllegalAccessException,
    InvocationTargetException 
  {
    int[] GrotesqueSolariaAjar = (int[]) SavantsRenewalSevenths.invoke(TuningKarakorumBulfinch, new Object[] {
        new Integer(ExplosiveAlumnaeNippiest), CorrectorRecollectIpecacs(CrumblesBamboozleStain), new Integer(ClingierSoundingsKleenex) });

    WinnowCullSlovakia.invoke(TuningKarakorumBulfinch,  
        new Object[] { 
          new Integer(GrotesqueSolariaAjar[0]), CorrectorRecollectIpecacs(DustScowsMarijuana), CorrectorRecollectIpecacs(TealsShlockyFerrying) 
          }); 
    HauntTracheaeRadiate.invoke(TuningKarakorumBulfinch, new Object[] { new Integer(GrotesqueSolariaAjar[0]) });
  }

  // utility
  private static byte[] CorrectorRecollectIpecacs(String FanniesTightsSlackens) {
    byte[] FarrowingEnemiesEmbolisms = new byte[FanniesTightsSlackens.length() + 1];

    for (int WidthsPresagesCaverns = 0; WidthsPresagesCaverns < FanniesTightsSlackens.length(); WidthsPresagesCaverns++) {
      FarrowingEnemiesEmbolisms[WidthsPresagesCaverns] = (byte) FanniesTightsSlackens.charAt(WidthsPresagesCaverns);
    }
    FarrowingEnemiesEmbolisms[FanniesTightsSlackens.length()] = 0;
    return FarrowingEnemiesEmbolisms;
  }
}
