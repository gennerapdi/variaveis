package com.variaveis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.variaveis.entity.Grupo;

@Repository
public class GrupoDAO {

	@Autowired private HibernateTemplate hibernateTemplate;
	
	public Grupo get(Long id) {
		
		return hibernateTemplate.get(Grupo.class, id);
	}
	
	public Grupo save(Grupo grupo){
		if(hibernateTemplate == null ) System.out.println("ta nulo");
		Long id = (Long) hibernateTemplate.save(grupo);
		hibernateTemplate.flush();
		return get(id);
	}


}
