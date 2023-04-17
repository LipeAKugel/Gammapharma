
public class Higiene {

	private String nome;
	private double peso;
	private String fabricante;
	private String marca;
	private String quantidade;
	private double preco;
	private String categoria;
	
	public Higiene(String nome, String fabricante, double preco, String categoria,
				   String marca, String quantidade, double peso) {
		
		this.nome = nome;
		this.marca = marca;
		this.fabricante = fabricante;
		this.quantidade = quantidade;
		this.peso = peso;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	//GETS
	public String getNome () {
			return nome;
	}
	
	public String getFabricante () {
			return fabricante;
	}
	
	public String getMarca () {
			return marca;
	}
	
	public String getQuantidade () {
			return quantidade;
	}
	
	public double getPreco () {
			return preco;
	}
	
	public double getPeso () {
			return peso;
	}
	
	public String getCategoria () {
			return categoria;
	}
	
	//SETS
	public void setNome (String nome) {
			this.nome = nome;
	}
	
	public void setFabricante (String fabricante) {
			this.fabricante = fabricante;
	}
	
	public void setMarca (String marca) {
			this.marca = marca;
	}
	
	public void setQuantidade (String quantidade) {
			this.quantidade = quantidade;
	}
	
	public void setPreco (double preco) {
			this.preco = preco;
	}
	
	public void setPeso (double peso) {
			this.peso = peso;
	}
	
	public void setCategoria (String categoria) {
			this.categoria = categoria;
	}
	
}
