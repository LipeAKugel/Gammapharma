
public class Medicamento { // public começa com Letra maiuscula

	private String nome; //minusculo
	private String categoria;
	private String marca;
	private double preco;
	private String uso;
	private String fabricante;
	private String dosagem; //Questionar a professora.
	private String quantidade;
	
	public Medicamento(String nome, String categoria, String fabricante, String quantidade,//Começo maiusculo
					   String marca, double preco, String uso, String dosagem) {
		
		this.nome = nome;
		this.categoria = categoria;
		this.marca = marca;
		this.preco = preco;
		this.uso = uso;
		this.fabricante = fabricante;
		this.dosagem = dosagem;
		this.quantidade = quantidade;
	}
	
	//gets
	public String getNome () {
			return nome;
	}
	
	public String getCategoria () {
			return categoria;
	}
	
	public String getMarca () {
			return marca;
	}
	
	public double getPreco () {
			return preco;
	}	
	
	public String getUso () {
			return uso;
	}
	
	public String getFabricante () {
			return fabricante;
	}
	
	public String getDosagem () {
			return dosagem;
	}
	
	public String getQuantidade () {
			return quantidade;
	}
	
	//sets
	public void setNome(String nome) {
			this.nome = nome;
	}
	
	public void setCategoria(String categoria) {
			this.categoria = categoria;
	}
	
	public void setMarca(String marca) {
			this.marca = marca;
	}
	
	public void setPreco (double preco) {
			this.preco = preco;
	}
	
	public void setUso (String uso) {
			this.uso = uso;
	}
	
	public void setFabricante (String fabricante) {
			this.fabricante = fabricante;
	}
	
	public void setDosagem (String dosagem) {
			this.dosagem = dosagem;
	}
	
	public void setQuantidade (String quantidade) {
			this.quantidade = quantidade;
	}
	
}
