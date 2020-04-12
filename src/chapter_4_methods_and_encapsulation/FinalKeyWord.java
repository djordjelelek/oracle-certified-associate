package chapter_4_methods_and_encapsulation;

public final class FinalKeyWord { //if you want a class which you don`t want to change
	protected final int FIRST_FINAL = 1; 
	//final instance variable can initialize here, or in instance initializr or in constructor
	protected static final int SECOND_FINAL = 2;
	//exist on the class level, and can`t be change
	public final void finalMethod(){  
		//cannot modify a final method in any solution, nor from a sub class
	}


}
