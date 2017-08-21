package com.variaveis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="variavel")
public class Variavel {
	
	
	@Id
	@GeneratedValue
	@Column(name="id_variavel")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_grupo")
	private Grupo grupo;
	
	@Column(name="nome_variavel")
	private String nomeVariavel;
	
	@Column(name="nome_exibido")
	private String nomeExibido;
	
	@Column(name="tabela")
	private String tabela;
	
	@Column(name="campo")
	private String campo;
	
	@Column(name="clausula_where")
	private String clausulaWhere;
	
	@Column(name="contexto")
	private String contexto;
	
	@Column(name="tipo_variavel")
	private Integer tipoVariavel;
	
	@Column(name="menu_especificacao")
	private String menuEspecificacao;
	
	@Column(name="campo_especificacao")
	private String campoEspecificacao;
	
	@Column(name="descricao_especificacao")
	private String descricaoEspecificacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getNomeVariavel() {
		return nomeVariavel;
	}

	public void setNomeVariavel(String nomeVariavel) {
		this.nomeVariavel = nomeVariavel;
	}

	public String getNomeExibido() {
		return nomeExibido;
	}

	public void setNomeExibido(String nomeExibido) {
		this.nomeExibido = nomeExibido;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getClausulaWhere() {
		return clausulaWhere;
	}

	public void setClausulaWhere(String clausulaWhere) {
		this.clausulaWhere = clausulaWhere;
	}

	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	public Integer getTipoVariavel() {
		return tipoVariavel;
	}

	public void setTipoVariavel(Integer tipoVariavel) {
		this.tipoVariavel = tipoVariavel;
	}

	public String getMenuEspecificacao() {
		return menuEspecificacao;
	}

	public void setMenuEspecificacao(String menuEspecificacao) {
		this.menuEspecificacao = menuEspecificacao;
	}

	public String getCampoEspecificacao() {
		return campoEspecificacao;
	}

	public void setCampoEspecificacao(String campoEspecificacao) {
		this.campoEspecificacao = campoEspecificacao;
	}

	public String getDescricaoEspecificacao() {
		return descricaoEspecificacao;
	}

	public void setDescricaoEspecificacao(String descricaoEspecificacao) {
		this.descricaoEspecificacao = descricaoEspecificacao;
	}

}
