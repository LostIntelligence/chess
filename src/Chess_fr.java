
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;;

public class Chess_fr implements ActionListener {
	boolean init = false;
	Logic logic = new Logic();
	JButton[][] buttons;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void showWindow() {

		// Spacer //
		// Creates Buttons and adds them to the array
		buttons = new JButton[8][8];
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 8; ++j) {
				buttons[i][j] = new JButton();
			}
		}
		// Spacer //

		JFrame frame = new JFrame();
		frame.setSize(900, 900);
		frame.setResizable(false);
		frame.setTitle("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 8, 0, 0));

		// Spacer //

		JPanel[][] panels = new JPanel[8][8];
		Boolean nextwhite = true;
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 8; ++j) {
				panels[i][j] = new JPanel();
				panels[i][j].setLayout(new GridLayout(0, 1, 0, 0));
				panels[i][j].add(buttons[i][j]);
				if (nextwhite == true) {
					panels[i][j].setBackground(Color.WHITE);
					if (j != 7) {
						nextwhite = false;
					}

				} else {
					panels[i][j].setBackground(Color.BLACK);
					if (j != 7) {
						nextwhite = true;
					}
				}
				panel.add(panels[i][j]);
			}
		}

		// Spacer //

		frame.setVisible(true);
		int rows = 0;
		int colums = 0;
		String btnname = "";
		for (int a = 0; a < 64; a++) {
			buttons[rows][colums].addActionListener(this);
			buttons[rows][colums].setContentAreaFilled(false);
			buttons[rows][colums].setBorderPainted(false);
			btnname = Integer.toString(rows * 10 + colums);
			buttons[rows][colums].setName(btnname);
			System.out.println(rows + " " + colums);
			System.out.println(btnname);
			if (colums == 7) {
				colums = -1;
				rows++;
			}
			colums++;
		}

		setPiecesOnBoard();
		System.out.printf("%n" + "Debug: Frame");
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(((Component) e.getSource()).getName());
		String btn = ((Component) e.getSource()).getName();
		System.out.printf("%n " + btn);

		System.out.printf("%n" + "Debug: Actionlistener");
		logic.run(btn);
		setPiecesOnBoard();

	}

	public void setPiecesOnBoard() {
		int[][] chessArray = logic.getArray();
		for (int row = 0; row < 8; row++) {
			for (int colum = 0; colum < 8; colum++) {
				int currentvalue = chessArray[row][colum];
				System.out.println("");
				System.out.println(row + "" + colum);
				System.out.println();
				switch (currentvalue) {
					case 1:
						buttons[row][colum].setIcon(null);
						break;
					case 2:
						buttons[row][colum].setIcon(null);
						break;
					case 3:
						buttons[row][colum].setIcon(null);
						break;
					case 4:
						buttons[row][colum].setIcon(null);
						break;
					case 5:
						buttons[row][colum].setIcon(null);
						break;
					case 6:
						buttons[row][colum].setIcon(null);
						break;
					case 11:
						buttons[row][colum].setIcon(null);
						break;
					case 12:
						buttons[row][colum].setIcon(null);
						break;
					case 13:
						buttons[row][colum].setIcon(null);
						break;
					case 14:
						buttons[row][colum].setIcon(null);
						break;
					case 15:
						buttons[row][colum].setIcon(null);
						break;
					case 16:
						buttons[row][colum].setIcon(null);
						break;
					default:
						System.out.println("Empty Tile");
						buttons[row][colum].setIcon(null);
						break;
				}

			}
		}
	}

}
