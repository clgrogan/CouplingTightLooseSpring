package com.sbmaster.spring.couples.game;

public class RunnerTight {

	private MarioTight marioGame;
	private TetrisTight tetrisGame;

	public RunnerTight(MarioTight marioTight) {
		this.marioGame = marioTight;
	}
	public RunnerTight(TetrisTight game) {
		this.tetrisGame = game;
	}

	public void marioRun() {
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();
		
	}
	public void tetrisRun() {
		tetrisGame.up();
		tetrisGame.down();
		tetrisGame.left();
		tetrisGame.right();
		
	}

}
