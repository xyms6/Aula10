package com.luis.bet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.bet.dto.UsuarioDTO;
import com.luis.bet.model.UsuarioModel;
import com.luis.bet.repository.Usuariorepository;


@RestController
@RequestMapping("api")
public class UsuarioController {
	
Usuariorepository repository;	

	@PostMapping("/cadastrar")
	public ResponseEntity<?> salvarUsuario(@RequestBody UsuarioDTO user) {
		UsuarioModel usuario = new UsuarioModel(user);
		repository.save(usuario);
		return ResponseEntity.ok("usuario cadastrado");
	}

	
}