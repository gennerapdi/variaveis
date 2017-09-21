package com.variaveis.dto.builder;

import java.util.ArrayList;
import java.util.List;

import com.variaveis.dto.TelefoneDTO;
import com.variaveis.dto.UsuarioDTO;
import com.variaveis.entity.Telefone;
import com.variaveis.entity.Usuario;

public class UsuarioBuilder {
	
	public List<Usuario> createLista(List<UsuarioDTO> usuariosDTO) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		for (UsuarioDTO usuarioDTO : usuariosDTO) {
			usuarios.add(create(usuarioDTO));
		}
		return usuarios;
	}
	
	public Usuario create(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setId(usuarioDTO.getCodigo());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setData(usuarioDTO.getData());
		usuario.setIdade(usuarioDTO.getIdade());
		usuario.setTelefones(telefones(usuarioDTO));
		return usuario;
	}
	
	public List<Telefone> telefones(UsuarioDTO usuarioDTO) {
		List<Telefone> telefones = new ArrayList<Telefone>();
		for (TelefoneDTO telefoneDTO : usuarioDTO.getTelefones()) {
			Telefone telefone = new Telefone();
			telefone.setId(telefoneDTO.getCodigo());
			telefone.setCodigoArea(telefoneDTO.getCodigoArea());
			telefone.setNumero(telefoneDTO.getNumero());
			telefones.add(telefone);
		}
		return telefones;
	}
	
}
