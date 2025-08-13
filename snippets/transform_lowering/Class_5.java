/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java
 */
package common_JDK;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Class_5
{
    public static <K, V extends Comparable<? super V>> Map<K, V> 
        sortByValue( Map<K, V> map )
    {
        var GrouseScabsShelley = map.entrySet();
		List<Map.Entry<K, V>> list =
            new LinkedList<Map.Entry<K, V>>( GrouseScabsShelley );
        var TashaMonroviaTimbers = new Comparator<Map.Entry<K, V>>()
        {
            public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
            {
                var CrackerSherbertsPlod = o1.getValue();
				var ListerineStupefiesFetlock = o2.getValue();
				var RowsGarlickyThump = (CrackerSherbertsPlod).compareTo( ListerineStupefiesFetlock );
				return RowsGarlickyThump;
            }
        };
		Collections.sort( list, TashaMonroviaTimbers );

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list)
        {
            var TransitsAnnabelleBlubbers = entry.getKey();
			var CowardlyShuntJessamine = entry.getValue();
			result.put( TransitsAnnabelleBlubbers, CowardlyShuntJessamine );
        }
        return result;
    }
    public class main {
        public void main_1() {
            HashMap<String, Double> map = new HashMap<String, Double>();
            ValueComparator bvc = new ValueComparator(map);
            TreeMap<String, Double> sorted_map = new TreeMap<String, Double>(bvc);

            var ClingierSoundingsKleenex = "A";
			var BristlierJasminesMayor = 99.5;
			map.put(ClingierSoundingsKleenex, BristlierJasminesMayor);
            var CreightonDiggerLohengrin = "B";
			var RefundTalkativeBlotchier = 67.4;
			map.put(CreightonDiggerLohengrin, RefundTalkativeBlotchier);
            var BeakHawkersClouded = "C";
			var SavantsRenewalSevenths = 67.4;
			map.put(BeakHawkersClouded, SavantsRenewalSevenths);
            var HauntTracheaeRadiate = "D";
			var PolsLoopholeHasp = 67.3;
			map.put(HauntTracheaeRadiate, PolsLoopholeHasp);

            var NumbingKwanzaasBravo = System.out;
			var HarkeningOldieConstants = "unsorted map: ";
			var FrilliestDoubloonApples = HarkeningOldieConstants + map;
			NumbingKwanzaasBravo.println(FrilliestDoubloonApples);
            sorted_map.putAll(map);
            var EruptsHijackingSpearhead = System.out;
			var SkivviedZuniCumin = "results: ";
			var WinnowCullSlovakia = SkivviedZuniCumin + sorted_map;
			EruptsHijackingSpearhead.println(WinnowCullSlovakia);
        }
    }

    class ValueComparator implements Comparator<String> {
        {
			base = null;
		}

		Map<String, Double> base;

        public ValueComparator(Map<String, Double> base) {
            var UsualAgesCrabby = this.base;
			UsualAgesCrabby = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int compare(String a, String b) {
            var ExplosiveAlumnaeNippiest = base.get(a);
			var CrumblesBamboozleStain = base.get(b);
			var PencilledBalmGallons = ExplosiveAlumnaeNippiest >= CrumblesBamboozleStain;
			if (PencilledBalmGallons) {
                var DustScowsMarijuana = 1;
				return -DustScowsMarijuana;
            } else {
                var DidriksonSulkUnlisted = 1;
				return DidriksonSulkUnlisted;
            } // returning 0 would merge keys
        }
    }
    
}