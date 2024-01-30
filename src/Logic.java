import javax.swing.JOptionPane;

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
			/*           */{ 11, 11, 11, 11, 11, 11, 11, 11 },
			/*           */{ 12, 13, 14, 16, 15, 14, 13, 12 } };

	public int[][] getArray() {
		return chessArray;
	}

	public void run(String btn) {
		String btntxt = btn;

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
					succesfulMove = logicTower(btnname);
					break;
				case 3:
					succesfulMove = logicKnight(btnname);
					break;
				case 4:
					succesfulMove = logicBishop(btnname);
					break;
				case 5:
					succesfulMove = logicQueen(btnname);
					break;
				case 6:
					succesfulMove = logicKing(btnname);
					break;
				case 11:
					succesfulMove = logicPawn(btnname);
					break;
				case 12:
					succesfulMove = logicTower(btnname);
					break;
				case 13:
					succesfulMove = logicKnight(btnname);
					break;
				case 14:
					succesfulMove = logicBishop(btnname);
					break;
				case 15:
					succesfulMove = logicQueen(btnname);
					break;
				case 16:
					succesfulMove = logicKing(btnname);
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
				firstClick = true;
			}

		}

	}

	public Boolean logicPawn(int btnname) {
		int maxDistance = 1;
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		int destinationPiece = chessArray[destinationRow][destinationColum];
		int pieceType = chessArray[currentRow][currentColum];
		if (isWhite == true) {
			if (currentRow == 1 && destinationRow == 3) {
				maxDistance++;
			}
			if (destinationColum == currentColum && destinationRow == currentRow + maxDistance && destinationPiece == 0) {

				if (destinationRow == 7) {
					// moving Straight and promoting
					pieceType = promotePiece(pieceType);
					movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
					return true;
				}
				// moving Straight
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;

			} else if ((destinationColum == currentColum + 1 || destinationColum == currentColum - 1) && destinationRow == currentRow + 1
					&& destinationPiece > 10 && destinationPiece > 0) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}

		} else if (isWhite == false) {
			if (currentRow == 6 && destinationRow == 4) {
				maxDistance++;
			}
			if (destinationColum == currentColum && destinationRow >= currentRow - maxDistance && destinationPiece == 0) {
				if (destinationRow == 0) {
					// moving Straight and promoting
					pieceType = promotePiece(pieceType);
					movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
					return true;
				}
				// moving Straight
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			} else if ((destinationColum == currentColum + 1 || destinationColum == currentColum - 1) && destinationRow == currentRow - 1
					&& destinationPiece < 10 && destinationPiece > 0) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		}
		return false;

	}

	public Boolean logicTower(int btnname) {
		boolean stop = false;
		boolean clear = true;
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		int destinationPiece = chessArray[destinationRow][destinationColum];
		int pieceType = chessArray[currentRow][currentColum];
		if (destinationColum == currentColum) {
			if (currentRow > destinationRow) {
				for (int i = currentRow; i > destinationRow; i--) {
					if (chessArray[i][currentColum] != 0 && chessArray[i][currentColum] != pieceType) {
						clear = false;
						break;
					}
				}
				for (int i = 0; stop == false; i++) {
					if (currentRow + i == destinationRow) {
						stop = true;
					}
					if (i > 7) {
						stop = true;
						clear = false;
					}
				}
			} else if (currentRow < destinationRow) {
				for (int i = currentRow; i < destinationRow; i++) {
					if (chessArray[i][currentColum] != 0 && chessArray[i][currentColum] != pieceType) {
						clear = false;
						break;
					}

				}
				for (int i = 0; stop == false; i++) {
					if (currentRow - i == destinationRow) {
						stop = true;
					}
					if (i > 7) {
						stop = true;
						clear = false;
					}
				}
			}
		} else if (destinationRow == currentRow) {
			if (currentColum > destinationColum) {
				for (int i = currentColum; i > destinationColum; i--) {
					if (chessArray[currentRow][i] != 0 && chessArray[currentRow][i] != pieceType) {
						clear = false;
						break;
					}
				}
				for (int i = 0; stop == false; i++) {
					if (destinationColum == currentColum - i) {
						stop = true;
					}
					if (i > 7) {
						stop = true;
						clear = false;
					}
				}
			} else if (currentColum < destinationColum) {
				for (int i = currentColum; i < destinationColum; i++) {
					if (chessArray[currentRow][i] != 0 && chessArray[currentRow][i] != pieceType) {
						clear = false;
						break;
					}

				}
				for (int i = 0; stop == false; i++) {
					if (destinationColum == currentColum + i) {
						stop = true;
					}
					if (i > 7) {
						stop = true;
						clear = false;
					}
				}
			}

		}
		if (destinationColum != currentColum && destinationRow != currentRow) {
			clear = false;
		}

		System.out.println(clear);
		if (isWhite == true) {

			if ((destinationPiece > 10 || destinationPiece == 0) && clear == true) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		} else {
			if (destinationPiece < 10 && clear == true) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}

		}
		return false;

	}

	public Boolean logicKnight(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		int destinationPiece = chessArray[destinationRow][destinationColum];
		int pieceType = chessArray[currentRow][currentColum];
		if (isWhite == true) {
			if ((destinationColum == currentColum + 1 || destinationColum == currentColum - 1)
					&& (destinationRow == currentRow + 2 || destinationRow == currentRow - 2) && (destinationPiece > 10 || destinationPiece == 0)) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}

			if ((destinationRow == currentRow + 1 || destinationRow == currentRow - 1)
					&& (destinationColum == currentColum + 2 || destinationColum == currentColum - 2)
					&& (destinationPiece > 10 || destinationPiece == 0)) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		} else {
			if ((destinationColum == currentColum + 1 || destinationColum == currentColum - 1)
					&& (destinationRow == currentRow + 2 || destinationRow == currentRow - 2) && (destinationPiece < 10)) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
			if ((destinationRow == currentRow + 1 || destinationRow == currentRow - 1)
					&& (destinationColum == currentColum + 2 || destinationColum == currentColum - 2) && destinationPiece < 10) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}

		}
		return false;
	}

	public Boolean logicBishop(int btnname) {
		Boolean clear = true;
		Boolean stop = false;
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		int destinationPiece = chessArray[destinationRow][destinationColum];
		int pieceType = chessArray[currentRow][currentColum];

		if (destinationColum > currentColum && destinationRow > currentRow) {
			// bottom right
			for (int i = 0; destinationColum != currentColum + i; i++) {
				if (chessArray[currentRow + i][currentColum + i] != 0 && i != 0) {
					clear = false;
				}
			}
			for (int i = 0; stop == false; i++) {
				if (currentRow + i == destinationRow && destinationColum == currentColum + i) {
					stop = true;
				}
				if (i > 7) {
					stop = true;
					clear = false;
				}
			}

		} else if (destinationColum < currentColum && destinationRow < currentRow) {
			// top left
			for (int i = 0; destinationColum != currentColum - i; i++) {
				if (chessArray[currentRow - i][currentColum - i] != 0 && i != 0) {
					clear = false;
				}
			}
			for (int i = 0; stop == false; i++) {
				if (currentRow - i == destinationRow && destinationColum == currentColum - i) {
					stop = true;
				}
				if (i > 7) {
					stop = true;
					clear = false;
				}
			}

		} else if (destinationColum < currentColum && destinationRow > currentRow) {
			// bottom left
			for (int i = 1; destinationRow != currentRow + i; i++) {
				if (chessArray[currentRow + i][currentColum - i] != 0) {
					clear = false;
				}
			}
			for (int i = 0; stop == false; i++) {
				if (currentRow + i == destinationRow && destinationColum == currentColum - i) {
					stop = true;
				}
				if (i > 7) {
					stop = true;
					clear = false;
				}
			}

		} else if (destinationColum > currentColum && destinationRow < currentRow) {
			// top right
			for (int i = 1; destinationColum != currentColum + i; i++) {
				if (chessArray[currentRow - i][currentColum + i] != 0) {
					clear = false;
				}
			}
			for (int i = 0; stop == false; i++) {
				if (currentRow - i == destinationRow && destinationColum == currentColum + i) {
					stop = true;
				}
				if (i > 7) {
					stop = true;
					clear = false;
				}
			}

		} else if (currentColum == destinationColum || currentRow == destinationRow) {
			clear = false;

		}

		if (isWhite == true) {

			if (clear && (destinationPiece == 0 || destinationPiece > 10)) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		} else {
			if (clear && destinationPiece < 10) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		}
		return false;
	}

	public Boolean logicQueen(int btnname) {
		if (logicTower(btnname) == true || logicBishop(btnname) == true) {

			return true;
		}
		return false;
	}

	public Boolean logicKing(int btnname) {
		int currentRow = savedPosition / 10;
		int currentColum = savedPosition % 10;
		int destinationRow = btnname / 10;
		int destinationColum = btnname % 10;
		int destinationPiece = chessArray[destinationRow][destinationColum];
		int pieceType = chessArray[currentRow][currentColum];
		if (isWhite == true) {
			if ((destinationRow == currentRow + 1 || destinationRow == currentRow - 1 || destinationRow == currentRow)
					&& (destinationColum == currentColum + 1 || destinationColum == currentColum + 1 || destinationColum == currentColum)
					&& (destinationPiece > 10 || destinationPiece == 0)) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		} else {
			if ((destinationRow == currentRow + 1 || destinationRow == currentRow - 1 || destinationRow == currentRow)
					&& (destinationColum == currentColum + 1 || destinationColum == currentColum + 1 || destinationColum == currentColum)
					&& destinationPiece < 10) {
				movePiece(currentRow, currentColum, destinationRow, destinationColum, pieceType);
				return true;
			}
		}
		return false;
	}

	public int promotePiece(int pieceType) {
		int chosenPieceIndex = JOptionPane.showOptionDialog(null, "Choose a replacement piece", "Promotion",
				JOptionPane.YES_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Queen ", "Knight", "Bishop", "Tower" }, null);
		switch (chosenPieceIndex) {
			case 0:
				chosenPieceIndex = 5;
				break;
			case 1:
				chosenPieceIndex = 3;
				break;
			case 2:
				chosenPieceIndex = 4;
				break;
			case 3:
				chosenPieceIndex = 2;
				break;
		}
		if (pieceType > 10) {
			chosenPieceIndex = chosenPieceIndex + 10;
		}
		return chosenPieceIndex;

	}

	public void movePiece(int currentRow, int currentColum, int destinationRow, int destinationColum, int pieceType) {
		chessArray[currentRow][currentColum] = 0;
		chessArray[destinationRow][destinationColum] = pieceType;
	}
}