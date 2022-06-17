package ex042;

/* Create a method that:
is called removeEveryOther
returns nothing
takes in a single parameter - an ArrayList of Strings called words

This method should take the ArrayList parameter and modify it by removing every other element in the list, starting with removing the 0th element.

For example, if the parameter is:
("hi","yo","sup","yolo","boop")
The modified ArrayList should be:
("yo","yolo")
*/

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists7 {

	public static void removeEveryOther(ArrayList<String> c) {
		Iterator<String> itr = c.iterator();
		int i = 0;
		while(itr.hasNext()) {
		    itr.next();
		    if(i % 2 == 0) {
		        itr.remove();
		    }
		    i++;
		}
	}
}

