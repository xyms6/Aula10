package com.luis.bet.dto;

import java.util.UUID;

public record UsuarioDTO(Long id, String cpf, String aniver, String email, String senha) {
}
