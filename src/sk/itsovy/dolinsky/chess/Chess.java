package sk.itsovy.dolinsky.chess;

/**
 * @author Martin Dolinsky
 */
public class Chess {

	public String normalize(String item) {
		if (item == null || item.length() != 2) {
			return null;
		}

		item = item.toUpperCase();

		if (Character.isDigit(item.charAt(0)) && Character.isLetter(item.charAt(1))) {
			item = item.charAt(1) + String.valueOf(item.charAt(0));
		}

		if (item.charAt(0) < 65 || item.charAt(0) > 72) {
			return null;
		}

		if (item.charAt(1) < 49 || item.charAt(1) > 56) {
			return null;
		}

		return item;
	}

	public boolean checkBishop(String pos, String dest) {
		pos = normalize(pos);
		dest = normalize(dest);

		if (pos == null || dest == null) {
			return false;
		}

		if (pos.equals(dest)) {
			return false;
		}

		return Math.abs(pos.charAt(0) - dest.charAt(0)) == Math.abs(pos.charAt(1) - dest.charAt(1));
	}

	public boolean checkKing(String pos, String dest) {
		pos = normalize(pos);
		dest = normalize(dest);

		if (pos == null || dest == null) {
			return false;
		}

		if (pos.equals(dest)) {
			return false;
		}

		return Math.abs(pos.charAt(0) - dest.charAt(0)) <= Math.abs(1) && Math.abs(pos.charAt(1) - dest.charAt(1)) <= Math.abs(1);
	}

	public boolean checkQueen(String pos, String dest) {
		pos = normalize(pos);
		dest = normalize(dest);

		if (pos == null || dest == null) {
			return false;
		}

		if (pos.equals(dest)){
			return false;
		}

		return (Math.abs(pos.charAt(0) - dest.charAt(0)) == Math.abs(pos.charAt(1) - dest.charAt(1))
				|| (pos.charAt(0) == dest.charAt(0) || pos.charAt(1) == dest.charAt(1)));
	}

	public boolean checkRook(String pos, String dest) {
		pos = normalize(pos);
		dest = normalize(dest);

		if (pos == null || dest == null) {
			return false;
		}

		if (pos.equals(dest)){
			return false;
		}

		return pos.charAt(0) == dest.charAt(0) || pos.charAt(1) == dest.charAt(1);
	}

	public boolean checkKnight(String pos, String dest) {
		pos = normalize(pos);
		dest = normalize(dest);

		if (pos == null || dest == null) {
			return false;
		}

		if (pos.equals(dest)) {
			return false;
		}

		int posX = Math.abs(pos.charAt(0) - dest.charAt(0));
		int posY = Math.abs(pos.charAt(1) - dest.charAt(1));
		return (posX == 1 && posY == 2) || (posX == 2 && posY == 1);
	}
}
