package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo1;

public class Phillips implements TV {

	@Override
	public final void liga() {
		System.out.println("Ligando a tv Phillips!");
	}

	@Override
	public final void desliga() {
		System.out.println("Desligando a tv Phillips!");
	}

	@Override
	public final void sintonizaCanal(final int canal) {
		System.out.println("Sintonizando o canal " + canal + " da TV Phillips");
	}

}
