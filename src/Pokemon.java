import java.util.ArrayList;


public class Pokemon extends Card {
	private int health;
	private PokemonType pokemonType;
	private ArrayList<PokemonType> weakness;
	private ArrayList<PokemonType> resistance;
	private String description;
	
	/* CONSTRUCTORS */
	public Pokemon()
	{
		super();
		health = 0;
		pokemonType = PokemonType.NORMAL;
		description = "default";
	}
	public Pokemon(int health, PokemonType pokemonType,
			ArrayList<PokemonType> weakness, ArrayList<PokemonType> resistance,
			String description) {
		super();
		this.health = health;
		this.pokemonType = pokemonType;
		this.weakness = weakness;
		this.resistance = resistance;
		this.description = description;
	}

	
}
