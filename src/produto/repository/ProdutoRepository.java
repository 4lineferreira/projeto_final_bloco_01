package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {

	public void cadastrarProduto (Produto produto);
	public void vandaProduto (int id);
	public void listaEstoque ();
	public void atualizar (Produto produto);
	
	
}
