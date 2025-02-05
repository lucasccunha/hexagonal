package com.lucas.hexagonal.application.core.usecase;

import com.lucas.hexagonal.application.ports.output.FindCustomerByIdOutputPort;

// Caso de uso responsável por buscar um cliente pelo ID
// Usa FindCustomerByIdOutputPort para realizar a busca
public class FindCustomerByIdUseCase {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }
}


