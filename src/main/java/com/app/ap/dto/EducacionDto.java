package com.app.ap.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EducacionDto {
    
    private String tituloEdu;
    private int fechaIniEdu;
    private int fechaFinEdu;
    private String descEdu;
    private String imagenEdu;
    private String sedeEdu;
    
    public EducacionDto() {
    }

    public EducacionDto(String tituloEdu, int fechaIniEdu, int fechaFinEdu, String descEdu, String imagenEdu, String sedeEdu) {
        this.tituloEdu = tituloEdu;
        this.fechaIniEdu = fechaIniEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
        this.sedeEdu = sedeEdu;
    }

}
