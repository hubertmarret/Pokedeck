

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
	
	public abstract void create();
	
	public void createCard(CardType cardType)
	{
		System.out.println("Enter the name of the card");
		name = UserInterface.scan.nextLine();
		
		this.cardType = cardType;
		
		System.out.println("Enter the collection of the card");
		collection = UserInterface.scan.nextLine();
	}
	
	public void modifyCard()
	{
		System.out.println("Enter the name of the card");
		name = UserInterface.scan.nextLine();
				
		System.out.println("Enter the collection of the card");
		collection = UserInterface.scan.nextLine();
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("CardType : "+cardType);
		System.out.println("Collection : "+collection);
	}
}
