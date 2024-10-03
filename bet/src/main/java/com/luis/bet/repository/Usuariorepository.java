package com.luis.bet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.bet.model.UsuarioModel;

  
	public interface Usuariorepository extends JpaRepository<UsuarioModel, UUID>{
		
	 
  
 
}
