package com.app.ap.repository;

import com.app.ap.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


//Se relaciona con models
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {
    
}
