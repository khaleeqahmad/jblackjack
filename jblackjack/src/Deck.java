import java.util.Collections;
import java.util.Stack;

/**
 * 
 */

/**
 * @author Khaleeq Ahmad
 * 
 */
public class Deck
{
    static Stack<Card> d = new Stack<Card>();

    Deck()
    {
	buildDeck();
    }

    /**
     * 
     */
    private static void buildDeck()
    {
	if (!d.isEmpty())
	{
	    clear();
	}
	for (Suit suit : Suit.values())
	{
	    for (Rank rank : Rank.values())
	    {
		Card currentCard = new Card(suit, rank);
		place(currentCard);
	    }
	}

	shuffle();
    }

    private static void clear()
    {
	d.clear();
    }

    private static Card draw()
    {
	return d.pop();
    }

    private static Card peek()
    {
	return d.peek();
    }

    private static void place(Card c)
    {
	d.addElement(c);
    }

    private static void shuffle()
    {
	Collections.shuffle(d);
    }

//    public static void main(String[] args)
//    {
//	buildDeck();
//	System.out.println("After build" + d.size());
//
//	Card c = draw();
//	System.out.println("After store draw" + d.size());
//
//	System.out.println(c);
//	System.out.println("After print draw" + d.size());
//
//	place(c);
//	System.out.println("After place back" + d.size());
//
//	System.out.println(peek());
//	System.out.println("After peek" + d.size());
//
//	shuffle();
//	System.out.println("Shuffle: " + peek());
//	System.out.println("Shuffle size" + d.size());
//
//	shuffle();
//	System.out.println("Shuffle: " + draw());
//	System.out.println("Shuffle size" + d.size());
//    }

}
