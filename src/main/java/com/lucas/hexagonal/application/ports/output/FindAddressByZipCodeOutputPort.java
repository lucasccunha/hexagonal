package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Address;

// Porta de saída usada por InsertCustomerUseCase
// para buscar um endereço pelo CEP
public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
