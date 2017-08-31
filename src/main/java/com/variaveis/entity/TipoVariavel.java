package com.variaveis.entity;

public enum TipoVariavel {
	
	COMUM(1,"comum"),
	LISTA(2,"lista");
	
	private final int id;
	private final String nome;

	public int value() {
		return id;
	}
	
	public String nome() {
		return nome;
	}
	
	private TipoVariavel(int id, String nome){
		this.id = id;
		this.nome = nome;
	}
}
