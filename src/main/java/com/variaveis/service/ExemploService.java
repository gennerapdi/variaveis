package com.variaveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.variaveis.dao.ExemploDAO;
import com.variaveis.entity.Usuario;

@Component
public class ExemploService {
	
	@Autowired public ExemploDAO dao;

	public List<Usuario> findAll() throws Exception {
		return dao.findAll();
	}

}
