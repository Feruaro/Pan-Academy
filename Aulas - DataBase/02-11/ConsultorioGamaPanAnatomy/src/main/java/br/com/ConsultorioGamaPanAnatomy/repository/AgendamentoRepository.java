package br.com.ConsultorioGamaPanAnatomy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ConsultorioGamaPanAnatomy.model.Agendamento;

public interface AgendamentoRepository extends MongoRepository<Agendamento, String> {

}
