package com.lucas.hexagonal.adapters.output;

import com.lucas.hexagonal.adapters.output.repository.ClienteRepositorio;
import com.lucas.hexagonal.adapters.output.repository.mapper.ClienteEntidadeMapper;
import com.lucas.hexagonal.application.core.domain.Cliente;
import com.lucas.hexagonal.application.ports.output.InserirClientePortaSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Adaptador que implementa a porta de saída InserirClientePortaSaida.
 * Esta classe é utilizada pelo core da aplicação para inserir clientes no banco de dados.
 */
@Component
public class InserirClienteAdaptador implements InserirClientePortaSaida {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private ClienteEntidadeMapper clienteEntidadeMapper;

    @Override
    public void insert(Cliente cliente) {
        var clienteEntidade = clienteEntidadeMapper.paraClienteEntidade(cliente);
        clienteRepositorio.save(clienteEntidade);
    }
}
