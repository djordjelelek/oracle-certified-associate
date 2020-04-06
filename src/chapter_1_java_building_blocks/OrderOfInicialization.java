package chapter_1_java_building_blocks;

public class OrderOfInicialization {

	public OrderOfInicialization() { // constructor - third initialize
		one = 30;
		two = 40;
	}

	int one = 1, two = 2;  //instance variables - first initialize
	{ // instance initializer - second initialize
		one = 10;
		two = 20;
	}

	public static void main(String[] args) {
		OrderOfInicialization ooi = new OrderOfInicialization();
		System.out.println(ooi.one);
		System.out.println(ooi.two);

	}

}
