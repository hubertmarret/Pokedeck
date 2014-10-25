import java.util.ArrayList;


public class Attack {
	private String name;
	private String description;
	private int power;
	private ArrayList<PokemonType> energyCost;
	
	/* CONSTRUCTORS */
	public Attack()
	{
		name = "default";
		power = 0;
	}
	public Attack(String name, String description, int power,
			ArrayList<PokemonType> energyCost) {
		this.name = name;
		this.description = description;
		this.power = power;
		this.energyCost = energyCost;
	}

	
}
