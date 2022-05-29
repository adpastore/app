package com.app.ap.services;

import com.app.ap.exception.UserNotFoundException;
import com.app.ap.models.Usuario;
import com.app.ap.repository.UsuarioRepo;
import java.util.List;
import org.hibernate.criterion.IdentifierProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    //Se declara el CRUM
    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarUsuario() {
        return usuarioRepo.findAll();
    }
    public Usuario editarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario); 
    }
    public void borrarUsuario(Long idUsuario) {
        usuarioRepo.deleteById(idUsuario);
    }
    
    public Usuario buscaUsuarioPorId(Long idUsuario){
        return usuarioRepo.findById(idUsuario).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"));
    }
  }
