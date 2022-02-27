package aspireLabBook2;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle in centimeters: ");
		double length = scan.nextDouble();
		System.out.println("Enter the width of the rectangle in centimeters: ");
		double width = scan.nextDouble();
		
		double area = length * width;
		
		System.out.println("The area of the rectangle is " + area + " square cm.");
		
		scan.close();
	}

}
