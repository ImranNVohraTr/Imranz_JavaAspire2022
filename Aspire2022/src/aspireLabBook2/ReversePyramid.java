package aspireLabBook2;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for (int i = 1; i <= 5; i++) {
			//for (int j = 5; j >= i; j--) {
				//if (j>=5) {
					//for (int m = 1; m <= i; m++) {
					//System.out.print(" ");
					//}
				//}
			//	System.out.print("* ");
			//}
			//System.out.println();
		//}
				
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (j <= 1) {
					for (int m = 1; m <= 5 - i; m++) {
						System.out.print(" ");
					}
				}
					System.out.print("* ");
				}
				System.out.println();
			}
		

	}

}
