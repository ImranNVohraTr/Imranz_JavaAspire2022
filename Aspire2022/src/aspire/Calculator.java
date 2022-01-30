package aspire;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter another number: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		int sum = num1 + num2;
		
		System.out.println("The sum of the numbers is:"+sum);
	}

}
