package sehtest;

import sehtest.Ring;
import java.util.*;

import javax.swing.JFrame;

import gui.MainWindow;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Table{
	// Grundgerüst für die Tabelle
	public Ring[] row1 = new Ring[4];
	public Ring[] row2 = new Ring[5];
	public Ring[] row3 = new Ring[6];
	public Ring[] row4 = new Ring[7];
	// Anzahl Reihen
	int rowCount = 4;
	public Ring[][] rows = new Ring[][] { this.row1, this.row2, this.row3, this.row4 };
	// Anzahl Elemente
	int elements = row1.length + row2.length + row3.length + row4.length;
	// Koordinaten für Adressierung Ringe in rows[][]
	private int x;
	private int y;
	//Tabelle fertig?
	boolean isSet;
	// Richtungen
	final String N = "N";
	final String NE = "NE";
	final String E = "E";
	final String SE = "SE";
	final String S = "S";
	final String SW = "SW";
	final String W = "W";
	final String NW = "NW";
	// Richtungsarray
	String[] directions = new String[] { N, NE, E, SE, S, SW, W, NW };

	// Erzeuge eine Tabelle random oder custom und gebe das Fenster mit um Objekte
	// zu ändern
	public Table(int random, MainWindow window) {

		this.x = 0;
		this.y = 0;

		if (random == 1) {
			for (int x = 0; x <= this.rowCount - 1; x++) {
				this.rows[x] = this.generateRow(this.rows[x], this.directions);
			}
		} else {
			this.setRow(window);
		}
	}

	private Ring[] generateRow(Ring[] row, String[] directions) {

		int x = 0;// Iterator=Index

		// Definieren hoechster zulaessiger Index
		int range = directions.length - 1;

		while (x <= row.length - 1) {
			// Wuerfeln
			int randomVal = (int) (Math.random() * range);

			// Erstelle am aktuellen Punkt einen Ring mit Direction fuer randomVal
			row[x] = new Ring(directions[randomVal]);

			// Tausche den zugewiesenen mit dem letzten in der Kette und verringere die
			// Range um 1
			String rett = directions[range];
			directions[range] = directions[randomVal];
			directions[randomVal] = rett;

			x++;

			range--;
		}

		return row;
	}

	public void setRow(MainWindow window) {
		window.addKeyListener(window);
		
	}

	public void setRing(String direction) {
		int x = this.x;
		int y = this.y;

		if (this.x == rowCount - 1 && this.y == this.rows[this.rowCount - 1].length - 1) {
			// Ende
			this.rows[x][y] = new Ring(direction);
			System.out.println(this.rows[x][y].getDirection() + "||X: " + x + "||Y: " + y);
			System.out.println("Auswertung");
		} else {
			if (x < this.rowCount) {
				if (y < this.rows[x].length) {
					this.rows[x][y] = new Ring(direction);
					System.out.println(this.rows[x][y].getDirection() + "||X: " + x + "||Y: " + y);
					this.y++;
				} else {
					this.y = 0;
					this.x++;
				}
			}
		}

	}


}
