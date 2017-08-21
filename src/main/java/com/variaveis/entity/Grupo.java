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
@Table(name="grupo")
public class Grupo {
	
	@Id
	@GeneratedValue
	@Column(name="id_grupo")
	private Integer id;
	
	@OneToMany(mappedBy = "grupo",fetch = FetchType.LAZY, cascade=CascadeType.ALL,targetEntity = Variavel.class)
	private List<Variavel> variaveis;


//	
//	private Grupo grupoPai;
	
	@Column(name="titulo")
	private String titulo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Grupo getGrupo() {
//		return grupo;
//	}
//
//	public void setGrupo(Grupo grupo) {
//		this.grupo = grupo;
//	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Variavel> getVariaveis() {
		return variaveis;
	}

	public void setVariaveis(List<Variavel> variaveis) {
		this.variaveis = variaveis;
	}
	
	
	

}
