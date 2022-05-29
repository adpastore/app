package com.app.ap.repository;

import com.app.ap.models.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;


//Se relaciona con models
public interface HabilidadesRepo extends JpaRepository<Habilidades, Long>{
    
}
