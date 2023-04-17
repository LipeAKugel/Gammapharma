
public class Filial {
	
	// Atributos.
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private Produto listaProdutos[];
	
	// Construtores.
	public Filial(String nome, String cnpj, Endereco endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	// Gets.
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	// Sets.
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// Métodos.
}
