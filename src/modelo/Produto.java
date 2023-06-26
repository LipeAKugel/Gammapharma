package modelo;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * A classe abstrata Produto representa um produto que está na filial.
 * Contém informações como nome, marca, fabricante, validade, peso e preço.
 * Sendo a classe pai de medicamento, suplemento e cosmético.
 */
public abstract class Produto {

	// Atributos
	protected String nome;
	protected String marca;
	protected String fabricante;
	protected Date validade;
	protected double peso;
	protected double preco;
	
	// Construtor
	/**
     * Construtor da classe Produto.
     *
     * @param nome       O nome do produto.
     * @param marca      A marca do produto.
     * @param fab        O fabricante do produto.
     * @param val        A data de validade do produto.
     * @param peso       O peso do produto.
     * @param preco      O preço do produto.
     */
	public Produto(String nome, String marca, String fab, Date val,
				   double peso, double preco) {
		this.nome = nome;
		this.marca = marca;
		fabricante = fab;
		validade = val;
		this.peso = peso;
		this.preco = preco;
	}
	
	
	// Gets
	/**
     * Obtém o nome do produto.
     *
     * @return O nome.
     */
	public String getNome() {
		return nome;
	}
	/**
     * Obtém a marca do produto.
     *
     * @return A marca.
     */
	public String getMarca() {
		return marca;
	}
	/**
     * Obtém o fabricante do produto.
     *
     * @return O fabricante.
     */
	public String getFabricante() {
		return fabricante;
	}
	/**
     * Obtém a data de validade do produto.
     *
     * @return A data de validade.
     */
	public Date getValidade() {
		return validade;
	}
	/**
     * Obtém o peso do produto.
     *
     * @return O peso do produto.
     */
	public double getPeso() {
		return peso;
	}
	/**
     * Obtém o preço do produto.
     *
     * @return O preço.
     */
	public double getPreco() {
		return preco;
	}
	
	// Sets
	/**
     * Define o nome do produto.
     *
     * @param O nome.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
     * Define a marca do produto.
     *
     * @param A marca.
     */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
     * Define o fabricante do produto.
     *
     * @param O fabricante.
     */
	public void setFabricante(String fab) {
		fabricante = fab;
	}
	/**
     * Define a data de validade do produto.
     *
     * @param A data de validade.
     */
	public void setValidade(Date val) {
		validade = val;
	}
	/**
     * Define o peso do produto.
     *
     * @param O peso.
     */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
     * Define o preço do produto.
     *
     * @param O preço.
     */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// toString
	/**
     * Retorna uma representação em formato de String do produto.
     *
     * @return Uma String contendo o nome, a marca, a validade e o preço do produto.
     */
	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		return "Nome: " + nome + ", Marca: " + marca +
			   "Validade: " + formato.format(validade) + "Preço: " + preco;
	}
	
}
