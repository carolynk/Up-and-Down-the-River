import java.util.*;
/**
* Represents a standard deck of 52 cards.
*/

public class Deck {
    // Attributes
    private List<Card> deck;
    private int index;
    
    // Methods
    /**
    * Constructor
    * Creates and shuffles a new deck of 52 cards
    */  
    public Deck() {
      deck = new ArrayList<Card>();
      this.index = 0;
      for (int i = 1; i <= 4; i++) {
          for (int j = 1; j <= 13; j++) {
            Card card = new Card();
            card.setSuit(i);
            card.setNumber(j);
            deck.add(card);
          }
      }
      this.shuffle();
    }
    
    /**
    * Shuffles the deck
    */
    public void shuffle() {
      Collections.shuffle(this.deck);
    }

    /**
    * Creates the deck
    */
    public Card deal() {
      Card dealtCard = deck.get(index);
      this.index++;

      return dealtCard;
    }

    /**
    * Prints out the formatted deck
    */
    public void display() {
      for (int i = 0; i <= this.deck.size()-1; i++ )
          System.out.println(deck.get(i).format());
    }
};