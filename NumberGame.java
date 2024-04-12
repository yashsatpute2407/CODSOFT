package CodSoft;
import java.util.Scanner;
import java.util.Random;

	public class NumberGame 
	{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        boolean playAgain = true;
	        int totalScore = 0;

	        System.out.println("Welcome to the Number Guessing Game!");

	        while (playAgain) 
	        {
	            int attempts = 0;
	            int secretNumber = random.nextInt(100) + 1;
	            boolean guessedCorrectly = false;

	            System.out.println("\nI have chosen a number between 1 and 100. Can you guess it?");

	            while (!guessedCorrectly && attempts < 10) 
	            { 
	                try 
	                {
	                    System.out.print("Enter your guess: ");
	                    int guess = scanner.nextInt();
	                    attempts++;

	                    if (guess < secretNumber) 
	                    {
	                        System.out.println("Too low! Try again.");
	                    } 
	                    else if (guess > secretNumber) 
	                    {
	                        System.out.println("Too high! Try again.");
	                    } 
	                    else 
	                    {
	                        System.out.println("Congratulations! You've guessed the number " + secretNumber +
	                                " in " + attempts + " attempts!");
	                        totalScore++;
	                        guessedCorrectly = true;
	                    }
	                } 
	                catch (Exception e)
	                {
	                    System.out.println("Please enter a valid integer.");
	                    scanner.next(); 
	                }
	            }

	            if (!guessedCorrectly) 
	            {
	                System.out.println("\nSorry, you've used all your attempts. The correct number was " + secretNumber + ".");
	            }

	            System.out.print("\nDo you want to play again? (yes/no): ");
	            String playAgainInput = scanner.next().toLowerCase();
	            if (!playAgainInput.equals("yes")) 
	            {
	                playAgain = false;
	            }
	        }

	        System.out.println("\nYour total score is: " + totalScore);
	        scanner.close();
	    }
	}
	
