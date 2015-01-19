public class Case {
	private int x;
	private int y;

	public Case(char x, char y) {
		this.x = Integer.parseInt(Character.toString(x));
		this.y = Integer.parseInt(Character.toString(y));
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj instanceof Case)
			if ((((Case) obj).x == this.x) && (((Case) obj).y == this.y))
				return true;
		return super.equals(obj);
	}

	
}
