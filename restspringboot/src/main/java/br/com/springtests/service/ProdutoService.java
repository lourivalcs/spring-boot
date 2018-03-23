package br.com.springtests.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import br.com.springtests.modelo.Produto;

@Service
public class ProdutoService {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public ProdutoService() {
		produtos.add(new Produto(1,"Produto 1"));
		produtos.add(new Produto(2,"Produto 2"));
		produtos.add(new Produto(3,"Produto 3"));
		produtos.add(new Produto(4,"Produto 4"));
		produtos.add(new Produto(5,"Produto 5"));
		produtos.add(new Produto(6,"Produto 6"));
		produtos.add(new Produto(7,"Produto 7"));
		produtos.add(new Produto(8,"Produto 8"));
		produtos.add(new Produto(9,"Produto 9"));
		
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public String adicionarProduto(Produto produto) {
		produtos.add(produto);
		return produto.getNomeProduto() + " Adicionado";
	}
	
	public String editarProduto(Produto produto) {
		produtos.stream()
				.filter(f -> f.getIdProduto() == produto.getIdProduto())
				.findFirst().get()
				.setNomeProduto(produto.getNomeProduto());
		return "Registro atualizado";
	}
	
	public String removerProduto(Long idProduto) {
		produtos.removeIf(r -> r.getIdProduto() == idProduto);
		return "Registro Removido";
	}
}
