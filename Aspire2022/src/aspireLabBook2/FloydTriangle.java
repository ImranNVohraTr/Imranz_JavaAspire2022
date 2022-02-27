package aspireLabBook2;
import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int rows, number = 1, counter, j; //int m;
		System.out.println("Enter the number of rows: ");
		rows = scan.nextInt();
		for (counter = 1; counter <= rows; counter++) {
			for (j = 1; j <= counter; j++) {
				//if (j <= 1) {
					//for (m = rows; m >= counter; m--) {
						//System.out.print("  ");
					//}
				//}
				System.out.print(number + "  ");
				number++;
			}
			System.out.println();
		}
		
		scan.close();

	}

}
