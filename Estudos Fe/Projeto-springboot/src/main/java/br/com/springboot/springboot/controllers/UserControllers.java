package br.com.springboot.springboot.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.springboot.model.User;

@RestController
@RequestMapping("/users")
public class UserControllers {
	
//	 Para cada método existe uma anotação;
//	 Através da anotação @...Mapping indica qual método;
//	
//	 GET(ler)                  -> @GetMapping   | recebe como parâmetro um path
//	 POST(criar)               -> @PostMapping
//	 PUT(substituir/alterar)   -> @PutMapping
//	 DELETE(remover)           -> @DeleteMapping
//	 PATCH(modificar)          -> @PatchMapping
	
	private List<User> users = new ArrayList<>();
	
	@GetMapping("/{id}")
	public User user(@PathVariable("id") Long id) {
		System.out.println("O id é " + id);
		
		Optional<User> userFind = users.stream().filter(user -> user.getId() == id).findFirst();
			
		if(userFind.isPresent()) return userFind.get();
					
		return null;
	}
	
	@PostMapping("/")
	public User user(@RequestBody User user) {
		users.add(user);
		return user;
	}
	
	@GetMapping("/List")
	public List<User> listUser() {
		return users;
	}
	
}
