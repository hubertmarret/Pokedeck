import java.util.ArrayList;


public class Deck {
	private ArrayList<Card> deck;
	
	public Deck()
	{
		deck = new ArrayList<Card>();
	}
	
	public void addCard(Card c)
	{
		deck.add(c);
	}
	
	public void delCard(String name)
	{
		for(Card c : deck)
		{
			if(c.getName() == name)
			{
				deck.remove(c);
			}
		}
	}
}
