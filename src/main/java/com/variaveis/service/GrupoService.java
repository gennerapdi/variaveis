package com.variaveis.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.variaveis.dao.GenericRepository;
import com.variaveis.entity.Grupo;

@Component
public class GrupoService {
	
	@Autowired public GenericRepository dao;
	
	@Transactional
	public Grupo save(Grupo grupo) throws Exception {
		return dao.save(grupo);
	}
}
