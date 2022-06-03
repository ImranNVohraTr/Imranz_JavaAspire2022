package aboutClasses;

public class InterfaceDemo {
public static void main(String[] args) {
		
	}
	
	
	class Human {
		
	}
	
	//Role
	interface Doctor{
		public void treat();
	}
	
	interface Nurse{
		public void care();
	}
	
	class AllopathyMedicalCollege implements Doctor, Nurse {
		public void treat() {
			System.out.println("The doctor does treatment using Allopathic medicine.");
		}
		
		public void care() {
			System.out.println("The nurse administers Allopathic medicine to patients.");
		}
	}
	
	class UnaniMedicalCollege implements Doctor {
		public void treat() {
			System.out.println("The doctor does treatme t using Unani medicine.");
		}
	}

}
