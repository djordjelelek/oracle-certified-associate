package chapter_2_operators_and_statements;

public class Operators {

	public static void main(String[] args) {
		System.out.println("\toperations with two different types ");
		long l = 1L;
		float f = 1.0F; // float and long must have letters F and L at the and of number
		System.out.println("long + flat = " + l + f + " (float)"); // smaller data types (long) will promote to bigger
		
		System.out.println("\tbytes, shorts and chars");
		byte b1 = 1;
		byte b2 = 2;
		// byte b = s1 + s2; can`t compile
		// byte, short and char first promote to int when you use operators
		System.out.println((byte) (b1 + b2) + " byte");
		// or
		b1 += b2; // compound assignment operator
		System.out.println("b1(compound assignment operator): " + b1);

		System.out.println("\ninteger max = " + Integer.MAX_VALUE + 1); // first negative number
		
		System.out.println("\n\tpreincrement and postincrement");
		int i1 = 1;
		int i2 = 2;
		int i = ++i1 + i2++; // ++preincrement and postincrement++
		System.out.println("i : " + i + "; i2 : " + i2);
		System.out.println(i2 >= i1); // relational operator
		
		
		
		
		System.out.println("\n\tlogical operators:");
		if (i1 < i2 | i1 > i2++) { // logical operators: &(and); |(or) and 
									// ^(exclusive or - false if both true or false)
			System.out.println(true);
			System.out.println("i2: " + i2);
		} else {
			System.out.println(false);
		}

		if (i1 < i2 || i1 > i2++) { // && and || - short circuit operators 
									// if left side can predict result, right side will never evaluated)
			System.out.println(true);
			System.out.println("i2 is again: " + i2);
		} else {
			System.out.println(false);
		}
		
		
		Operators o1 = new Operators();
		Operators o2 = o1;
		boolean b = (o1 == o2);
		System.out.println("Two references: " + b); //true because two references point to the same object
		
		
	}

}
