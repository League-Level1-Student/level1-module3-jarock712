package _05_netflix;
public class netflix {
public static void main(String[] args) {
	Movie StarWars = new Movie("Star Wars", 5);
	System.out.println(StarWars.getTicketPrice());
	NetflixQueue one = new NetflixQueue();
	one.addMovie(StarWars);
	one.printMovies();
	Movie Elf = new Movie("Elf", 3);
	System.out.println(Elf.getTicketPrice());
	one.addMovie(Elf);
	one.printMovies();
	Movie Pets = new Movie("Pets", 1);
	System.out.println(Pets.getTicketPrice());
	one.addMovie(Pets);
	one.printMovies();
	Movie TheShining = new Movie("The Shining", 4);
	System.out.println(TheShining.getTicketPrice());
	one.addMovie(TheShining);
	one.printMovies();
	Movie WizardOfOz = new Movie("Wizard of Oz", 2);
	System.out.println(WizardOfOz.getTicketPrice());
	one.addMovie(WizardOfOz);
	one.printMovies();
	Movie first = one.getBestMovie();
	System.out.println("The best movie is " + first);
	System.out.println("The second best movie is" + TheShining);
}
}
