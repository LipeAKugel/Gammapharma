package modelo;

import java.util.ArrayList;
/**
 * A classe Filial representa uma ou mais filiais da classe farmacia.
 */
public class Filial {
	
	// Atributos
	private String identificador;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Produto> listaProdutos;
	
	// Construtores
	/**
     * Construtor da classe Filial.
     *
     * @param identificador O identificador da filial.
     * @param cnpj          O CNPJ da filial.
     * @param end           O endereço da filial.
     */
	public Filial(String identificador, String cnpj, Endereco end) {
		this.identificador = identificador;
		this.cnpj = cnpj;
		endereco = end;
		listaProdutos = new ArrayList<Produto>();
	}
	
	// Gets
    /**
     * Obtém o identificador da filial.
     *
     * @return O identificador da filial.
     */
	public String getIdentificador() {
		return identificador;
	}
    /**
     * Obtém o CNPJ da filial.
     *
     * @return O CNPJ da filial.
     */
	public String getCnpj() {
		return cnpj;
	}
	/**
     * Obtém o endereço da filial.
     *
     * @return O endereço da filial.
     */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
     * Obtém a lista de produtos da filial.
     *
     * @return A lista de produtos da filial.
     */
	public ArrayList<Produto> getlistaProdutos() {
		return listaProdutos;
	}
	
	// Sets
	/**
     * Define o identificador da filial.
     *
     * @param identificador O identificador da filial.
     */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	/**
     * Define o CNPJ da filial.
     *
     * @param cnpj O CNPJ da filial.
     */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
     * Define o endereço da filial.
     *
     * @param end O endereço da filial.
     */
	public void setEndereco(Endereco end) {
		endereco = end;
	}
	/**
     * Define a lista de produtos da filial.
     *
     * @param lista A lista de produtos da filial.
     */
	public void setlistaProdutos(ArrayList<Produto> lista) {
		listaProdutos = lista;
	}
	
	// Métodos
    /**
     * Adiciona um produto à filial.
     *
     * @param produto O produto a ser adicionado.
     * @return true se o produto foi adicionado com sucesso, false caso contrário.
     */
	public boolean addProduto(Produto produto) {
		return listaProdutos.add(produto);
	}
	/**
     * Remove um produto da filial.
     *
     * @param produto O produto a ser removido.
     * @return true se o produto foi removido com sucesso, false caso contrário.
     */
	public boolean deletarProduto(Produto produto) {
		return listaProdutos.remove(produto);
	}
	
	// toString
    /**
     * Retorna uma representação em formato de String da filial.
     *
     * @return Uma String contendo o identificador, o CNPJ e a cidade da filial.
     */
    @Override
	public String toString() {
		return "Nome: " + identificador + ", CNPJ: " + cnpj +
			   ", Cidade: " + endereco.getCidade();
	}
}
