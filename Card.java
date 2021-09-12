public class Card {

  //Attributes
  private int suit; // 1 = hearts, 2 = spades, 3 = diamond, 4 = clubs 
  private int number; //Ace, 2, ... 10, Jack, Queen, King
  
  // Make default card
  public Card() {
    this.suit = 2;
    this.number = 1;
  }

  public Card(int suit, int number) {
    this.suit = suit;
  }

  public int getSuit() {
    return this.suit;
  }

  public int getNumber() {
    return this.number;
  }  

  public void setSuit(int suit) {
      this.suit = suit;
  }

  public void setNumber(int number) {
      this.number = number;
  }
  
  public String displaySuit(int num) {
    String suitString;
    switch (num) {
      case 1: 
          suitString = "Hearts";
          break;
      case 2: 
          suitString = "Spades";
          break;
      case 3: 
          suitString = "Diamonds";
          break;
      case 4: 
          suitString = "Clubs";
          break;
      default:
          suitString = "unknown suit";
          break;
    }
    return suitString;
  }

public String displayNumber(int num) {
    String numString;
    switch (num) {
      case 1: 
          numString = "Ace";
          break;
      case 11: 
          numString = "Jack";
          break;
      case 12: 
          numString = "Queen";
          break;
      case 13: 
          numString = "King";
          break;
      default:
          numString = Integer.toString(num);
          break;
    }
    return numString;
  }  
  
  public boolean compareSuits(Card card1, Card card2) {
    return card1.suit == card2.suit;
  }

  public String format() {
    return this.displayNumber(this.number) + " of " + this.displaySuit(this.suit);
  }

  public void display(){
    System.out.println(this.format());
  }
}