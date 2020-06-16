package _01_intro_to_static;
public class Athlete {
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete one = new Athlete("Beast", 99);
    	Athlete two = new Athlete("Goofy", 1);
    	one.bibNumber = 99;
    	two.bibNumber = 1;
    	System.out.println(one.name);
    	System.out.println(one.bibNumber);
    	System.out.println(two.name);
    	System.out.println(two.bibNumber);
    	System.out.println(raceLocation);
    }
}
