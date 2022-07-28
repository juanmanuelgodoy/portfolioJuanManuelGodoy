package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.ProyectosEntidad;
import com.example.portfolioJuanMGodoy.Interface.ProyectosInterfaz;

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
//("/api/proyectos")
public class ProyectosControlador {

    @Autowired
    ProyectosInterfaz proyectosInterfaz;

    @GetMapping("/proyectos/traer")
    public List<ProyectosEntidad> getProyectos() {
        return proyectosInterfaz.getProyectos();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<ProyectosEntidad> getById(@PathVariable(value = "id") String id) {
//        return proyectosInterfaz.getById(id);
//    }

    @PostMapping("/proyectos/crear")
	public String crearProyectos(@RequestBody ProyectosEntidad proyectos) {
    	proyectosInterfaz.saveProyectos(proyectos);
		return "Proyecto creado con éxito";
	}

	@DeleteMapping("/proyectos/borrar/{id}")
	public String eliminarProyectos(@PathVariable String id) {
		proyectosInterfaz.deleteProyectos(id);
		return "Proyecto eliminado con exito";
	}

    @PutMapping("/proyectos/editar/{id}")
	public ProyectosEntidad modificarProyectos(@PathVariable String id, @RequestParam ("descripcion") String nuevaDescripcion,
			@RequestParam ("titulo") String nuevoTitulo, @RequestParam ("url") String nuevaUrl) {

    	ProyectosEntidad proyectos = proyectosInterfaz.findProyectos(id);

    	proyectos.setDescripcion(nuevaDescripcion);
    	proyectos.setTitulo(nuevoTitulo);
    	proyectos.setUrl(nuevaUrl);

    	proyectosInterfaz.saveProyectos(proyectos);
    	return proyectos;
    }
}