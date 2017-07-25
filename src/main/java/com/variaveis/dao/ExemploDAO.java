package com.variaveis.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.variaveis.dao.handler.ExemploHandler;
import com.variaveis.entity.Usuario;

@Repository
public class ExemploDAO {

	@Autowired private JdbcTemplate jdbcTemplate;

	public List<Usuario> findAll() throws Exception {
		String sql = "SELECT * FROM usuario";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        return ExemploHandler.create(rows).list();
    } 
}
