package classes;

public class Produto {

	// Atributos.
	private String nome;
	private String categoria;
	private String marca;
	private double preco;
	
	// Construtor.
	public Produto(String nome, String categoria,
				   String marca, double preco) {
		this.nome = nome;
		this.categoria = categoria;
		this.marca = marca;
		this.preco = preco;
	}
	
	// Gets.
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getPreco() {
		return preco;
	}
	
	// Sets.
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
