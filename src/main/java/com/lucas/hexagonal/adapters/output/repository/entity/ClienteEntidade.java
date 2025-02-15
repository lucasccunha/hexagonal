package com.lucas.hexagonal.adapters.output.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "clientes")
public class ClienteEntidade {

    @Id
    private String id;
    private String nome;
    private EnderecoEntidade endereco;
    private String cpf;
    private Boolean cpfValido;
}
