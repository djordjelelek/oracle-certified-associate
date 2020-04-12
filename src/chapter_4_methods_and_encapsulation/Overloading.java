package chapter_4_methods_and_encapsulation;

public class Overloading {
	int i = 1;

	static void overloadingMethod(String s, int a) { 
	}
	static void overloadingMethod( int a, String s) { //different position of parameters
	}
	static void overloadingMethod(int a) {
	}
	static void overloadingMethod(long a) { //different types of parameters
	}
	static void overloadingMethod(long a, long b) { //different numbers of parameters
	}
	
	//if you send to method overloadingMethod(1,2), order in which java calls method will be:
	static void overloadingMethod(double d) { //first
	}
	static void overloadingMethod(float d) {  //second
	}
	static void overloadingMethod(Double d) {  //third
	}
	static void overloadingMethod(double ... d) {  //forth
	}
	//it is not essentially which method you write first
	
	
	public Overloading() {
		this(1); //call another constructor
	}
	public Overloading(int i) {
		this.i = i; //this - refers to instance variable of current class, or to the current object
	}
}
