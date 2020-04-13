package chapter_6_exceptions;

public class PrintingExceptions {
	int instanceVariable;

	public static void main(String[] args) {
		try {
			PrintingExceptions printingExceptions = null;
			System.out.println(printingExceptions.instanceVariable);
		} catch (NullPointerException e) {
			System.out.println(e); // exception type + message
			System.out.println(e.getMessage()); // only message
			System.out.println("NULL POINTER EXCEPTION!!!!!!"); // my message
			e.printStackTrace(); // everything
		}

	}

}
