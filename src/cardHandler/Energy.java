package cardHandler;

public class Energy extends Card {
	private static final long serialVersionUID = 4L;
	
	public PokemonType pokemonType;
	
	public Energy()
	{
		super();
		pokemonType = PokemonType.NORMAL;
	}
	
	public Energy(PokemonType pokemonType)
	{
		this.pokemonType = pokemonType;
	}
	
	public void setCard(String name, CardType cardType, String collection, PokemonType pokemonType)
	{
		super.setCard(name, cardType, collection);
		this.pokemonType = pokemonType;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Type : "+pokemonType);
	}
	
	public String toString()
	{
		return "Type : "+pokemonType+"\n";
	}
}
