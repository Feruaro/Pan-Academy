package br.com.panacademy.Atividade1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FirstApplication {
	
	private String habilidade1;
	private String habilidade2;
	private String habilidade3;
	private String habilidade4;

	
	@Override
	public String toString() {
		return "Habilidade 1 = " + habilidade1 + "\nHabilidade 2 = " + habilidade2 + "\nHabilidade 3 = "
				+ habilidade3 + "\nHabilidade4 = " + habilidade4;
	}
	
	
	
}
