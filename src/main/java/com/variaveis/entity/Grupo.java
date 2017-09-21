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
@Table(name="grupo")
public class Grupo extends Entidade{

	private static final long serialVersionUID = 5160652835887443442L;

	@Id
	@GeneratedValue
	@Column(name="id_grupo")
	private Integer id;
	
	@OneToMany(mappedBy = "grupo",fetch = FetchType.LAZY, cascade=CascadeType.ALL,targetEntity = Variavel.class)
	private List<Variavel> variaveis;

	@ManyToOne
	@JoinColumn(name = "id_grupo_pai", referencedColumnName = "id_grupo")
	private Grupo grupoPai;
	
	@OneToMany(mappedBy = "grupoPai", fetch = FetchType.LAZY, cascade=CascadeType.ALL, targetEntity = Grupo.class)
	private List<Grupo> gruposFilhos;
	
	@Column(name="titulo")
	private String titulo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Grupo getGrupoPai() {
		return grupoPai;
	}

	public void setGrupoPai(Grupo grupo) {
		this.grupoPai = grupo;
	}

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

	public List<Grupo> getGruposFilhos() {
		return gruposFilhos;
	}

	public void setGruposFilhos(List<Grupo> gruposFilhos) {
		this.gruposFilhos = gruposFilhos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grupoPai == null) ? 0 : grupoPai.hashCode());
		result = prime * result + ((gruposFilhos == null) ? 0 : gruposFilhos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((variaveis == null) ? 0 : variaveis.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (grupoPai == null) {
			if (other.grupoPai != null)
				return false;
		} else if (!grupoPai.equals(other.grupoPai))
			return false;
		if (gruposFilhos == null) {
			if (other.gruposFilhos != null)
				return false;
		} else if (!gruposFilhos.equals(other.gruposFilhos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (variaveis == null) {
			if (other.variaveis != null)
				return false;
		} else if (!variaveis.equals(other.variaveis))
			return false;
		return true;
	}

}
