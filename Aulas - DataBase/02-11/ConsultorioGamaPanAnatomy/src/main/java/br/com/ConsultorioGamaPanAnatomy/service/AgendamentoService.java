package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;

public interface AgendamentoService {
	
	public List<Agendamento> getAll();
	
	//CRUD
	
	public Agendamento getId(String id);
	
	public Agendamento create(Agendamento agendamento);
	
//	public Agendamento update(String id, Agendamento obj);
//	
//	public void delete(String id);
}
