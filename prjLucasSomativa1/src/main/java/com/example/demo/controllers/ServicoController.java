
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Servico;
import com.example.demo.services.ServicoService;

@RestController

@RequestMapping("/serviços")
public class ServicoController {
	private final ServicoService servicoService;
	
	@Autowired
	public ServicoController(ServicoService servicoService) {
		this.servicoService = servicoService;
	}
	
	@PostMapping
	public Servico createServico(@RequestBody Servico servico) {
		return servicoService.saveServico(servico);
	}
	
	@GetMapping
	public List<Servico> getAllServico(){
		return servicoService.getAllServicos();
	}

	@GetMapping("/{id}")
	public Servico getServico(@PathVariable Long id) {
		return servicoService.getServicoById(id);
	}

}
