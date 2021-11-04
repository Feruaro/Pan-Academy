package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import br.com.ConsultorioGamaPanAnatomy.model.Medico;

public interface MedicoService {
	
	public List<Medico> getAll();
	
	//CRUD
	
	public Medico getId(String id);
	
	public Medico create(Medico medico);
	
	public Medico update(String id, Medico obj);
	
//	public void delete(String id);
	
}
