package br.com.panacademy.Atividade1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panacademy.Atividade1.model.FirstApplication;

@RestController
@RequestMapping(path = "/home")
public class FirstApplicationControllers {
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	
	//	uma string com as habilidades e mentalidades que você utilizou para realizar essa atividade.
	
	@GetMapping("/habilidades")
	public String firstApp() {
		FirstApplication firstApp = new FirstApplication();
		
		firstApp.setHabilidade1("Spring Boot");
		firstApp.setHabilidade2("Spring Dev Tools");
		firstApp.setHabilidade3("Lombok");
		firstApp.setHabilidade4("Conhecimento Java");
		
		return firstApp.toString();
	}
	
}
