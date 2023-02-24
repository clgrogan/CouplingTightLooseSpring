package com.sbmaster.spring.couples.game;

public class TetrisTight {
	
	public void up() {
		System.out.println(this.getClass().getSimpleName() +"-No Action");
	}
	
	public void down() {
		System.out.println(this.getClass().getSimpleName() +"-Drop");
	}
	
	public void left() {
		System.out.println(this.getClass().getSimpleName() +"-Shift Left");
	}
	
	public void right() {
		System.out.println(this.getClass().getSimpleName() +"-Shift Right");
	}
	
}
