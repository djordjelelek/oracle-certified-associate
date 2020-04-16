package chapter_5_class_design.interface_implementing;

//don`t need to insert key word abstract, compiler will insert automatically
//may not be marked as final, static, private, protected
public abstract interface ParentFirst {
	public static final int numb = 1; // it must be PUBLIC STATIC FINAL
	public int numb2 = 2; // compiler will insert static final

	// or package
	public abstract void interfaceMethod(); // can`t be final, static, PROTECTED (abstract class),private

	public void interfaceMethod2(); // compiler will insert abstract

	
	public default void defaultMethod() {
		// can`t be protected, private; isn`t assumed to be static, final or abstract
	}

	
	default void defaultMethod2() {
		// compiler will insert public
	}
	// default methods can be overread
	// (only when class/interface doesn`t implements/extends two or more interface)

	
	public static void staticMethod() {
		// static method must be only public
		// it is not inherited in any class
	}

}
