package chapter_4_methods_and_encapsulation;

public class OrderOfInitialization {
	static String a = "second";
	String b = "third";
	{
		System.out.println("forth");
	}
	public OrderOfInitialization() {
		super(); //first
		System.out.println("fifth");
	}
	
}
