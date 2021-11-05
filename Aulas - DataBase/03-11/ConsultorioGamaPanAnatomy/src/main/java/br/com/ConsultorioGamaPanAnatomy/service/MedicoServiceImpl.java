package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ConsultorioGamaPanAnatomy.model.Medico;
import br.com.ConsultorioGamaPanAnatomy.repository.MedicoRepository;

@Service
public class MedicoServiceImpl implements MedicoService {
	
	@Autowired
	private MedicoRepository mr;

	@Override
	public List<Medico> getListaMedicos() {
		return this.mr.findAll();
	}

	@Override
	public Medico getByIdMedico(String id) {
		return this.mr.findById(id).orElseThrow(() -> new IllegalArgumentException("Médico inexistente!"));
	}
	
	@Override
	public Medico createMedico(Medico medico) {
		return this.mr.save(medico);
	}

	@Override
	public Medico updateMedico(String id, Medico medico) {
		Medico newMedico = this.getByIdMedico(id);
		newMedico.setTelefone(medico.getTelefone());
		return mr.save(newMedico);
	}
	
	@Override
	public void deleteMedico(String id) {
		this.getByIdMedico(id);
		this.mr.deleteById(id);
	}

	


}
