
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produto;
import com.example.demo.services.ProdutoService;

@RestController

@RequestMapping("/produtos")
public class ProdutoController {
	private final ProdutoService produtoService;
	
	@Autowired
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@PostMapping
	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}
	
	@GetMapping
	public List<Produto> getAllProdutos(){
		return produtoService.getAllProdutos();
	}

	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		return produtoService.getProdutoById(id);
	}

}
