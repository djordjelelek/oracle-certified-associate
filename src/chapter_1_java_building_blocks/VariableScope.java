package chapter_1_java_building_blocks;

public class VariableScope {
	int classV = 1; // in scope until the end of the program

	public static void main(String[] args) {
		VariableScope vs = new VariableScope();
		vs.classV = 2; // instance variable
		System.out.println(vs.classV);
		vs = null; // vs is now good for garbage collection; instance variable - not in scope

	}

	public void doSomething() {
		int localVariable;
		localVariable = 1;
		System.out.println(localVariable);
	} // local variable - until the end of block

}
