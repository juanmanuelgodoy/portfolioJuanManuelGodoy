package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.PersonaEntidad;
import com.example.portfolioJuanMGodoy.Service.PersonaServicio;
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
@RequestMapping("/api/persona")
public class PersonaControlador {

    @Autowired
    private PersonaServicio personaServicio;

    @GetMapping
    public List<PersonaEntidad> getAll() {
        return personaServicio.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonaEntidad> getById(@PathVariable(value = "id") int id) {
        return personaServicio.getById(id);
    }

    @PostMapping
    public PersonaEntidad save(@Validated @RequestBody PersonaEntidad persona) {
        return personaServicio.save(persona);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonaEntidad> update(@PathVariable(value = "id") int id,
            @Validated @RequestBody PersonaEntidad persona) {
        if (id == persona.getIdPersona()) {
            PersonaEntidad personaNew = personaServicio.save(persona);
            return ResponseEntity.ok().body(personaNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PersonaEntidad> delete(@PathVariable int id) {
        boolean ok = personaServicio.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }

}
//import com.example.portfolioJuanMGodoy.Entity.PersonaEntidad;
//import com.example.portfolioJuanMGodoy.Interface.PersonaInterfaz;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//@RestController
////@CrossOrigin (origins = "http://localhost:4200")
//public class PersonaControlador {
//
//	@Autowired
//	PersonaInterfaz personaInterfaz;
//        
//     @GetMapping("/hola")
//     public String decirHola(){
//            return "Hola Mundo";
//      }
//     
//	@GetMapping("/persona/lista")
//	public List<PersonaEntidad> getPersona() {
//		return personaInterfaz.getPersona();
//	}
//	
//	@PostMapping("/persona/crear")
//	public String crearPersona(@RequestBody PersonaEntidad persona ) {
//		personaInterfaz.guardarPersona(persona);
//		return "Persona creada con éxito";
//	}
//	
//	@DeleteMapping("/persona/eliminar/{id}")
//	public String eliminarPersona(@PathVariable String id) {
//		personaInterfaz.eliminarPersona(id);
//		return "Persona eliminada con {exito";
//	}
//	
//	@PutMapping("/persona/modificar/{id}")
//	public PersonaEntidad modificarPersona(@PathVariable String id, @RequestParam ("nombre") String nuevoNombre, @RequestParam ("apellido") String nuevoApellido, @RequestParam ("fotourl") String nuevaFoto ) {
//		PersonaEntidad persona = personaInterfaz.buscarPersona(id);
//		persona.setNombre(nuevoNombre);
//		persona.setApellido(nuevoApellido);
//		persona.setFotourl(nuevaFoto);
//		
//		personaInterfaz.guardarPersona(persona);
//		return persona;
//		
//	}
//	
//	@GetMapping("/persona/traer/perfil")
//	public PersonaEntidad buscarPersona(@PathVariable String id) {
//		
//		return personaInterfaz.buscarPersona(id);
//}    
//}
