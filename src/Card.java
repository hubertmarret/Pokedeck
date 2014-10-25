import java.util.Scanner;


public abstract class Card {
	protected String name;
	protected CardType cardType;
	protected String collection;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void create()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name of the card");
		name = scan.nextLine();
		System.out.println("Enter the type of the card ('pokemon','trainer','energy')");
		String str = scan.nextLine();
		switch(str)
		{
		case "pokemon": cardType = CardType.POKEMONCARD; break;
		case "trainer": cardType = CardType.TRAINERCARD; break;
		case "energy": cardType = CardType.ENERGYCARD; break;
		default: System.out.println("not an option");
		}
		System.out.println("Enter the collection of the card");
		collection = scan.nextLine();
		
		scan.close();
	}
	
}
