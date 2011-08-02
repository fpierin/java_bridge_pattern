package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.implementacao;

import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.interfaces.Tarefa;

public class TestesAutomatizados implements Tarefa {

	@Override
	public void realiza() {
		System.out.println("constrói testes automatizados");
	}

}
