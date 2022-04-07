import java.util.Scanner;

/**
 * This program gets input from the user to fill in a MadLib
 * @author josiederrick
 *
 */
public class MadLibGenerator {
	public static void main(String args[]) {
		String[] nouns = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a noun: ");
		nouns[0] = scan.nextLine();
		
		System.out.print("Cool, enter a new noun: ");
		nouns[1] = scan.nextLine();
		
		scan.close();		
		System.out.print("You said " + nouns[0] + ", " + nouns[1]);
	}
}
