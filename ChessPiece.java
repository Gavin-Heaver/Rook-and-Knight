/*

 * Gavin Heaver
 * Assignment 6: Inheritance
 * COP 3330
 * November 3, 2024
 */

import java.util.ArrayList;

public abstract class ChessPiece {
	/**
	 * masterList stores all the chess pieces in the game.
	 * color stores the color of the chess piece.
	 */
	public static ArrayList<ChessPiece> masterList = new ArrayList<ChessPiece>();
	private String color;
	int row;
	int col;
	
	public ChessPiece(String color, int row, int col) {
		this.color = color;
		this.row = row;
		this.col = col;
		masterList.add(this);
	}

	public String getColor() {
		return this.color;
	}
	
	/**
	 * @param row - The row of the space we are checking
	 * @param col - The column of the space we are checking
	 * @return return the chess piece that is currently in this space.  
	 * If there is none return null.
	 */
	public static ChessPiece isOccupied(int row, int col) {
		for (ChessPiece piece :  masterList) {
			if(piece.getRow() == row && piece.getCol() == col) {
				return piece;
			}
		}
		return null;

	}
	
	public abstract int getRow();
	public abstract int getCol();
	public abstract boolean isValidMove(int row, int col);
}
