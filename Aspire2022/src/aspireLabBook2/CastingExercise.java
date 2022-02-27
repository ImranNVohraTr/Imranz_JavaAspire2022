package aspireLabBook2;

public class CastingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		int i = b; // will accept - automatic type promotion
		//byte c = i; //We cannot automatically convert int to byte.
		byte d = (byte)i;
		byte x = 13;
		byte y = 20;
		int mul = x*y;
		//byte prdct = mul; //We cannot automatically convert int to byte.
		byte product = (byte)mul; 
		//The value of variable mul of int type is subtracted by 256 and stored 
		//in the variable product of byte type.
		//System.out.println("prdct = " + prdct);
		System.out.println("product = " + product);
	}

}