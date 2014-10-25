import java.util.Scanner;


public class UserInterface {
	
	private Scanner scan;
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
		switch(cardTypeChoice())
		{
		case POKEMONCARD: c = new Pokemon(); break;
		case TRAINERCARD: c = new Pokemon(); break;
		case ENERGYCARD: c = new Pokemon(); break;
		default: c = new Pokemon(); System.out.println("There is a problem");
		}
		c.create(cardType);
		deck.addCard(c);
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
			}
			else
			{
				System.out.println("No card have this name, try another one");
			}
		}
		while(goodAnswer);
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
		while(goodAnswer);
	}
	
	private UserChoice userChoiceMenu()
	{
		int userChoice;
		boolean goodAnswer=false;
		do
		{
			System.out.println("what do you want to do ?\n");
			System.out.println("_ add a card (type '1')");
			System.out.println("_ delete a card (type '2')");
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
		while(goodAnswer);
		
		return UserChoice.values()[userChoice];
	}

	private CardType cardTypeChoice()
	{		
		int cardType;
		boolean goodAnswer=false;
		do
		{
			System.out.println("Enter the type of the card\n");
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
		while(goodAnswer);
				
		return CardType.values()[cardType];
	}
	
	public void infinteLoop()
	{
		boolean quit = false;
		System.out.println("Welcome on our Pokemon card handler !!\n\n");
		
		do
		{	
			switch(userChoiceMenu())
			{
			case AddCard: addCard(); break;
			case DelCard: delCard(); break;
			case DisplayCard: displayCard(); break;
			case Quit: quit = true; scan.close(); break;
			default: System.out.println("There is a problem");
			}
		}
		while(!quit);
	}
}
