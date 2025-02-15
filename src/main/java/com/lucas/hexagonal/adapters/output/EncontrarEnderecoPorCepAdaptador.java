package com.lucas.hexagonal.adapters.output;

import com.lucas.hexagonal.adapters.output.client.EncontrarEnderecoPorCepCliente;
import com.lucas.hexagonal.adapters.output.client.mapper.EnderecoResponseMapper;
import com.lucas.hexagonal.application.core.domain.Endereco;
import com.lucas.hexagonal.application.ports.output.EncontrarEnderecoPorCepPortaSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Adaptador que implementa a porta de saída EncontrarEnderecoPorCepPortaSaida.
 * Esta classe é utilizada pelo core da aplicação para buscar endereços pelo CEP via cliente HTTP.
 */
@Component
public class EncontrarEnderecoPorCepAdaptador implements EncontrarEnderecoPorCepPortaSaida {

    @Autowired
    private EncontrarEnderecoPorCepCliente encontrarEnderecoPorCepCliente;

    @Autowired
    private EnderecoResponseMapper enderecoResponseMapper;

    @Override
    public Endereco encontrar(String cep) {
        var enderecoResponse = encontrarEnderecoPorCepCliente.encontrar(cep);
        return enderecoResponseMapper.paraEndereco(enderecoResponse);
    }
}
