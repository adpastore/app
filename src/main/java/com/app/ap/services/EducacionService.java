package com.app.ap.services;

import com.app.ap.exception.UserNotFoundException;
import com.app.ap.models.Educacion;
import com.app.ap.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //declaracion del servicio
@Transactional //union con el controlador y control de metodos
public class EducacionService {

    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    //Se declara el CRUM
    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> buscarEducacion() {
        return educacionRepo.findAll();
    }

    public Educacion editarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void deleteEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    public Educacion buscaEducacionPorId(Long id) {
        return educacionRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Educacion no encontrada"));
    }
}
