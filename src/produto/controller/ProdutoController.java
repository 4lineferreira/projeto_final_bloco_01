package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	int numero = 0;
	
	ArrayList<Produto> listaEstoque = new ArrayList<Produto>();

	@Override
	public void cadastrarProduto(Produto produto) {
		listaEstoque.add(produto);
		System.out.println("O " + produto.getNome() + " foi adicionado com sucesso ao estoque!");
		
	}

	@Override
	public void vandaProduto(int id) {
		var produto = buscarEstoque(id);
		if (produto != null) {
			if(listaEstoque.remove(produto)==true)
				System.out.println("A venda do produto " + produto.getNome() + " foi concluída");
		}else 
			System.out.println("O produto com o ID: " + id + " não foi encontrado!");
		
	}

	@Override
	public void listaEstoque() {
		for (var produto : listaEstoque) {
			produto.Visualizar();
		}
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarEstoque(produto.getId());
		if(buscarProduto != null) {
			listaEstoque.set(listaEstoque.indexOf(buscarProduto), produto);
			System.out.println("O produto ID " + produto.getId() + " foi atualizado com sucesso");
		}else
			System.out.println("O produto com o ID " + produto.getId() + " não foi encontrado");
		
	}
	
	public Produto buscarEstoque (int id) {
		for (var produto :listaEstoque ) {
			if (produto.getId()==id) {
				return produto;
			}
		}return null;
	}
	
	public int gerarId() {
		return ++numero;
	}
		
}
