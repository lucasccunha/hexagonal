package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Customer;

// Porta de saída usada por InsertCustomerUseCase
// para inserir um cliente no banco de dados

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}

