/**
 * 
 */

/**
 * @author Khaleeq Ahmad
 * 
 */
public class Player
{
    static String name;
    int score;
    static Hand hand = new Hand();

    Player(String name)
    {
	this.name = name;
    }

    public String toString()
    {
	return name + ": " + hand;
    }

    public static void pickUp(Deck d, int n)
    {
	for (int i = 0; i < n; i++)
	{
	    Card top = d.draw();
	    hand.add(top);

	    Rank thisRank = top.rank;
	    RankMap map = Main.rankmap;
	    int value = map.getRank(thisRank);
	    hand.raiseValue(value);
	    
	    //if (value > 21) && hand.contains(Ace)
	    //	value = value - 10;
	    
	    System.out.println(top + " has been added to " + name + "'s hand.");
	}
	
	viewHand();
    }

    public static void viewHand()
    {
	System.out.println(name + "'s hand: " +hand.view());
    }
    
    public void hit(Deck d)
    {
	if (hand.value < 21)
	    pickUp(d, 1);
	else
	    lost();
    }
    


    /**
     * 
     */
    private static void lost()
    {
	System.out.println(name + "'s hand has reached " + hand.value);
	System.out.println(name + " has lost the game.");
    }

    private static void won()
    {
	if (hand.value == 21)
	{
	    System.out.println(name + "'s hand has reached " + hand.value);
	}
	System.out.println(name + " has won the game.");
    }

}
