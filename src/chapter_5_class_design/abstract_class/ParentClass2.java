package chapter_5_class_design.abstract_class;

public abstract class ParentClass2 extends ParentClass{
	//everything like the ParentClass
	//extend only one abstract class

	public abstract void abstractMethod2();
	
	public void methodWithBody() { // it can override in the ChildClass and extend and change here
		System.out.println("2");
	}

}
