package com.example.portfolioJuanMGodoy.Controller;
import com.example.portfolioJuanMGodoy.Entity.SkillEntidad;
import com.example.portfolioJuanMGodoy.Service.SkillServicio;
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
@RequestMapping("/api/skills")
public class SkillControlador {
    
    @Autowired
    private SkillServicio skillServicio;

    @GetMapping
    public List<SkillEntidad> getAll() {
        return skillServicio.getAll();
    }        

    @GetMapping("/{id}")
    public ResponseEntity<SkillEntidad> getById(@PathVariable(value = "id") int id) {
        return skillServicio.getById(id);
    } 
    
    @PostMapping
    public SkillEntidad save(@Validated @RequestBody SkillEntidad skill) {
        return skillServicio.save(skill);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<SkillEntidad> update(@PathVariable(value = "id") int id, @Validated @RequestBody SkillEntidad skill) {
        if (id == skill.getIdSkill()) {
            SkillEntidad skillNew = skillServicio.save(skill);
            return ResponseEntity.ok().body(skillNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SkillEntidad> delete(@PathVariable int id) {
        boolean ok = skillServicio.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }

}

