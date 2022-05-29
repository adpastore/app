package com.app.ap.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String tituloUsuario;
    private String fotoPerfilUsuario;
    private String acercaUsuario;
    private String acercasUsuario;
    private String acercas2Usuario;
    private String telefonoUsuario;
    private String mailUsuario;
    private String facebookUsuario;
    private String githubUsuario;
    private String instagramUsuario;
    private String imagenUsuario;

    //Se mapea con las Clases Educacion/Habilidades/Experiencias 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHab")
    private List<Habilidades> habilidadesList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPot")
    private List<Potencias> potenciasList;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombreUsuario, String apellidoUsuario, String tituloUsuario, String fotoPerfilUsuario, String acercaUsuario, String acercasUsuario, String acercas2Usuario, String telefonoUsuario, String mailUsuario, String facebookUsuario, String githubUsuario, String instagramUsuario, String imagenUsuario, List<Educacion> educacionList, List<Habilidades> habilidadesList, List<Experiencia> experienciaList, List<Potencias> potenciasList) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.tituloUsuario = tituloUsuario;
        this.fotoPerfilUsuario = fotoPerfilUsuario;
        this.acercaUsuario = acercaUsuario;
        this.acercasUsuario = acercasUsuario;
        this.acercas2Usuario = acercas2Usuario;
        this.telefonoUsuario = telefonoUsuario;
        this.mailUsuario = mailUsuario;
        this.facebookUsuario = facebookUsuario;
        this.githubUsuario = githubUsuario;
        this.instagramUsuario = instagramUsuario;
        this.imagenUsuario = imagenUsuario;
        this.educacionList = educacionList;
        this.habilidadesList = habilidadesList;
        this.experienciaList = experienciaList;
        this.potenciasList = potenciasList;
    }

    public Usuario(String nombreUsuario, String apellidoUsuario, String tituloUsuario, String fotoPerfilUsuario, String acercaUsuario, String acercasUsuario, String acercas2Usuario, String telefonoUsuario, String mailUsuario, String facebookUsuario, String githubUsuario, String instagramUsuario, String imagenUsuario, List<Educacion> educacionList, List<Habilidades> habilidadesList, List<Experiencia> experienciaList, List<Potencias> potenciasList) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.tituloUsuario = tituloUsuario;
        this.fotoPerfilUsuario = fotoPerfilUsuario;
        this.acercaUsuario = acercaUsuario;
        this.acercasUsuario = acercasUsuario;
        this.acercas2Usuario = acercas2Usuario;
        this.telefonoUsuario = telefonoUsuario;
        this.mailUsuario = mailUsuario;
        this.facebookUsuario = facebookUsuario;
        this.githubUsuario = githubUsuario;
        this.instagramUsuario = instagramUsuario;
        this.imagenUsuario = imagenUsuario;
        this.educacionList = educacionList;
        this.habilidadesList = habilidadesList;
        this.experienciaList = experienciaList;
        this.potenciasList = potenciasList;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getTituloUsuario() {
        return tituloUsuario;
    }

    public void setTituloUsuario(String tituloUsuario) {
        this.tituloUsuario = tituloUsuario;
    }

    public String getFotoPerfilUsuario() {
        return fotoPerfilUsuario;
    }

    public void setFotoPerfilUsuario(String fotoPerfilUsuario) {
        this.fotoPerfilUsuario = fotoPerfilUsuario;
    }

    public String getAcercaUsuario() {
        return acercaUsuario;
    }

    public void setAcercaUsuario(String acercaUsuario) {
        this.acercaUsuario = acercaUsuario;
    }

    public String getAcercasUsuario() {
        return acercasUsuario;
    }

    public void setAcercasUsuario(String acercasUsuario) {
        this.acercasUsuario = acercasUsuario;
    }

    public String getAcercas2Usuario() {
        return acercas2Usuario;
    }

    public void setAcercas2Usuario(String acercas2Usuario) {
        this.acercas2Usuario = acercas2Usuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    public String getFacebookUsuario() {
        return facebookUsuario;
    }

    public void setFacebookUsuario(String facebookUsuario) {
        this.facebookUsuario = facebookUsuario;
    }

    public String getGithubUsuario() {
        return githubUsuario;
    }

    public void setGithubUsuario(String githubUsuario) {
        this.githubUsuario = githubUsuario;
    }

    public String getInstagramUsuario() {
        return instagramUsuario;
    }

    public void setInstagramUsuario(String instagramUsuario) {
        this.instagramUsuario = instagramUsuario;
    }

    public String getImagenUsuario() {
        return imagenUsuario;
    }

    public void setImagenUsuario(String imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }

    public List<Educacion> getEducacionList() {
        return educacionList;
    }

    public void setEducacionList(List<Educacion> educacionList) {
        this.educacionList = educacionList;
    }

    public List<Habilidades> getHabilidadesList() {
        return habilidadesList;
    }

    public void setHabilidadesList(List<Habilidades> habilidadesList) {
        this.habilidadesList = habilidadesList;
    }

    public List<Experiencia> getExperienciaList() {
        return experienciaList;
    }

    public void setExperienciaList(List<Experiencia> experienciaList) {
        this.experienciaList = experienciaList;
    }

    public List<Potencias> getPotenciasList() {
        return potenciasList;
    }

    public void setPotenciasList(List<Potencias> potenciasList) {
        this.potenciasList = potenciasList;
    }
}
