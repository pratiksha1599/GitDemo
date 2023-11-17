package ArrayListConcepts;

import java.util.Hashtable;

import javax.swing.Spring;

public class Hashtabledemo {
	public static void main(String[] args) {
		// Hashtable t = new Hashtable(); // capacity is 11, load factor 0.75
		// default size is 11
		// Hashtable t = new(initial capacity); //create hashtable object with some
		// capacity
		// Hashtable t = new Hashtable(initial capacity, fill ratio/load factor);

		Hashtable<Integer, String> t = new Hashtable<Integer, String>();

		t.put(101, "mattu");
		t.put(102, "Smith");
		t.put(103, "john");
		// t.put(104, null); //null pointer exception
		// t.put(null, "X"); // null pointer exception
		System.out.println(t);
		System.out.println(t.get(103));
		// insertion order is not preserved in Hashmap

		t.remove(102);
		System.out.println(t);
		t.put(105, "r");
		System.out.println(t);

		System.out.println(t.containsKey(103)); // true
		System.out.println(t.containsKey(102)); // false

		System.out.println(t.containsValue("john"));
		System.out.println(t.isEmpty());
		System.out.println(t.keySet());
		System.out.println(t.values());
	}

}
