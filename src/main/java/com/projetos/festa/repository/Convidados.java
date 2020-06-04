package com.projetos.festa.repository;

import java.util.ArrayList;
import java.util.List;

import com.projetos.festa.model.Convidado;
import org.springframework.stereotype.Repository;

@Repository
public class Convidados {
	
	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();
	
	static {
		LISTA_CONVIDADOS.add(new Convidado("Pedro",2));
		LISTA_CONVIDADOS.add(new Convidado("Maria",3));
		LISTA_CONVIDADOS.add(new Convidado("Ricardo",1));
		
		}
	
	public List<Convidado> todos(){
		return Convidados.LISTA_CONVIDADOS;
	}

	public void adicionar(Convidado convidado) {
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}
}
