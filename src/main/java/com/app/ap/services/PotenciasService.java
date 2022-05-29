package com.app.ap.services;

import com.app.ap.exception.UserNotFoundException;
import com.app.ap.models.Potencias;
import com.app.ap.repository.PotenciasRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //declaracion del servicio
@Transactional //union con el controlador y control de metodos
public class PotenciasService {
    
    private final PotenciasRepo potenciasRepo;
    
    @Autowired
    public PotenciasService(PotenciasRepo potenciasRepo)  {
        this.potenciasRepo = potenciasRepo;
    }
        
    //Declaramos el CRUM
    public Potencias addPotencias(Potencias potencias){
        return potenciasRepo.save(potencias);
    }
    
    public List<Potencias> buscarPotencias(){
        return potenciasRepo.findAll();
    }
    
    public Potencias editarPotencias(Potencias potencias){
        return potenciasRepo.save(potencias);
    }
    
    public void deletePotencias(Long id){
        potenciasRepo.deleteById(id);
    }
    
    public Potencias buscaPotenciasPorId(Long id){
        return potenciasRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Potencia no encontrada"));
    }
}
