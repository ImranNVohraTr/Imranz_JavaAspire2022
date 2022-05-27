/*this is a comment*/
package aspire;

public class Sandbox{
	public static void main(String argv[]) { 
		
		SuperClass obj1=new SubClass1();
		
		SupCon obj2=new SupCon();
		obj2.sc=new SubClass2();
		}
}

class SupCon{
	SuperClass sc;
}

class SuperClass{
	
	}

class SubClass1 extends SuperClass{
	
}

class SubClass2 extends SuperClass{
	
}