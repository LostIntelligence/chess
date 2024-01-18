import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class Logic {
	Boolean firstClick = true;
	int savedPosition = 0;
	int whosTurn = 1;
	int selectedPiece;
	Boolean isWhite = true;
	/*
	 * White Side
	 * whosTurn = 1
	 * 1 = Pawn
	 * 2 = Tower
	 * 3 = Knight
	 * 4 = Bishop
	 * 5 = Queen
	 * 6 = King
	 * 
	 * 
	 * Black Side
	 * whosTurn = 0
	 * 11 = Pawn
	 * 12 = Tower
	 * 13 = Knight
	 * 14 = Bishop
	 * 15 = Queen
	 * 16 = King
	 * 
	 */
	int[][] chessArray = { { 02, 03, 04, 06, 05, 04, 03, 02 },
			/*           */{ 01, 01, 01, 01, 01, 01, 01, 01 },
			/*           */{ 00, 00, 00, 00, 00, 00, 00, 00 },
			/*           */{ 00, 00, 00, 00, 00, 00, 00, 00 },
			/*           */{ 00, 00, 00, 00, 00, 00, 00, 00 },
			/*           */{ 00, 00, 00, 00, 00, 00, 00, 00 },
			/*           */{ 11, 00, 11, 11, 11, 11, 11, 11 },
			/*           */{ 12, 00, 14, 16, 15, 14, 13, 12 } };

	public int[][] getArray() {
		return chessArray;
	}

	public void run(String btn) {
		String btntxt = btn;
		System.out.printf("%n " + btntxt);

		Boolean validPiece = false;
		int btnname = Integer.parseInt(btntxt);
		if (firstClick == true) {

			int row = btnname / 10;
			int colum = btnname % 10;
			selectedPiece = chessArray[row][colum];

			System.out.printf("%n" + "Debug: colum " + colum);
			System.out.printf("%n" + "Debug: row " + row);
			System.out.printf("%n" + "Debug: SelectedPiece " + selectedPiece);

			if (whosTurn == 1 && selectedPiece > 0 && selectedPiece < 10) {
				validPiece = true;
			} else if (whosTurn == 0 && selectedPiece > 10) {
				validPiece = true;
			}

			if (validPiece == true) {
				savedPosition = btnname;
				firstClick = false;

			} else {
				JOptionPane.showMessageDialog(null, "Its not your turn", "WARN", JOptionPane.ERROR_MESSAGE);
			}
		} else if (firstClick == false) {
			Boolean succesfulMove = false;
			if (selectedPiece > 10) {
				isWhite = false;
			} else {
				isWhite = true;
			}
			switch (selectedPiece) {
				case 1:
					succesfulMove = logicPawn(btnname);
					break;
				case 2:
					succesfulMove = logicPawn(btnname);
					break;
				case 3:
					succesfulMove = logicPawn(btnname);
					break;
				case 4:
					succesfulMove = logicPawn(btnname);
					break;
				case 5:
					succesfulMove = logicPawn(btnname);
					break;
				case 6:
					succesfulMove = logicPawn(btnname);
					break;
				case 11:
					succesfulMove = logicPawn(btnname);
					break;
				case 12:
					succesfulMove = logicPawn(btnname);
					break;
				case 13:
					succesfulMove = logicPawn(btnname);
					break;
				case 14:
					succesfulMove = logicPawn(btnname);
					break;
				case 15:
					succesfulMove = logicPawn(btnname);
					break;
				case 16:
					succesfulMove = logicPawn(btnname);
					break;
				default:
					break;
			}

			if (succesfulMove == true) {
				firstClick = true;
				if (whosTurn == 1) {
					whosTurn = 0;
				} else if (whosTurn == 0) {
					whosTurn = 1;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Not a legal move", "WARN", JOptionPane.WARNING_MESSAGE);
			}

		}

	}

	public Boolean logicPawn(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		int destinationPiece = chessArray[destinationRow][destinationColum];
		int pieceType = 1;
		if (isWhite == true) {
			if (destinationColum == currentColum && destinationRow == currentRow + 1 && destinationPiece == 0) {
				// moving Straight
				if (destinationRow == 7) {
					pieceType = promotePiece(pieceType);
					movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);

					return true;
				}
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			} else if (false) {
				// Taking Diagonally
			}

		} else if (isWhite == false) {
			pieceType = pieceType + 10;
			if (destinationColum == currentColum && destinationRow == currentRow - 1 && destinationPiece == 0) {
				if (destinationRow == 0) {
					movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
					promotePiece(pieceType);
					return true;
				}
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		}
		return false;

	}

	public void logicTower(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		if (isWhite == true) {

		} else {

		}

	}

	public void logicKnight(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		int destinationPiece = chessArray[destinationRow][destinationColum];
		if (isWhite == true) {

		} else {

		}
	}

	public void logicBishop(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		if (isWhite == true) {

		} else {

		}
	}

	public void logicQueen(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		if (isWhite == true) {

		} else {

		}
	}

	public void logicKing(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		if (isWhite == true) {

		} else {

		}
	}

	public int promotePiece(int pieceType) {
		int chosenPieceIndex = JOptionPane.showOptionDialog(null, "Choose a replacement piece", "Promotion",
				JOptionPane.YES_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Queen ", "Knight", "Bishop", "Tower" }, null);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + chosenPieceIndex);

		return chosenPieceIndex;

	}

	public void movePiece(int currentRow, int currentColum, int destinationRow, int destinationColum, int pieceType) {
		chessArray[currentRow][currentColum] = 0;
		chessArray[destinationRow][destinationColum] = pieceType;
	}
}