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
	
	@DBRef
	private Medico medico;
	
	public Agendamento() {
		
	}

	public Agendamento(String id, String data, Medico medico) {
		this.id = id;
		this.data = data;
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

	@Override
	public int hashCode() {
		return Objects.hash(data, id, medico);
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
		return Objects.equals(data, other.data) && Objects.equals(id, other.id) && Objects.equals(medico, other.medico);
	}
	
}
