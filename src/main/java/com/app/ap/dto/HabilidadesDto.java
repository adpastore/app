package com.app.ap.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HabilidadesDto {
    
    private String nombreHab;
    private String descHab;
    private String imagenHab;
    private int porcHab;

    public HabilidadesDto() {
    }

    public HabilidadesDto(String nombreHab, String descHab, String imagenHab, int porcHab) {
        this.nombreHab = nombreHab;
        this.descHab = descHab;
        this.imagenHab = imagenHab;
        this.porcHab = porcHab;
    }

}
