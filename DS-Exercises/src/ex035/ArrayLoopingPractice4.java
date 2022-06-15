package ex035;
/*
 * Complete the maxLength method so that given the array words, it will return the word with the largest length.
*/
public class ArrayLoopingPractice4 {

	public static String maxLength(String[] a) {
		int output = 0;
		int length = a[0].length();
		for(int i = 1; i < a.length; i++ ) {
			if (a[i].length() > length) {
				output = i;
				length = a[i].length();
			}
		}
		return a[output];
	}
}
