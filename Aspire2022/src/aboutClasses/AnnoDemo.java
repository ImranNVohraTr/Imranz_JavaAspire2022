package aboutClasses;

public class AnnoDemo {
	

}

class TiffenBox{
	
}

class NonVegCanteenContainer {
	public static TiffenBox<NonVegFood> getBox() {
		TiffenBox<NonVegFood> box=new TiffenBox<>();
		box.setItem(new NonVegFood());
		return box;
	
}

class VegCanteenContainer {
	public static TiffenBox<VegFood> getBox() {
		TiffenBox<VegFood> box=new TiffenBox<>();
		box.setItem(new VegFood());
		return box;
}