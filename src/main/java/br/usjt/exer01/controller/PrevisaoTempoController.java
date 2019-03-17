package br.usjt.exer01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.exer01.repository.PrevisaoTempoRepository;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private PrevisaoTempoRepository tempoRepo;
	
	@GetMapping("/tempo")
	public ModelAndView listarTempos() {
		ModelAndView mv = new ModelAndView("lista_tempo");
		
		List<PrevisaoTempoController> tempos = tempoRepo.findAll();
		
		mv.addObject("tempo", tempos);
		
		return mv;
		
	}

}