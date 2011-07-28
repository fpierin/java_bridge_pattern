package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo1;

public class ControleRemotoConcreto extends ControleRemoto {

	private int canalAtual;
	
	public void proximoCanal(){
		canalAtual++;
		sintonizaCanal(canalAtual);
	}
	
	public void canalAnterior(){
		canalAtual--;
		sintonizaCanal(canalAtual);
	}	
	
}
