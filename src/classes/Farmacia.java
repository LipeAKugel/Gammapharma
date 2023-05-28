package classes;

import java.util.ArrayList;

public class Farmacia {

	// Atributos.
	private String nome;
	private String cnpj;
	private ArrayList<Filial> listaFiliais;
	
	public Farmacia(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		listaFiliais = new ArrayList<Filial>();
	}
	
	// Gets
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	
	// Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setlistaFiliais(ArrayList<Filial> lista) {
		listaFiliais = lista;
	}
	
	// Métodos.
	public void addFilial(Filial filial) {
		listaFiliais.add(filial);
	}
	
	public void deletarFilial(Filial filial) {
		listaFiliais.remove(filial);
	}
	
	public ArrayList<Filial> consultarFiliais(String cidade) {
		// Retorna uma lista com todas as filiais de uma determinada cidade.
		
		ArrayList<Filial> lista = new ArrayList<Filial>();
		
		// Loope por todas as filiais cadastradas.
		for (Filial filial : listaFiliais) {
			String filialCidade = filial.getEndereco().getCidade();
			
			// Se a cidade coincidir, adicione essa filial a lista.
			if (filialCidade.equals(cidade)) {
				lista.add(filial);
			}
		}
		
		return lista;
	}

	public ArrayList<Produto> produtosCadastrados() {
		// Retorna uma lista com todos os produtos cadastrados em todas as filiais.
		
		ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
		
		// Loope por todas as filiais cadastradas.
		for (Filial filial : listaFiliais) {
			// Adicione todos os produtos dessa filial à lista.
			produtosCadastrados.addAll(filial.getlistaProdutos());
		}
		
		return produtosCadastrados;
	}
	
	public ArrayList<Produto> buscarProdutos (String nome) {
		// Retorna uma lista com todos os produtos com certo nome.
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		for (Filial filial : listaFiliais) {
			for (Produto produto : filial.getlistaProdutos())  {
				if (produto.getNome().equals(nome)) {
					lista.add(produto);
				}
			}
		}
		
		return lista;
	}
	
	// toString.
	public String toString() {
		return "Nome: " + nome + ", Cnpj: " + cnpj +
			   ", Num de filiais:" + listaFiliais.size();
	}
}
