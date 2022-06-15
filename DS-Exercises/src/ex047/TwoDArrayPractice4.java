package ex047;
/*
Complete the sumEvenIndex method so that it takes in a 2-dimensional integer array and sums all numbers that are in an even index or an even row.
For example, in the following array, the cells with an x would be summed:

     0	1	2	3

0   x	x	x	x
1	x		x	
2	x	x	x	x
3	x		x	
 */
public class TwoDArrayPractice4 {

	public static int sumEvenIndex(int[][] a) {
		int sum = 0;
		for ( int i = 0; i < a.length; i++) {
			for (int x = 0; x < a[i].length; x++) {
				if (i % 2 == 0 || x % 2 == 0 ) {
					sum += a[i][x];
				}
			}
		}
		return sum;			
	}
}
