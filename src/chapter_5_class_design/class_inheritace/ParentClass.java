package chapter_5_class_design.class_inheritace;

//don`t need to write (Object is a class which all other class inherit from it
public class ParentClass extends java.lang.Object{  
	private int numb = 1; //you can access this member in the child class, by getter (it isn`t inherent)
	public String s = "s";
	
	public ParentClass(int numb, String s) {
		super(); //don`t need this
		this.numb = numb;
		this.s = s;
	}
	
	public ParentClass() {
		
	}

	public int getNumb() {
		return numb;
	}

	public String getS() {
		return s;
	}
	
	
	
}
