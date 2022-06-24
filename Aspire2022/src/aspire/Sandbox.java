/*this is a comment*/
package aspire;

class Money{
	private String country, name; 
	public getCountry() { return country; }
}

class Yen extends Money { 
	public String getCountry() { 
		return super.country; 
		} 
	} 

class Euro extends Money { 
	public String getCountry(String timeZone) { 
		return super.getCountry(); 
		} 
	}

public class Sandbox {
    public static void main(String[ ] args) {
        Yen y = new Yen();
        Euro e = new Euro();
    }
}