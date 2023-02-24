package com.sbmaster.spring.couples.game;

public class AbstractGameRunner {
	private Game game;
	public AbstractGameRunner(Game game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
