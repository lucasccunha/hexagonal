package com.lucas.hexagonal.application.ports.input;

import com.lucas.hexagonal.application.core.domain.Customer;

// Porta de entrada usada pelo controlador para inserir um cliente
public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
