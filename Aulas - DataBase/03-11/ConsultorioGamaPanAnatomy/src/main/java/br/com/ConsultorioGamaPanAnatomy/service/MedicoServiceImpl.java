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
	public List<Medico> getAll() {
		return this.mr.findAll();
	}

	@Override
	public Medico getId(String id) {
		return this.mr.findById(id).orElseThrow(() -> new IllegalArgumentException("Médico inexistente!"));
	}

	@Override
	public Medico create(Medico medico) {
		return this.mr.save(medico);
	}

	@Override
	public Medico update(String id, Medico medico) {
		Medico objMedico = this.getId(id);
		objMedico.setNome(medico.getNome());
		objMedico.setDocumentoProfissional(medico.getDocumentoProfissional());
		objMedico.setEspecialidade(medico.getEspecialidade());
		objMedico.setTelefone(medico.getTelefone());
		
		return mr.save(objMedico);
	}

	@Override
	public void delete(String id) {
		getId(id);
		mr.deleteById(id);
	}
}
