package com.example.geradorus.dto;

import jakarta.validation.constraints.NotBlank;

//@Data
public record TipoUSInputDTO(@NotBlank String descricao, long tipoTarefaId) {

}
