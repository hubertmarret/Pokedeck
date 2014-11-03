package pcg;
import java.util.Scanner;


public class UserInterface {
	
	public static Scanner scan;
	private Deck deck;
	
	
	public UserInterface()
	{
		scan = new Scanner(System.in);
		deck = new Deck();
	}
	
	public void addCard()
	{
		Card c;
		CardType cardType = cardTypeChoice();
		switch(cardType)
		{
			case POKEMONCARD: c = new Pokemon(); break;
			case TRAINERCARD: c = new Pokemon(); break;
			case ENERGYCARD: c = new Pokemon(); break;
			default: c = new Pokemon(); System.out.println("There is a problem");
		}
		c.createCard(cardType);
		c.create();
		deck.addCard(c);
	}
	
	public void modifyCard()
	{
		String name;
		boolean goodAnswer=false;
		do
		{
			System.out.println("Enter the name of the card you want to modify");
			name = scan.nextLine();
			if(deck.modifyCard(name))
			{
				goodAnswer = true;
				System.out.println("The card "+name+" has been modified");
			}
			else
			{
				System.out.println("No card have this name, try another one");
			}
		}
		while(!goodAnswer);
	}
	
	public void delCard()
	{
		String name;
		boolean goodAnswer=false;
		do
		{
			System.out.println("Enter the name of the card you want to delete");
			name = scan.nextLine();
			if(deck.delCard(name))
			{
				goodAnswer = true;
				System.out.println("The card "+name+" has been deleted");
			}
			else
			{
				System.out.println("No card have this name, try another one");
			}
		}
		while(!goodAnswer);
	}
	
	public void displayCard()
	{
		String name;
		boolean goodAnswer=false;
		do
		{
			System.out.println("Enter the name of the card you want to display");
			name = scan.nextLine();
			if(deck.displayCard(name))
			{
				goodAnswer = true;
			}
			else
			{
				System.out.println("No card have this name, try another one");
			}
		}
		while(!goodAnswer);
	}
	
	public void displayPokedeck()
	{
		deck.displayDeck();
	}
	
	public void findCardsByType()
	{
		CardType cardType = cardTypeChoice();
		deck.displayByType(cardType);
	}

	public void findCardsByCollection()
	{
		System.out.println("Enter the collection");
		String collection = scan.nextLine();
		deck.displayByCollection(collection);
	}
	
	private CardType cardTypeChoice()
	{		
		int cardType;
		boolean goodAnswer=false;
		do
		{
			System.out.println("Enter the type of the card");
			System.out.println("_ pokemon (type '0')");
			System.out.println("_ trainer (type '1')");
			System.out.println("_ energy (type '2')");
			cardType = scan.nextInt();
			scan.nextLine();
			if(cardType >= 0 && cardType < CardType.values().length)
			{
				goodAnswer = true;
			}
			else
			{
				System.out.println("wrong answer, try again");
			}
		}
		while(!goodAnswer);
				
		return CardType.values()[cardType];
	}
	
	private UserChoice userChoiceMenu()
	{
		int userChoice;
		boolean goodAnswer=false;
		do
		{
			System.out.println("\nWhat do you want to do ?");
			System.out.println("_ add a card (type '1')");
			System.out.println("_ modify a card (type '2')");
			System.out.println("_ delete a card (type '3')");
			System.out.println("_ display a card (type '4')");
			System.out.println("_ display the pokedeck (type '5')");
			System.out.println("_ display the cards of a chosen type (type '6')");
			System.out.println("_ display the cards of a chosen collection (type '7')");
			System.out.println("_ quit this program (type '0')");
			userChoice = scan.nextInt();
			scan.nextLine();
			if(userChoice >= 0 && userChoice < UserChoice.values().length)
			{
				goodAnswer = true;
			}
			else
			{
				System.out.println("wrong answer, try again");
			}
		}
		while(!goodAnswer);
		
		return UserChoice.values()[userChoice];
	}
	
	public void infinteLoop()
	{
		boolean quit = false;
		System.out.println("Welcome on our Pokemon card handler !!\n\n");
		do
		{	
			UserChoice userChoice = userChoiceMenu();
			switch(userChoice)
			{
				case ADDCARD: addCard(); break;
				case MODIFYCARD: modifyCard(); break;
				case DELCARD: delCard(); break;
				case DISPLAYCARD: displayCard(); break;
				case DISPLAYPOKEDECK: displayPokedeck(); break;
				case FINDCARDSBYTYPE: findCardsByType(); break;
				case FINDCARDSBYCOLLECTION: findCardsByCollection(); break;
				case QUIT: quit = true; scan.close(); break;
				default: System.out.println("There is a problem");
			}
		}
		while(!quit);
		System.out.println("Thank you for playing !!");
	}
}
