package controle;

import modelo.*;
/**
 * A classe ControleFilial é responsável por gerenciar as operações relacionadas às filiais
 * da farmácia. Ela fornece métodos para obter informações sobre as filiais, filtrar filiais
 * por cidade, encontrar a filial correspondente a um determinado produto e obter os dados de
 * uma filial específica.
 * @author Felipe Amorim
 * @since 2023
 * @version 1.0
 */
public class ControleFilial {
	
	private Filial[] filiais;
	private ControleFarmacia dados;
	
	/**
	 * Construtor da classe ControleFilial. Recebe uma instância de ControleFarmacia
	 * para obter acesso aos dados das filiais.
	 *
	 * @param dados Uma instância de ControleFarmacia contendo os dados da farmácia.
	 */
	public ControleFilial(ControleFarmacia dados) {
		this.dados = dados;
		filiais = dados.getFiliais();
	}
	/**
	 * Obtém uma lista com o nome de todas as filiais.
	 *
	 * @return Um array de strings contendo os nomes das filiais.
	 */
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
	/**
	 * Obtém uma lista com o nome de todas as filiais filtradas por cidade.
	 *
	 * @param cidade A cidade pela qual as filiais devem ser filtradas.
	 * @return Um array de strings contendo os nomes das filiais filtradas.
	 */
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
	/**
	 * Encontra a posição da filial correspondente a um determinado produto.
	 *
	 * @param produto O produto para o qual se deseja encontrar a filial correspondente.
	 * @return A posição da filial na lista de filiais.
	 */
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
	/**
	 * Obtém os dados de uma filial em uma determinada posição.
	 *
	 * @param pos A posição da filial na lista de filiais.
	 * @return Um array de strings contendo os dados da filial.
	 */
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
