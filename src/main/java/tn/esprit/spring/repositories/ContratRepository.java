package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Contrat;

@Repository
public interface ContratRepository  extends CrudRepository<Contrat, Long>{

}
