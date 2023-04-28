package classes;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Produto {

	// Atributos.
	protected String nome;
	protected String marca;
	protected String fabricante;
	protected Date validade;
	protected double peso;
	protected double preco;
	
	// Construtor.
	public Produto(String nome, String marca, String fab, Date val,
				   double peso, double preco) {
		this.nome = nome;
		this.marca = marca;
		fabricante = fab;
		validade = val;
		this.peso = peso;
		this.preco = preco;
	}
	
	
	// Gets.
	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getFab() {
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
	
	// Sets.
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
	
	// toString.
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		String saida = "Nome: " + nome + ", Marca: " + marca + 
				", Fabricante: " + fabricante + ", Validade: " + 
				formato.format(validade) + ", Peso: " + peso + 
				", Preço: R$" + preco;
		
		return saida;
	}
}
