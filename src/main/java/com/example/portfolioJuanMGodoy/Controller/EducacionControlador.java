package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.EducacionEntidad;
import com.example.portfolioJuanMGodoy.Service.EducacionServicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/educacion")
public class EducacionControlador {
    
    @Autowired
    private EducacionServicio educacionServicio;

    @GetMapping
    public List<EducacionEntidad> getAll() {
        return educacionServicio.getAll();
    }        

    @GetMapping("/{id}")
    public ResponseEntity<EducacionEntidad> getById(@PathVariable(value = "id") int id) {
        return educacionServicio.getById(id);
    } 
    
    @PostMapping
    public EducacionEntidad save(@Validated @RequestBody EducacionEntidad educacion) {
        return educacionServicio.save(educacion);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<EducacionEntidad> update(@PathVariable(value = "id") int id, @Validated @RequestBody EducacionEntidad educacion) {
        if (id == educacion.getIdEducacion()) {
            EducacionEntidad taskNew = educacionServicio.save(educacion);
            return ResponseEntity.ok().body(taskNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EducacionEntidad> delete(@PathVariable int id) {
        boolean ok = educacionServicio.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }


}