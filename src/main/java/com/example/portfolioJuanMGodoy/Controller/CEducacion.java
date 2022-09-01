package com.example.portfolioJuanMGodoy.Controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolioJuanMGodoy.DTO.dtoEducacion;
import com.example.portfolioJuanMGodoy.Entity.Educacion;
import com.example.portfolioJuanMGodoy.Security.Controller.Mensaje;
import com.example.portfolioJuanMGodoy.Service.SEducacion;

@RestController
@RequestMapping("/educacion")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliojmgfront.web.app")
public class CEducacion {

	@Autowired
	SEducacion sEducacion;

	@GetMapping("/lista")
	public ResponseEntity<List<Educacion>> list() {
		List<Educacion> list = sEducacion.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@GetMapping("/detail/{id}")
	public ResponseEntity<Educacion> getById(@PathVariable("id") String id){
		
		if(!sEducacion.existsById(id)) {
			return new ResponseEntity(new Mensaje("No existe el id buscado"), HttpStatus.BAD_REQUEST);
		}
		
		Educacion educacion = sEducacion.getOne(id).get();
		
		return new ResponseEntity(educacion, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") String id) {

		if (!sEducacion.existsById(id)) {
			return new ResponseEntity(new Mensaje("No existe el Id"), HttpStatus.NOT_FOUND);
		}

		sEducacion.delete(id);
		return new ResponseEntity(new Mensaje("Educacion eliminada con éxito"), HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeducacion) {

		if (StringUtils.isBlank(dtoeducacion.getNombreE())) {
			return new ResponseEntity(new Mensaje("El nombre de la entidad educativa es obligatorio"),HttpStatus.BAD_REQUEST);
		}

		if (StringUtils.isBlank(dtoeducacion.getDescripcionE())) {
			return new ResponseEntity(new Mensaje("La descripción del nivel educativo alcanzado es obligatorio"), HttpStatus.BAD_REQUEST);
		}

		if (sEducacion.existsByNombreE(dtoeducacion.getNombreE())) {
			return new ResponseEntity(new Mensaje("El nombre de la entidad educativa ya existe"),HttpStatus.BAD_REQUEST);
		}

		Educacion educacion = new Educacion(dtoeducacion.getNombreE(), dtoeducacion.getDescripcionE());

		sEducacion.save(educacion);

		return new ResponseEntity(new Mensaje("Nivel de educación creado"), HttpStatus.OK);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody dtoEducacion dtoeducacion) {

		if (!sEducacion.existsById(id)) {
			return new ResponseEntity(new Mensaje("No existe el id buscado"), HttpStatus.NOT_FOUND);
		}

		if (sEducacion.existsByNombreE(dtoeducacion.getNombreE()) && sEducacion.findByNombreE(dtoeducacion.getNombreE()).get().getId() != id) {
			return new ResponseEntity(new Mensaje("Nombre de institución educativa ya existente"), HttpStatus.BAD_REQUEST);
		}

		if(StringUtils.isBlank(dtoeducacion.getNombreE())) {
			return new ResponseEntity(new Mensaje("El nombre de institución educativa no puede estar vacio"), HttpStatus.BAD_REQUEST);
		}
		
		Educacion educacion = sEducacion.getOne(id).get();
		educacion.setNombreE(dtoeducacion.getNombreE());
		educacion.setDescripcionE(dtoeducacion.getDescripcionE());
		
		sEducacion.save(educacion);
		
		return new ResponseEntity(new Mensaje("Nivel educativo actualizado con éxito"), HttpStatus.OK);
				
	}

}
