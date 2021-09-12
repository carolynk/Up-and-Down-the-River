import java.util.*;
/**
* Represents a Game
*/
class Game {
  // Attributes
  private static Player player1 = new Player("Nate");
  private static Player player2 = new Player("Carrie");
  private static Deck myDeck = new Deck();
  private static int round = 5;
  private static Card trump = new Card();
  // private static ArrayList<Card> table = new ArrayList<>();
  private static Hashtable<Player, Card> table = new Hashtable<Player, Card>();
  Scanner keyboard = new Scanner(System.in);
  private static Player leader = player1;

  // Methods
  /**
  * This method plays every round
  */
  public void play() {
    
    while (round >= 1) {
      this.dealNum(round);
      playRound();
      round--;
      }
  }

  /**
  * This method sets trump and plays a single round
  */
  public void playRound() {
    this.trump = myDeck.deal();
    
    for (int i = round; i >= 1; i--) {
      System.out.println("This is the Trump: ");
      trump.display();
      playTurn();
    }

  }

  /**
  * This method gives everyone a turn
  */
  public void playTurn() {
    // Everyone gets to play a card
    playerTurn(player1);
    playerTurn(player2);

    // Player winner = getWinner();   

    System.out.println(" ");
    System.out.println("The table:"); 
    displayTable();
    System.out.println(" ");

  }
  
  /**
  * This method gives a single player a turn
  * @param player determines which player's turn it is
  @ param cardToPlay Card the player played
  */
  public void playerTurn(Player player) {
    // A single player plays a card1
    player.displayHand();
    System.out.println("What card do you want to play, " + player.getName() + "?");
    int cardNumber = Integer.valueOf(keyboard.nextLine()) - 1;

    Card cardToPlay  = player.playCard(cardNumber);
    System.out.print("You played: ");
    cardToPlay.display();
    System.out.println(" ");
    table.add(cardToPlay);

  }

  /**
  * Figure out who won
  */
  public Card getWinner() {
    Card leadingCard = table.get(0);
    Card winningCard = table.get(0);
    Card led = table.get(0);
      for (int i = 0; i < table.size(); i++) {

      }
    
    return winningCard; 
  }

  public void compareCards(Card card1, Card card2) {

  }

  // Displays all the cards currently on the table
  public static void displayTable() {
      for (int i = 0; i < table.size(); i++) {
          if (table.get(i) != null) {
              System.out.print(table.get(i).format() + " ");
          }
      }

      System.out.println();
      System.out.println();
  }

  /**
  * This method deals every player's hand
  * @param numDealt how many cards to deal
  */
  public void dealNum(int numDealt) {
    for (int i = 1; i <= numDealt; i++) {
      Card newCard1 = myDeck.deal();
      Card newCard2 = myDeck.deal();
    
      player1.giveCard(newCard1);
      player2.giveCard(newCard2);
    }
  }
}