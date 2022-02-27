package aspireLabBook2;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Finding largest of int value
		System.out.println("Enter the first integer number:");
		int first = scan.nextInt();
		System.out.println("Enter the second integer number:");
		int second = scan.nextInt();
		System.out.println("Enter the third integer number:");
		int third = scan.nextInt();
		
		System.out.println("---------------------------------------");

		if (first >= second && first >= third)
			System.out.println(first + " is the largest of the three numbers.");
		else if (second >= first && second >= third)
			System.out.println(second + " is the largest of the three numbers.");
		else if (third >= first && third >= second)
			System.out.println(third + " is the largest of the three numbers.");
		
		System.out.println("---------------------------------------");
		
		System.out.println(" ");
		
		System.out.println("*********************************");
		
		System.out.println("");
		
		//Finding largest of float value
		System.out.println("Enter the first decimal number:");
		float firstFl = scan.nextFloat();
		System.out.println("Enter the second decimal number:");
		float secondFl = scan.nextFloat();
		System.out.println("Enter the third decimal number:");
		float thirdFl = scan.nextFloat();
		
		System.out.println("---------------------------------------");
		if (firstFl >= secondFl && firstFl >= thirdFl)
			System.out.println(firstFl + " is the largest of the three numbers.");
		else if (secondFl >= firstFl && secondFl >= thirdFl)
			System.out.println(secondFl + " is the largest of the three numbers.");
		else if (thirdFl >= firstFl && thirdFl >= secondFl)
			System.out.println(thirdFl + " is the largest of the three numbers.");
		System.out.println("---------------------------------------");
		
		scan.close();
	}

}