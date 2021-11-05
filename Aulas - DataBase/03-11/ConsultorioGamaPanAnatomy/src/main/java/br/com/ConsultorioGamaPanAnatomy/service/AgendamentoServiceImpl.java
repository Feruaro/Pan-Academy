package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;
import br.com.ConsultorioGamaPanAnatomy.model.Medico;
import br.com.ConsultorioGamaPanAnatomy.model.Paciente;
import br.com.ConsultorioGamaPanAnatomy.repository.AgendamentoRepository;
import br.com.ConsultorioGamaPanAnatomy.repository.MedicoRepository;
import br.com.ConsultorioGamaPanAnatomy.repository.PacienteRepository;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {
	
	@Autowired
	private AgendamentoRepository ar;
	
	@Autowired
	private MedicoRepository mr;
	
	@Autowired
	private PacienteRepository pr;

	@Override
	public List<Agendamento> getListaAgendamentos() {
		return this.ar.findAll();
	}

	@Override
	public Agendamento getByIdAgendamento(String id) {
		return this.ar.findById(id).orElseThrow(() -> new IllegalArgumentException("Agendamento inexistente!"));
	}

	@Override
	public Agendamento createAgendamento(Agendamento agendamento) {
		String idMedico = agendamento.getMedico().getId();
		Medico verificaIdMedico = mr.findById(idMedico).orElseThrow(() -> new IllegalArgumentException("Médico inexistente!"));
		
		String idPaciente = agendamento.getPaciente().getId();
		Paciente verificaIdPaciente = pr.findById(idPaciente).orElseThrow(() -> new IllegalArgumentException("Paciente inexistente!"));
		
		agendamento.setMedico(verificaIdMedico);
		agendamento.setPaciente(verificaIdPaciente);
		
		return this.ar.save(agendamento);
	}

	@Override
	public Agendamento updateAgendamento(String id, Agendamento agendamento) {
		Agendamento newAgendamento = getByIdAgendamento(id);
		newAgendamento.setData(agendamento.getData());
		
		return ar.save(null);
	}

	@Override
	public void deleteAgendamento(String id) {
		getByIdAgendamento(id);
		ar.deleteById(id);
	}
	
	
}
