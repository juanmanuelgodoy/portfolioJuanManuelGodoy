package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.SocialesEntidad;
import com.example.portfolioJuanMGodoy.Service.SocialesServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;

public class SocialesControlador {
    
    @Autowired
    private SocialesServicio socialesServicio;

    @GetMapping
    public List<SocialesEntidad> getAll() {
        return socialesServicio.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SocialesEntidad> getById(@PathVariable(value = "id") int id) {
        return socialesServicio.getById(id);
    }

    @PostMapping
    public SocialesEntidad save(@Validated @RequestBody SocialesEntidad red) {
        return socialesServicio.save(red);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SocialesEntidad> update(@PathVariable(value = "id") int id, @Validated @RequestBody SocialesEntidad red) {
        if (id == red.getIdSociales()) {
            SocialesEntidad redNew = socialesServicio.save(red);
            return ResponseEntity.ok().body(redNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SocialesEntidad> delete(@PathVariable int id) {
        boolean ok = socialesServicio.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    
    }
}
