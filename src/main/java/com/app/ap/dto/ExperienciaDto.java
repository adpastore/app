package com.app.ap.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExperienciaDto {
    
    private String nombreExp;
    private int fechaIniExp;
    private int fechaFinExp;
    private String descExp;
    private String imagenExp;
    private String lugarExp;
    private String asigExp;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String nombreExp, int fechaIniExp, int fechaFinExp, String descExp, String imagenExp, String lugarExp, String asigExp) {
        this.nombreExp = nombreExp;
        this.fechaIniExp = fechaIniExp;
        this.fechaFinExp = fechaFinExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
        this.lugarExp = lugarExp;
        this.asigExp = asigExp;
    }

 
}
