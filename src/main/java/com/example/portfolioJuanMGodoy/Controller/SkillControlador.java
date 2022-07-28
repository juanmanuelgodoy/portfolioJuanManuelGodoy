package com.example.portfolioJuanMGodoy.Controller;
import com.example.portfolioJuanMGodoy.Entity.SkillEntidad;
import com.example.portfolioJuanMGodoy.Interface.SkillInterfaz;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin("*")
@RestController
@RequestMapping
//("/api/skills")
public class SkillControlador {
    
    @Autowired
   SkillInterfaz skillInterfaz;

    @GetMapping("/skills/traer")
    public List<SkillEntidad> getSkill() {
        return skillInterfaz.getSkill();
    }        

//    @GetMapping("/{id}")
//    public ResponseEntity<SkillEntidad> getById(@PathVariable(value = "id") String id) {
//        return skillInterfaz.getById(id);
//    } 
    
    @PostMapping("/skills/crear")
	public String crearSkill(@RequestBody SkillEntidad skill) {
    	skillInterfaz.saveSkill(skill);
		return "Skill creada con éxito";
	}

	@DeleteMapping("/skills/borrar/{id}")
	public String eliminarSkill(@PathVariable String id) {
		skillInterfaz.deleteSkill(id);
		return "Skill eliminada con exito";
	}
    
    @PutMapping("/skills/editar/{id}")
	public SkillEntidad modificarSkill(@PathVariable String id, @RequestParam ("titulo") String nuevoTitulo, @RequestParam ("dominio") Integer nuevoDominio) {

    	SkillEntidad skill = skillInterfaz.findSkill(id);

    	skill.setTitulo(nuevoTitulo);
    	skill.setDominio(nuevoDominio);

    	skillInterfaz.saveSkill(skill);
    	return skill;
    }
}

