
import java.util.Scanner;

public class diceClass2 {

	public static void displayMessage()
	{
		Scanner Input = new Scanner(System.in);
		
		int one = 1 + (int)(Math.random()*6);
		int two = 2 + (int)(Math.random()*12);
		int three = 3 + (int)(Math.random()*18);
		String playerAnswer;
		int playerInput;
		int count = 1;
	

			System.out.print("Choose how many dices do you want to play with between 1-3");
			playerInput = Input.nextInt();
			
			if ( playerInput == 1 )
			{
				System.out.println( "Guess your number between 1-6: ");
				playerInput = Input.nextInt();
				
				if ( one == playerInput ) 
				{
					System.out.println( "You win!");
				}
				else if ( one != playerInput )
				{
					System.out.println("You lose!");
				}
				else if ( playerInput > 6 || playerInput < 1)
				{
					System.out.println( "Invalid Input");
				}
				
				System.out.println( "Computer guess is " + one );
				
			}
			if ( playerInput == 2 )
			{
				System.out.println( "Guess your number between 1-12: ");
				playerInput = Input.nextInt();
				
				if ( two == playerInput ) 
				{
					System.out.println( "You win!");
				}
				else if ( two != playerInput )
				{
					System.out.println("You lose!");
				}
				else if ( playerInput > 12 || playerInput < 1)
				{
					System.out.println( "Invalid Input");
				}
				
				System.out.println( "Computer guess is " + two );
				
			}
			if ( playerInput == 3 )
			{
				System.out.println( "Guess your number between 1-18: ");
				playerInput = Input.nextInt();
				
				if ( three == playerInput ) 
				{
					System.out.println( "You win!");
				}
				else if ( three != playerInput )
				{
					System.out.println("You lose!");
				}
				else if ( playerInput > 18 || playerInput < 1)
				{
					System.out.println( "Invalid Input");
				}
				
				System.out.println( "Computer guess is " + three );
				
			}
			
		System.out.println( "Thank for playing. Goodbye!");
	}
}

