package com.sbmaster.spring.couples.game;

public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("Jump");
	}
	
	@Override
	public void down() {
		System.out.println("Crouch / Enter Hole");
	}
	
	@Override
	public void left() {
		System.out.println("Stop");
	}
	
	@Override
	public void right() {
		System.out.println("Accelerate");
	}
	
}
