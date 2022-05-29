package com.app.ap.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PotenciasDto {
    
    private String potencias;
    private int valor;

    public PotenciasDto() {
    }

    public PotenciasDto(String potencias, int valor) {
        this.potencias = potencias;
        this.valor = valor;
    }
}
