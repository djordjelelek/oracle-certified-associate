package chapter_5_class_design.abstract_class;

public abstract class ParentClass {
	// abstract class can1t be final or static
	// can`t initialize

	public int numb = 1;
	protected String str;

	public abstract void abstractMethod(); // can`t be final or static

	public void methodWithBody() { // it can override in the ChildClass

	}
}
