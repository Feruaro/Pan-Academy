package br.com.ConsultorioGamaPanAnatomy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ConsultorioGamaPanAnatomy.model.Paciente;

public interface PacienteRepository extends MongoRepository<Paciente, String> {

}
