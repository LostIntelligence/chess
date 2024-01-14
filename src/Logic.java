import javax.swing.JOptionPane;

public class Logic {
	Boolean firstClick = true;
	int savedPosition = 0;
	int whosTurn = 1;
	int selectedPiece;
	Boolean isWhite = false;
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
			{ 01, 01, 01, 01, 01, 01, 01, 01 },
			{ 00, 00, 00, 00, 00, 00, 00, 00 },
			{ 00, 00, 00, 00, 00, 00, 00, 00 },
			{ 00, 00, 00, 00, 00, 00, 00, 00 },
			{ 00, 00, 00, 00, 00, 00, 00, 00 },
			{ 11, 11, 11, 11, 11, 11, 11, 11 },
			{ 12, 13, 14, 16, 15, 14, 13, 12 } };

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
			int row = btnname / 10;
			int colum = btnname % 10;
			chessArray[row][colum] = selectedPiece;
			row = savedPosition / 10;
			colum = savedPosition % 10;
			chessArray[row][colum] = 0;
			firstClick = true;
			if (whosTurn == 1) {
				whosTurn = 0;
			} else if (whosTurn == 0) {
				whosTurn = 1;
			}

		}

	}

	public void logicPawn() {
		if (isWhite == true) {

		} else {

		}
	}

	public void logicTower() {
		if (isWhite == true) {

		} else {

		}

	}

	public void logicKnight() {
		if (isWhite == true) {

		} else {

		}
	}

	public void logicBishop() {
		if (isWhite == true) {

		} else {

		}
	}

	public void logicQueen() {
		if (isWhite == true) {

		} else {

		}
	}

	public void logicKing() {
		if (isWhite == true) {

		} else {

		}
	}
}
