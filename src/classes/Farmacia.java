package classes;

import java.util.ArrayList;

public class Farmacia {

	private String nome;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Filial> listaFiliais;
	private ArrayList<Produto> listaProdutos;
	
	public Farmacia(String nome, String cnpj, Endereco end) {
		this.nome = nome;
		this.cnpj = cnpj;
		endereco = end;
		listaFiliais = new ArrayList<Filial>();
		listaProdutos = new ArrayList<Produto>();
	}
	
	// Gets
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	public ArrayList<Produto> getListaProdutos(){
		return listaProdutos;
	}
	
	// Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setEndereco(Endereco end) {
		endereco = end;
	}
	public void setlistaFiliais(ArrayList<Filial> lista) {
		listaFiliais = lista;
	}
	public void setListaProdutos(ArrayList<Produto> produto) {
		listaProdutos = produto;
	}
	
	// Métodos.
	public void addFilial(Filial filial) {
		listaFiliais.add(filial);
	}
	
	public void deletarFilial(Filial filial) {
		listaFiliais.remove(filial);
	}
	
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public void deletarProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	public String consultarFiliais() {
		// Retorna uma string com o nome de todas as filiais cadastradas.
		
		String saida = "****** Filiais cadastradas ******\n";
		
		int qntd = listaFiliais.size();
		
		for (int i = 0;i<qntd; i++) {
			saida += "\n" + listaFiliais.get(i).getIdentificador();
		}
		
		return saida;
		
	}
	
	public String consultarProdutos() {
		// Retorna uma string com o nome de todos os produtos cadastrados.

		String saida = "****** Produtos cadastrados ******\n";
		
		int qntd = listaProdutos.size();
		for ( int i = 0; i<qntd; i++) {
			saida += "\n" + listaProdutos.get(i).getNome();
		}
		
		return saida;
	}

	public ArrayList<Produto> produtosCadastrados() {
		// Retorna uma lista com todos os produtos cadastrados em
		// todas as filiais.
		
		ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
		produtosCadastrados.addAll(listaProdutos);
		
		int qntdFiliais = listaFiliais.size();
		
		// Loope por todas as filiais cadastradas.
		for (int i = 0; i<qntdFiliais; i++) {
			Filial filial = listaFiliais.get(i);
			
			// Adicione todos os produtos dessa filial à lista.
			produtosCadastrados.addAll(filial.getlistaProdutos());
		}
		
		return produtosCadastrados;
	}
	
	// toString.
	public String toString() {
		return "Nome: " + nome + ", Cnpj: " + cnpj +
			   ", Num de filiais:" + listaFiliais.size();
	}
}
