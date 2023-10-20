package javafirstclass;

import java.util.*;
public class Arrays {
	
	public void array() {
		Scanner sc = new Scanner(System.in);
		
//		Method 1 
		
		int[] intArray = new int[5]; //size of the array
		
		intArray[0] = 1;
		intArray[1] = 10;
		intArray[2] = 2;
		intArray[3] = 12;
		intArray[4] = 32;
		
		System.out.println("first:");
		for (int i = 0; i < 5; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("*******************************");
		System.out.println("second:");
		
		int[] intArray1 = { 1,20,10,2};
		for(int i = 0; i<4; i++) {
			System.out.println(intArray1);
		}
		
//		Method 3:
		System.out.println("Method 3:");
		System.out.print("Enter the size:");
		int size = sc.nextInt();
		int[] intArrayUser = new int[size];
		System.out.println("Enter the values:");
		for (int i = 0; i < size; i++) // Get user input interger array values
		{
			intArrayUser[i] = sc.nextInt();
		}
		System.out.println("The values entered:");

		for (int i = 0; i < size; i++) {
			System.out.println(intArrayUser[i]);
		}
		
		System.out.println("String Array:");
		// String Declaration METHOD - 1
		String[] arrStr = new String[10]; 
		arrStr[0] = "Hello Java!!";
		
		System.out.println(arrStr[0]);
	}
	public static void main(String[] args) {
		Arrays test = new Arrays();
		test.array();
	}

}
