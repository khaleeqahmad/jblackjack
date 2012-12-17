import java.util.Scanner;

/**
 * 
 */

/**
 * @author Khaleeq Ahmad
 * 
 */
public class Main
{
    public static RankMap rankmap = new RankMap();

    static Scanner in = new Scanner(System.in);
    
    static Player user;
    static Player computer = new Player("Computer");
    
    static Deck deck = new Deck();

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	
	newPlayer();
//	a player makes a bet
//	- a player gets dealt two cards, and sees one of the dealer's cards
//	- the player can stay or hit up to 21; if they go above 21,they automatically lose
//	- the dealer automatically hits until 17 or higher; if they go above 21, they automatically lose
//	- if both hands are 21 or below, the highest hand wins (your choice what to do on a tie)
//	- player wins or loses based on the hand analysis

	
	deck.draw();

    }

    public static void newPlayer()
    {
	System.out.println("What's your name?");
	String name = in.nextLine();
	user = new Player(name);
    }
    

    
    public static void hit()
    {
	
    }

}
