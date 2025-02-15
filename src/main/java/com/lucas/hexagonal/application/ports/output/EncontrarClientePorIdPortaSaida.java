package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Cliente;
import java.util.Optional;

public interface EncontrarClientePorIdPortaSaida {
    Optional<Cliente> find(String id);
}
