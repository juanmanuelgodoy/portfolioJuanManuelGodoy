package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.ExpLaboralEntidad;
import com.example.portfolioJuanMGodoy.Service.ExpLaboralServicio;
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
@RequestMapping("/api/laboral")
public class ExpLaboralControlador {
    
    @Autowired
    private ExpLaboralServicio expLaboralServicio;

    @GetMapping
    public List<ExpLaboralEntidad> getAll() {
        return expLaboralServicio.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpLaboralEntidad> getById(@PathVariable(value = "id") int id) {
        return expLaboralServicio.getById(id);
    }

    @PostMapping
    public ExpLaboralEntidad save(@Validated @RequestBody ExpLaboralEntidad expLaboral) {
        return expLaboralServicio.save(expLaboral);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExpLaboralEntidad> update(@PathVariable(value = "id") int id, @Validated @RequestBody ExpLaboralEntidad expLaboral) {
        if (id == expLaboral.getIdExpLaboral()) {
         ExpLaboralEntidad expLaboralNew = expLaboralServicio.save(expLaboral);
            return ResponseEntity.ok().body(expLaboralNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ExpLaboralEntidad> delete(@PathVariable int id) {
        boolean ok = expLaboralServicio.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}

