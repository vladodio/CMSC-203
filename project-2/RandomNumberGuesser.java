import java.util.Scanner;
/*
Forgive the horrific conventions used
I was not allowed to make a separate class to handle everything :(
*/



public class RandomNumberGuesser{
	
	public static void main(String[] args) {
		System.out.println("Number Guessing Game:");
		Scanner stdin = new Scanner(System.in);
		boolean playingAgain = true;
		String playAgain;
		int nextGuess = -1;
		while(playingAgain) {
			boolean guessCorrect = false, inputValid = false;
			int highGuess = 100, lowGuess = 0;
			int randNum = RNG.rand();
	
	
	
			System.out.println("Enter your first guess");
			while(!inputValid){
				nextGuess = stdin.nextInt();
				inputValid = RNG.inputValidation(nextGuess, lowGuess, highGuess);
			}
			inputValid = false;
	
			System.out.printf("Number of Guesses is %d%n", RNG.getCount());
			if(nextGuess == randNum){
				guessCorrect = true;
			}
			else if(nextGuess > randNum){
				System.out.println("Your guess is too high");
				highGuess = nextGuess;
			}
			else{
				System.out.println("Your guess is too low");
				lowGuess = nextGuess;
			}
			while(!guessCorrect){
				System.out.printf("Enter your next guess between %d and %d%n", lowGuess, highGuess);
				while(!inputValid){
					nextGuess = stdin.nextInt();
					inputValid = RNG.inputValidation(nextGuess, lowGuess, highGuess);
				}
				inputValid = false;
				System.out.printf("Number of Guesses is %d%n", RNG.getCount());
				if(nextGuess == randNum){
					guessCorrect = true;
				}
				else if(nextGuess > randNum){
					System.out.println("Your guess is too high");
					highGuess = nextGuess;
				}
				else{
					System.out.println("Your guess is too low");
					lowGuess = nextGuess;
				}
			}
			System.out.println("Congratualtions, you guessed correctly\nTry Again? (yes or no)");
			while(!inputValid) {
				playAgain = stdin.nextLine();
				if(playAgain.equals("yes")) {
					inputValid = true;
					playingAgain = true;
				}
				else if(playAgain.equals("no")) {
					inputValid = true;
					playingAgain = false;
				}
				else {
					System.out.println("Please input yes or no");
				}
			}
		}
		System.out.println("Programmer: Alex Ortunio");
		stdin.close();
	}
}
	
	
