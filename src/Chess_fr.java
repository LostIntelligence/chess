import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Chess_fr implements ActionListener {
	boolean init = false;
	Logic logic = new Logic();

	/**
	 * @wbp.parser.entryPoint
	 */
	public void showWindow() {

		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setResizable(false);
		frame.setTitle("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 8, 0, 0));

		JPanel panel_1a = new JPanel();
		JButton t00 = new JButton("");
		panel_1a.setBackground(Color.WHITE);
		panel.add(panel_1a);
		panel_1a.setLayout(new GridLayout(0, 1, 0, 0));
		panel_1a.add(t00);
		t00.setContentAreaFilled(false);
		t00.setBorderPainted(false);
		t00.setName("00");

		JPanel panel_1b = new JPanel();
		JButton t01 = new JButton("");
		panel_1b.setBackground(Color.BLACK);
		panel_1b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_1b);
		panel_1b.add(t01);
		t01.setContentAreaFilled(false);
		t01.setBorderPainted(false);
		t01.setName("01");

		JPanel panel_1c = new JPanel();
		JButton t02 = new JButton("");
		panel_1c.setBackground(Color.WHITE);
		panel.add(panel_1c);
		panel_1c.setLayout(new GridLayout(0, 1, 0, 0));
		panel_1a.add(t02);
		t02.setContentAreaFilled(false);
		t02.setBorderPainted(false);
		t02.setName("02");

		JPanel panel_1d = new JPanel();
		JButton t03 = new JButton("");
		panel_1d.setBackground(Color.BLACK);
		panel_1d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_1d);
		panel_1a.add(t03);
		t03.setContentAreaFilled(false);
		t03.setBorderPainted(false);
		t03.setName("03");

		JPanel panel_1e = new JPanel();
		JButton t04 = new JButton("");
		panel_1e.setBackground(Color.WHITE);
		panel.add(panel_1e);
		panel_1e.setLayout(new GridLayout(0, 1, 0, 0));
		panel_1a.add(t04);
		t04.setContentAreaFilled(false);
		t04.setBorderPainted(false);
		t04.setName("04");

		JPanel panel_1f = new JPanel();
		JButton t05 = new JButton("");
		panel_1f.setBackground(Color.BLACK);
		panel_1f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_1f);
		panel_1a.add(t05);
		t05.setContentAreaFilled(false);
		t05.setBorderPainted(false);
		t05.setName("05");

		JPanel panel_1g = new JPanel();
		JButton t06 = new JButton("");
		panel_1g.setBackground(Color.WHITE);
		panel_1g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_1g);
		panel_1a.add(t06);
		t06.setContentAreaFilled(false);
		t06.setBorderPainted(false);
		t06.setName("06");

		JPanel panel_1h = new JPanel();
		JButton t07 = new JButton("");
		panel_1h.setBackground(Color.BLACK);
		panel_1h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_1h);
		panel_1a.add(t07);
		t07.setContentAreaFilled(false);
		t07.setBorderPainted(false);
		t07.setName("07");

		JPanel panel_2a = new JPanel();
		JButton t10 = new JButton("");
		panel_2a.setBackground(Color.BLACK);
		panel_2a.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2a);
		panel_1a.add(t10);
		t10.setContentAreaFilled(false);
		t10.setBorderPainted(false);
		t10.setName("10");

		JPanel panel_2b = new JPanel();
		JButton t11 = new JButton("");
		panel_2b.setBackground(Color.WHITE);
		panel_2b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2b);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);
		t11.setName("11");

		JPanel panel_2c = new JPanel();
		JButton t12 = new JButton("");
		panel_2c.setBackground(Color.BLACK);
		panel_2c.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2c);
		panel_1a.add(t12);
		t12.setContentAreaFilled(false);
		t12.setBorderPainted(false);
		t12.setName("12");

		JPanel panel_2d = new JPanel();
		JButton t13 = new JButton("");
		panel_2d.setBackground(Color.WHITE);
		panel_2d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2d);
		panel_1a.add(t13);
		t13.setContentAreaFilled(false);
		t13.setBorderPainted(false);
		t13.setName("13");

		JPanel panel_2e = new JPanel();
		JButton t14 = new JButton("");
		panel_2e.setBackground(Color.BLACK);
		panel_2e.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2e);
		panel_1a.add(t14);
		t14.setContentAreaFilled(false);
		t14.setBorderPainted(false);
		t14.setName("14");

		JPanel panel_2f = new JPanel();
		JButton t15 = new JButton("");
		panel_2f.setBackground(Color.WHITE);
		panel_2f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2f);
		panel_1a.add(t15);
		t15.setContentAreaFilled(false);
		t15.setBorderPainted(false);
		t15.setName("15");

		JPanel panel_2g = new JPanel();
		JButton t16 = new JButton("");
		panel_2g.setBackground(Color.BLACK);
		panel_2g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2g);
		panel_1a.add(t16);
		t16.setContentAreaFilled(false);
		t16.setBorderPainted(false);
		t16.setName("16");

		JPanel panel_2h = new JPanel();
		JButton t17 = new JButton("");
		panel_2h.setBackground(Color.WHITE);
		panel_2h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_2h);
		panel_1a.add(t17);
		t17.setContentAreaFilled(false);
		t17.setBorderPainted(false);
		t17.setName("17");

		JPanel panel_3a = new JPanel();
		JButton t20 = new JButton("");
		panel_3a.setBackground(Color.WHITE);
		panel_3a.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3a);
		panel_1a.add(t20);
		t20.setContentAreaFilled(false);
		t20.setBorderPainted(false);
		t20.setName("20");

		JPanel panel_3b = new JPanel();
		JButton t21 = new JButton("");
		panel_3b.setBackground(Color.BLACK);
		panel_3b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3b);
		panel_1a.add(t21);
		t21.setContentAreaFilled(false);
		t21.setBorderPainted(false);
		t21.setName("21");

		JPanel panel_3c = new JPanel();
		JButton t22 = new JButton("");
		panel_3c.setBackground(Color.WHITE);
		panel_3c.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3c);
		panel_1a.add(t22);
		t22.setContentAreaFilled(false);
		t22.setBorderPainted(false);
		t22.setName("22");

		JPanel panel_3d = new JPanel();
		panel_3d.setBackground(Color.BLACK);
		panel_3d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3d);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_3e = new JPanel();
		panel_3e.setBackground(Color.WHITE);
		panel_3e.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3e);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_3f = new JPanel();
		panel_3f.setBackground(Color.BLACK);
		panel_3f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3f);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_3g = new JPanel();
		panel_3g.setBackground(Color.WHITE);
		panel_3g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3g);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_3h = new JPanel();
		panel_3h.setBackground(Color.BLACK);
		panel_3h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_3h);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4a = new JPanel();
		panel_4a.setBackground(Color.BLACK);
		panel_4a.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4a);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4b = new JPanel();
		panel_4b.setBackground(Color.WHITE);
		panel_4b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4b);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4c = new JPanel();
		panel_4c.setBackground(Color.BLACK);
		panel_4c.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4c);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4d = new JPanel();
		panel_4d.setBackground(Color.WHITE);
		panel_4d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4d);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4e = new JPanel();
		panel_4e.setBackground(Color.BLACK);
		panel_4e.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4e);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4f = new JPanel();
		panel_4f.setBackground(Color.WHITE);
		panel_4f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4f);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4g = new JPanel();
		panel_4g.setBackground(Color.BLACK);
		panel_4g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4g);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_4h = new JPanel();
		panel_4h.setBackground(Color.WHITE);
		panel_4h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_4h);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5a = new JPanel();
		panel_5a.setBackground(Color.WHITE);
		panel_5a.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5a);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5b = new JPanel();
		panel_5b.setBackground(Color.BLACK);
		panel_5b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5b);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5c = new JPanel();
		panel_5c.setBackground(Color.WHITE);
		panel_5c.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5c);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5d = new JPanel();
		panel_5d.setBackground(Color.BLACK);
		panel_5d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5d);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5e = new JPanel();
		panel_5e.setBackground(Color.WHITE);
		panel_5e.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5e);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5f = new JPanel();
		panel_5f.setBackground(Color.BLACK);
		panel_5f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5f);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5g = new JPanel();
		panel_5g.setBackground(Color.WHITE);
		panel_5g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5g);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_5h = new JPanel();
		panel_5h.setBackground(Color.BLACK);
		panel_5h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_5h);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6a = new JPanel();
		panel_6a.setBackground(Color.BLACK);
		panel_6a.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6a);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6b = new JPanel();
		panel_6b.setBackground(Color.WHITE);
		panel_6b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6b);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6c = new JPanel();
		panel_6c.setBackground(Color.BLACK);
		panel_6c.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6c);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6d = new JPanel();
		panel_6d.setBackground(Color.WHITE);
		panel_6d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6d);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6e = new JPanel();
		panel_6e.setBackground(Color.BLACK);
		panel_6e.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6e);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6f = new JPanel();
		panel_6f.setBackground(Color.WHITE);
		panel_6f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6f);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6g = new JPanel();
		panel_6g.setBackground(Color.BLACK);
		panel_6g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6g);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_6h = new JPanel();
		panel_6h.setBackground(Color.WHITE);
		panel_6h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_6h);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7a = new JPanel();
		panel_7a.setBackground(Color.WHITE);
		panel_7a.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7a);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7b = new JPanel();
		panel_7b.setBackground(Color.BLACK);
		panel_7b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7b);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7c = new JPanel();
		panel_7c.setBackground(Color.WHITE);
		panel_7c.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7c);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7d = new JPanel();
		panel_7d.setBackground(Color.BLACK);
		panel_7d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7d);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7e = new JPanel();
		panel_7e.setBackground(Color.WHITE);
		panel_7e.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7e);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7f = new JPanel();
		panel_7f.setBackground(Color.BLACK);
		panel_7f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7f);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7g = new JPanel();
		panel_7g.setBackground(Color.WHITE);
		panel_7g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7g);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_7h = new JPanel();
		panel_7h.setBackground(Color.BLACK);
		panel_7h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_7h);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8a = new JPanel();
		panel_8a.setBackground(Color.BLACK);
		panel_8a.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8a);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8b = new JPanel();
		panel_8b.setBackground(Color.WHITE);
		panel_8b.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8b);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8c = new JPanel();
		panel_8c.setBackground(Color.BLACK);
		panel_8c.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8c);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8d = new JPanel();
		panel_8d.setBackground(Color.WHITE);
		panel_8d.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8d);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8e = new JPanel();
		panel_8e.setBackground(Color.BLACK);
		panel_8e.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8e);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8f = new JPanel();
		panel_8f.setBackground(Color.WHITE);
		panel_8f.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8f);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8g = new JPanel();
		panel_8g.setBackground(Color.BLACK);
		panel_8g.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8g);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		JPanel panel_8h = new JPanel();
		panel_8h.setBackground(Color.WHITE);
		panel_8h.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(panel_8h);
		panel_1a.add(t11);
		t11.setContentAreaFilled(false);
		t11.setBorderPainted(false);

		frame.setVisible(true);
		t00.addActionListener(this);
		t01.addActionListener(this);
		t02.addActionListener(this);
		t03.addActionListener(this);
		t04.addActionListener(this);
		t05.addActionListener(this);
		t06.addActionListener(this);
		t07.addActionListener(this);
		t10.addActionListener(this);
		t11.addActionListener(this);
		t12.addActionListener(this);
		t13.addActionListener(this);
		t14.addActionListener(this);
		t15.addActionListener(this);
		t16.addActionListener(this);
		t17.addActionListener(this);
		t20.addActionListener(this);
		t21.addActionListener(this);
		t22.addActionListener(this);
		/*
		 * t23.addActionListener(this);
		 * t24.addActionListener(this);
		 * t25.addActionListener(this);
		 * t26.addActionListener(this);
		 * t27.addActionListener(this);
		 * t30.addActionListener(this);
		 * t31.addActionListener(this);
		 * t32.addActionListener(this);
		 * t33.addActionListener(this);
		 * t34.addActionListener(this);
		 * t35.addActionListener(this);
		 * t36.addActionListener(this);
		 * t37.addActionListener(this);
		 * t40.addActionListener(this);
		 * t41.addActionListener(this);
		 * t42.addActionListener(this);
		 * t43.addActionListener(this);
		 * t44.addActionListener(this);
		 * t45.addActionListener(this);
		 * t46.addActionListener(this);
		 * t47.addActionListener(this);
		 * t50.addActionListener(this);
		 * t51.addActionListener(this);
		 * t52.addActionListener(this);
		 * t53.addActionListener(this);
		 * t54.addActionListener(this);
		 * t55.addActionListener(this);
		 * t56.addActionListener(this);
		 * t57.addActionListener(this);
		 * t60.addActionListener(this);
		 * t61.addActionListener(this);
		 * t62.addActionListener(this);
		 * t63.addActionListener(this);
		 * t64.addActionListener(this);
		 * t65.addActionListener(this);
		 * t66.addActionListener(this);
		 * t67.addActionListener(this);
		 * t70.addActionListener(this);
		 * t71.addActionListener(this);
		 * t72.addActionListener(this);
		 * t73.addActionListener(this);
		 * t74.addActionListener(this);
		 * t75.addActionListener(this);
		 * t76.addActionListener(this);
		 * t77.addActionListener(this);
		 */
		System.out.printf("%n" + "Debug: Frame");

	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(((Component) e.getSource()).getName());
		String btn = ((Component) e.getSource()).getName();
		System.out.printf("%n" + "Debug: Actionlistener");
		logic.run(btn);
	}

}
