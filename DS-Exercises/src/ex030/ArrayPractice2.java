package ex030;
/*
 * Complete the sumElements method to find the average of all elements in the given array.
*/
public class ArrayPractice2 {

	public static double avgElements(int[] a) {
			double total = 0;
			int i = 0;
			for (i = 0;i < a.length; i++) {

			total += a[i];
			}
			return total / a.length;
		
	}
}
