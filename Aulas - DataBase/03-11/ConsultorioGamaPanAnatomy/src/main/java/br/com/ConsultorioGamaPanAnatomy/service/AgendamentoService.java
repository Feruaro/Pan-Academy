package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;

public interface AgendamentoService {
	
	public List<Agendamento> getListaAgendamentos();
	
	public Agendamento getByIdAgendamento(String id);
	
	public Agendamento createAgendamento(Agendamento agendamento);
	
	public Agendamento updateAgendamento(String id, Agendamento agendamento);
	
	public void deleteAgendamento(String id);
}
