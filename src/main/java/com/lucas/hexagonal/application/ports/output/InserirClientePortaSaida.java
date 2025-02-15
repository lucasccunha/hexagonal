package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Cliente;

public interface InserirClientePortaSaida {
    void insert(Cliente cliente);

}

