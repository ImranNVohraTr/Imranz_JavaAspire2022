package aspireLabBook2;
import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the side of the square, in centimeters: ");
		double side = scan.nextDouble();
		
		double area = side * side;
		
		System.out.println("The area of the square is " + area + " square cm.");
		
		scan.close();
	}

}
