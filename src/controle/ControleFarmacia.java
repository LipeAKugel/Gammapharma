package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleFarmacia {
	
	private Farmacia farmacia = new Farmacia("Gammapharma",
											 "04.974.867/0001-07");
	
	// Construtor.
	public ControleFarmacia() {
		farmacia.fillWithSomeData();
	}
	
	// Gets e sets.
	public Farmacia getFarmacia() {
		return farmacia;
	}
	
	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}
	
	// Métodos.
	public Produto[] getProdutos() {
		// Retorna um array de produtos.
		ArrayList<Produto> lista = new ArrayList<Produto>(); 
		lista = farmacia.produtosCadastrados();
		
		Produto[] array = lista.toArray(new Produto[0]);
		
		return array;
	}
	
	public Produto[] buscaProdutos(String nome) {
		// Retorna uma lista de produtos filtrados pelo nome.
		ArrayList<Produto> lista = new ArrayList<Produto>();
		lista = farmacia.buscarProdutos(nome);
		
		Produto[] array = lista.toArray(new Produto[0]);
		return array;
	}
	
	public Filial[] getFiliais() {
		// Retorna um array de filiais.
		ArrayList<Filial> lista = new ArrayList<Filial>();
		lista = farmacia.getlistaFiliais();
		
		Filial[] array = lista.toArray(new Filial[0]);
		
		return array;
	}
	
	public Filial[] buscaFilial(String cidade) {
		// Retorna uma lista de filiais filtradas pela cidade.
		ArrayList<Filial> lista = new ArrayList<Filial>();
		lista = farmacia.buscarFiliais(cidade);
		
		Filial[] array = lista.toArray(new Filial[0]);
		return array;
	}
	
	/*
	public boolean salvarProduto() {
		// Salva um produto na farmácia a partir dos dados recebidos.
	}
	
	public boolean salvarFilial() {
		// Salva uma filial na farmácia a partir dos dados recebidos.
	}
	*/
	
	public boolean removerProduto(int pos) {
		// Remove um produto específico da farmácia.
		boolean removido;
		Produto prod = getProdutos()[pos];
		
		// Ache a filial que esse produto está.
		int pos_filial = new ControleFilial(this).acharFilial(prod);
		Filial filial = getFiliais()[pos_filial];
		
		// Delete o produto desta filial.
		removido = filial.deletarProduto(prod);
		
		// Atualize a lista de filiais da farmácia.
		ArrayList<Filial> nova_lista = farmacia.getlistaFiliais();
		nova_lista.set(pos_filial, filial);
		farmacia.setlistaFiliais(nova_lista);
		
		return removido;
	}
	
	public boolean removerFilial(int pos) {
		// Remove uma filial específica da farmácia.
		boolean removido;
		Filial filial = getFiliais()[pos];
		
		// Remova a filial da farmácia.
		removido = farmacia.deletarFilial(filial);
		
		return removido;
	}
}
