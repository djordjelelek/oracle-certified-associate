package chapter_3_core_java_api;

import java.util.ArrayList;
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
		
		/*in ArrayList you have wrapper classes of primitive types; 
		if you add primitive values, ArrayList will convert primitive type to its wrapper AUTOBOXING*/
		int intFromString = Integer.parseInt("1"); //method for converting string to int
		String stringFromInt = Integer.toString(1); //method for converting int to string
		System.out.println(intFromString + stringFromInt);
		//all wrapper classes have similar methods for converting Strings to that classes
		
		
		
		

	}

}
