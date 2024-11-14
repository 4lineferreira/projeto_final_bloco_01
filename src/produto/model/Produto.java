package produto.model;

public abstract class Produto {

	private float valor;
	private String nome;
	private String marca;
	private int id;
	public Produto(String nome, String marca, int id, float valor) {
		this.nome = nome;
		this.marca = marca;
		this.id = id;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void Visualizar () {
		System.out.println("\n\nID: " + this.id);
		System.out.println("Produto: " + this.nome);
		System.out.println("Marca: " + this.marca);
		System.out.println("Valor: " + this.valor);
		
	}
	
	
}
