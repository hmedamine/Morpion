import java.util.LinkedList;
import java.util.List;

public class Plateau {
	private static final String PLAYER_SEPARATOR = ", ";
	private int squareSize;
	private List<Case> cases = new LinkedList<Case>();

	public Plateau(char plateauSize) {
		this.squareSize = Integer.parseInt(Character.toString(plateauSize));
	}

	public void addCase(Case caze) {
		cases.add(caze);
	}

	private int remaingSize() {
		return (squareSize * squareSize) - cases.size();
	}

	public String report(Player player1, Player player2) {
		if (hasWeHaveAWinner(player1,player2)!=null) {
			Player winner=hasWeHaveAWinner(player1,player2);
			return winner.report();
		} else {
			String player1message = player1.report(remaingSize(), 1);
			String player2message = player2.report(remaingSize(), 2);
			return player1message + PLAYER_SEPARATOR + player2message;
		}
	}

	private Player hasWeHaveAWinner(Player player1, Player player2) {
		if(player1.isAWinner()) return player1;
		if(player2.isAWinner()) return player2;
		return null;
	}

	public void isAlreadyFilled(Case caseToadd) {

		if (cases.contains(caseToadd))
			throw new BoxAlreadySelectedException();
	}
}
