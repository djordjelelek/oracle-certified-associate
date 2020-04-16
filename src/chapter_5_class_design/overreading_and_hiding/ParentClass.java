package chapter_5_class_design.overreading_and_hiding;

public class ParentClass {
	// don`t hide variables, also you can`t overrid them

	public void overreadingMethod(boolean b) throws RuntimeException {
		System.out.println("parent class");
		hidingMethod();
	}

	// if call from parent class
	public static void hidingMethod() {
		System.out.println("static from ParentClass");
	}
	
	//if you don`t want to change method in a ChildClass
	public final void finalMethod() {

	}
}
