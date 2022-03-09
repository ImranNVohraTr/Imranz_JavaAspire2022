/*this is a comment*/
package aspire;

public class Sandbox {
	static int i;
	int age;
	
	Sandbox(int age){
		this.age = age;
	}
	Calculator calc = new Calculator();
	
	public static void main(String[] args) {
		
		Sandbox sb = new Sandbox(3);
				
		System.out.println(i);
		System.out.println(sb.age);
	}
	
}
