package training.solution3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Solution3
 * 
 * Beispiellösung für die Aufgabe aus Exercise3
 *
 */
public class Solution3
{
    public static void main( String[] args )
    {
    	
    	// Lösung Aufgabe 3
    	int status = 0;
    	
    	System.out.println("Writing command line args to file...");
    	
    	Path path = Paths.get("target/output.txt");
    	try (BufferedWriter writer = Files.newBufferedWriter(path)) {
        	for (String arg : args) {
            	System.out.println("Writing: " + arg);
        		writer.write(arg);
        		writer.newLine();
        	}
    	} catch (IOException e) {
    		System.err.println("Failed to write file!");
			e.printStackTrace();
			status = 1;
		} finally {
			System.out.println("Done!");
			System.exit(status);
		}
    }
}
