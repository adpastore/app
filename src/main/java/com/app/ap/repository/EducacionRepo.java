package com.app.ap.repository;

import com.app.ap.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


//Se relaciona con models
public interface EducacionRepo extends JpaRepository<Educacion, Long>{

}
