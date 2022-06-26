package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.SkillEntidad;
import com.example.portfolioJuanMGodoy.Repository.SkillRepositorio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SkillServicio {
    @Autowired
    SkillRepositorio skillRepositorio;

    public List<SkillEntidad> getAll(){
        return (List<SkillEntidad>) skillRepositorio.findAll();
    }
    public ResponseEntity<SkillEntidad> getById(int id) {

        Optional<SkillEntidad> skill = skillRepositorio.findById(id);

        if (skill.isPresent()) {
            return ResponseEntity.ok().body(skill.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    public SkillEntidad save( SkillEntidad skill) {
        return skillRepositorio.save(skill);
    }

 public boolean delete(int id) {
    try {
        skillRepositorio.deleteById(id);
        return true;
    } catch(Exception err){
        return false;
    }
}

}

    

