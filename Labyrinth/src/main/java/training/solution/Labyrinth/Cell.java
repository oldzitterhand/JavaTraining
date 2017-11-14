package training.solution.Labyrinth;

/**
 * This bean holds information about a 'cell' in a labyrinth.
 * It is needed to keep track of the tested paths and the solution path. 
 * 
 * @author Patrick Metz
 */
public class Cell {
	
	private static final String START = "S";
	private static final String END = "G";
	
	//public static final String WALL = "*";
	public static final String WALL = Character.toString((char)9608);
	//public static final String PATH = "@";
	public static final String PATH = Character.toString((char)664);
	//public static final String DEAD_END = ".";
	public static final String DEAD_END = Character.toString((char)183);

	/** Flag to indicated if the cell has already been visited. **/
	private boolean visited;
	/** Flag to indicated whether the cell is part of the solution path or not. **/
	private boolean reached;
	/** The symbol is used to represent the cell's state (empty, wall, visited or part of the solution path). **/ 
	private String symbol;
	
	public boolean isVisited() {
		return visited;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isReached() {
		return reached;
	}

	public void setReached(boolean reached) {
		this.reached = reached;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public boolean isStart() {
		return START.equalsIgnoreCase(symbol);
	}
	
	public boolean isEnd() {
		return END.equalsIgnoreCase(symbol);
	}
	
}
