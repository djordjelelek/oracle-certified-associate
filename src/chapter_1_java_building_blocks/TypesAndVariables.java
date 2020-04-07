package chapter_1_java_building_blocks;

public class TypesAndVariables {
	int instanceV; // instance v can be uninitialized

	public static void main(String[] args) {
		TypesAndVariables referenceType = new TypesAndVariables(); // reference type
		System.out.println("instance variable : " + referenceType.instanceV);

		referenceType.doSomething();

		int primitiveType = 1; //$, or letter must be first sign in a name of variable (avoid $ and _)
		System.out.println("primitive type : " + primitiveType);
		
		

	}

	public void doSomething() {
		int localV;
		// System.out.println(localV); can`t compile; local variables must be initialize
		localV = 1;
		System.out.println("local variable : " + localV); // now can
	}
	
}
