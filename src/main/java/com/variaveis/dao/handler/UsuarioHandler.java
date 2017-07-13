package com.variaveis.dao.handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.variaveis.entity.Usuario;

public class UsuarioHandler {
	
	private ResultSet resultSet;

	private UsuarioHandler(ResultSet resultSet) { 
		this.resultSet = resultSet;
	}
	
	public static UsuarioHandler create(ResultSet resultSet) {
		return new UsuarioHandler(resultSet);
	}
	
	public List<Usuario> list() throws SQLException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		while (resultSet.next()) {
			Usuario usuario = new Usuario();
			usuario.setId(resultSet.getLong("id"));
			usuario.setNome(resultSet.getString("nome"));
			usuario.setIdade(resultSet.getInt("idade"));
			usuario.setTelefone(resultSet.getInt("telefone"));
			usuario.setData(resultSet.getDate("data"));
			usuarios.add(usuario);	
        }
		return usuarios;
	}

}
