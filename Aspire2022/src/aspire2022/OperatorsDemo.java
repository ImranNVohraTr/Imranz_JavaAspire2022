package aspire2022;

/*Objective:
 *Understanding Operators */

public class OperatorsDemo {
	public static void main(String[] args) {
		int num1=30;
		int num2=20;
		
		//Addition
		
		int add=num1+num2;//+ is a addition operator
		
		System.out.println(add);
		
		/*
		 "+" operator is overloaded.
		 - for numbers, it will do addition
		 - for char and string, it will do concatenation
		 */		
		System.out.println("Addition...:"+add);//here + is doing concatenation
		
		//Deletion
		
		int sub=num1-num2;
		System.out.println("Subtraction..:"+sub);
		
		//Multiplication
		
		int mul=num1*num2;
		System.out.println("Multiplication..:"+mul);
		
		//Division
		
		int div=num1/num2;
		System.out.println("Division - (quotient)...:"+div);
		
		//Mod
		
		int mod=num1%num2;
		System.out.println("Mod - Division (Remainder)..:"+mod);
		
		//== this double equalto is used for comparison
		
		System.out.println(num1==num2);//this will return a boolean - true or false
		//if both are equal it will return true or else it will return false
	}

}
