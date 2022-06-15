package ex034;
/*
 *  Complete the maxValue method so that given the array nums, it will return the maximum value in the array. 
*/
public class ArrayLoopingPractice3 {

	public static int maxValue(int[] a) {
		int largest = a[0];
		for (int i = 0; i < a.length ; i++) {
			if (a[i] > largest )
				largest = a[i];
		}
		return largest;
	}

}
