package br.com.ConsultorioGamaPanAnatomy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ConsultorioGamaPanAnatomy.model.Medico;
import br.com.ConsultorioGamaPanAnatomy.service.MedicoService;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {
	
	@Autowired
	private MedicoService ms;
	
	@GetMapping
	public List<Medico> getAll() { 
		return ms.getAll();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Medico> getId(@PathVariable String id) {
		Medico objMedico = ms.getId(id);
		return ResponseEntity.ok().body(objMedico);
	}
	
	@PostMapping
	public Medico create(@RequestBody Medico medico) {
		return ms.create(medico);
	}
	

}
