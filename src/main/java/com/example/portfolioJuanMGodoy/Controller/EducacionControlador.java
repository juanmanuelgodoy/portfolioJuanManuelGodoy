package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.EducacionEntidad;
import com.example.portfolioJuanMGodoy.Interface.EducacionInterfaz;

import java.time.LocalDate;
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
//("/api/educacion")
public class EducacionControlador {
    
    @Autowired
    EducacionInterfaz educacionInterfaz;

    @GetMapping("/educacion/traer")
    public List<EducacionEntidad> getEducacion() {
        return educacionInterfaz.getEducacion();
    }        

//    @GetMapping("/{id}")
//    public ResponseEntity<EducacionEntidad> getById(@PathVariable(value = "id") String id) {
//        return educacionServicio.getById(id);
//    } 
    
    @PostMapping("/educacion/crear")
	public String crearEducacion(@RequestBody EducacionEntidad educacion) {
		educacionInterfaz.saveEducacion(educacion);
		return "Educacion creada con éxito";
	}

	@DeleteMapping("/educacion/borrar/{id}")
	public String eliminarEducacion(@PathVariable String id) {
		educacionInterfaz.deleteEducacion(id);
		return "Educacion eliminada con exito";
	}
	
	@PutMapping("/educacion/editar/{id}")
	public EducacionEntidad modificarEducacion(@PathVariable String id, @RequestParam ("titulo") String nuevoTitulo, @RequestParam ("fechafin") LocalDate nuevaFechafin, @RequestParam ("institucion") String nuevaInstitucion,
											@RequestParam ("institucionurl") String nuevaInstitucionurl, @RequestParam ("fotourl") String nuevaFotourl) {
		
		EducacionEntidad educacion = educacionInterfaz.findEducacion(id);
		
		educacion.setFechafin(nuevaFechafin);
		educacion.setFotourl(nuevaFotourl);
		educacion.setInstitucion(nuevaInstitucionurl);
		educacion.setInstitucionurl(nuevaInstitucionurl);
		educacion.setTitulo(nuevoTitulo);
		
		educacionInterfaz.saveEducacion(educacion);
		return educacion;
	}
}
