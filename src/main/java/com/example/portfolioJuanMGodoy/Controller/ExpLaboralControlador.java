package com.example.portfolioJuanMGodoy.Controller;

import com.example.portfolioJuanMGodoy.Entity.ExpLaboralEntidad;
import com.example.portfolioJuanMGodoy.Interface.ExpLaboralInterfaz;

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
//("/api/expLaboral")
public class ExpLaboralControlador {
    
    @Autowired
    ExpLaboralInterfaz expLaboralInterfaz;

    @GetMapping("/explaboral/traer")
    public List<ExpLaboralEntidad> getexpLaboral() {
        return expLaboralInterfaz.getExpLaboral();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<ExpLaboralEntidad> getById(@PathVariable(value = "id") String id) {
//        return expLaboralServicio.getById(id);
//    }

    @PostMapping("/explaboral/crear")
	public String crearExpLaboral(@RequestBody ExpLaboralEntidad expLaboral) {
    	expLaboralInterfaz.saveExpLaboral(expLaboral);
		return "Experiencia laboral creada con éxito";
	}

	@DeleteMapping("/expLaboral/borrar/{id}")
	public String eliminarExpLaboral(@PathVariable String id) {
		expLaboralInterfaz.deleteExpLaboral(id);
		return "Experiencia laboral eliminada con exito";
	}
	
    @PutMapping("/explaboral/editar/{id}")
	public ExpLaboralEntidad modificarExpLaboral(@PathVariable String id, @RequestParam ("puesto") String nuevoPuesto, @RequestParam ("fechafin") LocalDate nuevaFechafin, @RequestParam ("fechainicio") LocalDate nuevaFechainicio, @RequestParam ("descripcion") String nuevaDescripcion,
			@RequestParam ("empresa") String nuevaEmpresa, @RequestParam ("fotourl") String nuevaFotourl) {

    	ExpLaboralEntidad expLaboral = expLaboralInterfaz.findExpLaboral(id);

    	expLaboral.setFechafin(nuevaFechafin);
    	expLaboral.setFotourl(nuevaFotourl);
    	expLaboral.setDescripcion(nuevaDescripcion);
    	expLaboral.setEmpresa(nuevaEmpresa);
    	expLaboral.setFechainicio(nuevaFechainicio);
    	expLaboral.setPuesto(nuevoPuesto);

    	expLaboralInterfaz.saveExpLaboral(expLaboral);
    	return expLaboral;
    }
}

