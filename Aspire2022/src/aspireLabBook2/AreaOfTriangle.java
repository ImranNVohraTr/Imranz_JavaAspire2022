package aspireLabBook2;
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the base of the triangle, in centimeters: ");
		double base = scan.nextDouble();
		System.out.println("Enter the height of the triangle, in centimeters: ");
		double height = scan.nextDouble();
		
		double area = (base * height) / 2;
		System.out.println("The area of the triangle is: " + area + " square cm.");
		
		scan.close();
	}

}
