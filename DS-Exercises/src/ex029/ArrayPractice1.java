package ex029;
/*
 * Complete the sumElements method to find the sum of all elements in the given array.
*/		
public class ArrayPractice1 {

	public static int sumElements(int[] a) {
		int total = 0;
		int i = 0;
		for (i = 0;i < a.length; i++) {

		total += a[i];
		}
		return total;
	}
	

}
