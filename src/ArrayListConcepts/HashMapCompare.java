package ArrayListConcepts;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(3, "C");
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "D");
		// 1. on the basis of the key value : use equals method:
		System.out.println(map1.equals(map2)); // true

		System.out.println(map1.equals(map3)); // false
		// 2. compare hashmaps for the same keys: keysSet();
		System.out.println(map1.keySet().equals(map2.keySet())); // true
		System.out.println(map1.keySet().equals(map3.keySet())); // true
		// 3. find the extra keys

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		map4.put(5, "T");
		// Combine the keys from both the maps: using HashSet:
		HashSet<Integer> combinekeys = new HashSet<>(map1.keySet());
		// add the keyset from map4
		combinekeys.addAll(map4.keySet());
		combinekeys.removeAll(map1.keySet());
		System.out.println(combinekeys);

		// 4. Compare maps by values
       
		//1.
	}
}
