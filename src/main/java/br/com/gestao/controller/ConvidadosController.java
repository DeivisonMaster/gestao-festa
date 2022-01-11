package br.com.gestao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gestao.repository.ConvidadoRepository;

@Controller
public class ConvidadosController {
	
	@Autowired
	private ConvidadoRepository repository;
	
	@GetMapping("/convidados")
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject(repository.findAll());
		return mv;
	}
	
}
