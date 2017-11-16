package training.exercise.Labyrinth;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The labyrinth solver can read a labyrinth from a text-file, find the path through the labyrinth
 * and can print the labyrinth to the console.
 * 
 * @author Patrick Metz
 */
public class LabyrinthSolver {

	private Cell[][] labyrinth;
	
	private int startX = 0, startY = 0, endX = 0, endY = 0;
	private int width = 0, height = 0;
	
	private boolean found = false;
	
	public LabyrinthSolver(String filePath) throws Exception {
		labyrinth = readLabyrinth(filePath);
	}

	private Cell[][] readLabyrinth(String filePath) throws Exception {
		List<String> lines = readLinesFromFile(filePath);
		return createArrayFromLines(lines);
	}

	private Cell[][] createArrayFromLines(List<String> lines) {
		if (lines != null && !lines.isEmpty()) {
			
			// Tasks:
			// - Determine the height and width of the labyrinth.
			//   You will need these values to initialize the array.
			//   Take into account that not all lines might be of the same length (so find the longest line).
			// - Fill the cell array
			//   Read every line character for character and create a cell.
			//   Put the character into the cell. Also check if the cell is either the start- or end-point
			//   of the labyrinth and set this information as well.
			

			// Determine the height and width of the labyrinth here!
			
			
			Cell[][] labyrinth = new Cell[height][width];
			
			// Fill the array here!
			
			return labyrinth;
		}
		return new Cell[0][0];
	}
	
	private List<String> readLinesFromFile(String filePath) throws Exception {
		List<String> lines = new ArrayList<>();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			URL url = classLoader.getResource(filePath);
			lines = Files.readAllLines(Paths.get(url.toURI()));
		} catch (NullPointerException | IOException | URISyntaxException e) {
			throw e;
		}
		return lines;
	}

	public void findWay() {
		move(startY, startX);
	}
	
	private void move(int y, int x) {
		labyrinth[y][x].setVisited(true);
		
		
		// Tasks:
		// - you will need to find a way to stop the recursion
		// - move in the different directions (up, down, right, left)
		// Tipp:
		// - use the method "isReached()" from the Cell object
		// - use the method "setReached(boolean reached)" from the Cell object to mark your way

		
		
		putBreadcrumb(y, x);
	}

	private void putBreadcrumb(int y, int x) {
		// mark the correct way with an '@' and dead ends with a '.'
		if(labyrinth[y][x].isReached()) {
			labyrinth[y][x].setSymbol(Cell.PATH);
		} else {
			labyrinth[y][x].setSymbol(Cell.DEAD_END);
		}
	}

	private void markEndPoint(int y, int x) {
		found = true;
		labyrinth[y][x].setReached(true);
		labyrinth[y][x].setSymbol(Cell.PATH);
	}


	private boolean foundEndPoint(int y, int x) {
		return y == endY && x == endX; 
	}

	private boolean canMove(int y, int x) {
		if (isInBoundary(y, x) &&
				!Cell.WALL.equals(labyrinth[y][x].getSymbol()) &&
				!labyrinth[y][x].isVisited() && !found) {
			return true;
		}
		return false;
	}

	private boolean isInBoundary(int y, int x) {
		return y >= 0 && y < height && x >= 0 && x < width;
	}

	public Cell[][] getLabyrinth() {
		return labyrinth;
	}
	
	public void printLabyrinth() {
		for (int y = 0; y < labyrinth.length; y++) {
			for (int x = 0; x < labyrinth[y].length; x++) {
				if (x != (labyrinth[y].length - 1))
					System.out.print(labyrinth[y][x].getSymbol());
				else
					System.out.println(labyrinth[y][x].getSymbol());
			}
		}
		System.out.println("");
	}

	public int getStartX() {
		return startX;
	}

	public int getStartY() {
		return startY;
	}

	public int getEndX() {
		return endX;
	}

	public int getEndY() {
		return endY;
	}
}
