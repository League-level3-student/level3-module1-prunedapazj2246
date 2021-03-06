package _02_LongChipCompetition;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
    /*
     * The Beatles are eating lunch and playing a game to see who has the
     * longest chip. (In England, french fries are called "chips".)
     * Find the Beatle with the longest chip. You may not edit the Chip or
     * Beatle classes. Make sure to initialize The Beatles before you start
     * your search.
     */
    private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

    public static void main(String[] args) {
        LongChipCompetition lcc = new LongChipCompetition();
        
     lcc.initializeBeatles();
lcc.findLongestChip();
	

    }
public void findLongestChip() {
	int name=0;
	double smallest =Integer.MAX_VALUE;
    for (int i = 0; i < theBeatles.size(); i++) {
    	ArrayList<Chip> lc = theBeatles.get(i).getChips();
    	for (int j = 0; j < lc.size(); j++) {
    		
    		
			if(lc.get(j).getLength()<smallest) {
				smallest=lc.get(j).getLength();
				name =i;
			}
		}
    }
    
    if(name==0) {
    	System.out.println("George");
    }
    else  if(name==1) {
    	System.out.println("John");
    }
    else  if(name==2) {
    	System.out.println("Paul");
    }
    else {
    	System.out.println("Ringo");
    }
    
}
    private void initializeBeatles() {
        Beatle george = new Beatle("George");
        Beatle john = new Beatle("John");
        Beatle paul = new Beatle("Paul");
        Beatle ringo = new Beatle("Ringo");
        theBeatles.add(george);
        theBeatles.add(john);
        theBeatles.add(paul);
        theBeatles.add(ringo);
    }

    public ArrayList<Beatle> getTheBand(){
        return theBeatles;
    }
}

class Beatle {
    private String name;
    private ArrayList<Chip> chips = new ArrayList<Chip>();

    public Beatle(String name) {
        this.name = name;
        initializePlateOfChips();
    }

    private void initializePlateOfChips() {
        int numberOfChips = new Random().nextInt(100);
        for (int i = 0; i < numberOfChips; i++) {
            chips.add(new Chip(new Random().nextDouble() * 10));
        }
    }

    public ArrayList<Chip> getChips() {
        return this.chips;
    }

    public String getName() {
        return this.name;
    }
}

class Chip {
    private double length;

    public double getLength() {
        return length;
    }

    Chip(double d) {
        this.length = d;
    }
}
