package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.Persona;
import com.example.portfolioJuanMGodoy.Interface.PersonaInterfaz;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
//("/api/personas")
public class PersonaControlador {

    @Autowired
    PersonaInterfaz personaInterfaz;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return personaInterfaz.getPersona();
    }

//   @GetMapping("/{id}")
//   public ResponseEntity<PersonaEntidad> getById(@PathVariable(value = "id") String id) {
//       return personaInterfaz.getById(id);
//    }
    @PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/personas/crear")
	public String crearPersona(@RequestBody Persona persona) {
		personaInterfaz.savePersona(persona);
		return "Persona creada con éxito";
	}

    @PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/personas/borrar/{id}")
	public String eliminarPersona(@PathVariable String id) {
		personaInterfaz.deletePersona(id);
		return "Persona eliminada con exito";
	}
	
    @PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/personas/editar/{id}")
	public Persona modificarPersona(@PathVariable String id, @RequestParam ("nombre") String nuevoNombre, @RequestParam ("apellido") String nuevoApellido, @RequestParam ("fotourl") String nuevaFoto,
											@RequestParam ("email") String nuevoEmail, @RequestParam ("titulo") String nuevoTitulo, @RequestParam ("telefono") String nuevoTelefono, @RequestParam ("ubicacion") String nuevaUbicacion,
											@RequestParam ("acerca") String nuevoAcerca, @RequestParam ("coverurl") String nuevoCoverurl, @RequestParam ("username") String nuevoUsername, @RequestParam ("password") String nuevoPassword) {
		Persona persona = personaInterfaz.findPersona(id);
		persona.setNombre(nuevoNombre);
		persona.setApellido(nuevoApellido);
		persona.setFotourl(nuevaFoto);
		persona.setAcerca(nuevoAcerca);
		persona.setCoverurl(nuevoCoverurl);
		persona.setEmail(nuevoEmail);
		persona.setPassword(nuevoPassword);
		persona.setTelefono(nuevoTelefono);
		persona.setTitulo(nuevoTitulo);
		persona.setUbicacion(nuevaUbicacion);
		persona.setUsername(nuevoUsername);
				
		personaInterfaz.savePersona(persona);
		return persona;
		
	}


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

//	@GetMapping("/personas/traer/perfil/")
//	public Persona findPersona() {
//		return personaInterfaz.findPersona(null);
//	}    
}