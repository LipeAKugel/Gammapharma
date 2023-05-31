package modelo;

import java.util.ArrayList;

public class Filial {
	
	// Atributos
	private String identificador;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Produto> listaProdutos;
	
	// Construtores
	public Filial(String identificador, String cnpj, Endereco end) {
		this.identificador = identificador;
		this.cnpj = cnpj;
		endereco = end;
		listaProdutos = new ArrayList<Produto>();
	}
	
	// Gets
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
	
	// Sets
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
	
	// Métodos
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public void deletarProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	// toString
	public String toString() {
		return "Nome: " + identificador + ", CNPJ: " + cnpj +
			   ", Cidade: " + endereco.getCidade();
	}
}
