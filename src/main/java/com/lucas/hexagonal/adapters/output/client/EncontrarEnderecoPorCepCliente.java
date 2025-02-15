package com.lucas.hexagonal.adapters.output.client;

import com.lucas.hexagonal.adapters.output.client.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "EncontrarEnderecoPorCepCliente",
        url = "${lucas.client.address.url}"
)
public interface EncontrarEnderecoPorCepCliente {

    @GetMapping("/{cep}]")
    EnderecoResponse encontrar(@PathVariable("cep") String cep);
}
