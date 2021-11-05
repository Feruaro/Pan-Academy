package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import br.com.ConsultorioGamaPanAnatomy.model.Paciente;

public interface PacienteService {
	
	public List<Paciente> getListaPacientes();
	
	public Paciente getByIdPaciente(String id);
	
	public Paciente createPaciente(Paciente paciente);
	
	public Paciente updatePaciente(String id, Paciente paciente);
	
	public void deletePaciente(String id);
	
}
