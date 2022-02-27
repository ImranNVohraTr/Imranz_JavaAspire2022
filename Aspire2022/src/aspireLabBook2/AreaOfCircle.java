package aspireLabBook2;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle, in centimeters: ");
		double radius = scan.nextDouble();
		
		double area = Math.PI * (radius * radius);
		
		System.out.println("The area of the circle is " + area + " square cm.");
		System.out.println();
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of the circle is " + circumference + " cm.");
		
		scan.close();

	}

}
