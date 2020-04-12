package chapter_4_methods_and_encapsulation;

public class EncapsulatingData {
	private int a;
	private boolean b;
	//private fields
	
	
	public EncapsulatingData(int a, boolean b) {
		super();
		this.a = a;
		this.b = b; //you can initialize in constructor
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) { 
		this.a = a;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	//if you don`t want to change once you initialize by constructor, don`t use SETERS
	
	

	
	
	
	

}
