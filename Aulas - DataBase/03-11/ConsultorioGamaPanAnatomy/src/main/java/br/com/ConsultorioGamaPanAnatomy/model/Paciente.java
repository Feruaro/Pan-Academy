package br.com.ConsultorioGamaPanAnatomy.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private String dataNascimento;
	private String planoSaude;
	private String carteirinha;
	private String endereco;
	private String telefone;
	
	public Paciente() {
		
	}

	public Paciente(String id, String nome, String dataNascimento, String planoSaude, String carteirinha, String endereco, String telefone) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.planoSaude = planoSaude;
		this.carteirinha = carteirinha;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	public String getCarteirinha() {
		return carteirinha;
	}
	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carteirinha, dataNascimento, endereco, id, nome, planoSaude, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(carteirinha, other.carteirinha) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(planoSaude, other.planoSaude)
				&& Objects.equals(telefone, other.telefone);
	}

	
}
