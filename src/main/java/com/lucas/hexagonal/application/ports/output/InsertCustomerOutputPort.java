package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
