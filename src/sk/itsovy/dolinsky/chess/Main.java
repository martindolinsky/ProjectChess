package sk.itsovy.dolinsky.chess;

public class Main {
	public static void main(String[] args) {

		Chess chess = new Chess();

		System.out.println(chess.normalize("8H"));
		System.out.println("Bishop from C1 to F4");
		System.out.println(chess.checkBishop("1c", "4f"));
		System.out.println("King from E1 to E8");
		System.out.println(chess.checkKing("1e","8e"));
		System.out.println("Queen from D1 to H5");
		System.out.println(chess.checkQueen("1d","5h"));
		System.out.println("Rook from H1 to H8");
		System.out.println(chess.checkRook("1h","8h"));
		System.out.println("Knight from G1 to E2");
		System.out.println(chess.checkKnight("1g", "3e"));

	}
}
