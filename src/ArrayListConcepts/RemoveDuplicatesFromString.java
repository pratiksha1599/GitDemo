package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
     
		
		ArrayList<String> strr = new ArrayList<String>(Arrays.asList("dd","oo","aa","cc","vv","cc","dd"));
		LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<String>(strr);
		ArrayList<String> SortedArrayString = new ArrayList<String>(LinkedHashSet);
		System.out.println(SortedArrayString);
	}
}
