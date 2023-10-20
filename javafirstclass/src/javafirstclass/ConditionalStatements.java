package javafirstclass;

import java.util.*;


public class ConditionalStatements {

	Scanner sc = new Scanner(System.in);
	
	private int n; // Use of access modifier

	public void fizzBuzz() {
		System.out.print("Enter a number: ");
		n = sc.nextInt();  // Get input from user
		
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print("FizzBuzz" + " ");
			} 
			
			else if (i % 3 == 0) {
				System.out.print("Fizz!" + " ");
			} 
			
			else if (i % 7 == 0) {
				System.out.print("Buzz!"+ " ");
			}
			
			else {
				System.out.print(i+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		ConditionalStatements test = new ConditionalStatements();
		test.fizzBuzz();
	}
}

