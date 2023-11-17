package Arrayprograms;

public class NumberInAsendingOrder {
	public static void main(String[] args) {

		int num[] = { 20, 30, 40, 10, 50, 11, 12 };
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
					System.out.println(num[j]);

				}
			}
		}
		System.out.println();
		//System.out.println("Array After sorting in asending order :");
		 for (int i = 0; i < num.length; i++) {     
	            System.out.print(num[i] + " ");    
	        }   
	}
}
