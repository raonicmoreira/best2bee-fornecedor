package br.com.best2bee.fornecedor.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.best2bee.fornecedor.modelo.Produto;

public class DetalhesDoProdutoDto {

	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	
	public DetalhesDoProdutoDto(Produto produto) {
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.preco = produto.getPreco();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}


	public Double getPreco() {
		return preco;
	}
	
	//converte Produto em uma lista de ProdutoDto
	public static List<DetalhesDoProdutoDto> converter(List<Produto> produtos) {
		return produtos.stream().map(DetalhesDoProdutoDto::new).collect(Collectors.toList());
	}
		
}
