package ex050;
/*
Complete the method so that it takes in a 2-D array and returns the sums of the rows as a 1-D integer array.

For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
{4,6,11,3}
*/
public class TwoDArrayPractice7 {

	public static int[] rowSums(int[][] a) {
		int[] b = new int[a.length];
		for ( int i = 0; i < a.length; i ++) {
			int sum = 0;
			for (int x = 0; x < a[i].length; x++) {
				sum += a[i][x];
				b[i] = sum;
			}
		}
		return b;
	}

}
