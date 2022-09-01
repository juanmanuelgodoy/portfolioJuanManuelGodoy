package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.Sociales;
import com.example.portfolioJuanMGodoy.Interface.SocialesInterfaz;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin("*")
@CrossOrigin("https://portfoliojmgfront.web.app")

@RestController
@RequestMapping
//("/api/sociales")
public class SocialesControlador {
    
    @Autowired
    SocialesInterfaz socialesInterfaz;

    @GetMapping("/sociales/traer")
    public List<Sociales> getSociales() {
        return socialesInterfaz.getSociales();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<SocialesEntidad> getById(@PathVariable(value = "id") String id) {
//        return socialesInterfaz.getById(id);
//    }

    @PostMapping("/sociales/crear")
	public String crearSociales(@RequestBody Sociales sociales) {
    	socialesInterfaz.saveSociales(sociales);
		return "Redes sociales creadas con éxito";
	}

	@DeleteMapping("/sociales/borrar/{id}")
	public String eliminarSociales(@PathVariable String id) {
		socialesInterfaz.deleteSociales(id);
		return "Redes sociales eliminadas con exito";
	}

    @PutMapping("/sociales/editar/{id}")
	public Sociales modificarSociales(@PathVariable String id, @RequestParam ("nombre") String nuevoNombre, @RequestParam ("url") String nuevaUrl, @RequestParam ("fotourl") String nuevaFotourl) {

    	Sociales sociales = socialesInterfaz.findSociales(id);

    	sociales.setFotourl(nuevaFotourl);
    	sociales.setNombre(nuevoNombre);
    	sociales.setUrl(nuevaFotourl);

    	socialesInterfaz.saveSociales(sociales);
    	return sociales;
    }
}
