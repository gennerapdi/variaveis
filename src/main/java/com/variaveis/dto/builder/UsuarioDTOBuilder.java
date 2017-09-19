package com.variaveis.dto.builder;

import java.util.ArrayList;
import java.util.List;

import com.variaveis.dto.TelefoneDTO;
import com.variaveis.dto.UsuarioDTO;
import com.variaveis.entity.Telefone;
import com.variaveis.entity.Usuario;

public class UsuarioDTOBuilder {
	
	public List<UsuarioDTO> createLista(List<Usuario> usuarios) {
		List<UsuarioDTO> usuariosDTO = new ArrayList<UsuarioDTO>();
		for (Usuario usuario : usuarios) {
			usuariosDTO.add(create(usuario));
		}
		return usuariosDTO;
	}
	
	public UsuarioDTO create(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setCodigo(usuario.getId());
		dto.setNome(usuario.getNome());
		dto.setData(usuario.getData());
		dto.setIdade(usuario.getIdade());
		dto.setTelefones(telefones(usuario));
		return dto;
	}
	
	public List<TelefoneDTO> telefones(Usuario usuario) {
		List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
		for (Telefone telefone : usuario.getTelefones()) {
			TelefoneDTO dto = new TelefoneDTO();
			dto.setCodigo(telefone.getId());
			dto.setCodigoArea(telefone.getCodigoArea());
			dto.setNumero(telefone.getNumero());
			telefones.add(dto);
		}
		return telefones;
	}
	
}
