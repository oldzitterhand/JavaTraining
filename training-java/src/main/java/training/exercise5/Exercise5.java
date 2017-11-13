package training.exercise5;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Exercise5 - case-switch
 */
public class Exercise5
{
    public static void main( String[] args )
    {
    	int min = 0;
    	int max = 5;
    	
    	for (int i = 0; i < 10; i++) {
    		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

    		System.out.println("Random number is: " + randomNum);
    		
    		// Task: Use a case-switch-statement to print the numbers from 0 to 5 in their textual
    		//       representation (zero, one, two, etc.) to the command line.
    		
    	}

    }
}
