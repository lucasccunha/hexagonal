package com.lucas.hexagonal.adapters.output;

import com.lucas.hexagonal.adapters.output.repository.CustomerRepository;
import com.lucas.hexagonal.adapters.output.repository.mapper.CustomerEntityMapper;
import com.lucas.hexagonal.application.core.domain.Customer;
import com.lucas.hexagonal.application.ports.output.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
