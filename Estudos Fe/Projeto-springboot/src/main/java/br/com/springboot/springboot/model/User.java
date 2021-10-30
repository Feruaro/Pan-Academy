package br.com.springboot.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter                //-> criando os métodos getters através do lombok
@Setter                //-> criando os métodos setters através do lombok
@AllArgsConstructor    //-> criando o método construtor (com todos os atributos) através do lombok
@NoArgsConstructor     //-> criando o método construtor (vazio) através do lombok
public class User {
	
	private Long id;
	private String name;
	private String username;

	
	
}
