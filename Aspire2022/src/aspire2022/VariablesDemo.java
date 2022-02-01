package aspire2022;

public class VariablesDemo {
	public static void main(String[] args) {
		
		//PRIMITIVE data types:
		
		byte weight = 67;
		
		weight = 127;
		weight = -128;
		
		short distance = 1600;
		
		distance = 32767;
		distance = -32768;
		
		int humanPopulation = 1450500000;
		
		humanPopulation = 2147483647;
		humanPopulation = -2147483648;
		
		long antPopulation = 5678234998726543789L;
		
		antPopulation = 9223372036854775807L;
		antPopulation = -9223372036854775808L;
		
		//float price = 340000000000000000000000000000000000000.01F;
		
		float price = 309999999999999999999999999999999999999.1f;
		
		double highValue = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.9999999999999999999;
		highValue = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0;
		
		int count = 0;
		while(highValue>0) {
			highValue = highValue/10;
			count = count+1;
		}
		
		System.out.println("No. of characters in double is " + count);
		
		char c = 'a';
		c = 97;
		
		boolean clear = true;
		clear = false;
		
		//COMPLEX data types:
		
		String msg = "Hello!";
		
		//COMPLEX data types of Primitive Types:
		
		Byte b = 127;
		b = Byte.valueOf(weight);
		
		Short s = 32400;
		s = Short.valueOf(distance);
		
		Integer i = 1869609696;
		i = Integer.valueOf(humanPopulation);
		
		Long l = 984739747435682629L;
		l = Long.valueOf(antPopulation);
		
		Float f = 67835686.123f;
		f = Float.valueOf(price);
		
		Double d = 66593659236592369.79879797979d;
		d = Double.valueOf(highValue);
		
		Character cc = 'b';
		cc = Character.valueOf(c);
		
		Boolean bb = true;
		bb = Boolean.valueOf(clear);
				
		
	}

}
