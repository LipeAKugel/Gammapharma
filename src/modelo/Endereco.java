package modelo;

/**
 * A classe Endereco representa um endereço.
 */
public class Endereco {
	
	// Atributos
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
	/**
     * Obtém o logradouro do endereço.
     *
     * @return O logradouro do endereço.
     */
	public String getLograd() {
		return logradouro;
	}
	 /**
     * Obtém o complemento do endereço.
     *
     * @return O complemento do endereço.
     */
	public String getComp() {
		return complemento;
	}
	/**
     * Obtém o CEP do endereço.
     *
     * @return O CEP do endereço.
     */
	public String getCep() {
		return cep;
	}
	/**
     * Obtém a cidade do endereço.
     *
     * @return A cidade do endereço.
     */
	public String getCidade() {
		return cidade;
	}
	/**
     * Obtém o estado do endereço.
     *
     * @return O estado do endereço.
     */
	public String getEstado() {
		return estado;
	}
	
	// Sets
	/**
     * Define o logradouro do endereço.
     *
     * @param lograd O logradouro do endereço.
     */
	public void setLograd(String lograd) {
		logradouro = lograd;
	}
	/**
     * Define o complemento do endereço.
     *
     * @param comp O complemento do endereço.
     */
	public void setComp(String comp) {
		complemento = comp;
	}
	/**
     * Define o CEP do endereço.
     *
     * @param cep O CEP do endereço.
     */
	public void setCep(String cep) {
		this.cep = cep;
	}
	/**
     * Define a cidade do endereço.
     *
     * @param cidade A cidade do endereço.
     */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
     * Define o estado do endereço.
     *
     * @param estado O estado do endereço.
     */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	// toString
	/**
     * Retorna uma representação em forma de String do objeto Endereco.
     *
     * @return Uma representação em forma de String do objeto Endereco.
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
