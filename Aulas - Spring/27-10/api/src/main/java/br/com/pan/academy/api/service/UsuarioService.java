package br.com.pan.academy.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pan.academy.api.model.Usuario;
import br.com.pan.academy.api.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository ur;
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = ur.findById(id);
		return obj.orElse(null);
	}
	
	public List<Usuario> findAll() {
		return ur.findAll();
	}
	
}
