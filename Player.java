import java.util.*;

public class Player {
  // Attribute
  private String name;
  private Hand hand;

  // Default constructor

  public Player(String name) {
      hand = new Hand(); // Instantiate new hand object
      this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void giveCard(Card card) {
      hand.addCard(card);
  }

  public Card playCard(int numCard) {
    Card cardDown = this.hand.playCard(numCard);
    return cardDown;
  }

  public void displayHand() {
      System.out.println(this.name + "'s hand:");
      hand.display();
      System.out.println("");
  }
}
