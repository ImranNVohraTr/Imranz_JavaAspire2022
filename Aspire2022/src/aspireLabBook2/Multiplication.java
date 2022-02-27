package aspireLabBook2;

import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		System.out.println("Let us multiply two numbers.");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = scan.nextInt();
		System.out.print("Enter the second number: ");
		int second = scan.nextInt();
		int product = first*second;
		System.out.println("The product of the numbers is: " + product + ".");
		
		scan.close();
	}

}