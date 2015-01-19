import java.util.LinkedList;
import java.util.List;

public class Player implements Comparable<Player> {
	private String name;
	private String pion;
	private List<Case> filledCases = new LinkedList<Case>();

	public Player(String playerName, String pion) {
		this.name = playerName;
		this.pion = pion;
	}

	public Player(String playerName) {
		this.name = playerName;
	}

	public void fillCase(Case caze) {
		filledCases.add(caze);
	}

	@Override
	public int compareTo(Player player) {
		return player.name.compareTo(this.name);
	}

	public String report(int size, int order) {
		return getRemainingGames(size, order) + " games for " + name;
	}

	private int getRemainingGames(int size, int order) {
		if (size % 2 != 0) {
			if (order == 1)
				return size - (size / 2);
			return size - (size / 2) - 1;
		} else {
			return size - Math.round(size / 2);
		}
	}

	public String report() {
		return "Game Over, " + name + " is a winner";
	}

	public boolean isAWinner() {
		if (filledCases.contains(new Case(convertToChar(0), convertToChar(0)))
				&&filledCases.contains(new Case(convertToChar(1), convertToChar(1)))
				&&filledCases.contains(new Case(convertToChar(2), convertToChar(2))))
		{
			return true;
		}
		return false;
	}

	private char convertToChar(int i) {
		char c = (char) ('0' + i);
		return c;
	}

}
