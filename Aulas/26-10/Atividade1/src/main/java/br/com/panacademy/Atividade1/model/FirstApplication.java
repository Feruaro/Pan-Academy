package br.com.panacademy.Atividade1.model;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructorpublic class FirstApplication {
	
	private List<String> habilidades;

	public StringBuilder getAllHabilidades() {
		StringBuilder sbr = new StringBuilder();
		
		for(int i=0; i<habilidades.size(); i++) {
			sbr.append("Habilidade " + (i+1) + " = " + habilidades.get(i) + "\n");
		}	
		
		return sbr;
	}	
	
	
}
