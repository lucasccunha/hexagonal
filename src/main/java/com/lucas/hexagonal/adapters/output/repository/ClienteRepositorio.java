package com.lucas.hexagonal.adapters.output.repository;

import com.lucas.hexagonal.adapters.output.repository.entity.ClienteEntidade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepositorio extends MongoRepository<ClienteEntidade, String> {
}
