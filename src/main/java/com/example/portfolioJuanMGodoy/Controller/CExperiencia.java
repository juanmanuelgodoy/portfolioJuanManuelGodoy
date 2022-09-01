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

import com.example.portfolioJuanMGodoy.DTO.dtoExperiencia;
import com.example.portfolioJuanMGodoy.Entity.Experiencia;
import com.example.portfolioJuanMGodoy.Security.Controller.Mensaje;
import com.example.portfolioJuanMGodoy.Service.SExperiencia;

@RestController
@RequestMapping("/experiencia")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliojmgfront.web.app")

public class CExperiencia {

	@Autowired
	SExperiencia sExperiencia;

	@GetMapping("/lista")
	public ResponseEntity<List<Experiencia>> list() {
		List<Experiencia> list = sExperiencia.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp) {

		if (StringUtils.isBlank(dtoexp.getNombreE()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		
		if (StringUtils.isBlank(dtoexp.getDescripcionE()))
			return new ResponseEntity(new Mensaje("La descripcion es obligatoria"), HttpStatus.BAD_REQUEST);

		if (sExperiencia.existsByNombreE(dtoexp.getNombreE()))
			return new ResponseEntity(new Mensaje("Esta experiencia ya existe"), HttpStatus.BAD_REQUEST);

		Experiencia experiencia = new Experiencia(dtoexp.getNombreE(), dtoexp.getDescripcionE());

		sExperiencia.save(experiencia);

		return new ResponseEntity(new Mensaje("Experiencia guardada con éxito"), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody dtoExperiencia dtoexp){
		
		if(!sExperiencia.existsById(id))
			return new ResponseEntity(new Mensaje("El id buscado no existe"), HttpStatus.BAD_REQUEST);
		if(sExperiencia.existsByNombreE(dtoexp.getNombreE()) && sExperiencia.getByNombreE(dtoexp.getNombreE()).get().getId() != id)
			return new ResponseEntity(new Mensaje("Esta experiencia ya existe"), HttpStatus.BAD_REQUEST);
		if (StringUtils.isBlank(dtoexp.getNombreE()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		
		Experiencia experiencia = sExperiencia.getOne(id).get();
		experiencia.setNombreE(dtoexp.getNombreE());
		experiencia.setDescripcionE(dtoexp.getDescripcionE());
		
		sExperiencia.save(experiencia);
		
		return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
			
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") String id){
		
		if(!sExperiencia.existsById(id))
			return new ResponseEntity(new Mensaje("El id buscado no existe"), HttpStatus.BAD_REQUEST);
		
		sExperiencia.delete(id);
		
		return new ResponseEntity(new Mensaje("Experiencia eliminada con éxito"), HttpStatus.OK);
	}

	@GetMapping("/detail/{id}")
	public ResponseEntity<Experiencia> getById(@PathVariable("id") String id) {

		if (!sExperiencia.existsById(id))
			
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);

		Experiencia experiencia = sExperiencia.getOne(id).get();

		return new ResponseEntity(experiencia, HttpStatus.OK);
	}
	
}
