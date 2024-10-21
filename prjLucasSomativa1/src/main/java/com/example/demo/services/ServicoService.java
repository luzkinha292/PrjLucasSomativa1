
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Servico;
import com.example.demo.repositories.ServicoRepository;

@Service
public class ServicoService {
	private final ServicoRepository servicoRepository;
	
	@Autowired
	public ServicoService(ServicoRepository servicoRepository) {
		this.servicoRepository = servicoRepository;
	}
	
	public Servico saveServico(Servico servico) {
		return servicoRepository.save(servico);
	}
	
	public Servico getServicoById(Long id) {
		return servicoRepository.findById(id).orElse(null);
	}
	
	public List<Servico> getAllServicos(){
		return servicoRepository.findAll();
	}	
	
}
