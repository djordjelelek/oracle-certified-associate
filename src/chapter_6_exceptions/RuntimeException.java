package chapter_6_exceptions;

public class RuntimeException { //extends RuntimeException

	public static void main(String[] args) {
		try {

		} catch (ArithmeticException e) { 
			// JVM, divided with 0
		} catch (ArrayIndexOutOfBoundsException e) {  
			// JVM, invalid index
		} catch (ClassCastException e) {
			// JVM, wrong cast
		} catch (NumberFormatException e) {
			/* programmer, subclass of IllegalArgumentsException, 
		 	convert illegal string to number*/
		} catch (IllegalArgumentException e) {
			// programmer, illegal arguments
		} catch (NullPointerException e) {
			// JVM, null
		}

	}

}
