import java.util.EnumMap;

/**
 * 
 */

/**
 * @author Khaleeq Ahmad
 * 
 */
public class RankMap
{
    EnumMap<Rank, Integer> ranks = new EnumMap<Rank, Integer>(Rank.class);

    RankMap()
    {
	ranks.put(Rank.two, 2);
	ranks.put(Rank.three, 3);
	ranks.put(Rank.four, 4);
	ranks.put(Rank.five, 5);
	ranks.put(Rank.six, 6);
	ranks.put(Rank.seven, 7);
	ranks.put(Rank.eight, 8);
	ranks.put(Rank.nine, 9);
	ranks.put(Rank.ten, 10);
	ranks.put(Rank.jack, 10);
	ranks.put(Rank.queen, 10);
	ranks.put(Rank.king, 10);
	ranks.put(Rank.ace, 11);
    }
    
    int getRank(Rank key)
    {
	return ranks.get(key);
    }
}
