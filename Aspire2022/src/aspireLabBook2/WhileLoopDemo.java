package aspireLabBook2;
import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer less than 10: ");
		num = scan.nextInt();
		
		while (num <= 10) {
			sum = sum + num;
			num++;
		}
		System.out.format("The sum of the numbers from the while loop is: %d ", sum);
		
		scan.close();
	}

}
