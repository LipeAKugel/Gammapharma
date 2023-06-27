package modelo;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * A classe Suplemento representa uma categoria de produto.
 * Herda características da classe Produto e adiciona informações específicas para a herança de suplemento.
 */
public class Suplemento extends Produto {
	
	private String modoUso;
	private String quantidade;
	private String dosagem;
	private String indicacao;
	private String principioAtivo;
	
	/**
     * Construtor da classe Suplemento.
     *
     * @param nome            O nome do suplemento.
     * @param marca           A marca do suplemento.
     * @param fab             O fabricante do suplemento.
     * @param val             A data de validade do suplemento.
     * @param peso            O peso do suplemento.
     * @param preco           O preço do suplemento.
     * @param modoUso         O modo de uso do suplemento.
     * @param quantidade      A quantidade do suplemento.
     * @param dosagem         A dosagem do suplemento.
     * @param indicacao       A indicação do suplemento.
     * @param principioAtivo  O princípio ativo do suplemento.
     */
	public Suplemento (String nome, String marca, String fab, Date val,
					   double peso, double preco, String modoUso,
					   String quantidade, String dosagem, String indicacao,
					   String principioAtivo) {
		super(nome, marca, fab, val, peso, preco);
		this.modoUso = modoUso;
		this.quantidade = quantidade;
		this.dosagem = dosagem;
		this.indicacao = indicacao;
		this.principioAtivo = principioAtivo;
	}

	public String getModoUso() {
		return modoUso;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public String getDosagem() {
		return dosagem;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	
	public void setModoUso(String modoUso) {
		this.modoUso = modoUso;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public void getIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public void getPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	/**
	 * @return Uma representação em forma de String do Suplemento que contém:
     * nome, marca, validade, preço, modo de uso e a indicação do suplemento.
     */
    @Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		String saida = "Nome: " + nome + ", Marca: " + marca + ", Validade: " +
					   formato.format(validade) + ", Preço: R$" + preco +
					   ", Modo de Uso: " + modoUso + ", Indicação: " + indicacao;
				
		return saida;
	}
}
