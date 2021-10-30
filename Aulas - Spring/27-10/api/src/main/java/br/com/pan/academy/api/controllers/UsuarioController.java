package br.com.pan.academy.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pan.academy.api.model.Usuario;
import br.com.pan.academy.api.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	//@GetMapping  ->  path | value | somente a string
	@GetMapping(path = "/{id}")   //@PathVariable para poder diferenciar um endpoint de uma variável
	public ResponseEntity<Usuario> findById(@PathVariable Integer id){
		Usuario obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);
	};
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
