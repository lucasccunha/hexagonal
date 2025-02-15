package com.lucas.hexagonal.adapters.output.repository.mapper;

import com.lucas.hexagonal.adapters.output.repository.entity.ClienteEntidade;
import com.lucas.hexagonal.application.core.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteEntidadeMapper {

    ClienteEntidade paraClienteEntidade(Cliente cliente);
}
