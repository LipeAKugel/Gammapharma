package modelo;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * A classe abstrata Produto representa um produto em uma filial.
 * Ela contém informações como nome, marca, fabricante, validade,
 * peso e preço. Essa classe é a classe pai de Medicamento, Suplemento e Cosmético.
 */
public abstract class Produto {

	protected String nome;
	protected String marca;
	protected String fabricante;
	protected Date validade;
	protected double peso;
	protected double preco;
	
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
	
	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public Date getValidade() {
		return validade;
	}

	public double getPeso() {
		return peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setFabricante(String fab) {
		fabricante = fab;
	}

	public void setValidade(Date val) {
		validade = val;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * @return Uma representação em forma de String do Produto que contém:
     * o nome, a marca, a validade e o preço do produto. 
     */
	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		return "Nome: " + nome + ", Marca: " + marca +
			   "Validade: " + formato.format(validade) + "Preço: " + preco;
	}
	
}
