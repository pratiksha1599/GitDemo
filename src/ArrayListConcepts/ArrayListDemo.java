package ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// ArrayList is default class in java
		// dynamic array

		// negative indexing not allowed in java
//		int i[] = new int[4];
//		i[0]=100;
//		i[4]=500;
		// System.out.println(i[9]);
		// default generics
		
		//virtual capcity of arraylist is 10
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add(100);
		ar.add("ff");
		ar.add("99.99");
		System.out.println(ar);
		System.out.println(ar.size());
		
		//ArrayList<Integer>ar1 =new ArrayList<Interger>();

		ar.add(true);
		System.out.println(ar.size());
		}
}
