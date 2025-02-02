package com.lucas.hexagonal.adapters.output;

import com.lucas.hexagonal.adapters.output.client.FindAddressByZipCodeClient;
import com.lucas.hexagonal.adapters.output.client.mapper.AddressResponseMapper;
import com.lucas.hexagonal.application.core.domain.Address;
import com.lucas.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

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
