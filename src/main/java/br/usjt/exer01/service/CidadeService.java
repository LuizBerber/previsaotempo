package br.usjt.exer01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.exer01.model.Cidade;
import br.usjt.exer01.repository.CidadeRepository;

public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	public List<Cidade> listarCidade() {
		return repo.findAll();
	}

	public void excluir(Cidade cidade) {
		repo.delete(cidade);
	}

	public void salvar(Cidade cidade) {
		repo.save(cidade);
	}

}
