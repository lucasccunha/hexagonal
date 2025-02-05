package com.lucas.hexagonal.application.core.usecase;

import com.lucas.hexagonal.application.core.domain.Address;
import com.lucas.hexagonal.application.core.domain.Customer;
import com.lucas.hexagonal.application.ports.input.InsertCustomerInputPort;
import com.lucas.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import com.lucas.hexagonal.application.ports.output.InsertCustomerOutputPort;

// Caso de uso responsável por inserir um cliente

// FindAddressByZipCodeOutputPort para buscar o endereço
// InsertCustomerOutputPort para salvar o cliente

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        // Busca o endereço pelo CEP
        Address address = findAddressByZipCodeOutputPort.find(zipCode);
        // Associa o endereço ao cliente
        customer.setAddress(address);
        // Insere o cliente no sistema
        insertCustomerOutputPort.insert(customer);
    }
}
