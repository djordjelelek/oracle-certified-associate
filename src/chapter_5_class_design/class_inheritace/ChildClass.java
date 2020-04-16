package chapter_5_class_design.class_inheritace;

public class ChildClass extends ParentClass { // you can extend only one class
	double d = 1.2;
	
	public ChildClass() {
		//super(); //if you don`t write super(), compiler will insert that automatically
		System.out.println("Child constructor");
		//super(); //calling parent constructor; must be on the first place
		System.out.println(super.s); //calling methods/variables from parent class
		System.out.println(this.s); //calling methods/variables from child class 
									//s is inherent form parent, also it isn`t private
									
	}

	public ChildClass(int numb, String s, double d) {
		super(numb, s);
		this.d = d;
	}
	

}
