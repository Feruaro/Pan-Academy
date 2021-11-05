package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ConsultorioGamaPanAnatomy.model.Paciente;
import br.com.ConsultorioGamaPanAnatomy.repository.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pr;
	
	@Override
	public List<Paciente> getListaPacientes() {
		return this.pr.findAll();
	}

	@Override
	public Paciente getByIdPaciente(String id) {
		return this.pr.findById(id).orElseThrow(() -> new IllegalArgumentException("Paciente inexistente!"));
	}

	@Override
	public Paciente createPaciente(Paciente paciente) {	
		return this.pr.save(paciente);
	}

	@Override
	public Paciente updatePaciente(String id, Paciente paciente) {
		Paciente newPaciente = pr.findById(id).orElseThrow(() -> new IllegalArgumentException("Paciente inexistente!"));
		
		newPaciente.setCarteirinha(paciente.getCarteirinha());
		newPaciente.setEndereco(paciente.getEndereco());
		newPaciente.setPlanoSaude(paciente.getPlanoSaude());
		newPaciente.setTelefone(paciente.getTelefone());
		
		return this.pr.save(newPaciente);
	}

	@Override
	public void deletePaciente(String id) {
		this.getByIdPaciente(id);
		this.pr.deleteById(id);
	}

}
