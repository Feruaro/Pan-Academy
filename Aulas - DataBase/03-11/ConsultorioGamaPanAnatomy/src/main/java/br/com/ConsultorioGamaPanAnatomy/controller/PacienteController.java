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

import br.com.ConsultorioGamaPanAnatomy.model.Paciente;
import br.com.ConsultorioGamaPanAnatomy.service.PacienteServiceImpl;

@RestController
@RequestMapping(path = "/pacientes")
public class PacienteController {
	
	@Autowired
	private PacienteServiceImpl ps;
	
	@GetMapping
	public List<Paciente> getListaPacientes() {
		return ps.getListaPacientes();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Paciente> getByIdPaciente(@PathVariable String id) {
		Paciente paciente = ps.getByIdPaciente(id);
		return ResponseEntity.ok().body(paciente);
	}
 	
	@PostMapping(path = "createPaciente")
	public Paciente createPaciente(@RequestBody Paciente paciente) {
		return this.ps.createPaciente(paciente);
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Paciente> updatePaciente(@PathVariable String id, @RequestBody Paciente paciente) {
		Paciente newPaciente = ps.updatePaciente(id, paciente);
		return ResponseEntity.ok().body(newPaciente);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Paciente> deletePaciente(@PathVariable String id) {
		ps.deletePaciente(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
