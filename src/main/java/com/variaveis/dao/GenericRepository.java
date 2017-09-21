package com.variaveis.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.variaveis.entity.Entidade;

@Repository
public class GenericRepository {

	@Autowired private Session session;

	public <T extends Entidade> T get(Class<T> classe, Integer id) {
		return classe.cast(session.get(classe, id));
	}

	@SuppressWarnings("unchecked")
	public <T extends Entidade> List<T> findWhere(Entidade entidade) {
		return session.createCriteria(entidade.getClass()).add(Example.create(entidade)).list();
	}

	public <T extends Entidade> T save(T entidade) {
		entidade.setId((Integer) session.save(entidade));
		return entidade;
	}

	public void update(Entidade... entidades) {
		for (Entidade entidade : entidades)
			session.merge(entidade);
	}

	public void delete(Entidade... entidades) {
		for (Entidade entidade : entidades)
			session.delete(entidade);
	}
}
