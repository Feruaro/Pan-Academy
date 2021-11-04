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

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;
import br.com.ConsultorioGamaPanAnatomy.service.AgendamentoService;

@RestController
@RequestMapping(path = "/agendamentos")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoService as;
	
	@GetMapping
	public List<Agendamento> getAll(){
		return this.as.getAll();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Agendamento> getId(@PathVariable String id){
		Agendamento objAgendamento = this.as.getId(id);
		return ResponseEntity.ok().body(objAgendamento);
	}
	
	@PostMapping
	public Agendamento create(@RequestBody Agendamento agendamento) {
		return this.as.create(agendamento);
	}
	
}