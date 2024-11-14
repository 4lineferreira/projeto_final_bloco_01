package produto.model;

public class ProdutoConsole extends Produto {

	String versao;

	public ProdutoConsole(String nome, String marca, int id, float valor, String versao) {
		super(nome, marca, id, valor);

		this.versao = versao;

	}
	@Override
	public void Visualizar () {
		System.out.println("Versão: " + this.versao);
	}
}
