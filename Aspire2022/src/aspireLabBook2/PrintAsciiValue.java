package aspireLabBook2;

public class PrintAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		int ascii = ch;
		//We can cast a char value to int
		int asciiCast = (int)ch;
		System.out.println("ASCII value with implicit conversion is: " + ascii);
		System.out.println("ASCII value with explicit conversion is: " + asciiCast);
		
		int asciiGuess = 33;
		char corrCh = (char)asciiGuess;
		System.out.println("The character with ASCII value 33 is: " + corrCh);

	}

}