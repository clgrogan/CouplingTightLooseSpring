package com.sbmaster.spring.couples.game;

public class MarioTight {
	
	public void up() {
		System.out.println(this.getClass().getSimpleName() +"-Jump");
	}
	
	public void down() {
		System.out.println(this.getClass().getSimpleName() +"-Crouch / Enter Hole");
	}
	
	public void left() {
		System.out.println(this.getClass().getSimpleName() +"-Stop");
	}
	
	public void right() {
		System.out.println(this.getClass().getSimpleName() +"-Accelerate");
	}
	
}
