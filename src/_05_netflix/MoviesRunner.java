package _05_netflix;

import javax.swing.JOptionPane;

public class MoviesRunner {
public static void main(String[] args) {
	Movie TwilightStars = new Movie ("Twilight Stars", -1);
	Movie StarWars9 = new Movie ("Star Wars - Episode IX", 1);
	Movie StarWars7 = new Movie ("Star Wars - Episode VII", 2);
	Movie InfinityWars = new Movie ("Infinity Wars", 3);
	Movie Spiderman = new Movie ("Spiderman", 4);
	Movie StarWars4 = new Movie ("Star Wars - Episode IV", 5);
	String UIQ = JOptionPane.showInputDialog("What movie do you want to buy a ticket for?");
	if (UIQ.equals ("Twilight Stars")) {
		String ts = TwilightStars.getTicketPrice ();
	System.out.println(ts);	
	}
	else if (UIQ.equals ("Star Wars - Episode IX")) {
	String sw9 = StarWars9.getTicketPrice ();
System.out.println(sw9);	
}
	else if (UIQ.equals ("Star Wars - Episode VII")) {
	String sw7 = StarWars7.getTicketPrice ();
System.out.println(sw7);	
}
	else if (UIQ.equals ("Infinity Wars")) {
		String iw = InfinityWars.getTicketPrice ();
	System.out.println(iw);	
	}
	else if (UIQ.equals ("Spiderman")) {
		String s = Spiderman.getTicketPrice ();
	System.out.println(s);	
	}
	else if (UIQ.equals ("Star Wars - Episode IV")) {
		String sw4 = StarWars4.getTicketPrice ();
	System.out.println(sw4);	
	}
NetflixQueue NQ = new NetflixQueue();	
NQ.addMovie(TwilightStars);
NQ.addMovie(StarWars9);
NQ.addMovie(StarWars7);
NQ.addMovie(InfinityWars);
NQ.addMovie(Spiderman);
NQ.addMovie(StarWars4);

String UIQ2 = JOptionPane.showInputDialog("Do you know what the best movie is?");
Movie M = NQ.getBestMovie();
if (UIQ2.equals("Star Wars - Episode IV")){
System.out.println("Correct!");
}
else {
	System.out.println("Its actually " + M);
}

}
}
