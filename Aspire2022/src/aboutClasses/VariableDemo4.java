package aboutClasses;

public class VariableDemo4 {
	public static void main(String[] args) {
		TrainingRoom Sunflower=new TrainingRoom();
		
		TrainingRoom Marigold=new TrainingRoom();
		
		System.out.println(Sunflower.Sanyo+" : "+Marigold.Sanyo);
		System.out.println(TrainingRoom.Sulabh+" : "+TrainingRoom.Sulabh);
		
	}

}

class TrainingRoom{
	Projector Sanyo=new Projector();//Instance Variables
	static Toilet Sulabh=new Toilet();//Class Variables
	
}

class Projector{
	
}

class Toilet{
	
}
