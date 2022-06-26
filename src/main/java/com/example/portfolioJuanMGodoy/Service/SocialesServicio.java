package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.SocialesEntidad;
import com.example.portfolioJuanMGodoy.Repository.SocialesRepositorio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SocialesServicio {
    @Autowired
    SocialesRepositorio socialesRepositorio;

    public List<SocialesEntidad> getAll(){
        return (List<SocialesEntidad>) socialesRepositorio.findAll();
    }

    public ResponseEntity<SocialesEntidad> getById (int id) {

        Optional<SocialesEntidad> red = socialesRepositorio.findById(id);

        if (red.isPresent()) {
            return ResponseEntity.ok().body(red.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public SocialesEntidad save(SocialesEntidad red) {
        return socialesRepositorio.save(red);
    }

    public boolean delete(int id) {
        try {
            socialesRepositorio.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

    

