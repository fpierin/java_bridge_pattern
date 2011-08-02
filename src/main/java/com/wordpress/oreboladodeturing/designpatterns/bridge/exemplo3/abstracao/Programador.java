package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.abstracao;

import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.interfaces.Colaborador;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.interfaces.Tarefa;

public class Programador implements Colaborador {
	
	private Tarefa tarefa;

	public Programador(final Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public void produz() {
		System.out.println("\nProgramador trabalhando ");
		tarefa.realiza();
	}

	@Override
	public void recebeTarefa(final Tarefa tarefa) {
		this.tarefa = tarefa;		
	}

}
