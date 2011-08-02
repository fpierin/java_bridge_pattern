package com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.main;

import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.abstracao.Homologador;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.abstracao.Programador;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.implementacao.ProgramacaoJava;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.implementacao.ProgramacaoRuby;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.implementacao.TestesAutomatizados;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.implementacao.TestesManuais;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.interfaces.Colaborador;
import com.wordpress.oreboladodeturing.designpatterns.bridge.exemplo3.interfaces.Tarefa;


public class ExemploDoPatternBridge {

	public static void main(final String[] args) {

		// Eu gosto de programar em java, então eu posso criar um programador que executa a tarefa de programar em Java 
		Tarefa tarefaDoProgramador = new ProgramacaoJava();
		final Colaborador programador = new Programador(tarefaDoProgramador);	
		programador.produz();
		
		// Eu também gosto de Ruby, então se recebesse uma tarefa em ruby ficaria feliz!
		tarefaDoProgramador = new ProgramacaoRuby();
		programador.recebeTarefa(tarefaDoProgramador);		
		programador.produz();
		
		// Mas se a situação aperta e me pedem testes automatizados, em problemas eu faço também!
		tarefaDoProgramador = new TestesAutomatizados();
		programador.recebeTarefa(tarefaDoProgramador);		
		programador.produz();		
		
		// No caso do colaborador, temos o mesmo, ele faz testes manuais
		Tarefa tarefaDoHomologador = new TestesManuais();
		final Colaborador homologador = new Homologador(tarefaDoHomologador);
		homologador.produz();
		
		// Mas se a situação aperta ele pode programar até em Ruby!
		tarefaDoHomologador = new ProgramacaoRuby();
		homologador.recebeTarefa(tarefaDoHomologador);		
		homologador.produz();		
		
	}

}
