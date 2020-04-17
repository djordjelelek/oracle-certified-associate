package chapter_5_class_design.polymorphism;

//first extends, second implements
public class ImlementationClass extends SuperClass implements MiddleClass {
	int numb = 0;

	@Override
	public void middleClassMethod() {
		System.out.println("Imlementation Class");

	}

	@Override
	public void overreadMethod() {
		System.out.println("ImlementationClass overread method");
	}

}
