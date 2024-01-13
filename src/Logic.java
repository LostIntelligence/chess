import javax.swing.JOptionPane;

public class Logic {
	Boolean fc = true;
	int savedPosition = 0;
	int whosTurn = 1;
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
		/*
		 * Boolean validPiece = false;
		 * int y = Integer.parseInt(btntxt);
		 * if (fc == true) {
		 * 
		 * int colum = y / 10;
		 * int row = y % 10;
		 * int selectedPiece = chessArray[colum][row];
		 * System.out.printf("%n" + "Debug: colum " + colum);
		 * System.out.printf("%n" + "Debug: row " + row);
		 * System.out.printf("%n" + "Debug: SelectedPiece " + selectedPiece);
		 * if (whosTurn == 1 && selectedPiece > 0 && selectedPiece < 10) {
		 * validPiece = true;
		 * } else if (whosTurn == 0 && selectedPiece > 10) {
		 * validPiece = true;
		 * }
		 * 
		 * if (validPiece == true) {
		 * savedPosition = y;
		 * fc = false;
		 * 
		 * } else {
		 * JOptionPane.showMessageDialog(null, JOptionPane.WARNING_MESSAGE);
		 * }
		 * }
		 */
		

	}
}
