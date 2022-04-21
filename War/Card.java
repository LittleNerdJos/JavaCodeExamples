
public class Card {
	private String rank;
	private String suit;
	
	public Card(String r, String s) {
		rank = r;
		suit = s;
	}
	
	public String getRank() {
		return rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getFaceValue() {
		if (rank.equals("A")) {
			return 1;
		} else if (rank.equals("J")) {
			return 11;
		} else if (rank.equals("Q")) {
			return 12;
		} else if (rank.equals("K")) {
			return 13;
		} else {
			return Integer.parseInt(rank);
		}
		
	}
	
	public int compareTo(Card c) {
		if (this.getFaceValue() > c.getFaceValue()) {
			return 1;
		} else if (this.getFaceValue() < c.getFaceValue()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
}
