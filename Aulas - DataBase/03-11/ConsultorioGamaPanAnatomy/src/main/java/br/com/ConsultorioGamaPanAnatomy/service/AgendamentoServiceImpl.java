package br.com.ConsultorioGamaPanAnatomy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;
import br.com.ConsultorioGamaPanAnatomy.model.Medico;
import br.com.ConsultorioGamaPanAnatomy.model.Paciente;
import br.com.ConsultorioGamaPanAnatomy.repository.AgendamentoRepository;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {
	
	@Autowired
	private AgendamentoRepository ar;
	
	@Autowired
	private MedicoServiceImpl ms;
	
	@Autowired
	private PacienteServiceImpl ps;

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
		Medico verificaIdMedico = ms.getByIdMedico(idMedico);
		
		String idPaciente = agendamento.getPaciente().getId();
		Paciente verificaIdPaciente = ps.getByIdPaciente(idPaciente);
		
		agendamento.setMedico(verificaIdMedico);
		agendamento.setPaciente(verificaIdPaciente);
		
		return this.ar.save(agendamento);
	}

	@Override
	public Agendamento updateAgendamento(String id, Agendamento agendamento) {
		Agendamento newAgendamento = getByIdAgendamento(id);
		
		if(agendamento.getData() != null) newAgendamento.setData(agendamento.getData());
		if(agendamento.getHorario() != null) newAgendamento.setHorario(agendamento.getHorario());
		if(agendamento.getDescricaoAgendamento() != null) newAgendamento.setDescricaoAgendamento(agendamento.getDescricaoAgendamento());
				
		return ar.save(newAgendamento);
	}

	@Override
	public void deleteAgendamento(String id) {
		getByIdAgendamento(id);
		ar.deleteById(id);
	}
	
	
}
