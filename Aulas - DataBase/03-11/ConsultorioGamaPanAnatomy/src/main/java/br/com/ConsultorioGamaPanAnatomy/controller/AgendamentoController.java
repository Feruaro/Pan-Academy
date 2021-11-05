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

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;
import br.com.ConsultorioGamaPanAnatomy.service.AgendamentoServiceImpl;

@RestController
@RequestMapping(path = "/agendamentos")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoServiceImpl as;
	
	@GetMapping
	public List<Agendamento> getAll(){
		return this.as.getListaAgendamentos();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Agendamento> getId(@PathVariable String id){
		Agendamento objAgendamento = this.as.getByIdAgendamento(id);
		return ResponseEntity.ok().body(objAgendamento);
	}
	
	@PostMapping(path = "createAgendamento")
	public Agendamento create(@RequestBody Agendamento agendamento) {
		return this.as.createAgendamento(agendamento);
	}
	
	@PutMapping(path = "{id}")
	public ResponseEntity<Agendamento> update(@PathVariable String id, @RequestBody Agendamento agendamento){
		Agendamento objAgendamento = as.updateAgendamento(id, agendamento);
		return ResponseEntity.ok().body(objAgendamento);
	}
	
	@DeleteMapping(path = "{id}")
	public ResponseEntity<Agendamento> delete(@PathVariable String id) {
		as.deleteAgendamento(id);
		return ResponseEntity.noContent().build();
	}
	
}