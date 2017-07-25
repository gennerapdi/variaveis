package com.variaveis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.variaveis.entity.Usuario;
import com.variaveis.service.ExemploService;

@Controller
@RequestMapping("/api/exemplo")
public class ExemploController {
	
	@Autowired public ExemploService exemploService;   

	@RequestMapping(value="/", method = RequestMethod.GET )
	public ResponseEntity<List> findAll() {
		try {
			List<Usuario> usuarios = exemploService.findAll();
			return new ResponseEntity<List>(usuarios, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List>(new ArrayList(), HttpStatus.OK);
	}
}
