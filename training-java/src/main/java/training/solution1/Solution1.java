package training.solution1;

/**
 * Solution1
 * 
 * Beispiellösung für die Aufgabe aus Exercise1
 *
 */
public class Solution1 
{
    public static void main( String[] args )
    {
    	
    	// Lösung Aufgabe 1a
    	System.out.println("Args from command line: ");
    	for (String arg : args) {
        	System.out.println(arg);
        }
    	
    	// Lösung Aufgabe 1b
    	System.out.println("Argument #2 from command line: ");
    	if (args.length > 1) {
    		System.out.println(args[1]);
    	}
    }
}
