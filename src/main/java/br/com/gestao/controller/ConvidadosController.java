package br.com.gestao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gestao.model.Convidado;
import br.com.gestao.repository.ConvidadoRepository;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private ConvidadoRepository repository;
	
	@GetMapping
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidado", new Convidado());
		mv.addObject("listaConvidados", repository.findAll());
		return mv;
	}
	
	@PostMapping
	public String salvar(Convidado convidado){
		repository.save(convidado);
		return "redirect:/convidados";
	}
	
}
