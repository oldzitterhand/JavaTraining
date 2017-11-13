package training.solution2;

/**
 * Solution2
 * 
 * Beispiellösung für die Aufgabe aus Exercise2
 *
 */
public class Solution2
{
    public static void main( String[] args )
    {
    	
    	// Lösung Aufgabe 2
    	int status = 0;
    	
    	try {
    		process();
    	} catch (IllegalArgumentException exception) {
    		System.out.println("Caught exception!");
    		exception.printStackTrace();
    		status = 1;
    	} finally {
    		System.out.println("Done!");
    		System.exit(status);
    	}

    }
    
    
    /**
     * Something will go wrong in this method.
     */
    private static void process() {
    	throw new IllegalArgumentException("Uuups, something went wrong here!");
    }

}
