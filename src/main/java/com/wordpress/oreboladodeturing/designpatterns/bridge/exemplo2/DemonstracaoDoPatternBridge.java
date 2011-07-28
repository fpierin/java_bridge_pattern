package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo2;


public class DemonstracaoDoPatternBridge {

	public static void main(String[] args) {

		Veiculo veiculo = new Onibus(new MotorPequeno());
		veiculo.dirigir();
		veiculo.colocaMotor(new MotorGrande());
		veiculo.dirigir();

		veiculo = new Carro(new MotorGrande());
		veiculo.dirigir();
		veiculo.colocaMotor(new MotorGrande());
		veiculo.dirigir();

	}	
	
}