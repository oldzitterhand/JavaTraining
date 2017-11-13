package training.solution4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Solution4
 * 
 * Beispiellösung für die Aufgabe aus Exercise4
 *
 */
public class Solution4
{
	private static final String FILE_PATH = "src/main/java/training/exercise4/lorem_ipsum.txt";
	
    public static void main( String[] args )
    {
    	// Lösung Aufgabe 4
    	int status = 0;
    	
    	Path path = Paths.get(FILE_PATH);
    	try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
    	} catch (IOException e) {
    		System.err.println("Failed to read file!");
			e.printStackTrace();
			status = 1;
		} finally {
			System.out.println("Done!");
			System.exit(status);
		}
    }
}
