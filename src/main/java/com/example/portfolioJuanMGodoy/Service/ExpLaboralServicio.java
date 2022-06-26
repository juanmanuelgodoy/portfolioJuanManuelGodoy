package com.example.portfolioJuanMGodoy.Service;


import com.example.portfolioJuanMGodoy.Entity.ExpLaboralEntidad;
import com.example.portfolioJuanMGodoy.Repository.ExpLaboralRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExpLaboralServicio {
    
    @Autowired
    ExpLaboralRepositorio expLaboralRepositorio;
    
    public List<ExpLaboralEntidad> getAll() {
        return (List<ExpLaboralEntidad>) expLaboralRepositorio.findAll();
    }
    
    public ResponseEntity<ExpLaboralEntidad> getById(int id) {

        Optional<ExpLaboralEntidad> laboral = expLaboralRepositorio.findById(id);

        if (laboral.isPresent()) {
            return ResponseEntity.ok().body(laboral.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    public ExpLaboralEntidad save(ExpLaboralEntidad laboral) {
        return expLaboralRepositorio.save(laboral); 
    }

    public boolean delete(int id) {
        try {
            expLaboralRepositorio.deleteById(id); 
            return true;
        } catch(Exception err){
            return false;
        }
    } 

}
