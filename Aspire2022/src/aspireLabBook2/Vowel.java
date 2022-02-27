package aspireLabBook2;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter of the English alphabet: ");
		char ch = scan.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		System.out.println(ch + " is a vowel.");
		else
			System.out.println(ch + " is not a vowel.");
		
		scan.close();
	}

}