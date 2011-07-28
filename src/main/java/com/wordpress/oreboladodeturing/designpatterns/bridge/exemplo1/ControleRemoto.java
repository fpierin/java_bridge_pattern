package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo1;

public abstract class ControleRemoto {

	private TV implementador;
	
	public void liga(){
		implementador.liga();
	}
	
	public void desliga(){
		implementador.desliga();
	}
	
	public void sintonizaCanal(final int canal){
		implementador.sintonizaCanal(canal);
	}		
	
}
