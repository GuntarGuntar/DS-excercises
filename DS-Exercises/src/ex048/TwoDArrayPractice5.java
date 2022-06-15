package ex048;
/*
Complete the sumColumn method so that given a 2-D int array and an integer representing the column to sum, 
sum up the all elements in that column in the given array.
*/
public class TwoDArrayPractice5 {

	public static int sumColumn(int[][] a, int i) {
		int sum = 0;
		for ( int j = 0; j < a.length; j++) {
				sum += a[j][i];
		}
		return sum;
	}

}
