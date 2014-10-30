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
	
	public int findCard(String name)
	{
		int index = -1;
		int cpt = 0;
		for(Card c : deck)
		{
			if(c.getName().contains(name))
			{
				index = cpt;
				break;
			}
			cpt++;
		}
		return index;
	}
	
	public boolean modifyCard(String name)
	{
		int index = findCard(name);
		if(index >= 0)
		{
			deck.get(index).modifyCard();
			deck.get(index).create();
			return true;
		}
		return false;
	}
	
	public boolean delCard(String name)
	{
		int index = findCard(name);
		if(index >= 0)
		{
			deck.remove(deck.get(index));
			return true;
		}
		return false;
	}
	
	public boolean displayCard(String name)
	{
		int index = findCard(name);
		if(index >= 0)
		{
			deck.get(index).display();
			return true;
		}
		return false;
	}
}
