package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.ProyectosEntidad;
import com.example.portfolioJuanMGodoy.Service.ProyectosServicio;
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
@RequestMapping("/api/proyectos")
public class ProyectosControlador {

    @Autowired
    private ProyectosServicio proyectosServicio;

    @GetMapping
    public List<ProyectosEntidad> getAll() {
        return proyectosServicio.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProyectosEntidad> getById(@PathVariable(value = "id") int id) {
        return proyectosServicio.getById(id);
    }

    @PostMapping
    public ProyectosEntidad save(@Validated @RequestBody ProyectosEntidad proyecto) {
        return proyectosServicio.save(proyecto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProyectosEntidad> update(@PathVariable(value = "id") int id, @Validated @RequestBody ProyectosEntidad proyecto) {
        if (id == proyecto.getIdProyectos()) {
            ProyectosEntidad taskNew = proyectosServicio.save(proyecto);
            return ResponseEntity.ok().body(taskNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ProyectosEntidad> delete(@PathVariable int id) {
        boolean ok = proyectosServicio.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
}

}
