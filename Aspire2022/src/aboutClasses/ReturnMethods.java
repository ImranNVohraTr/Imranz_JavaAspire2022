package aboutClasses;

public class ReturnMethods {
	public static void main(String[] args) {
		ReturnMethods obj=new ReturnMethods();
		
		int a=obj.call();
		
		System.out.println(a);
		
		
		System.out.println(obj.call(1));
		
		System.out.println(obj.getName(100));
		
	}
	
	int call() {
		return 100;
	}
	
	short call(int i) {
		if(i==10) {
			return 10;
		}
		else {
			return 100;
		}
	}
	
	boolean run() {
		return true;
	}
	
	String getName(int rollno) {
		switch(rollno) {
		case 100:{
			return "Abdullah";
			//break; 
			/*we do not need to give break when there is a return statement before it
			 * because the return statement breaks the switch sequence.  
			 */
		}
		case 200:{
			return "Amar";
			//break;
		}
		default:{
			return "Noman";
		}
		}
	}

}
