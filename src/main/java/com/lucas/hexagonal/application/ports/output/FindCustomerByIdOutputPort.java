package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Customer;
import java.util.Optional;

// Porta de saída usada por FindCustomerByIdUseCase
// para buscar um cliente pelo ID
public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
