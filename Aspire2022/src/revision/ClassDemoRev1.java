package revision;

public class ClassDemoRev1 {
	int age=20;
	int weight=met2("heavy");
	public static void main(String[] args) {
		ClassDemoRev1 obj1=new ClassDemoRev1();
		obj1.met1();
		System.out.println(obj1.weight);
		
	}
	
	void met1() {
		
	}
	
	int met2(String s) {
		if(s.equals("heavy")) {
			return 10;
		}
		else {
			return 5;
		}
	}

}
