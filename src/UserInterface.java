import java.util.Scanner;


public class UserInterface {
	
	public void addCard()
	{
		
	}
	
	public void delCard()
	{
		
	}

	public void infinteLoop()
	{
		boolean quit = false;
		Scanner scan = new Scanner(System.in);
		String response;
		
		do
		{
			System.out.println("Welcome on our Pokemon card handler !!\n\n");
			System.out.println("what do you to do ?\n");
			System.out.println("_ add a card (type 'add')");
			System.out.println("_ delete a card (type 'delete')");
			System.out.println("_ quit this program (type 'quit')");
			
			response = scan.nextLine().toLowerCase();
			
			switch(response)
			{
			case "add": addCard(); break;
			case "delete": delCard(); break;
			case "quit": quit = true; scan.close(); break;
			default: System.out.println("You didn't type a good character, try again");
			}
			if(quit) break;
		}
		while(true);
	}
}
