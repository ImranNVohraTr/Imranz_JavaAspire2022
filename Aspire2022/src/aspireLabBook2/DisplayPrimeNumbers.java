package aspireLabBook2;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, num = 0;
		String primeNumbers = "";
		
		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if(i % num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter == 2)
			{
				primeNumbers = primeNumbers + i + " ";
			}
			
		}
		System.out.println("The prime numbers between 1 and 100 are: ");
		System.out.println(primeNumbers);

	}

}
