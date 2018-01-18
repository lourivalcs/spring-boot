package br.com.springtests.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import br.com.springtests.modelo.Produto;

@Service
public class ProdutoService {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
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
