package com.lucas.hexagonal.adapters.output.repository.mapper;

import com.lucas.hexagonal.adapters.output.repository.entity.CustomerEntity;
import com.lucas.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}