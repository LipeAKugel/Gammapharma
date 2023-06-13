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
	
}
