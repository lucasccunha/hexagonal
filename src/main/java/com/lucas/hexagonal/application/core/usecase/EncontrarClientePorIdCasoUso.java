package com.lucas.hexagonal.application.core.usecase;

import com.lucas.hexagonal.application.ports.output.EncontrarClientePorIdPortaSaida;

public class EncontrarClientePorIdCasoUso {

    private final EncontrarClientePorIdPortaSaida encontrarClientePorIdPortaSaida;

    public EncontrarClientePorIdCasoUso(EncontrarClientePorIdPortaSaida encontrarClientePorIdPortaSaida) {
        this.encontrarClientePorIdPortaSaida = encontrarClientePorIdPortaSaida;
    }
}
