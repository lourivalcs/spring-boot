package br.com.springtests.modelo;

public class Produto {
	private Long idProduto;
	private String nomeProduto;
	
	public Produto() {
		
	}
	
	public Produto(long idProduto, String nomeProduto) {
		this.setIdProduto(idProduto);
		this.setNomeProduto(nomeProduto);
	}
	
	public Long getIdProduto() {
		return this.idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
}
