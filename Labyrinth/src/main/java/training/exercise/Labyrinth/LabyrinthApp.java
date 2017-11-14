package training.exercise.Labyrinth;

/**
 * The application can find a way through a labyrinth and print the path on the console.
 * 
 * @author Patrick Metz
 */
public class LabyrinthApp 
{
    public static void main( String[] args ) {
    	String filePath = "test.txt";
    	try {
			LabyrinthSolver solver = new LabyrinthSolver(filePath);
			solver.printLabyrinth();

			sleep(2500);
			
			solver.findWay();
			solver.printLabyrinth();
		} catch (Exception e) {
			System.err.println("Failed to read file " + filePath);
		}
    }
    
    private static void sleep(long millis) {
    	try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// yeah... pretty unlikely
		}
    }
}
