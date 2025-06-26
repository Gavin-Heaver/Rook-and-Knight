/*
 * Gavin Heaver
 * Assignment 6: Inheritance
 * COP 3330
 * November 3, 2024
 */
public class Knight extends ChessPiece{
	//Create constructor
	public Knight(String color, int row, int col) {
		super(color, row, col);
	}
	
	//get row function
	@Override
	public int getRow() {
		//return row
		return row;
	}

	//get col function
	@Override
	public int getCol() {
		// return col
		return col;
	}

	//valid move function
	@Override
	public boolean isValidMove(int row, int col) {
		if(row < 8 && col < 8) {
			//Check to see if the move made is possible for a knight
			if(row == getRow() + 2 && col == getCol() + 1) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
			//Check to see if the move made is possible for a knight	
			} else if (row == getRow() + 2 && col == getCol() - 1) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
			//Check to see if the move made is possible for a knight
			} else if (row == getRow() - 2 && col == getCol() + 1) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
			//Check to see if the move made is possible for a knight
			} else if (row == getRow() - 2 && col == getCol() - 1) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
			//Check to see if the move made is possible for a knight
			} else if (row == getRow() + 1 && col == getCol() + 2) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
			//Check to see if the move made is possible for a knight
			} else if (row == getRow() + 1 && col == getCol() - 2) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
			//Check to see if the move made is possible for a knight
			} else if (row == getRow() - 1 && col == getCol() + 2) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
			//Check to see if the move made is possible for a knight
			} else if (row == getRow() - 1 && col == getCol() - 2) {
				//Grab the return if there is a piece in the spot or not
				ChessPiece piece = ChessPiece.isOccupied(row, col);
				
				//Check there was a piece or not
				if (piece != null) {
					if(piece.getColor() != getColor()) {
						//if the color isn't the same, you can take it
						return true;
					} else if (piece.getColor() == getColor()) {
						//If the color is the same, you can't take it
						return false;
					}
				} else {
					//If no piece was there, return true
					return true;
				}
	
			}
		}
		//return false if no valid move is made
		return false;
	}
}
