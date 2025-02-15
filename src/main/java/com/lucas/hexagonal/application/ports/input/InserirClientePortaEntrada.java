package com.lucas.hexagonal.application.ports.input;

import com.lucas.hexagonal.application.core.domain.Cliente;


public interface InserirClientePortaEntrada {
    void insert(Cliente cliente, String cep);
}
