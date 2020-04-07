package chapter_2_operators_and_statements;



public class Satements {

	public static void main(String[] args) {
		boolean b = true;
		
		int i = (b) ? 2 : 1; //ternary operatio
		System.out.println("i: " + i); 
		
		if(b) System.out.println("T"); //if-else statement
		else System.out.println("F");
		
		while(b == false) System.out.println(i); //while statement
		
		do System.out.println("i: " + ++i); //do-while statement (at least one DO must be execute)
		while (b==false);
		
		System.out.print("print case from where find true case, until first braek: ");
		switch (i) {
		case 2: System.out.print(2 + ", ");
		case 3: System.out.print(3 + ", "); //print 3 because i==3; 
		case 4: System.out.print(4 + " " + "\n"); break; // print 4 because case(3) hasn`t break statement
		case 5: System.out.print(5);
		}
		
		System.out.print("FOR statement: ");
		int [] array = {1,2,3}; 
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		
		System.out.print("\nFOR-EACH statement: ");
		for (int j : array) {  //can`t use when you need index in array
			if (j == 2) continue; //continue statement
			System.out.print(j + " ");
		}
		
		
		for (int j = 0; j < array.length; j++) { //nested loops
			for (int j2 = 0; j2 < array.length; j2++) {
				for (int k = 0; k < array.length; k++) {
					
				}
			}
		}
	}

}
