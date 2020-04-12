package chapter_4_methods_and_encapsulation;

public class StaticKeyWord {
	static int staticVariable = 1;
	
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	
	public static class InnerClass{ //only inner classes can be static
		
	}

	public static void main(String[] args) {
		InnerClass inner = new InnerClass(); //the way how to call static inner class
	
		int s = StaticKeyWord.staticVariable; 
		StaticKeyWord.staticMethod();
		//don`t need to initialize class to call static members. They exist on the class level 
		
		

	}

}
