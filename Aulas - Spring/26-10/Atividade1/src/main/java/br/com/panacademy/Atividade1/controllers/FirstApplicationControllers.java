package br.com.panacademy.Atividade1.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panacademy.Atividade1.model.FirstApplication;

@RestController
@RequestMapping(path = "/home")
public class FirstApplicationControllers {
	
	//1- Hello World
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	//2- Retornar um relato sobre sua experiencia em fazer sua primeira aplicação Web Java
	@GetMapping("/relatoExperiencia")
	public String relatoExperiencia() {
		
		return "Fiquei muito feliz com a experiência da minha primeira aplicação Java Web com Spring Boot!!" +
			  "\nUtilizei todos os conhecimentos aprendidos em aula e outros conhecimentos adquiridos em estudos das faculdades e cursos de Java" +
			  "\nEstou cada dia mais feliz e animada com toda a minha caminhada e evolução nesta jornada!";
	}
	
	//3- Retornar uma string com as habilidades e mentalidades que você utilizou para realizar essa atividade
	@GetMapping("/habilidades")
	public String firstApp() {
		
		List<FirstApplication> habilidades = Arrays.asList(new FirstApplication("Spring boot"),
				                                           new FirstApplication("Spring Dev Tools"),
				                                           new FirstApplication("Lombok"),
				                                           new FirstApplication("Conhecimentos em Java"),
				                                           new FirstApplication("Aulas maravilhosas da Jeni, Jonathan e Ana <3"));
		
		return habilidades.toString();
	}
	
}
