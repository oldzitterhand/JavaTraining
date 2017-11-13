package training.exercise2;

/**
 * Exercise2 - Exceptions
 */
public class Exercise2 
{
    public static void main( String[] args )
    {
        // Task: The method "process" throws an IllegalArgumentException
        //       1. "Catch" the exception and print the stack trace.
        //       2. "Finally" print a line on the console outputting the text "Done!".
        //       3. Return an exit code when your program terminates.
    	
    	process();
    }
    
    /**
     * Something will go wrong in this method.
     */
    private static void process() {
    	throw new IllegalArgumentException("Uuups, something went wrong here!");
    }
}
