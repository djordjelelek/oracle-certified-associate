package chapter_5_class_design.polymorphism;

public class SuperClass {

	public void superClassMethod() {
		System.out.println("Super class");
	}

	public void overreadMethod() {
		System.out.println("Super class overread method");
	}
	// virtual method (this won`t call); it must be non-static, non-final, non-private
}
