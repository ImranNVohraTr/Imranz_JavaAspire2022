package aspire2022;
import java.util.Scanner;

public class Inputs {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number..");
		int n = scan.nextInt();
		System.out.println(n);
		
		System.out.println("Enter your first name..");
		String s = scan.next();
		System.out.println(s);
		
		scan.close();
		
	}

}
