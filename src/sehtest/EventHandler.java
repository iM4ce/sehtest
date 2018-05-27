package sehtest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gui.MainWindow;

public class EventHandler implements KeyListener{

	private boolean listening;
	
	public EventHandler() {
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e, MainWindow window, Table test) {
		// TODO Auto-generated method stub
		if(this.listening) {
			int input = e.getKeyChar();
			String direction = Ring.intToDirection(input);
			test.setRing(direction, this);
		}else {
			window.removeKeyListener(this);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public boolean isListening() {
		return this.listening;
	}
	public void setListening(boolean l) {
		this.listening=l;
	}

}
