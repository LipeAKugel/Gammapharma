package controle;

import modelo.*;

public class ControleProduto {
	
	private Produto[] produtos;
	private ControleFarmacia dados; // (PERGUNTAR)
	
	public ControleProduto(ControleFarmacia dados) {
		this.dados = dados;
		produtos = dados.getProdutos();
	}
	
	public String[] getNomeProdutos() {
		// Retorna uma lista com todos os nomes dos produtos. 
		String[] nomes = new String[produtos.length];
		
		int i = 0;
		for (Produto produto : produtos) {
			nomes[i] = produto.getNome();
			i++;
		}
		
		return nomes;
	}

	public String[] getNomeFiltrado(String nome) {
		// Retorna uma lista de todos os nomes dos produtos filtrados.
		Produto[] lista = dados.buscaProdutos(nome);
		String[] nomes = new String[lista.length];
		
		int i = 0;
		for (Produto produto : lista) {
			nomes[i] = produto.getNome();
			i++;
		}
		
		return nomes;
	}

}
