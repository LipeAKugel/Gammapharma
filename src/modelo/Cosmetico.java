package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * A classe Cosmetico representa uma categoria de produto de cosméticos.
 * Ela herda as características da classe Produto e adiciona informações
 * específicas de sua categoria, como aplicação, função e tipo de pele 
 * para o qual o cosmético é indicado. Essa classe possui métodos para acessar
 * e modificar essas informações, além de uma representação em formato de String 
 * do produto de cosmético, contendo nome, marca, preço, validade, aplicação e função.
 * @author João Vitor e Felipe Amorim
 * @since 2023
 * @version 1.0
 */
public class Cosmetico extends Produto{
	
	private String aplicacao;
	private String funcao;
	private String tipoPele;
	
	/**
     * Construtor da classe Cosmetico.
     *
     * @param nome       O nome do cosmético.
     * @param marca      A marca do cosmético.
     * @param fab        A data de fabricação do cosmético.
     * @param val        A data de validade do cosmético.
     * @param peso       O peso do cosmético.
     * @param preco      O preço do cosmético.
     * @param aplicacao  A aplicação do cosmético.
     * @param funcao     A função do cosmético.
     * @param tipoPele   O tipo de pele para o qual o cosmético é indicado.
     */
	public Cosmetico (String nome, String marca, String fab, Date val,
					  double peso, double preco, String aplicacao,
					  String funcao, String tipoPele) {
		super(nome, marca, fab, val, peso, preco);
		this.aplicacao = aplicacao;
		this.funcao = funcao;
		this.tipoPele = tipoPele;
	}

	public String getAplicacao() {
		return aplicacao;
	}

	public String getFuncao() {
		return funcao;
	}
	
	public String getTipoPele() {
		return tipoPele;
	}
	
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void setTipoPele(String tipoPele) {
		this.tipoPele = tipoPele;
	}
	
    /**
     * @return Uma representação em forma de String do Cosmetico que contém: 
     * nome, marca, preço, validade, aplicação e função.
     */
	 @Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		String saida = "Nome: " + nome + ", Marca: " + marca + ", Validade: " +
					   formato.format(validade) + ", Preço: R$" + preco +
					   ", Aplicação: " + aplicacao + ", Função: " + funcao;
				
		return saida;
	}
}
