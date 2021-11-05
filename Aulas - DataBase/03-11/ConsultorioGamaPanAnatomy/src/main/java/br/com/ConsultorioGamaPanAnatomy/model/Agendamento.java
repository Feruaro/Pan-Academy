package br.com.ConsultorioGamaPanAnatomy.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Agendamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String data; 
	private String horario; 
	private String descricaoAgendamento;
	
	@DBRef
	private Medico medico;
	@DBRef
	private Paciente paciente;
	
	public Agendamento() {

	}

	public Agendamento(String id, String data, String horario, String descricaoAgendamento, Medico medico, Paciente paciente) {
		this.id = id;
		this.data = data;
		this.horario = horario;
		this.descricaoAgendamento = descricaoAgendamento;
		this.medico = medico;
		this.paciente = paciente;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDescricaoAgendamento() {
		return descricaoAgendamento;
	}
	public void setDescricaoAgendamento(String descricaoAgendamento) {
		this.descricaoAgendamento = descricaoAgendamento;
	}

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, descricaoAgendamento, horario, id, medico, paciente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(data, other.data) && Objects.equals(descricaoAgendamento, other.descricaoAgendamento)
				&& Objects.equals(horario, other.horario) && Objects.equals(id, other.id)
				&& Objects.equals(medico, other.medico) && Objects.equals(paciente, other.paciente);
	}

	
	
}
