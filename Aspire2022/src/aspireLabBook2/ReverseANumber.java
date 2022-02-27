package aspireLabBook2;
import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int reversenum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		num = scan.nextInt();
		
		//reversenum = ((num % 10) * 10) + (num / 10); //This is a shorter method only for 2 digit numbers
		
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + (num % 10);
			num = num / 10;
		}
		System.out.println("The reverse of the number is " + reversenum + ".");
		
		scan.close();
	}

}
