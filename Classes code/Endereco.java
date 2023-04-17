
public class Endereco {
	
	// Atributos.
	private String logradouro;
	private String complemento;
	private int cep;
	private String cidade;
	private String estado;
	
	// Construtores.
	public Endereco(String lograd, String comp, int cep,
				    String cidade, String estado) {
		logradouro = lograd;
		complemento = comp;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	// Gets.
	public String getLograd() {
		return logradouro;
	}
	public String getComp() {
		return complemento;
	}
	public int getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	
	// Sets.
	public void setLograd(String lograd) {
		logradouro = lograd;
	}
	public void setComp(String comp) {
		complemento = comp;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
