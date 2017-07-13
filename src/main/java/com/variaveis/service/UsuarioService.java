package com.variaveis.service;

import java.util.List;

import com.variaveis.dao.UsuarioDAO;
import com.variaveis.entity.Usuario;

public class UsuarioService {

	public List<Usuario> findAll() throws Exception {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.findAll();
	}

	public void save(Usuario usuario) throws Exception {
		UsuarioDAO dao = new UsuarioDAO();
		dao.save(usuario);
	}
}
