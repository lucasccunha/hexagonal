package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Endereco;

public interface EncontrarEnderecoPorCepPortaSaida {
    Endereco encontrar(String cep);
}

