package chapter_5_class_design.abstract_class;

public abstract class ParentClass {
	// abstract class can`t be final, static, private, protected
	// can`t be initialize

	public int numb = 1;
	protected String str;

	abstract void abstractMethod(); // can`t be final, static, private

	public void methodWithBody() { // it can override in the ChildClass
		System.out.println("1");
	}
}
