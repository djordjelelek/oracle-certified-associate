package chapter_3_core_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayLists {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //in branches you can enter how many elemnts you want
		list.add(1); //adding elements
		list.remove(0); //remove from that position
		list.set(2, 5); //set on that position, without deleting 
		list.size(); //size of array
		list.isEmpty(); //boolean result is list empty
		list.clear(); //discard all elements
		list.contains(2); //is list contains element
		list.equals(list); //are lists point on the same list
		Collections.sort(list); //sorting list
		//ArrayList has good method toString for print
		
		/*in ArrayList you have wrapper classes of primitive types; 
		if you add primitive values, ArrayList will convert primitive type to its wrapper AUTOBOXING*/
		int intFromString = Integer.parseInt("1"); //method for converting string to int
		String stringFromInt = Integer.toString(1); //method for converting int to string
		System.out.println(intFromString + stringFromInt);
		//all wrapper classes have similar methods for converting Strings to that classes
		
		Object[]arrayObject = list.toArray(); //converting from list to array
		int[] array = {1,2};
		List<int[]> list2 = Arrays.asList(array); //converting from array to backed list(we can`t change size of this list
		System.out.println(arrayObject + " " + list2);
	

	}

}
