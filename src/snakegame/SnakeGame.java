package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SnakeGame(){
		super("Snake Game");
		add(new Board());
		pack();
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SnakeGame();
	}

}
