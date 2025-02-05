package com.lucas.hexagonal.adapters.input.controller;

import com.lucas.hexagonal.application.ports.input.InsertCustomerInputPort;
import com.lucas.hexagonal.adapters.input.controller.request.CustomerRequest;
import com.lucas.hexagonal.adapters.input.controller.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

/**
 * Controlador REST responsável pelo endpoint de criação de clientes.
 * Esta classe utiliza a porta de entrada InsertCustomerInputPort para inserir clientes.
 */
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}