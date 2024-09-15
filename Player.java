package week_6_asmt;

import java.util.ArrayList; 
import java.util.List; 
 
public class Player { 
    private String name; 
    private List<Card> hand; 
    private int score; 
 
    // Constructor - initializes name and score 
    public Player(String name) { 
        this.name = name; 
        this.hand = new ArrayList<>(); 
        this.score = 0; 
    } 
 
    // Draw a card from the deck and add it to the player's hand 
    public void draw(Deck deck) { 
        hand.add(deck.draw()); 
    } 
 
    // Flip the top card (removes and returns the top card) 
    public Card flip() { 
        return hand.remove(0); 
    } 
 
    // Increment the player's score 
    public void incrementScore() { 
        score++; 
    } 
 
    // Describe the player's hand 
    public void describe() { 
        System.out.println(name + "'s hand:"); 
        for (Card card : hand) { 
            card.describe(); 
        } 
    } 
 
    // Getters and Setters 
    public String getName() { 
        return name; 
    } 
 
    public int getScore() { 
        return score; 
    } 
}
