package chapter_6_exceptions;

public class ErrorsE { //JVM, should not handle it
	
	//Java can`t initialize this block and throw an error ExceptionInInitializerErrors e
	static { 
		int[]array = new int[2];
		int num =  array[-1];
	} 
	
	//StackOverflowError
	static void stackOverFlow(int num) {
		stackOverFlow(1);
	}

	public static void main(String[] args) {
		
	}

}
