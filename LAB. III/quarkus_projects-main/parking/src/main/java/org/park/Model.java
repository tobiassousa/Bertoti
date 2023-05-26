package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {

	private List<Produto> produtos = new LinkedList<Produto>();

	public Model() {
		addProduto(new Produto("5555-22", new Especificacao("Avião", "Ozires Silva", "2015")));
		addProduto(new Produto("5555-23", new Especificacao("Whatszapp", "Mark", "2019")));
		addProduto(new Produto("5555-24", new Especificacao("Facebook", "Mark", "2018")));
		addProduto(new Produto("5555-25", new Especificacao("Instagram", "Mark", "2012")));
	}

	public void addProduto(Produto produto){
		produtos.add(produto);
	}

	public Produto buscarCodigo(String codigo){
		for(Produto produto:produtos){
			if(produto.getCodigo().equals(codigo)) return produto;
		}

		return null;
	}


	public List<Produto> buscarEspecificacao(Especificacao esp){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		for(Produto produto:produtos){
			if(esp.comparar(produto.getEspc())) produtosEncontrados.add(produto);
		}
		return produtosEncontrados;
	}


	public List<Produto> buscarNome(String nome){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		for(Produto produto:produtos) {
			if(produto.getEspc().getNome().equals(nome)) produtosEncontrados.add(produto);
		}
		return produtosEncontrados;
	}

	public List<Produto> buscarDiretor(String diretor){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		for(Produto produto:produtos) {
			if(produto.getEspc().getDiretor().equals(diretor)) produtosEncontrados.add(produto);
		}
		return produtosEncontrados;
	}

	public List<Produto> buscarAno(String ano){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		for(Produto produto:produtos) {
			if(produto.getEspc().getAno().equals(ano)) produtosEncontrados.add(produto);
		}
		return produtosEncontrados;
	}

	public List<Produto> getFilmes(){
		return produtos;
	}

}