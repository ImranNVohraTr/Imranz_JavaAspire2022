package aspireLabBook2;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers and I will swap their order.");
		System.out.println("Enter the first number: ");
		int first = scan.nextInt();
		System.out.println("Enter the second number: ");
		int second = scan.nextInt();
		System.out.println("You entered the numbers in the following order:");
		System.out.println("First = " + first);
		System.out.println("Second = " + second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println();
		System.out.println("After swapping the numbers, the new order is: ");
		System.out.println("First = " + first);
		System.out.println("Second = " + second);
		
		scan.close();

	}

}
