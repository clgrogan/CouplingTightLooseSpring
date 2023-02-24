package com.sbmaster.spring.couples.springgame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sbmaster.spring.couples.game.GamingConsole;

@Component
public class Runner {
	
	@Autowired
	private GamingConsole game;

	public Runner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
