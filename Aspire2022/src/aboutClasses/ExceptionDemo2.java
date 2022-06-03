package aboutClasses;

public class ExceptionDemo2 {
	public static void main(String[] args){
		System.out.println("Before exception...");
		new ExceptionDemo2().met();
		System.out.println("After exception...");
	}
	
	void met(){
		try {
		super.clone();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

