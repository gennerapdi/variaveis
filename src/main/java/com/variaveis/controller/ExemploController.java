package com.variaveis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.variaveis.dto.UsuarioDTO;
import com.variaveis.dto.builder.UsuarioBuilder;
import com.variaveis.dto.builder.UsuarioDTOBuilder;
import com.variaveis.entity.Usuario;
import com.variaveis.service.ExemploService;

@Controller
@RequestMapping("/api/exemplo")
public class ExemploController {
	
	@Autowired public ExemploService exemploService;   

	@RequestMapping(value="/", method = RequestMethod.GET )
	@Transactional
	public ResponseEntity<List> findAll() {
		try {
			List<Usuario> usuarios = exemploService.findAll();
			UsuarioDTOBuilder builder = new UsuarioDTOBuilder();
			return new ResponseEntity<List>(builder.createLista(usuarios), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List>(new ArrayList(), HttpStatus.OK);
	} 
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO usuarioDTO, BindingResult result) {
		try {
			UsuarioBuilder builder = new UsuarioBuilder();
			Usuario usuario = builder.create(usuarioDTO);
			usuario = exemploService.save(usuario);
			UsuarioDTOBuilder builderDTO = new UsuarioDTOBuilder();
			return new ResponseEntity<UsuarioDTO>(builderDTO.create(usuario), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
