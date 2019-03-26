package br.usjt.exer01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.exer01.model.PrevisaoTempo;
import br.usjt.exer01.repository.PrevisaoTempoRepository;

@Service
public class PrevisaoTempoService {

	@Autowired
	private PrevisaoTempoRepository tempoRepo;
	
	public void salvar(PrevisaoTempo tempo) {
		tempoRepo.save(tempo);
	}
	
	public List <PrevisaoTempo> listarTodos(){
		return tempoRepo.findAll();
	}
}
