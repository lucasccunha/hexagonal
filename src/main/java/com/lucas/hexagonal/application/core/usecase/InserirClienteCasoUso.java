package com.lucas.hexagonal.application.core.usecase;

import com.lucas.hexagonal.application.core.domain.Cliente;
import com.lucas.hexagonal.application.core.domain.Endereco;
import com.lucas.hexagonal.application.ports.input.InserirClientePortaEntrada;
import com.lucas.hexagonal.application.ports.output.EncontrarEnderecoPorCepPortaSaida;
import com.lucas.hexagonal.application.ports.output.InserirClientePortaSaida;

public class InserirClienteCasoUso implements InserirClientePortaEntrada {

    private final EncontrarEnderecoPorCepPortaSaida encontrarEnderecoPorCepPortaSaida;
    private final InserirClientePortaSaida inserirClientePortaSaida;

    public InserirClienteCasoUso(EncontrarEnderecoPorCepPortaSaida encontrarEnderecoPorCepPortaSaida, InserirClientePortaSaida inserirClientePortaSaida) {
        this.encontrarEnderecoPorCepPortaSaida = encontrarEnderecoPorCepPortaSaida;
        this.inserirClientePortaSaida = inserirClientePortaSaida;
    }

    @Override
    public void insert(Cliente cliente, String cep) {

        Endereco endereco = encontrarEnderecoPorCepPortaSaida.encontrar(cep);

        cliente.setEndereco(endereco);

        inserirClientePortaSaida.insert(cliente);
    }
}
