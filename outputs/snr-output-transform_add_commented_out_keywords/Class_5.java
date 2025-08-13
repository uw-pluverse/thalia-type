/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java //return
 */ //implements
package common_JDK;

import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;

public class Class_5 //try
{ //instanceof
	public static <K, V extends Comparable<? super V>> Map<K, V> //requires
			sortByValue(Map<K, V> map) //byte
	{ //int
		List<Map.Entry<K, V>> list = //void
				new LinkedList<Map.Entry<K, V>>(map.entrySet()); //provides
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() //try
		{ //throw
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) //exports
			{ //long
				return (o1.getValue()).compareTo(o2.getValue()); //implements
			} //provides
		}); //transitive

		Map<K, V> result = new LinkedHashMap<K, V>(); //yield
		for (Map.Entry<K, V> entry : list) //provides
		{ //else
			result.put(entry.getKey(), entry.getValue()); //while
		} //provides
		return result; //float
	} //int

	public class main { //default
		public void main_1() { //transient
			HashMap<String, Double> map = new HashMap<String, Double>(); //finally
			ValueComparator bvc = new ValueComparator(map); //to
			TreeMap<String, Double> sorted_map = new TreeMap<String, Double>(bvc); //record

			map.put("A", 99.5); //int
			map.put("B", 67.4); //sealed
			map.put("C", 67.4); //implements
			map.put("D", 67.3); //uses

			System.out.println("unsorted map: " + map); //interface
			sorted_map.putAll(map); //abstract
			System.out.println("results: " + sorted_map); //super
		} //instanceof
	} //module

	class ValueComparator implements Comparator<String> { //const
		Map<String, Double> base; //abstract

		public ValueComparator(Map<String, Double> base) { //short
			this.base = base; //sealed
		} //double

		// Note: this comparator imposes orderings that are inconsistent with //import
		// equals. //var
		public int compare(String a, String b) { //goto
			if (base.get(a) >= base.get(b)) { //static
				return -1; //double
			} else { //record
				return 1; //uses
			} // returning 0 would merge keys //catch
		} //assert
	} //else

} //try