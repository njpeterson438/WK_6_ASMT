package week_6_asmt;

	import java.util.ArrayList; 
	import java.util.Collections; 
	import java.util.List; 
	 
	public class Deck { 
	    private List<Card> cards; 
	 
	    // Constructor - populate deck with 52 cards 
	    public Deck() { 
	        cards = new ArrayList<>(); 
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; 
	        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
	        		"Nine", "Ten", "Jack", "Queen", "King", "Ace"}; 
	        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 
	 
	        for (String suit : suits) { 
	            for (int i = 0; i < ranks.length; i++) { 
	                cards.add(new Card(values[i], ranks[i] + " of " + suit)); 
	            } 
	        } 
	    } 
	 
	    // Shuffle the deck 
	    public void shuffle() { 
	        Collections.shuffle(cards); 
	    } 
	 
	    // Draw a card (remove and return the top card) 
	    public Card draw() { 
	        return cards.remove(0); 
	    } 
	 
	    // Get the size of the deck (optional) 
	    public int size() { 
	        return cards.size(); 
	    } 
	} 
