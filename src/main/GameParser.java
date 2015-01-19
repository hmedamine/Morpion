
public class GameParser {

	private static final String SEPARATOR = ":";

	public Plateau parsePlateau(String plateau) {
		char plateauSize = plateau.charAt(0);
		return new Plateau(plateauSize);
	}

	public Player parsePlayer(String player) {
		String[] playerSplit=player.split(SEPARATOR);
		String playerName=playerSplit[0];
		String pion=playerSplit[1];
		return new Player(playerName,pion);
	}

}
