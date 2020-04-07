package chapter_3_core_java_api;

public class Strings {

	public static void main(String[] args) {
		System.out.println("Concatenation " + "of Strings"); //concatenation
		
		String s1 = "str"; //literal from string pool
		s1 = "String"; //imutability (this is a new object, strings can`t be change)  
		
		String s2 = new String(); //not in the string pool, but create new object 
		s2 = "\ts t r i n g\n";
		
		//String methods
		System.out.println("Char from 0 position on string s1 : " + s1.charAt(0));
		System.out.println("String lenght : " + s1.length());
		System.out.println("Index of letter i : " + s1.indexOf("i"));
		System.out.println("String contains letter/s : " + s1.contains("St"));
		System.out.println("Substring of s1 : " + s1.subSequence(0, 3));
		System.out.println("All lower case in string : " + s1.toLowerCase());
		System.out.println("All upper case in string : " + s1.toUpperCase());
		System.out.println("Are two string equals : " + s1.equals(s2));
		System.out.println("Are two string equals (ignore case) : " + s1.equalsIgnoreCase(s2));
		System.out.println("Trim of string : " + s2.trim());
		System.out.println("Replace letter : " + s1.replace('s', 'S'));
		System.out.println("Are string start/end with this letter : " + s1.startsWith("St") + ", " + s1.endsWith("St"));
		System.out.println("Methods chaining : " + s1.trim().toUpperCase().substring(0, 3));
		
		
		String str = "string";
		doSomething(str); //you can`t change String like this because string pool
		str = doSomething(str); //now can
		System.out.println("Only one Q will be + " + str);
		
		
	}
	static String doSomething(String str) {
		return str += "Q";
	}

}
