package br.com.pan.academy.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pan.academy.api.model.Produto;
import br.com.pan.academy.api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository pr;
	
	public Produto findById(Integer id) {
		Optional<Produto> obj = pr.findById(id);
		return obj.orElse(null);
	}
	
	public List<Produto> findAll() {
		return pr.findAll();
	}
	
	public Produto update(Integer id, Produto obj) {
		Produto newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setValor(obj.getValor());
		newObj.setDescricao(obj.getDescricao());
		return pr.save(newObj);
	}
	
	public void delete(Integer id) {
		findById(id);
		pr.deleteById(id);
	}
	
	public Produto create(Produto obj) {
		obj.setId(null);
		return pr.save(obj);
	}
}
