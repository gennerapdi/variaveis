package com.variaveis.entity;

import java.io.Serializable;

public abstract class Entidade implements Serializable {
	private static final long serialVersionUID = -5515710797590190307L;

	public abstract void setId(Integer id);
}