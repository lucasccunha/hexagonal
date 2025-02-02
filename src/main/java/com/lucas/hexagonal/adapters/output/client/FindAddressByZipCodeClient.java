package com.lucas.hexagonal.adapters.output.client;

import com.lucas.hexagonal.adapters.output.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${lucas.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}]")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
