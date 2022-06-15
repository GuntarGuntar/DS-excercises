package ex045;
/*
 * Complete the sumRow method.  The method should take in an 2D integer array and a row number.  The method should return the sum of the elements in a given row.
 * 
 * For example, if row = 0, you should return the sum of all the elements in the topmost row.
*/
public class TwoDArrayPractice2 {

	public static int sumRow(int[][] a, int row) {
		int sum = 0;
		for (int x = 0; x < a[row].length; x++) {
			sum += a[row][x];
		}
	return sum;
	}

}
