package br.usjt.exer01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.exer01.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
