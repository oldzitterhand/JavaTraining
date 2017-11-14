package training.solution.Labyrinth;

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
			height = lines.size();
			for (String line : lines) {
	        	width = Math.max(width, line.length());
	        }
			
			Cell[][] labyrinth = new Cell[height][width];
			for (int y = 0; y < lines.size(); y++) {
	        	char[] chars = lines.get(y).toCharArray();
	        	for (int x = 0; x < chars.length; x++) {
	        		Cell cell = new Cell();
	        		cell.setSymbol(String.valueOf(chars[x]));
	        		labyrinth[y][x] = cell;
	        		if (cell.isStart()) {
	        			startY = y;
	        			startX = x;
	        		} else if (cell.isEnd()) {
	        			endY = y;
	        			endX = x;
	        		}
	        	}
	        }
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
		
		// stop if we found the end point
		if (foundEndPoint(y, x)) {
//			System.err.println("End point found! " + endY + "/" + endX);
			markEndPoint(y, x);
			return;
		}
		
		// move up
		if (canMove(y-1, x)) {
//			System.err.println("moving up to " + (y-1) + "/" + x);
			move(y-1, x);
			if (labyrinth[y-1][x].isReached()) {
				labyrinth[y][x].setReached(true);
			}
		}
		// move down
		if (canMove(y+1, x)) {
//			System.err.println("moving down to " + (y+1) + "/" + x);
			move(y+1, x);
			if (labyrinth[y+1][x].isReached()) {
				labyrinth[y][x].setReached(true);
			}
		}
		// move left
		if (canMove(y, x-1)) {
//			System.err.println("moving left to " + y + "/" + (x-1));
			move(y, x-1);
			if (labyrinth[y][x-1].isReached()) {
				labyrinth[y][x].setReached(true);
			}
		}
		// move right
		if (canMove(y, x+1)) {
//			System.err.println("moving left to " + y + "/" + (x+1));
			move(y, x+1);
			if (labyrinth[y][x+1].isReached()) {
				labyrinth[y][x].setReached(true);
			}
		}
		
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
