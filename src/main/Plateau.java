import java.util.LinkedList;
import java.util.List;

public class Plateau {
	private static final String PLAYER_SEPARATOR = ", ";
	private int squareSize;
	private List<Case> cases = new LinkedList<Case>();

	public Plateau(char plateauSize) {
		this.squareSize = Integer.parseInt(Character.toString(plateauSize));
	}
	
	public void addCase(Case caze){
		cases.add(caze);
	}

	private int remaingSize() {
		return (squareSize * squareSize)-cases.size();
	}

	public String report(Player player1, Player player2) {
		String player1message = player1.report(remaingSize(),1);
		String player2message = player2.report(remaingSize(),2);
		return player1message+PLAYER_SEPARATOR+player2message;
	}
}
