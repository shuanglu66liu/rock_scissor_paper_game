import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GameRunner {
    public static void main( String[] args)
    {
        /*Use HashMap to store the key value pair of number and its choice*/
    	HashMap<Integer, String> choices = new HashMap<>();
    	choices.put(0, "Rock");
    	choices.put(1, "Scissors");
    	choices.put(2, "Paper");

        /*Declare variables and objects*/
        int u; // User's Choice
        int c; // Computer's Choice
        Scanner in = new Scanner(System.in);//Object for getting input from keyboard
        Random myRand = new Random(); //Object for Generating Random Numbers
        
        /*Show user their choices */
        System.out.println("0. Rock");
        System.out.println("1. Scissors");
        System.out.println("2. Paper");
        
        boolean continueGame  = true; //control when the game stops
        
        while (continueGame) {
	        System.out.println("Please enter your move (0,1,2): ");
	        
	        u = in.nextInt(); // Get user input from keyboard
	        
	        c = myRand.nextInt(3); // Make a random number between 0 and 2 for the computer's choice.
	        
	        /* Show the results to the user */
	        System.out.println("Computer: " + choices.get(c) + "     You: " + choices.get(u));
	        
	        if ( u==c )
	        {
	            System.out.println("Tie Game!");
	        }
	        else if ( (u - c==-1) || (u==2 && c==0)  )
	        {
	            System.out.println("You Win :D");
	        }
	        else
	        {
	            System.out.println("You Lose :(");
	        }
	        System.out.println("Do you want to play again? [y/n] ");
	        
	        String next = in.next().toLowerCase();
	        if (next.compareTo("n")==0) {
		        System.out.println("Exit the game.");

	        	continueGame = false;
	        	System.exit(0);
	        }
	        	
        }
        in.close();
	        
    }
}
