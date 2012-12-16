import java.util.ArrayList;
import java.util.Collections;

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

    Hand()
    {
	h = new ArrayList<Card>();
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