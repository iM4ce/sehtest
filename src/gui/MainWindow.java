package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;
import javax.swing.BorderFactory;

import sehtest.Ergebnis;
import sehtest.Main;
import sehtest.Ring;
import sehtest.Table;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainWindow extends JFrame implements KeyListener {

	private JPanel contentPane;
	private Table test;
	private Table ergebnis;
	private boolean listening;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		 * // Create random test Table test = new Table(1); MainWindow frame = null;
		 */
		
		// Create random test
		Table test = new Table(1, null, null);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
		/*
		 * // Lets get the input System.out.println("Input:");
		 * frame.addKeyListener(frame); Ergebnis ergebnis = new Ergebnis(0, frame);
		 */
	}

	/**
	 * Create the frame.
	 */
	public MainWindow(Table table) {

		this.test = table;
		Border border = BorderFactory.createLineBorder(Color.BLACK);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 872);
		contentPane = new JPanel();
		contentPane.setBorder(border);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		String path = "/img/ELandolt.png";

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel label_00 = new JLabel("");
		label_00.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[0][0].getPath())));
		label_00.setBounds(12, 43, 136, 136);
		label_00.setBorder(border);
		panel.add(label_00);

		JLabel label_01 = new JLabel("");
		label_01.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[0][1].getPath())));
		label_01.setBounds(327, 48, 136, 136);
		label_01.setBorder(border);
		panel.add(label_01);

		JLabel label_02 = new JLabel("");
		label_02.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[0][2].getPath())));
		label_02.setBounds(628, 48, 136, 136);
		label_02.setBorder(border);
		panel.add(label_02);

		JLabel label_03 = new JLabel("");
		label_03.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[0][3].getPath())));
		label_03.setBounds(919, 43, 136, 136);
		label_03.setBorder(border);
		panel.add(label_03);

		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[1][0].getPath())));
		label_10.setBounds(12, 236, 136, 136);
		label_10.setBorder(border);
		panel.add(label_10);

		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[1][1].getPath())));
		label_11.setBounds(252, 236, 136, 136);
		label_11.setBorder(border);
		panel.add(label_11);

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[1][2].getPath())));
		label_12.setBounds(473, 236, 136, 136);
		label_12.setBorder(border);
		panel.add(label_12);

		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[1][3].getPath())));
		label_13.setBounds(707, 236, 136, 136);
		label_13.setBorder(border);
		panel.add(label_13);

		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[1][4].getPath())));
		label_14.setBounds(919, 236, 136, 136);
		label_14.setBorder(border);
		panel.add(label_14);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[2][0].getPath())));
		label_20.setBounds(12, 455, 136, 136);
		label_20.setBorder(border);
		panel.add(label_20);

		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[2][1].getPath())));
		label_21.setBounds(187, 455, 136, 136);
		label_21.setBorder(border);
		panel.add(label_21);

		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[2][2].getPath())));
		label_22.setBounds(369, 455, 136, 136);
		label_22.setBorder(border);
		panel.add(label_22);

		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[2][3].getPath())));
		label_23.setBounds(554, 455, 136, 136);
		label_23.setBorder(border);
		panel.add(label_23);

		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[2][4].getPath())));
		label_24.setBounds(744, 455, 136, 136);
		label_24.setBorder(border);
		panel.add(label_24);

		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[2][5].getPath())));
		label_25.setBounds(919, 455, 136, 136);
		label_25.setBorder(border);
		panel.add(label_25);

		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[3][0].getPath())));
		label_30.setBounds(12, 616, 136, 136);
		label_30.setBorder(border);
		panel.add(label_30);

		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[3][1].getPath())));
		label_31.setBounds(167, 616, 136, 136);
		label_31.setBorder(border);
		panel.add(label_31);

		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[3][2].getPath())));
		label_32.setBounds(327, 616, 136, 136);
		label_32.setBorder(border);
		panel.add(label_32);

		JLabel label_33 = new JLabel("");
		label_33.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[3][3].getPath())));
		label_33.setBounds(480, 616, 136, 136);
		label_33.setBorder(border);
		panel.add(label_33);

		JLabel label_34 = new JLabel("");
		label_34.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[3][4].getPath())));
		label_34.setBounds(628, 616, 136, 136);
		label_34.setBorder(border);
		panel.add(label_34);

		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[3][5].getPath())));
		label_35.setBounds(776, 616, 136, 136);
		label_35.setBorder(border);
		panel.add(label_35);

		JLabel label_36 = new JLabel("");
		label_36.setIcon(new ImageIcon(MainWindow.class.getResource(this.test.rows[3][6].getPath())));
		label_36.setBounds(919, 616, 136, 136);
		label_36.setBorder(border);
		panel.add(label_36);

		// this.addKeyListener(this);

		/*// Create window and open
		MainWindow window = new MainWindow(test);
		window.setVisible(true);

		// Show Tutorial

		// Lets get the input
		System.out.println("Input:");
		this.addKeyListener(test);
		Ergebnis ergebnis = new Ergebnis(0, this);
		this.removeKeyListener(test);
		System.out.println(ergebnis.rows[0][3].getPath());
		System.out.println(ergebnis.rows[3][0].getPath());
		/*
		 * MainWindow window2 = new MainWindow(ergebnis); window.setVisible(false);
		 * System.out.println("Test geschlossen - Öffne Ergebnis");
		 * window2.setVisible(true);
		 */

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (this.listening) {
			int input = e.getKeyChar();
			String direction = Ring.intToDirection(input);
			ergebnis.setRing(direction, );
		}else {
		}

	}*/
}
