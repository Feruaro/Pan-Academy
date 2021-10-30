package br.com.pan.academy.api.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity 
@Table(name = "Usuários")
public class Usuario implements Serializable {	
	
	private static final long serialVersionUID = 1L;

	@Id             //strategy  ->  informa a forma que o id é criado  |  GenerationType  ->  cia um id sem repetir r de forma sequencial
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty      
	@Length(min = 3, max = 100, message = "Nome entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty
	@Length(min = 3, max = 100, message = "Senha entre 3 e 100 caracteres")
	private String senha;

	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
