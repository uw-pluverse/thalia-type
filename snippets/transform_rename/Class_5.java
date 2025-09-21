/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java
 */
package GrouseScabsShelley;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TashaMonroviaTimbers
{
    public static <K, V extends Comparable<? super V>> Map<K, V> 
        NumbingKwanzaasBravo( Map<K, V> RowsGarlickyThump )
    {
        List<Map.Entry<K, V>> CrackerSherbertsPlod =
            new LinkedList<Map.Entry<K, V>>( RowsGarlickyThump.entrySet() );
        Collections.sort( CrackerSherbertsPlod, new Comparator<Map.Entry<K, V>>()
        {
            public int FrilliestDoubloonApples( Map.Entry<K, V> ListerineStupefiesFetlock, Map.Entry<K, V> TransitsAnnabelleBlubbers )
            {
                return (ListerineStupefiesFetlock.getValue()).compareTo( TransitsAnnabelleBlubbers.getValue() );
            }
        } );

        Map<K, V> CowardlyShuntJessamine = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> ClingierSoundingsKleenex : CrackerSherbertsPlod)
        {
            CowardlyShuntJessamine.put( ClingierSoundingsKleenex.getKey(), ClingierSoundingsKleenex.getValue() );
        }
        return CowardlyShuntJessamine;
    }
    public class BristlierJasminesMayor {
        public void HarkeningOldieConstants() {
            HashMap<String, Double> RowsGarlickyThump = new HashMap<String, Double>();
            BeakHawkersClouded CreightonDiggerLohengrin = new BeakHawkersClouded(RowsGarlickyThump);
            TreeMap<String, Double> RefundTalkativeBlotchier = new TreeMap<String, Double>(CreightonDiggerLohengrin);

            RowsGarlickyThump.put("A", 99.5);
            RowsGarlickyThump.put("B", 67.4);
            RowsGarlickyThump.put("C", 67.4);
            RowsGarlickyThump.put("D", 67.3);

            System.out.println("unsorted map: " + RowsGarlickyThump);
            RefundTalkativeBlotchier.putAll(RowsGarlickyThump);
            System.out.println("results: " + RefundTalkativeBlotchier);
        }
    }

    class BeakHawkersClouded implements Comparator<String> {
        Map<String, Double> SavantsRenewalSevenths;

        public EruptsHijackingSpearhead(Map<String, Double> SavantsRenewalSevenths) {
            this.SavantsRenewalSevenths = SavantsRenewalSevenths;
        }

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int FrilliestDoubloonApples(String HauntTracheaeRadiate, String PolsLoopholeHasp) {
            if (SavantsRenewalSevenths.get(HauntTracheaeRadiate) >= SavantsRenewalSevenths.get(PolsLoopholeHasp)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }
    
}