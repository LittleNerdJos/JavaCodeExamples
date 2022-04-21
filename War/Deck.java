import java.util.*;

public class Deck {
	//suits are unicode for spade, heart, diamond, club
	private final String[] SUITS = {"\u2660","\u2665","\u2666","\u2663"};
	private final String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	private Card[] deck = new Card[52];
	private int nextCardIndex;
	
	//this method creates a deck object
	public Deck() {
		nextCardIndex = 0;
		for (String s : SUITS) {
			for (String r : RANKS) {
				Card card = new Card(r,s);
				deck[nextCardIndex] = card;
				nextCardIndex++;
			}
		}
		nextCardIndex = 0;
	}
	
	//this method will shuffle the deck
	public void shuffle() {
		//convert the array to a list
		List<Card> deckList = Arrays.asList(deck);
		
		//shuffle the list
		Collections.shuffle(deckList);
		
		//convert back to array
		deck = deckList.toArray(deck);
				
		//reset to the top of the deck
		nextCardIndex = 0;
	}
	
	//returns the next card in the deck
	//shift nextCardIndex by 1
	public Card draw() {
		Card x = new Card(deck[nextCardIndex].getRank(),deck[nextCardIndex].getSuit());
		nextCardIndex += 1;
		return x;
	}
	
	public int cardsRemaining() {
		return 52 - nextCardIndex;
	}
	
	public int cardsDealt() {
		return nextCardIndex;
	}
	
	//how to print a deck
	public String toString() {
		String output = "";
		for (Card c : deck) {
			output += "\n" + c;
		}
		return output;
	}
	
}
