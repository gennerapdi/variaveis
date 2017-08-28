package com.variaveis.entity;

public enum Contexto {
	
	MATRICULA(1,"matricula"),
	DIARIO_CLASSE(2,"vw_gdoc_contexto_diario_classe"),
	PESSOA(3,"pessoa"),
	PROCESSO_SELETIVO(4,"processo_seletivo"),
	USUARIO(5,"usuario"),
	FILANTROPIA_SOLICITACAO(6,"filantropia_solicitacao"),
	FINANTROPIA_ALUNO_SOLICITACAO(7,"filantropia_aluno_solicitacao"),
	CALENDARIO(8,"vw_gdoc_instituicao_calendario"),
	ANO_ESCOLAR(9,"vw_gdoc_contexto_ano_escolar");

	private final int id;
	private final String nome;

	public int value() {
		return id;
	}
	
	public String nome() {
		return nome;
	}
	
	private Contexto(int id, String nome){
		this.id = id;
		this.nome = nome;
	}
}
