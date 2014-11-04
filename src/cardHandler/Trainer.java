package cardHandler;

public class Trainer extends Card {
	private static final long serialVersionUID = 3L;
	
	private String role;
	private String description;
	
	public Trainer()
	{
		super();
		role = "unknown";
		description = "default";
	}
	
	public Trainer(String role, String description)
	{
		super();
		this.role = role;
		this.description = description;
	}
	
	public void setCard(String name, CardType cardType, String collection, String role, String description)
	{
		super.setCard(name, cardType, collection);
		this.role = role;
		this.description = description;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Role : "+role);
		System.out.println("Description : "+description+"\n");
	}
	
	public String toString()
	{
		return "Role : "+role+"\nDescription : "+description+"\n";
	}
}
