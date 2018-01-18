package br.com.springtests.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.springtests.modelo.Produto;
import br.com.springtests.service.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping(method=RequestMethod.GET, value="/listarProduto")
	public List<Produto> listarProduto() {
		return this.produtoService.getProdutos();		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/adicionarProduto")
	public String adicionarProduto(@RequestBody Produto produto) {
		return this.produtoService.adicionarProduto(produto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/editarProduto")
	public String editarProduto(@RequestBody Produto produto) {
		return this.produtoService.editarProduto(produto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/removerProduto")
	public String removerProduto(@RequestBody Produto produto) {
		return this.produtoService.removerProduto(produto.getIdProduto());
	}
}
