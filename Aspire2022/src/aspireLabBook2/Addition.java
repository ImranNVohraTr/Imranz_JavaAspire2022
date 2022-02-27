package aspireLabBook2;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Following is an example of adding two predeclared numbers.");
		int first = 100;
		System.out.println("First predeclared number: " + first);
		int second = 200; 
		System.out.println("Second predeclared number: " + second);
		
		 // add two numbers
		 int sum = first + second;
		 System.out.println("Their sum is: " + sum);
		 
		 System.out.println("--------------------------------");
		 
		// add two numbers entered by user.
		 System.out.println("Now lets try adding numbers that you provide.");
		 System.out.println("Enter two numbers.");
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter first number: ");
		 int firstScan = scan.nextInt();
		 System.out.println("Enter second number: ");
		 int secondScan = scan.nextInt();
		 int sumOfScan = firstScan + secondScan;
		 System.out.println("Sum of the numbers you entered is " + sumOfScan + ".");
		 
		 System.out.println("--------------------------------");
		 
		// add three numbers entered by user.
		 System.out.println("Let's try adding 3 numbers this time.");
		 System.out.println("Enter the first number: ");
		 int firstSc = scan.nextInt();
		 System.out.println("Enter the second number: ");
		 int secSc = scan.nextInt();
		 System.out.println("Enter the third number: ");
		 int thrdSc = scan.nextInt();
		 int sum3 = firstSc + secSc + thrdSc;
		 System.out.println("The sum of the three numbers is " + sum3 + ".");
		 
		 scan.close();
	}

}
