/*
 * Gavin Heaver
 * Assignment 6: Inheritance
 * COP 3330
 * November 3, 2024
 */
public class RunnerKnight {

	public static void main(String[] args) {
		new Rook("Black", 6, 4);
		new Knight("White", 4, 2);
		new Knight("Black", 6, 3);
		new Rook("White", 2, 3);

		//System.out.println(ChessPiece.masterList.size());
		System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 3));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 1));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(2, 3));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(2, 1));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(5, 4));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 4));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(5, 0));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 0));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 3));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 4));

	}

}
