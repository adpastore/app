package com.app.ap.services;

import com.app.ap.exception.UserNotFoundException;
import com.app.ap.models.Habilidades;
import com.app.ap.repository.HabilidadesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //declaracion del servicio
@Transactional //union con el controlador y control de metodos
public class HabilidadesService {
    
    private final HabilidadesRepo habilidadesRepo;
    
    @Autowired
    public HabilidadesService(HabilidadesRepo habilidadesRepo)  {
        this.habilidadesRepo = habilidadesRepo;
    }
    
    //Declaramos el CRUM
    public Habilidades addHabilidades(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }
    
    public List<Habilidades> buscarHabilidades(){
        return habilidadesRepo.findAll();
    }
    
    public Habilidades editarHabilidades(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }
    
    public void deleteHabilidades(Long id){
        habilidadesRepo.deleteById(id);
    }
    
    public Habilidades buscaHabilidadesPorId(Long id){
        return habilidadesRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Habilidades no encontrada"));
    }
}

