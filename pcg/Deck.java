package pcg;
import java.io.Serializable;
import java.util.ArrayList;


public class Deck implements Serializable {
	private static final long serialVersionUID = 99L;
	
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
			if(c.getName().equals(name))
			{
				index = cpt;
				break;
			}
			cpt++;
		}
		return index;
	}
	
	public ArrayList<Card> findCardsByType(CardType cardType)
	{
		ArrayList<Card> cards = new ArrayList<>();
		for(Card c : deck)
		{
			if(c.getType() == cardType)
			{
				cards.add(c);
			}
		}
		return cards;
	}
	
	public ArrayList<Card> findCardsByCollection(String collection)
	{
		ArrayList<Card> cards = new ArrayList<>();
		for(Card c : deck)
		{
			if(c.getCollection().equals(collection))
			{
				cards.add(c);
			}
		}
		return cards;
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
	
	public void displayDeck()
	{
		for(Card c : deck)
		{
			c.display();
		}
	}
	
	public void displayByType(CardType cardType)
	{
		for(Card c : findCardsByType(cardType))
		{
			c.display();
		}
	}
	
	public void displayByCollection(String collection)
	{
		for(Card c : findCardsByCollection(collection))
		{
			c.display();
		}
	}
}
