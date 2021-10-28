package br.com.pan.academy.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.pan.academy.api.model.Usuario;
import br.com.pan.academy.api.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {
	
	@Autowired
	UsuarioRepository ur;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario("Fernanda", "1234");
		Usuario u2 = new Usuario("William", "4321");
		
		ur.saveAll(Arrays.asList(u1, u2));
	}

}
