package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.implementacao;

import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.interfaces.Tarefa;

public class TestesManuais implements Tarefa {

	@Override
	public void realiza() {
		System.out.println("constrói testes manuais");
	}

}
