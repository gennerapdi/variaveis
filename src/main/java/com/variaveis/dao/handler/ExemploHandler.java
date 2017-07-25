package com.variaveis.dao.handler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.variaveis.entity.Usuario;

public class ExemploHandler {
	
	private List<Map<String, Object>> rows;

	private ExemploHandler(List<Map<String, Object>> rows) { 
		this.rows = rows;
	}
	
	public static ExemploHandler create(List<Map<String, Object>> rows) {
		return new ExemploHandler(rows);
	}
	
	public List<Usuario> list() throws SQLException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		for (Map row : rows) {
			Usuario usuario = new Usuario();
			usuario.setId(((Integer)row.get("id")).longValue());
			usuario.setNome((String)row.get("nome"));
			usuario.setIdade((Integer)row.get("idade"));
			usuario.setTelefone((Integer)row.get("telefone"));
			usuario.setData((Date)row.get("data"));
			usuarios.add(usuario);	
        }
		return usuarios;
	}

}
