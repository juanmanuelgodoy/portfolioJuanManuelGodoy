package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.ProyectosEntidad;
import com.example.portfolioJuanMGodoy.Repository.ProyectosRepositorio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProyectosServicio {
    @Autowired
    ProyectosRepositorio proyectosRepositorio;

    public List<ProyectosEntidad> getAll(){
        return (List<ProyectosEntidad>) proyectosRepositorio.findAll();
    }

    public ResponseEntity<ProyectosEntidad> getById(int id) {

        Optional<ProyectosEntidad> proyecto = proyectosRepositorio.findById(id);

        if (proyecto.isPresent()) {
            return ResponseEntity.ok().body(proyecto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ProyectosEntidad save(ProyectosEntidad proyecto) {
        return proyectosRepositorio.save(proyecto); 
    }
    public boolean delete(int id) {
        try {
            proyectosRepositorio.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}

    

