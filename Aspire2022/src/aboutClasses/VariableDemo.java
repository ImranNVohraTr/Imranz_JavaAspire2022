package aboutClasses;

public class VariableDemo {
	public static void main(String[] args) {
		
		Laddu laddu=new Laddu();
		
		VariableDemo vd=new VariableDemo();
		
		//Pass By Value (pbv)
		System.out.println("before passing by value...:" + laddu.size);
		vd.pbv(laddu.size);
		System.out.println("after passing by value...:" + laddu.size);
		
		//Pass By Value (pbv)
		System.out.println("before passing by reference...:" + laddu.size);
		vd.pbr(laddu);
		System.out.println("after passing by reference...:" + laddu.size);
	}
	
	void pbv(int size) {
		size=5;
	}
	
	void pbr(Laddu lad) {
		lad.size=5;
	}
	
}

class Laddu {
	int size=10;//primitive type
}
