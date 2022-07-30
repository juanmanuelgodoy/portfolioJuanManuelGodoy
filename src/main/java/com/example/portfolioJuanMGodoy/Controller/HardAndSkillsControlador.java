package com.example.portfolioJuanMGodoy.Controller;
import com.example.portfolioJuanMGodoy.Entity.HardAndSkills;
import com.example.portfolioJuanMGodoy.Interface.HardAndSkillsInterfaz;
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
public class HardAndSkillsControlador {
    
    @Autowired
   HardAndSkillsInterfaz skillInterfaz;

    @GetMapping("/skills/traer")
    public List<HardAndSkills> getSkill() {
        return skillInterfaz.getSkill();
    }        

//    @GetMapping("/{id}")
//    public ResponseEntity<SkillEntidad> getById(@PathVariable(value = "id") String id) {
//        return skillInterfaz.getById(id);
//    } 
    
    @PostMapping("/skills/crear")
	public String crearSkill(@RequestBody HardAndSkills skill) {
    	skillInterfaz.saveSkill(skill);
		return "Skill creada con éxito";
	}

	@DeleteMapping("/skills/borrar/{id}")
	public String eliminarSkill(@PathVariable String id) {
		skillInterfaz.deleteSkill(id);
		return "Skill eliminada con exito";
	}
    
    @PutMapping("/skills/editar/{id}")
	public HardAndSkills modificarSkill(@PathVariable String id, @RequestParam ("titulo") String nuevoTitulo, @RequestParam ("dominio") Integer nuevoDominio) {

    	HardAndSkills skill = skillInterfaz.findSkill(id);

    	skill.setTitulo(nuevoTitulo);
    	skill.setDominio(nuevoDominio);

    	skillInterfaz.saveSkill(skill);
    	return skill;
    }
}

