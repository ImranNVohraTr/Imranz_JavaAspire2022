package revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
    	Integer c=0;
    	String d=null;
    	for(Map.Entry<String, Integer> me:players.entrySet()) {
    		Integer m=me.getValue();
    		if(c<m) {
    			c=m;
    			d=me.getKey();
    		}else continue;
    	}
    	System.out.println("\n\n"+d);
    }
    
}

public class HashMapBowling {
	public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        sc.close();
        game.getWinner();
    }

}
