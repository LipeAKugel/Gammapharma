package classes;

import java.util.ArrayList;

public class SistemaFarmacia {
	
	ArrayList<Produto> listaProdutos;
	ArrayList<Filial> listaFiliais;
	
	public SistemaFarmacia () {
		listaProdutos = new ArrayList<Produto>();
		listaFiliais = new ArrayList<Filial>();
	}
	
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public void deletarProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	public ArrayList<Produto> getlistaProdutos() {
		return listaProdutos;
	}
	
	public String consultarProdutos() {
		
		String saida = "****** Produtos cadastrados ******\n";
		
		int qntd = listaProdutos.size();
		
		for(int i=0; i<qntd; i++) {
			saida += "\n" + listaProdutos.get(i).getNome();
		}
		
		return saida;
		
	}
	
	public void addFilial(Filial filial) {
		listaFiliais.add(filial);
	}
	
	public void deletarFilial(Filial filial) {
		listaFiliais.remove(filial);
	}
	
	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	
	public String consultarFiliais() {
		
		String saida = "****** Filiais cadastradas ******\n";
		
		int qntd = listaFiliais.size();
		
		for(int i=0; i<qntd; i++) {
			saida += "\n" + listaFiliais.get(i).getNome();
		}
		
		return saida;
		
	}
}
