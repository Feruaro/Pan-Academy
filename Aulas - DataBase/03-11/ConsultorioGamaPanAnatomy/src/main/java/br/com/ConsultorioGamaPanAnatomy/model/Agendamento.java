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
	private String nomePaciente;
	private String dataNascPaciente;
	private String carteirinhaPaciente;
	private String telefonePaciente;
	private String descricaoAgendamento;
	
	@DBRef
	private Medico medico;
	
	public Agendamento() {
		
	}

	public Agendamento(String id, String data, String horario, String nomePaciente, String dataNascPaciente,
			String carteirinhaPaciente, String telefonePaciente, String descricaoAgendamento, Medico medico) {
		this.id = id;
		this.data = data;
		this.horario = horario;
		this.nomePaciente = nomePaciente;
		this.dataNascPaciente = dataNascPaciente;
		this.carteirinhaPaciente = carteirinhaPaciente;
		this.telefonePaciente = telefonePaciente;
		this.descricaoAgendamento = descricaoAgendamento;
		this.medico = medico;
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

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public String getDataNascPaciente() {
		return dataNascPaciente;
	}
	public void setDataNascPaciente(String dataNascPaciente) {
		this.dataNascPaciente = dataNascPaciente;
	}

	public String getCarteirinhaPaciente() {
		return carteirinhaPaciente;
	}
	public void setCarteirinhaPaciente(String carteirinhaPaciente) {
		this.carteirinhaPaciente = carteirinhaPaciente;
	}

	public String getTelefonePaciente() {
		return telefonePaciente;
	}
	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	public String getDescricaoAgendamento() {
		return descricaoAgendamento;
	}
	public void setDescricaoAgendamento(String descricaoAgendamento) {
		this.descricaoAgendamento = descricaoAgendamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carteirinhaPaciente, data, descricaoAgendamento, horario, id, medico, nomePaciente,
				telefonePaciente);
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
		return Objects.equals(carteirinhaPaciente, other.carteirinhaPaciente) && Objects.equals(data, other.data)
				&& Objects.equals(descricaoAgendamento, other.descricaoAgendamento)
				&& Objects.equals(horario, other.horario) && Objects.equals(id, other.id)
				&& Objects.equals(medico, other.medico) && Objects.equals(nomePaciente, other.nomePaciente)
				&& Objects.equals(telefonePaciente, other.telefonePaciente);
	}
	
}
