package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.EducacionEntidad;
import com.example.portfolioJuanMGodoy.Repository.EducacionRepositorio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EducacionServicio {
    @Autowired
    EducacionRepositorio educacionRepositorio;
   

    public List<EducacionEntidad> getAll(){
        return (List<EducacionEntidad>) educacionRepositorio.findAll();
    }
    
    public ResponseEntity<EducacionEntidad> getById(int id) {

        Optional<EducacionEntidad> educacion = educacionRepositorio.findById(id);

        if (educacion.isPresent()) {
            return ResponseEntity.ok().body(educacion.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    public EducacionEntidad save( EducacionEntidad educacion) {
        return educacionRepositorio.save(educacion); 
    }

    public boolean delete(int id) {
    try {
        educacionRepositorio.deleteById(id);
        return true;
    } catch(Exception err){
        return false;
    }
}
}

