package com.lucas.hexagonal.application.ports.output;

import com.lucas.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
