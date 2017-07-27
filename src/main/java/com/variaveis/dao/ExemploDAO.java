package com.variaveis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.variaveis.entity.Usuario;

@Repository
public class ExemploDAO {

	@Autowired private HibernateTemplate hibernateTemplate;

	public List<Usuario> findAll() throws Exception {
		return hibernateTemplate.loadAll(Usuario.class);
    } 
	
	public Usuario get(Long id) {		
		return hibernateTemplate.get(Usuario.class, id);
	}
	
	public Usuario save(Usuario usuario) {		
		Long id = (Long) hibernateTemplate.save(usuario);
		hibernateTemplate.flush();
		return get(id);
	}
	
}
