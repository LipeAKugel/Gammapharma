package modelo;

import java.util.ArrayList;
/**
 * A classe Filial representa uma filial de uma farmácia, contendo informações
 * como identificador, CNPJ, endereço e uma lista de produtos. Essa classe fornece 
 * métodos para acessar e modificar essas informações, além de funcionalidades como
 * adicionar e remover produtos da filial. Também inclui uma representação em formato
 * de String que exibe o identificador, CNPJ e cidade da filial.
 * @author João Vitor e Felipe Amorim
 * @since 2023
 * @version 1.0
 */
public class Filial {
	
	private String identificador;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Produto> listaProdutos;
	
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
	
	public String getIdentificador() {
		return identificador;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public ArrayList<Produto> getlistaProdutos() {
		return listaProdutos;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(Endereco end) {
		endereco = end;
	}

	public void setlistaProdutos(ArrayList<Produto> lista) {
		listaProdutos = lista;
	}
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
	
    /**
     * @return Uma representação em forma de String da filial que contém: 
     * identificador, cnpj e endereço da filial.
     */
    @Override
	public String toString() {
		return "Nome: " + identificador + ", CNPJ: " + cnpj +
			   ", Cidade: " + endereco.getCidade();
	}
}
