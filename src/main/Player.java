import java.util.LinkedList;
import java.util.List;

public class Player implements Comparable<Player> {
	private String name;
	private String pion;
	private List<Case> filledCases=new LinkedList<Case>();

	public Player(String playerName, String pion) {
		this.name=playerName;
		this.pion=pion;
	}
	
	public Player(String playerName) {
		this.name=playerName;
	}

	public void fillCase(Case caze){
		filledCases.add(caze);
	}

	@Override
	public int compareTo(Player player) {
		return player.name.compareTo(this.name);
	}

	public String report(int size, int i) {
		return getRemainingGames(size)+" games for "+name;
	}

	private int getRemainingGames(int size) {
		if(size%2==0)
		return size-Math.round(size/2);
	}
	
}
