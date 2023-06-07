package controle;

import modelo.*;

public class ControleFilial {
	
	private Filial[] filiais;
	private ControleFarmacia dados;
	
	public ControleFilial(ControleFarmacia dados) {
		this.dados = dados;
		filiais = dados.getFiliais();
	}
	
	public String[] getNomeFiliais() {
		// Retorna uma lista com o nome de todas as filiais.
		String[] nomes = new String[filiais.length];
		
		int i = 0;
		for (Filial filial : filiais) {
			nomes[i] = filial.getIdentificador();
			i++;
		}
		
		return nomes;
	}
	
	public String[] getNomeFiltrado(String cidade) {
		// Retorna uma lista de todos os nomes das filiais filtradas.
		Filial[] lista = dados.buscaFilial(cidade);
		String[] nomes = new String[lista.length];
		
		int i = 0;
		for (Filial filial : lista) {
			nomes[i] = filial.getIdentificador();
			i++;
		}
		
		return nomes;
	}
}
