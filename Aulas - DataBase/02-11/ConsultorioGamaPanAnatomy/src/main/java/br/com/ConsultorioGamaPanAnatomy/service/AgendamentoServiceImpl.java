package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;
import br.com.ConsultorioGamaPanAnatomy.model.Medico;
import br.com.ConsultorioGamaPanAnatomy.repository.AgendamentoRepository;
import br.com.ConsultorioGamaPanAnatomy.repository.MedicoRepository;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {
	
	@Autowired
	private AgendamentoRepository ar;
	
	@Autowired
	private MedicoRepository mr;

	@Override
	public List<Agendamento> getAll() {
		return this.ar.findAll();
	}

	@Override
	public Agendamento getId(String id) {
		return this.ar.findById(id).orElseThrow(() -> new IllegalArgumentException("Agendamento inexistente!"));
	}

	@Override
	public Agendamento create(Agendamento agendamento) {
		String idMedico = agendamento.getMedico().getId();
		Medico verificaIdMedico = mr.findById(idMedico).orElseThrow(() -> new IllegalArgumentException("Médico inexistente!"));
		agendamento.setMedico(verificaIdMedico);
		
		return this.ar.save(agendamento);
	}

//	@Override
//	public Agendamento update(String id, Agendamento obj) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(String id) {
//		// TODO Auto-generated method stub
//		
//	}
}
