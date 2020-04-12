package chapter_4_methods_and_encapsulation;

public class MethodsAndVarargs {

	public static void main(String[] args) {
		thisIsMethod(1);
		varargsParaeter (1, 10, 20, 30);

	}
	/*acess specifier + OPTIONAL specifier + return type + method name + 
	OPTIONAL list of parameters + OPTIONAL exception*/
	private static void thisIsMethod(int parameter) throws NullPointerException{ 
		
	}
	static void varargsParaeter(int i, int...varargs){ //can`t compile if switch
		for (int j : varargs) { //java see varargs like as array list
			System.out.println(j);
		}
	}

}
