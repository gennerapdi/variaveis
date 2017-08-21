package com.variaveis.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="opcao_parametro")
public class OpcaoParametro {

	@Id
	@GeneratedValue
	@Column(name="id_opcao_parametro")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_parametro")
	private Parametro paramentro;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="fim_clausula")
	private String fimClausula;
	
	@Column(name="simbolo")
	private String simbolo;
	
	@Column(name="tabela")
	private String tabela;
	
	@Column(name="dinamico")
	private Boolean dinamico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Parametro getParamentro() {
		return paramentro;
	}

	public void setParamentro(Parametro paramentro) {
		this.paramentro = paramentro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFimClausula() {
		return fimClausula;
	}

	public void setFimClausula(String fimClausula) {
		this.fimClausula = fimClausula;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public Boolean getDinamico() {
		return dinamico;
	}

	public void setDinamico(Boolean dinamico) {
		this.dinamico = dinamico;
	}

}
