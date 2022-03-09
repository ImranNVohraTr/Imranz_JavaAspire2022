package aboutClasses;

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer.Inner inn=new Outer.Inner();
		
		inn.met();
		
		Outer.Inner2 inn2=new Outer().new Inner2();
		inn2.met();
	}
}
class Outer{
	int i;
	static int j;
	void meeeet() {
		System.out.println("meeeet method called");
	}
	static void meeeet2() {
		System.out.println("meeeet2 static method called");
	}
	//inner class
	static class Inner{
		public void met() {
			meeeet2();
			System.out.println("static inner method,,,,...."+j);
		}
	}
	
	class Inner2{
		public void met() {
			meeeet();
			System.out.println("inner method..............."+i);
		}
	}
}
