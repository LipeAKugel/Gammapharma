package modelo;

/**
 * A classe Endereco representa um endereço físico, contendo informações 
 * como logradouro, complemento, CEP, cidade e estado. Essa classe fornece 
 * métodos para acessar e modificar esses atributos, além de uma representação 
 * em formato de ToString do endereço completo.
 * @author João Vitor e Felipe Amorim
 * @since 2023
 * @version 1.0
 */
public class Endereco {
	
	private String logradouro;
	private String complemento;
	private String cep;
	private String cidade;
	private String estado;
	

    /**
     * Construtor da classe Endereco.
     *
     * @param lograd   O logradouro do endereço.
     * @param comp     O complemento do endereço.
     * @param cep      O CEP do endereço.
     * @param cidade   A cidade do endereço.
     * @param estado   O estado do endereço.
     */
	
	public Endereco(String lograd, String comp, String cep,
				    String cidade, String estado) {
		logradouro = lograd;
		complemento = comp;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
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

	/**
     * @return Uma representação em forma de String do Endereço que contém: 
     * logradouro, complemento, cep, cidade e estado.
     */
    @Override
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
