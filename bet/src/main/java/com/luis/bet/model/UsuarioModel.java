package com.luis.bet.model;

import java.util.UUID;

import com.luis.bet.dto.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_usuario")

public class UsuarioModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cpf, aniver, email, senha;

	public UsuarioModel( UsuarioDTO user) {
		this.cpf = user.cpf();
		this.aniver = user.aniver();
		this.email = user.email();
		this.senha = user.senha();
	}
	
}

	 
