package com.lucas.hexagonal.adapters.output.client.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String street;
    private String city;
    private String state;
}
