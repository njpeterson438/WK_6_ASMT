package week_6_asmt;

public class Card {

	private int value;    // Value from 2 to 14 (Ace being 14) 
    private String name;  // Name like "Ace of Spades" 
 
    // Constructor 
    public Card(int value, String name) { 
        this.value = value; 
        this.name = name; 
    } 
 
    // Getters and Setters 
    public int getValue() { 
        return value; 
    } 
 
    public void setValue(int value) { 
        this.value = value; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    // Describe method to print out card details 
    public void describe() { 
        System.out.println(name + " (" + value + ")"); 
    } 
}
