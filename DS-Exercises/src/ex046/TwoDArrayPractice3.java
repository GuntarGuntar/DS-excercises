package ex046;
/*
 * Complete the max2Delement method.  The method should take in a 2D array as a parameter and return the highest value in the array.
 */
public class TwoDArrayPractice3 {

	public static int max2Delement(int[][] a) {
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int x = 0; x < a[i].length; x++) {
				if(a[i][x] > max) {
					max = a[i][x];
				}
			}
		}
		return max;
	}

}
