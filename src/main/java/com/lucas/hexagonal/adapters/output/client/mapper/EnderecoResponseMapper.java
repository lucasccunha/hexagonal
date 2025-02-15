package com.lucas.hexagonal.adapters.output.client.mapper;

import com.lucas.hexagonal.adapters.output.client.response.EnderecoResponse;
import com.lucas.hexagonal.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoResponseMapper {

    Endereco paraEndereco(EnderecoResponse enderecoResponse);
}
