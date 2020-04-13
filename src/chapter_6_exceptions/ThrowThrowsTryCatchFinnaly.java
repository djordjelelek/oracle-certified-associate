package chapter_6_exceptions;

public class ThrowThrowsTryCatchFinnaly {

	public static void main(String[] args) {
		int[] i = new int[2];
		i[0] = 0;
		i[1] = 1;
		try {
			printArray(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception (aioobe)!!!");
		} catch (Exception e) {
			System.out.println("EXCEPTION!!!");
		} finally {
			System.out.println("finnaly block");
		}

		System.out.println("end");

	}

	// throws - it might throw an exception
	static void printArray(int[] array) throws ArrayIndexOutOfBoundsException, Exception {
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
			if (array[i] == -1)
				throw new Exception(); // it will throw the exception
		}
	}
}
