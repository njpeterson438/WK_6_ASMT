package week_6_asmt;

public class App { 
 
    public static void main(String[] args) { 
        // Step 1: Instantiate a deck and two players 
        Deck deck = new Deck(); 
        Player player1 = new Player("Player 1"); 
        Player player2 = new Player("Player 2"); 
 
        // Step 2: Shuffle the deck 
        deck.shuffle(); 
 
        // Step 3: Deal cards to players (each player gets 26 cards) 
        for (int i = 0; i < 26; i++) { 
            player1.draw(deck); 
            player2.draw(deck); 
        } 
 
        // Step 4: Play 26 rounds and compare cards 
        for (int i = 0; i < 26; i++) { 
            System.out.println("Round " + (i + 1) + ":"); 
 
            Card player1Card = player1.flip(); 
            Card player2Card = player2.flip();
            
            System.out.print("Player One has the card\t\t");
 
            player1Card.describe();
            
            System.out.print("Player Two has the card\t\t");
            
            player2Card.describe(); 
 
            if (player1Card.getValue() > player2Card.getValue()) { 
                System.out.println(player1.getName() + " wins the round!\n"); 
                player1.incrementScore(); 
            } else if (player1Card.getValue() < player2Card.getValue()) { 
                System.out.println(player2.getName() + " wins the round!\n"); 
                player2.incrementScore(); 
            } else { 
                System.out.println("It's a tie!\n");        
            } 
            System.out.println(player1.getName() + "'s Score: " + player1.getScore()); 
            System.out.println(player2.getName() + "'s Score: " + player2.getScore() + "\n");
        } 
 
        // Step 5: Determine the winner 
        System.out.println("Final Scores:"); 
        System.out.println(player1.getName() + ": " + player1.getScore()); 
        System.out.println(player2.getName() + ": " + player2.getScore()); 
 
        if (player1.getScore() > player2.getScore()) { 
            System.out.println(player1.getName() + " wins the game!"); 
        } else if (player1.getScore() < player2.getScore()) { 
            System.out.println(player2.getName() + " wins the game!"); 
        } else { 
            System.out.println("It's a draw!"); 
        } 
    } 
}
