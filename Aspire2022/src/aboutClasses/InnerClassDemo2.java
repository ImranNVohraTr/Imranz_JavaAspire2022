package aboutClasses;

class OuterClass{
	int a;
	public void show() {
		System.out.println("show() function of Outer class called.");
	}
	class Inner{
		public void display() {
			System.out.println("display() function of Inner class called.");
		}
	}
	
	static class StaticInner{
		public void demonstrate() {
			System.out.println("demonstrate() function of StaticInner class called.");
	}
}
}

public class InnerClassDemo2 {
	public static void main(String[] args) {
		OuterClass otr=new OuterClass();
		otr.show();
		
		OuterClass.Inner inr=otr.new Inner();
		inr.display();
		
		OuterClass.StaticInner stin=new OuterClass.StaticInner();
		stin.demonstrate();
		
		
	}

}
