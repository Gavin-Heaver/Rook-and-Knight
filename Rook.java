/*
 * Gavin Heaver
 * Assignment 6: Inheritance
 * COP 3330
 * November 3, 2024
 */
public class Rook extends ChessPiece{
	//Create constructor
	public Rook(String color, int row, int col) {
		super(color, row, col);
	}

	@Override
	public int getRow() {
		//return row
		return row;
	}

	@Override
	public int getCol() {
		// return col
		return col;
	}

	@Override
	public boolean isValidMove(int row, int col) {
		if(row < 8 && col < 8) {
			//Make sure the piece stays on either the same row or column
			if (row == getRow()) {
				//Check if column is greater or less than the previous value
				if(col > getCol()) {
					for(int i = 0; i < col - getCol(); i++) {
						//Grab the return if there is a piece in the spot or not
						ChessPiece piece = ChessPiece.isOccupied(row, col - i);
						//If a piece is in the way, return false
						if (piece != null) {
							//Return false
							return false;
						}
					}
					
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
					
				//Check if the column is greater or less than the previous value
				} else if(col < getCol()) {
					for(int i = 0; i < getCol() - col; i++) {
						//Grab the return if there is a piece in the spot or not
						ChessPiece piece = ChessPiece.isOccupied(row, col + i);
						//If a piece is in the way, return false
						if (piece != null) {
							//return false
							return false;
						}
					}
					
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
				
			//Make sure the piece stays on either the same row or column
			} else if (col == getCol()) {
				//Check if row is greater or less than the previous value
				if(row > getRow()) {
					for(int i = 0; i < row - getRow(); i++) {
						//Grab the return if there is a piece in the spot or not
						ChessPiece piece = ChessPiece.isOccupied(row - i, col);
						//If a piece is in the way, return false
						if (piece != null) {
							//return false
							return false;
						}
					}
					
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
					
				//Check if row is greater or less than the previous value
				} else if(row < getRow()) {
					for(int i = 0; i < getRow() - row; i++) {
						//Grab the return if there is a piece in the spot or not
						ChessPiece piece = ChessPiece.isOccupied(row + i, col);
						//If a piece is in the way, return false
						if (piece != null) {
							//return false
							return false;
						}
					}
					
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
		}
		//if no valid move is made, return false
		return false;
	}
}
