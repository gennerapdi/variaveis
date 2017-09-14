package com.variaveis.entity;


/*
 * TODO rever código feito na execução da planilha.
 * */
public enum Visao {
	
	CONTRATO(1,"contrato"),
	ADITIVO(2,"aditivo"),
	CONF_DIVIDA(3,"conf. Divida"),
	DECLARACAO(4,"declaração"),
	BOLETIM(5,"boletim"),
	HISTORICO(6,"historico"),
	FICHA_INDIVIDUAL(7,"ficha individual"),
	DIPLOMA(8,"diploma"),
	REQUERIMENTO_MATRICULA(9,"requerimento de Matricula"),
	CARTEIRA_ESTUDANTE(10,"carteira de estudante"),
	DIVERSOS(11,"diversos"),
	BOLETO(12,"boleto"),
	DIARIO_CLASSE(13,"diario de classe"),
	PESSOA(14,"pessoa"), 
	PROCESSO_SELETIVO(15,"processo Seletivo"), // Id no banco diferente do que ta na planilha
	MURAL(16,"mural"),
	SOLICITACAO_BOLSA_SOLICITANTE(17,"solicitação de bolsa(Solicitante)"),
	SOLICITACAO_BOLSA_ALUNO(18,"solicitação de bolsa(Aluno)"),
	FREQUENCIA_PROFESSOR(19,"frequência professor"),
	CERTIFICADO_DISCIPLINA(20,"certificado disciplina");
	
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
