import org.hamcrest.Matcher;

public class Morpion {

	public static final String LINE_SEPARATOR = System
			.getProperty("line.separator");
	private Player player1;
	private Player player2;
	private Plateau plateau;

	public Morpion(String plateauRepresentation, String player1Representation,
			String player2Representation) {
		GameParser parser = new GameParser();
		plateau = parser.parsePlateau(plateauRepresentation);
		player1 = parser.parsePlayer(player1Representation);
		player2 = parser.parsePlayer(player2Representation);
	}

	public void play(String playerName, String caze) {
		Player player= findPlayer(playerName);
		char yPosition = caze.charAt(2);
		char xPosition = caze.charAt(0);
		Case caseToadd = new Case(xPosition,yPosition);
		player.fillCase(caseToadd);
		plateau.addCase(caseToadd);
	}

	private Player findPlayer(String playerName) {
		if(player1.compareTo(new Player(playerName))==0)
			return player1;
		return player2;
	}

	public String report() {
		StringBuilder builder=new StringBuilder();
		builder.append(plateau.report(player1,player2));
		return builder.toString();
	}

	public Matcher<String> display() {
		// TODO Auto-generated method stub
		return null;
	}

}
