package pcg;
import java.util.Scanner;


public class Pokemon extends Card {
	private static final long serialVersionUID = 2L;
	
	private int health;
	private PokemonType pokemonType;
	private String description;
	
	public Pokemon()
	{
		super();
		health = 0;
		pokemonType = PokemonType.NORMAL;
		description = "default";
	}
	public Pokemon(int health, PokemonType pokemonType, String description) {
		super();
		this.health = health;
		this.pokemonType = pokemonType;
		this.description = description;
	}
	
	private PokemonType pokemonTypeChoice(Scanner scan)
	{
		int pokemonType;
		boolean goodAnswer=false;
		do
		{
			System.out.println("Enter the type of the pokemon\n");
			System.out.println("normal('0'), fire('1'), water('2'), grass('3'), lightning('4'), psychic('5')");
			System.out.println("fighting('6'), darkness('7'), metal('8'), fairy('9'), dragon('10')");
			pokemonType = scan.nextInt();
			scan.nextLine();
			if(pokemonType >= 0 && pokemonType < PokemonType.values().length)
			{
				goodAnswer = true;
			}
			else
			{
				System.out.println("wrong answer, try again");
			}
		}
		while(!goodAnswer);
				
		return PokemonType.values()[pokemonType];
	}
	
	public void create()
	{
		System.out.println("Enter the health of the pokemon");
		health = UserInterface.scan.nextInt();
		UserInterface.scan.nextLine();
		
		pokemonType = pokemonTypeChoice(UserInterface.scan);
		
		System.out.println("Enter the description of the pokemon");
		description = UserInterface.scan.nextLine();
	}

	public void display()
	{
		super.display();
		System.out.println("Health : "+health+" hp");
		System.out.println("Type : "+pokemonType);
		System.out.println("Description : "+description+"\n");
	}
	
}
