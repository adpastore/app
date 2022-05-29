package com.app.ap.dto;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    @Basic
    private String nombreUser;
    private String apellidoUser;
    private String tituloUser;
    private String fotoPerfilUser;
    private String acercaUser;
    private String acercasUser;
    private String acercas2User;
    private String telefonoUser;
    private String mailUser;
    private String facebookUser;
    private String githubUser;
    private String instagramUser;
    private String imagenUser;

    public UsuarioDto() {
    }

    public UsuarioDto(Long idUsuario, String nombreUser, String apellidoUser, String tituloUser, String fotoPerfilUser, String acercaUser, String acercasUser, String acercas2User, String telefonoUser, String mailUser, String facebookUser, String githubUser, String instagramUser, String imagenUser) {
        this.idUsuario = idUsuario;
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.tituloUser = tituloUser;
        this.fotoPerfilUser = fotoPerfilUser;
        this.acercaUser = acercaUser;
        this.acercasUser = acercasUser;
        this.acercas2User = acercas2User;
        this.telefonoUser = telefonoUser;
        this.mailUser = mailUser;
        this.facebookUser = facebookUser;
        this.githubUser = githubUser;
        this.instagramUser = instagramUser;
        this.imagenUser = imagenUser;
    }

    
}