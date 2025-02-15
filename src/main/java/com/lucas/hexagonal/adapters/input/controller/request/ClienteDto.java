package com.lucas.hexagonal.adapters.input.controller.request;

import jakarta.validation.constraints.NotBlank;

public record ClienteDto(
        @NotBlank String nome,
        @NotBlank String cpf,
        @NotBlank String cep
) {}
