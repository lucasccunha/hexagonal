package com.lucas.hexagonal.adapters.input.controller;

import com.lucas.hexagonal.adapters.input.controller.mapper.ClienteMapper;
import com.lucas.hexagonal.adapters.input.controller.request.ClienteDto;
import com.lucas.hexagonal.application.ports.input.InserirClientePortaEntrada;
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
public class ClienteController {

    @Autowired
    private InserirClientePortaEntrada insertCustomerInputPort;

    @Autowired
    private ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody ClienteDto clienteDto) {
        var customer = clienteMapper.paraCliente(clienteDto);
        insertCustomerInputPort.insert(customer, clienteDto.cep());
        return ResponseEntity.ok().build();
    }
}