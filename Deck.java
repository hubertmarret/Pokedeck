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
	
	public boolean delCard(String name)
	{
		boolean isInDeck=false;
		for(Card c : deck)
		{
			if(c.getName() == name)
			{
				deck.remove(c);
				isInDeck = true;
				break;
			}
		}
		return isInDeck;
	}
	public boolean displayCard(String name)
	{
		boolean isInDeck=false;
		for(Card c : deck)
		{
			if(c.getName() == name)
			{
				c.display();
				isInDeck = true;
				break;
			}
		}
		return isInDeck;
	}
}
