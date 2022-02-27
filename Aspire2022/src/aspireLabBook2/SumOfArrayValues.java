package aspireLabBook2;

public class SumOfArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 30, 40, 50, 60};
		int sum = 0;
		
		for (int num : array)
		{
			sum = sum + num;
		}
		System.out.println("The sum of the array elements is " + sum + ".");
		//System.out.println("The values of the array are: " + num + ".");

	}

}
