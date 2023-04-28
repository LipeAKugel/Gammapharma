package classes;

import java.util.ArrayList;

public class Filial extends EmpresaFarmacia {
	
	// Atributos.
	private Endereco endereco;
	private ArrayList<Produto> listaProdutos;
	
	// Construtores.
	public Filial(String nome, String cnpj, Endereco end) {
		super(nome, cnpj);
		endereco = end;
		listaProdutos = new ArrayList<Produto>();
	}
	
	// Gets.
	public Endereco getEndereco() {
		return endereco;
	}
	
	public ArrayList<Produto> getlistaProdutos() {
		return listaProdutos;
	}
	
	// Sets.
	public void setEndereco(Endereco end) {
		endereco = end;
	}
	
	public void setlistaProdutos(ArrayList<Produto> lista) {
		listaProdutos = lista;
	}
	
	// Métodos.
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public void deletarProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	public String consultarProdutos() {
		
		String saida = "****** Produtos cadastrados ******\n";
		
		int qntd = listaProdutos.size();
		
		for(int i=0; i<qntd; i++) {
			saida += "\n" + listaProdutos.get(i).getNome();
		}
		
		return saida;
		
	}
	
	// toString.
	public String toString() {
		return "Nome: " + nome + ", CNPJ: " + cnpj + ", Cidade: " + endereco.getCidade();
	}
}
