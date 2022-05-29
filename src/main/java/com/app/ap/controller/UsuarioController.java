package com.app.ap.controller;

import com.app.ap.models.Usuario;
import com.app.ap.services.UsuarioService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")

public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> obtenerUsuario(){
    List<Usuario> usuario=usuarioService.buscarUsuario();
    return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario)  {
        Usuario updateUsuario=usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario)  {
        Usuario nuevoUsuario=usuarioService.agregarUsuario(usuario);
        return new ResponseEntity<>(nuevoUsuario,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idUsuario}")
    public ResponseEntity<?> borrarUsuario(@PathVariable("idUsuario")Long id){
        usuarioService.borrarUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
