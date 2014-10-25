import java.util.Scanner;


public abstract class Card {
	protected String name;
	protected CardType cardType;
	protected String collection;
	
	protected Scanner scan;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void create(CardType cardType)
	{
		scan = new Scanner(System.in);
		
		System.out.println("Enter the name of the card");
		name = scan.nextLine();
		this.cardType = cardType;
		System.out.println("Enter the collection of the card");
		collection = scan.nextLine();
		
		scan.close();
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("CardType : "+cardType);
		System.out.println("Collection : "+collection);
	}
}
