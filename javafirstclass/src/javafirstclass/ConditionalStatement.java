package javafirstclass;

import java.util.Scanner;


public class ConditionalStatement {
	Scanner sc = new Scanner(System.in);
	private int age;
	public void voteCheck() {
		System.out.print("Enter your age:");
		age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
	public static void main(String[] args) {
		ConditionalStatement test = new ConditionalStatement();
		test.voteCheck();
	}
}
