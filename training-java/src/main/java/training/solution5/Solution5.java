package training.solution5;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Solution5 - switch-case
 */
public class Solution5
{
    public static void main( String[] args )
    {
    	int min = 0;
    	int max = 5;
    	
    	for (int i = 0; i < 10; i++) {
    		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

    		System.out.print("Random number is: " + randomNum + " - ");
    		
    		switch (randomNum) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("Unknown number");
				break;
			}
    		
    	}

    }
}
