package com.lucas.hexagonal.adapters.output;

import com.lucas.hexagonal.adapters.output.client.FindAddressByZipCodeClient;
import com.lucas.hexagonal.adapters.output.client.mapper.AddressResponseMapper;
import com.lucas.hexagonal.application.core.domain.Address;
import com.lucas.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Adaptador que implementa a porta de saída FindAddressByZipCodeOutputPort.
 * Esta classe é utilizada pelo core da aplicação para buscar endereços pelo CEP via cliente HTTP.
 */
@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}