package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromarray {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(7, 8, 8, 2, 3, 1, 4, 4, 5, 6, 1, 7, 8, 9, 7));
		// 1. LinkedHashSet
		LinkedHashSet<Integer> LinkedHashSet = new LinkedHashSet<Integer>(number);
		ArrayList<Integer> Sortedarraylist = new ArrayList<Integer>(LinkedHashSet);
		System.out.println(Sortedarraylist);

		// 2. JDK 8 - stream
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 6));
		List<Integer> marksListUnique = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);

		ArrayList<Integer> markLists = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7, 3, 4));
		List<Integer> marklistUniqueList = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(marklistUniqueList);

		ArrayList<Integer> age = new ArrayList<Integer>(Arrays.asList(23, 45, 45, 67, 78, 78));
		LinkedHashSet<Integer> LinkedHashset = new LinkedHashSet<Integer>(age);
		ArrayList<Integer> sortedarrayList = new ArrayList<Integer>(LinkedHashset);

		System.out.println(sortedarrayList);
	}

}
