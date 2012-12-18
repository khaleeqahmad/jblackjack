import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author Khaleeq Ahmad
 * 
 */
public class Hand extends CardStack
{
    ArrayList<Card> h;
    int value;

    Hand()
    {
	h = new ArrayList<Card>();
	value = 0;
    }

    String view()
    {
	return h.toString();
    }

    void choose(Card c)
    {
	h.remove(c);
    }

    void raiseValue(int val)
    {
	value += val;
    }

    boolean contains(Card c)
    {
	Iterator<Card> it = h.iterator();
	while (it.hasNext())
	{
	    Card current = it.next();
	    if (current == c)
		return true;
	}
	return false;
    }

    boolean contains(Rank r)
    {
	Iterator<Card> it = h.iterator();
	while (it.hasNext())
	{
	    Card current = it.next();
	    if (current.getRank() == r)
		return true;
	}
	return false;
    }

    boolean contains(Suit s)
    {
	Iterator<Card> it = h.iterator();
	while (it.hasNext())
	{
	    Card current = it.next();
	    if (current.getSuit() == s)
		return true;
	}
	return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see CardStack#place(Card)
     */
    @Override
    public void add(Card c)
    {
	h.add(c);
    }

    /*
     * (non-Javadoc)
     * 
     * @see CardStack#shuffle()
     */
    @Override
    public void shuffle()
    {
	Collections.shuffle(h);
    }

    /*
     * (non-Javadoc)
     * 
     * @see CardStack#clear()
     */
    @Override
    public void clear()
    {
	h.clear();
    }

}