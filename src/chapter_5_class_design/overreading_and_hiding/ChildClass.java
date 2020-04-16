package chapter_5_class_design.overreading_and_hiding;

public class ChildClass extends ParentClass {
	

	// the same like the ParentClass method (otherwise it will be overloading)
	public void overreadingMethod(boolean b) throws NullPointerException {
		System.out.println("child class" + b);
		
	}
	
	//if call from child class
	public static void hidingMethod() {
		System.out.println("static from ParentClass");
	}
	

}
