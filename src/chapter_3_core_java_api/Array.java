package chapter_3_core_java_api;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arrayInt1 = new int[3];
		int[] arrayInt2 = { 3, 2, 1 };
		String[] arrayStrings = { "k", "9", "100", "#" };
		
		arrayInt1[0] = 1; //adding elements in array; for print use for loop

		System.out.println("Are array equal : " + arrayInt1.equals(arrayInt2)); // Are arrays reference 
																				// on the same array
		System.out.println("Length od arrayInt1 : " + arrayInt1.length); // length of array method
		System.out.println(arrayInt1);

		Arrays.sort(arrayInt2); // sorting array - result will be 1, 2, 3
		Arrays.sort(arrayStrings); // in string numbers before letters, upper case before lower
		Arrays.binarySearch(arrayInt1, 2); // searching sign in array, but array need to sort first
		
		
		int[][] array2D = new int [2][2]; //you can create 2d, 3d ... arrays
		int[][][] assymetricArray = new int [1][2][3];  //assymetric array
		
		array2D[0][1] = 1;
		assymetricArray[2][1][3] = 2;
	}

}
