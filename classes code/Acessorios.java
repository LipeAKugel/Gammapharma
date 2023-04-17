
public class Acessorios {

	private double peso;
	private double preco;
	private String marca;
	private String quantidade;
	private String nome;
	private String fabricante;
	
	public Acessorios(String marca, String quantidade, String nome,
					  String fabricante, double peso, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.fabricante = fabricante;
		this.peso = peso;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//GETS
	public double getPeso() { 
			return peso;
	}
	
	public double getPreco() {
			return preco;
	}
	
	public String getNome() {
			return nome;
	}
					
	public String getQuantidade() {
			return quantidade;
	}
	
	public String getFabricante() {
			return fabricante;
	}
	
	public String getMarca() {
			return marca;
	}
	
	//SETS
	public void setPeso(double peso) {
			this.peso = peso;
	}
	
	public void setPreco(double preco) {
			this.preco = preco;
	}
	
	public void setNome(String nome) {
			this.nome = nome;
	}
	
	public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
	}
	
	public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
	}
	public void setMarca(String marca) {
			this.marca = marca;
	}
}
