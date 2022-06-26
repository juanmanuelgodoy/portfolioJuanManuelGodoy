package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.PersonaEntidad;
import com.example.portfolioJuanMGodoy.Interface.PersonaInterfaz;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@CrossOrigin (origins = "http://localhost:4200")
public class PersonaControlador {

	@Autowired
	PersonaInterfaz personaInterfaz;
        
     @GetMapping("/hola")
     public String decirHola(){
            return "Hola Mundo";
      }
     
	@GetMapping("/persona/lista")
	public List<PersonaEntidad> getPersona() {
		return personaInterfaz.getPersona();
	}
	
	@PostMapping("/persona/crear")
	public String crearPersona(@RequestBody PersonaEntidad persona ) {
		personaInterfaz.guardarPersona(persona);
		return "Persona creada con éxito";
	}
	
	@DeleteMapping("/persona/eliminar/{id}")
	public String eliminarPersona(@PathVariable String id) {
		personaInterfaz.eliminarPersona(id);
		return "Persona eliminada con {exito";
	}
	
	@PutMapping("/persona/modificar/{id}")
	public PersonaEntidad modificarPersona(@PathVariable String id, @RequestParam ("nombre") String nuevoNombre, @RequestParam ("apellido") String nuevoApellido, @RequestParam ("foto") String nuevaFoto ) {
		PersonaEntidad persona = personaInterfaz.buscarPersona(id);
		persona.setNombre(nuevoNombre);
		persona.setApellido(nuevoApellido);
		persona.setFoto(nuevaFoto);
		
		personaInterfaz.guardarPersona(persona);
		return persona;
		
	}
	
	@GetMapping("/persona/traer/perfil")
	public PersonaEntidad buscarPersona(@PathVariable String id) {
		
		return personaInterfaz.buscarPersona(id);
}    
}
