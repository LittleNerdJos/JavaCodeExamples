import java.util.Scanner;

/**
 * This program gets input from the user to fill in a MadLib
 * @author josiederrick
 *
 */
public class MadLibGenerator2 {

	public static void main(String[] args) {
		String[] nouns = new String[6];
		String[] adj = new String[3];
		String plNoun, adverb;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("You're going to need to enter 6 nouns.");
		for (int i = 0; i<6; i++) {
			System.out.print("\tNoun "+(i+1)+": ");
			nouns[i] = scan.nextLine();
		}
		
		System.out.println("Now enter 3 adjectives");
		for (int i = 0; i<3; i++) {
			System.out.print("\tAdjective "+(i+1)+": ");
			adj[i] = scan.nextLine();
		}
		
		System.out.print("Enter a plural noun: ");
		plNoun = scan.nextLine();
		
		System.out.print("Enter an adverb: ");
		adverb = scan.nextLine();
		
		scan.close();		
		System.out.print("\nDriving a car can be fun if you follow this "+ adj[0]+" advice:\n"
				+ " 1. When approaching a/an "+nouns[0] + " on the right, always honk your "+ nouns[1] +".\n"
				+ " 2. Before making an " + adj[1] + " turn, always stick your " + nouns[2] +
						" out the window.\n"
				+ " 3. Every 2000 miles have your "+nouns[3] +" inspected and your "+nouns[4] +" checked.\n"
				+ " 4. When approaching a school, watch out for "+adj[2] +" "+ plNoun +".\n"
				+ " 5. Above all, drive "+adverb +". The "+ nouns[5] +" you save may be your own!");
	}

}
