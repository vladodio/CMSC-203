import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input;
		while(true) {
			Movie film = new Movie();
			System.out.println("Enter Movie Title: ");
			input = keyboard.nextLine();
			film.setTitle(input);
			System.out.println("Enter Movie Rating: ");
			input = keyboard.nextLine();
			film.setRating(input);
			System.out.println("Enter the Number of Tickets Sold at a (unnamed) Theater: ");
			input = keyboard.nextLine();
			film.setSoldTickets(Integer.parseInt(input));
			System.out.println(film.toString());
			System.out.println("Do you want to enter another? (y or n)");
			input = keyboard.nextLine();
			if(input.equals("n")) {
				break;
			}
		}
		System.out.println("Goodbye!");
	}

}
