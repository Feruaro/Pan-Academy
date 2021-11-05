package br.com.ConsultorioGamaPanAnatomy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ConsultorioGamaPanAnatomy.model.Medico;
import br.com.ConsultorioGamaPanAnatomy.service.MedicoServiceImpl;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {
	
	@Autowired
	private MedicoServiceImpl ms;
	
	@GetMapping
	public List<Medico> getListaMedicos() { 
		return ms.getListaMedicos();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Medico> getByIdMedico(@PathVariable String id) {
		Medico objMedico = ms.getByIdMedico(id);
		return ResponseEntity.ok().body(objMedico);
	}
	
	@PostMapping(path = "createMedico")
	public Medico createMedico(@RequestBody Medico medico) {
		return ms.createMedico(medico);
	}
	
	@PutMapping(path ="{id}")
	public ResponseEntity<Medico> updateMedico(@PathVariable String id, @RequestBody Medico medico){
		Medico objMedico = ms.updateMedico(id, medico);
		return ResponseEntity.ok().body(objMedico);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Medico> deleteMedico(@PathVariable String id){
		ms.deleteMedico(id);
		return ResponseEntity.noContent().build();
	}

}
