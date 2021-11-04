package br.com.ConsultorioGamaPanAnatomy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ConsultorioGamaPanAnatomy.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
