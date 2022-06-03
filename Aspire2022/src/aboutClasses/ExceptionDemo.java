package aboutClasses;

public class ExceptionDemo {
	public static void main(String[] args) throws Exception{
		System.out.println("Before exception...");
		try {
		int i=1/0;
		}catch(Exception e) {
			System.out.println(e);
		};
		System.out.println("After exception...");
		
	}

	
}
