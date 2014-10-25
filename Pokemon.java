import java.util.Scanner;


public class Pokemon extends Card {
	private int health;
	private PokemonType pokemonType;
	private String description;
	
	/* CONSTRUCTORS */
	public Pokemon()
	{
		health = 0;
		pokemonType = PokemonType.NORMAL;
		description = "default";
	}
	public Pokemon(int health, PokemonType pokemonType, String description) {
		this.health = health;
		this.pokemonType = pokemonType;
		this.description = description;
	}
	
	private PokemonType pokemonTypeChoice()
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
		while(goodAnswer);
				
		return PokemonType.values()[pokemonType];
	}
	
	public void create(CardType cardType)
	{
		scan = new Scanner(System.in);
		
		System.out.println("Enter the health of the pokemon");
		health = scan.nextInt();
		scan.nextLine();
		
		pokemonType = pokemonTypeChoice();
		
		System.out.println("Enter the description of the pokemon");
		description = scan.nextLine();
		
		scan.close();
	}

	public void display()
	{
		System.out.println("Health : "+health+"hp");
		System.out.println("Type : "+pokemonType);
		System.out.println("Description : "+description);
	}
	
}
