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

	public int acharFilial(Produto produto) {
		// Acha a posição de uma filial correspondente de um produto.
		int pos = 0;
		
		loop: for (Filial f : filiais) {
			for (Produto p : f.getlistaProdutos()) {
				if (produto.equals(p)) {
					// Quebre o loop inteiro.
					break loop;
				}
			}
			pos++;
		}
		
		return pos;
	}

	public String[] getDadosFilial(int pos) {
		// Retorna os dados de uma filial em uma certa posição.
		
		Filial filial = filiais[pos];
		String[] filialDados = new String[7];
		
		// Preencha os dados da filial.
		filialDados[0] = filial.getIdentificador();
		filialDados[1] = filial.getEndereco().getLograd();
		filialDados[2] = filial.getEndereco().getCep();
		filialDados[3] = filial.getCnpj();
		filialDados[4] = filial.getEndereco().getEstado();
		filialDados[5] = filial.getEndereco().getCidade();
		filialDados[6] = filial.getEndereco().getComp();
		
		return filialDados;
	}
}
