package aspireLabBook2;
import java.util.Scanner;
public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int array[] = new int[10];
		int sum = 0;
		System.out.println("Enter the elements for the array: ");
		for (int i = 0; i < 10; i++) {
			array[i] = 	scan.nextInt();
		}
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("The sum of the array elements is " + sum + ".");
		
		scan.close();
	}

}
