package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import br.com.ConsultorioGamaPanAnatomy.model.Medico;

public interface MedicoService {
	
	public List<Medico> getListaMedicos();
	
	public Medico getByIdMedico(String id);
	
	public Medico createMedico(Medico medico);
	
	public Medico updateMedico(String id, Medico medico);
	
	public void deleteMedico(String id);
	
}
