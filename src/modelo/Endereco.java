package modelo;

public class Endereco {
	
	// Atributos
	private String logradouro;
	private String complemento;
	private String cep;
	private String cidade;
	private String estado;
	
	// Construtor
	public Endereco(String lograd, String comp, String cep,
				    String cidade, String estado) {
		logradouro = lograd;
		complemento = comp;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	// Gets
	public String getLograd() {
		return logradouro;
	}
	public String getComp() {
		return complemento;
	}
	public String getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	
	// Sets
	public void setLograd(String lograd) {
		logradouro = lograd;
	}
	public void setComp(String comp) {
		complemento = comp;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	// toString
	public String toString() {
		String saida;
		/*
		format = logradouro + "\n" +
				 complemento + "\n" +
				 cep + "\n" +
				 cidade + "\n" +
				 estado + "\n";
		*/
		
		saida = logradouro + ", " + complemento + ", " + cep + ", " + cidade + ", " + estado;
		return saida;
	}	
}
