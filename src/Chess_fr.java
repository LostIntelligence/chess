
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;;

public class Chess_fr implements ActionListener {

	boolean init = false;
	Logic logic = new Logic();
	JButton[][] buttons;
	Image pawnB;
	Image towerB;
	Image knightB;
	Image bishopB;
	Image queenB;
	Image kingB;
	Image pawnW;
	Image towerW;
	Image knightW;
	Image bishopW;
	Image queenW;
	Image kingW;

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
		frame.setResizable(true);
		frame.setTitle("Chess");
		frame.setLayout(new GridLayout(1, 1, 0, 0));
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
					panels[i][j].setBackground(Color.lightGray);
					if (j != 7) {
						nextwhite = false;
					}

				} else {
					panels[i][j].setBackground(Color.gray);
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
		ScaleImage();
		int[][] chessArray = logic.getArray();
		for (int row = 0; row < 8; row++) {
			for (int colum = 0; colum < 8; colum++) {
				int currentvalue = chessArray[row][colum];
				System.out.println("");
				System.out.println("Populating: " + row + "" + colum);
				switch (currentvalue) {
					case 1:
						buttons[row][colum].setIcon(new ImageIcon(pawnW));
						break;
					case 2:
						buttons[row][colum].setIcon(new ImageIcon(towerW));
						break;
					case 3:
						buttons[row][colum].setIcon(new ImageIcon(knightW));
						break;
					case 4:
						buttons[row][colum].setIcon(new ImageIcon(bishopW));
						break;
					case 5:
						buttons[row][colum].setIcon(new ImageIcon(queenW));
						break;
					case 6:
						buttons[row][colum].setIcon(new ImageIcon(kingW));
						break;
					case 11:
						buttons[row][colum].setIcon(new ImageIcon(pawnB));
						break;
					case 12:
						buttons[row][colum].setIcon(new ImageIcon(towerB));
						break;
					case 13:
						buttons[row][colum].setIcon(new ImageIcon(knightB));
						break;
					case 14:
						buttons[row][colum].setIcon(new ImageIcon(bishopB));
						break;
					case 15:
						buttons[row][colum].setIcon(new ImageIcon(queenB));
						break;
					case 16:
						buttons[row][colum].setIcon(new ImageIcon(kingB));
						break;
					default:
						System.out.println("Empty Tile");
						buttons[row][colum].setIcon(null);
						break;
				}

			}
		}
	}

	public void ScaleImage() {
		int width = buttons[0][0].getWidth();
		int height = buttons[0][0].getHeight();
		try {
			pawnW = ImageIO.read(new File("pawnW.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			towerW = ImageIO.read(new File("towerW.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			knightW = ImageIO.read(new File("knightW.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			bishopW = ImageIO.read(new File("bishopW.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			queenW = ImageIO.read(new File("queenW.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			kingW = ImageIO.read(new File("kingW.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);

			pawnB = ImageIO.read(new File("pawnB.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			towerB = ImageIO.read(new File("towerB.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			knightB = ImageIO.read(new File("knightB.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			bishopB = ImageIO.read(new File("bishopB.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			queenB = ImageIO.read(new File("queenB.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);
			kingB = ImageIO.read(new File("kingB.png")).getScaledInstance(width, height, Image.SCALE_DEFAULT);

		} catch (Exception e) {
			System.err.println("Image size Failed");
		}
	}
}
