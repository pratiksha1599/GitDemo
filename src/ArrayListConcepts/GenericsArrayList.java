package ArrayListConcepts;

import java.util.ArrayList;

public class GenericsArrayList {
	public static void main(String[] args) {

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Rashi");
		studentNames.add("Quinjal");
		studentNames.add("tej");
		studentNames.add("pp");
     
		//typical for loop
		for(int i=0;i<=studentNames.size();i++)
		{
			System.out.println(studentNames);
		}
		
		for(String s: studentNames) {
			System.out.println(s);
		}
	}
}
