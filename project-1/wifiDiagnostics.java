import java.util.Scanner;

public class wifiDiagnostics {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input;
		System.out.print("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n\nFirst step: reboot your computer\nAre you able to connect with the internet? (yes or no)\n"); 
		input = keyboard.nextLine();
		if(input.equals("yes") || input.equals("Yes")) {
			System.out.println("Rebooting your computer seemed to work");
			System.exit(0);
		}
		System.out.println("Second Step: reboot your router\nNow are you able to connect to the internet? (yes or no)");
		input = keyboard.nextLine();
		if(input.equals("yes") || input.equals("Yes")) {
			System.out.println("Rebooting your router seemed to work");
			System.exit(0);
		}
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\nNow are you able to connect to the internet? (yes or no)");
		input = keyboard.nextLine();
		if(input.equals("yes") || input.equals("Yes")) {
			System.out.println("Checking the router's cables seemed to work");
			System.exit(0);
		}
		System.out.println("Fourth step: move your computer closer to your router\nNow are you able to connect to the internet? (yes or no)");
		input = keyboard.nextLine();
		if(input.equals("yes") || input.equals("Yes")) {
			System.out.println("Moving your computer closer seemed to work");
			System.exit(0);
		}
		System.out.println("Fifth step: Contact your ISP\nMake sure your ISP is hooked up to your router");
	}
}
