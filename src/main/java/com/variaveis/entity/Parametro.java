package com.variaveis.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="parametro")
public class Parametro {

	@Id
	@GeneratedValue
	@Column(name="id_paramentro")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="inicio_clausula")
	private String inicioClausula;
	
	@OneToMany(mappedBy="paramentro",targetEntity=OpcaoParametro.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<OpcaoParametro> opcao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInicioClausula() {
		return inicioClausula;
	}

	public void setInicioClausula(String inicioClausula) {
		this.inicioClausula = inicioClausula;
	}
	
	
}
