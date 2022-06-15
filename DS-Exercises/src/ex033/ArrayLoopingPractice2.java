package ex033;
/*
 * Complete the timesTen method to take each element of arr and multiply its value by 10.  It should return its the array when finished.
*/
public class ArrayLoopingPractice2 {

	public static double[] timesTen(double[] array) {		
		double[] input = new double[array.length];
		
		for (int i = 0; i < array.length ; i++) {

			input[i] = array[i] * 10;
			System.out.println(input);
		}
		return input;
	}

}
