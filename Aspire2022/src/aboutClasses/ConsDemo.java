package aboutClasses;

public class ConsDemo {
	ConsDemo(){//Constructor
		System.out.println("Constructor is called.");
	}
	
	String s;
	
	ConsDemo(String s, int i){
		System.out.println("Constructor with string and integer parameter called: "+s+" "+i);
	}
	
	ConsDemo(String s){
		System.out.println("Constructor with string parameter called: "+s);
		this.s=s;
	}
	
	public static void main(String[] args) {
		ConsDemo obj=new ConsDemo();
		System.out.println("..................");
		
		ConsDemo obj2=new ConsDemo("Test");
		
		ConsDemo obj3=new ConsDemo("Test2, 4");
		
		System.out.println(obj.s);
		System.out.println(obj2.s);
		System.out.println(obj3.s);
	}

}
