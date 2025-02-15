package com.lucas.hexagonal.adapters.input.controller.mapper;

import com.lucas.hexagonal.adapters.input.controller.request.ClienteDto;
import com.lucas.hexagonal.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "endereco", ignore = true)
    @Mapping(target = "cpfValido", ignore = true)
    Cliente paraCliente(ClienteDto customerDto);
}

