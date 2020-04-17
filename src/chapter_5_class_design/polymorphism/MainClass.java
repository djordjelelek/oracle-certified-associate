package chapter_5_class_design.polymorphism;

public class MainClass {

	public static void main(String[] args) {

		ImlementationClass impl = new ImlementationClass();
		System.out.println(impl.numb);
		
		MiddleClass middle = impl;  
		middle.middleClassMethod();
		/* System.out.println(impl.numb);
		refer impl on the MiddleClass part of the class; 
		can`t call methods/variables from ImplementationClass */
		
		
		SuperClass superC = impl;
		superC.superClassMethod();
		superC.overreadMethod(); //it will call Override method from ImlementationClass
		/* refer impl on the SuperClass part of the class; 
		can`t call methods/variables from ImplementationClass/MiddleClass */
		
		//impl object exist in the memory
		
		
		ImlementationClass impl2 = (ImlementationClass) superC;
		System.out.println(impl2.numb);
		
		
//		SuperClass sc = new SuperClass();
//		ImlementationClass impl3 =  (ImlementationClass) sc;
//		System.out.println(impl3.numb);
		
//		THIS WILL THROW AN EXCEPTION
		
		if (impl2 instanceof ImlementationClass) System.out.println("YES");
		//check is some object belongs to some class; help with casting
		

	}
	public static void doSomething(SuperClass s) { 
		//this method able to handle instance of all classes which extends/implements SuperClass
		//THE BEST THINK ABOUT POLYMORPHISM
		
	}

}
