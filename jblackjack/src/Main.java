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

    static Scanner nameIn = new Scanner(System.in);
    static Scanner optionIn = new Scanner(System.in);

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
	hitOrStand();
	//	a player makes a bet
	//	- a player gets dealt two cards, and sees one of the dealer's cards
	//	- the player can stay or hit up to 21; if they go above 21,they automatically lose
	//	- the dealer automatically hits until 17 or higher; if they go above 21, they automatically lose
	//	- if both hands are 21 or below, the highest hand wins (your choice what to do on a tie)
	//	- player wins or loses based on the hand analysis

    }

    public static void newPlayer()
    {
	System.out.println("What's your name?");
	String name = nameIn.nextLine();
	user = new Player(name);
    }

    public static void hitOrStand()
    {
	user.viewHand();
	System.out.println("'Hit'" + " or " + "'Stand'");
	String answer = optionIn.nextLine().toLowerCase();
	System.out.println();

	if (answer.equals("hit"))
	{
	    hit(user);
	}
	else if (answer.equals("stand"))
	{
	    stand(user);
	}
	else
	{
	    System.out.println("That was not a valid option, please try again.");
	    hitOrStand();
	}
    }

    /**
     * @param p
     */
    private static void stand(Player p)
    {
	System.out.println("You have selected 'stand'.");
	System.out.println();
    }

    /**
     * @param p
     */
    private static void hit(Player p)
    {
	System.out.println("You have selected hit.");
	p.hit(deck);	
    }


}
