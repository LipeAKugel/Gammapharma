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
	
	// Gets.
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	
	public ArrayList<Produto> getListaProdutos(){
		return listaProdutos;
	}
	
	// Sets.
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	//Consultar filiais
	public String consultarFiliais() {
		
		String saida = "****** Filiais cadastradas ******\n";
		
		int qntd = listaFiliais.size();
		
		for (int i = 0;i<qntd; i++) {
			saida += "\n" + listaFiliais.get(i).getIdentificador();
		}
		
		return saida;
		
	}
	//Consultar produtos
	public String consultarProdutos() {

		String saida = "****** Produtos cadastrados ******\n";
		
		int qntd = listaProdutos.size();
		for ( int i = 0; i<qntd; i++) {
			saida += "\n" + listaProdutos.get(i).getNome();
		}
		return saida;
	}
	
	// toString.
	public String toString() {
		return "Nome: " + nome + ", Cnpj: " + cnpj +
			   ", Num de filiais:" + listaFiliais.size();
	}
}
