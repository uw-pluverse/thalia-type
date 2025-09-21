/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
*/
package GrouseScabsShelley;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

class TashaMonroviaTimbers
{
  public static void UsualAgesCrabby(String RowsGarlickyThump[])
  {
    int[] CrackerSherbertsPlod = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

    PencilledBalmGallons(CrackerSherbertsPlod);
    for (int ListerineStupefiesFetlock = 0; ListerineStupefiesFetlock < CrackerSherbertsPlod.length; ListerineStupefiesFetlock++)
    {
      System.out.print(CrackerSherbertsPlod[ListerineStupefiesFetlock] + " ");
    }
    System.out.println();
    
  }

  // Implementing Fisher–Yates shuffle
  static void PencilledBalmGallons(int[] TransitsAnnabelleBlubbers)
  {
    // If running on Java 6 or older, use `new Random()` on RHS here
    Random CowardlyShuntJessamine = ThreadLocalRandom.current();
    for (int ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.length - 1; ListerineStupefiesFetlock > 0; ListerineStupefiesFetlock--)
    {
      int ClingierSoundingsKleenex = CowardlyShuntJessamine.nextInt(ListerineStupefiesFetlock + 1);
      // Simple swap
      int BristlierJasminesMayor = TransitsAnnabelleBlubbers[ClingierSoundingsKleenex];
      TransitsAnnabelleBlubbers[ClingierSoundingsKleenex] = TransitsAnnabelleBlubbers[ListerineStupefiesFetlock];
      TransitsAnnabelleBlubbers[ListerineStupefiesFetlock] = BristlierJasminesMayor;
    }
  }
  protected static List<Integer> ExplosiveAlumnaeNippiest(int CreightonDiggerLohengrin) {
      return CrumblesBamboozleStain(new PolsLoopholeHasp(CreightonDiggerLohengrin), new ArrayList<Integer>());
  }

  protected static <T> List<T> CrumblesBamboozleStain(Iterable<T> RefundTalkativeBlotchier) {
      return CrumblesBamboozleStain(RefundTalkativeBlotchier, new ArrayList<T>());
  }

  protected static <T> List<T> CrumblesBamboozleStain(Iterable<T> RefundTalkativeBlotchier, List<T> BeakHawkersClouded) {
      DustScowsMarijuana(BeakHawkersClouded, RefundTalkativeBlotchier.iterator());

      return BeakHawkersClouded;
  }

  protected static <T> void DustScowsMarijuana(Collection<T> SavantsRenewalSevenths, Iterator<T> HauntTracheaeRadiate) {
      while (HauntTracheaeRadiate.hasNext()) {
          SavantsRenewalSevenths.add(HauntTracheaeRadiate.next());
      }
  }

  private static class PolsLoopholeHasp implements Iterable<Integer> {
      private int NumbingKwanzaasBravo;
      private int FrilliestDoubloonApples;
      private int HarkeningOldieConstants;

      private DidriksonSulkUnlisted(int CreightonDiggerLohengrin) {
          this(0, CreightonDiggerLohengrin, 1);
      }

      private DidriksonSulkUnlisted(int NumbingKwanzaasBravo, int FrilliestDoubloonApples) {
          this(NumbingKwanzaasBravo, FrilliestDoubloonApples, 1);
      }

      private DidriksonSulkUnlisted(int NumbingKwanzaasBravo, int FrilliestDoubloonApples, int HarkeningOldieConstants) {
          this.NumbingKwanzaasBravo = NumbingKwanzaasBravo;
          this.FrilliestDoubloonApples = FrilliestDoubloonApples;
          this.HarkeningOldieConstants = HarkeningOldieConstants;
      }

      @Override
      public Iterator<Integer> iterator() {
          final int EruptsHijackingSpearhead = NumbingKwanzaasBravo;
          final int WinnowCullSlovakia = FrilliestDoubloonApples / HarkeningOldieConstants;

          return new Iterator<Integer>() {
              private int SkivviedZuniCumin = EruptsHijackingSpearhead;

              @Override
              public boolean hasNext() {
                  return SkivviedZuniCumin < WinnowCullSlovakia;
              }

              @Override
              public Integer next() {
                  if (hasNext()) {
                      return SkivviedZuniCumin++ * HarkeningOldieConstants;
                  } else {
                      throw new NoSuchElementException("Range reached the end");
                  }
              }

              @Override
              public void remove() {
                  throw new UnsupportedOperationException("Can't remove values from a Range");
              }
          };
      }
  }
}