import java.util.*;

public class Hand {
    // Attributes
    private List<Card> cards;
    
    public Hand() {
      cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
      cards.add(card);
    }

    // Methods

    public void display() {
      for (int i = 0; i <= this.cards.size()-1; i++ ) {
          System.out.println(cards.get(i).format());
      }
    }

    public Card playCard(int cardNum) {
      Card cardDown = cards.get(cardNum);
      this.cards.remove(cardNum);
      return cardDown;
    }


}