package sehtest;

import gui.*;
import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {

		// Create random test
		Table test = new Table(1, null);

		// Create window and open
		MainWindow window = new MainWindow(test);
		window.setVisible(true);

		// Show Tutorial

		// Lets get the input
		System.out.println("Input:");
		Ergebnis ergebnis = new Ergebnis(0, window);
	
		/*MainWindow window2 = new MainWindow(ergebnis);
		window.setVisible(false);
		System.out.println("Test geschlossen - �ffne Ergebnis");
		window2.setVisible(true);*/

	}

}
