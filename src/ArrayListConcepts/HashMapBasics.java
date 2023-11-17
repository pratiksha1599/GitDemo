package ArrayListConcepts;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {
	public static void main(String[] args) {
		// no order - no indexing
		// stores values -- key - value <k,v>
		// key can not be duplicate
		// can store n number of null values but only null key
		// It can store only one null value in the memory
		// hashmap is not thread0-safe - unsynchronized
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washigton DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London1"); //
		capitalMap.put(null, "berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		/*
		 * System.out.println(capitalMap.get("jarmany"));
		 * System.out.println(capitalMap.get("USA"));
		 * System.out.println(capitalMap.get("UK"));
		 */
		System.out.println(capitalMap.get(null));

		System.out.println(capitalMap.get("Russia"));
		System.out.println(capitalMap.get("France"));
		System.out.println("_________________________________");
		// iterator
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String Value = capitalMap.get(key);
			System.out.println("key= " + key + " value= " + Value);

		}
		System.out.println("===========================");
		capitalMap.forEach((k,v)->System.out.println("key =" + k + " and value = " + v));
	}
}
