package classes;

public class Filial {
	
	// Atributos.
	private String nome;
	private String cnpj;
	private Endereco endereco;
	
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
	public Endereco getEndereco() {
		return endereco;
	}
	
	// Sets.
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setEndereco(Endereco end) {
		endereco = end;
	}
	
	// toString.
	public String toString() {
		return "Nome: " + nome + ", CNPJ: " + cnpj + ", Cidade: " + endereco.getCidade();
	}
}
