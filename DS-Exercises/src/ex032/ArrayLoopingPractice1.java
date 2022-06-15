package ex032;
/*
Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
*/
public class ArrayLoopingPractice1 {

	public static String[] combineNames(String[] strings, String[] strings2) {
		String[] input = new String[strings.length];
		
		for (int i = 0; i < strings.length ; i++) {
			
		input[i] = strings[i] + (" ") + strings2[i];
		System.out.println(input);
		}
		return input;
	}
}
