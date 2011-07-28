package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo2;

public abstract class Veiculo {
	
	protected Motor motor;
	protected int pesoEmKilos;
	
	public abstract void dirigir();
	
	public void colocaMotor(final Motor motor){
		this.motor = motor;
	}
	
	public void avisarDeAcordoComVelocidade(final int cavalosForca){
		final int razao = pesoEmKilos / cavalosForca;
		if (razao < 3){
			System.out.println("O ve�culo est� r�pido.");
		} else if ((razao >= 3) && (razao < 8)){
			System.out.println("O ve�culo est� extremamente r�pido.");
		} else {
			System.out.println("O ve�culo est� devagar.");			
		}
	}
	
}
