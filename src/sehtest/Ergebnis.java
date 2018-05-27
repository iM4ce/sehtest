package sehtest;

import java.util.Scanner;

import gui.MainWindow;

import java.awt.event.*;

public class Ergebnis extends Table {

	public Ergebnis(int random, MainWindow window) {
		super(random, window);
		// TODO Auto-generated constructor stub
	}

	public void evaluate(Table test) {
		if (test.rowCount == this.rowCount) {

			Ring[][] rows = new Ring[][] { this.row1, this.row2, this.row3, this.row4 };
			Ring[][] rows2 = new Ring[][] { test.row1, test.row2, test.row3, test.row4 };
			int[] pointsPerRow = new int[test.rowCount];
			int points = 0;

			int x = 0;
			while (x < rows.length) {
				int y = 0;
				while (y < rows[x].length) {
					String dir1 = rows[x][y].getDirection();
					String dir2 = rows2[x][y].getDirection();
					if (dir1.equals(dir2)) {
						pointsPerRow[x]++;
						points++;
						x++;
					}
				}
			}

		}
	}
}



