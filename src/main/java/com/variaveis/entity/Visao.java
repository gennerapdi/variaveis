package com.variaveis.entity;

public enum Visao {
	
	CONTRATO(1,"contrato"),
	ADITIVO(2,"aditivo"),
	CONF_DIVIDA(3,"conf. Divida"),
	DECLARACAO(4,"declaração"),
	BOLETIM(5,"boletim"),
	;
	
	
	
	
	private final int id;
	private final String nome;

	public int value() {
		return id;
	}
	
	public String nome() {
		return nome;
	}
	
	private Visao(int id, String nome){
		this.id = id;
		this.nome = nome;
	}

}
