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
	
	
	public Usuario update(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setSenha(obj.getSenha());
		return ur.save(newObj);
	}
	
	public void delete(Integer id) {
		findById(id);
		ur.deleteById(id);
	}
	
	public Usuario create(Usuario obj) {
		obj.setId(null);
		return ur.save(obj);
	}
	
	
}
