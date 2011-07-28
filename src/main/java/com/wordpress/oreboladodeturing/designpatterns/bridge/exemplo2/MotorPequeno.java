package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo2;

public class MotorPequeno implements Motor {

	int cavalosForca;

	public MotorPequeno() {
		cavalosForca = 100;
	}

	@Override
	public int liga() {
		System.out.println("O motor pequeno está em funcionamento!");
		return cavalosForca;
	}

}