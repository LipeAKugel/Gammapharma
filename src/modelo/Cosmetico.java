package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * A classe Cosmetico representa uma categoria de produto.
 * Herda características da classe Produto e adiciona informações específicas para a herança de cosmetico.
 * @author Joao **
 * @since 2023
 * @version 1.0
 */
public class Cosmetico extends Produto{
	
	//Atributos
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
	//Construtor 
	public Cosmetico (String nome, String marca, String fab, Date val,
					  double peso, double preco, String aplicacao,
					  String funcao, String tipoPele) {
		super(nome, marca, fab, val, peso, preco);
		this.aplicacao = aplicacao;
		this.funcao = funcao;
		this.tipoPele = tipoPele;
	}
	
	//Gets
	/**
     * Obtém a aplicação do cosmético.
     *
     * @return A aplicação do cosmético.
     */
	public String getAplicacao() {
		return aplicacao;
	}
    /**
     * Obtém a função do cosmético.
     *
     * @return A função do cosmético.
     */
	public String getFuncao() {
		return funcao;
	}
    /**
     * Obtém o tipo de pele para o qual o cosmético é indicado.
     *
     * @return O tipo de pele para o qual o cosmético é indicado.
     */
	public String getTipoPele() {
		return tipoPele;
	}
	
	//Sets
    /**
     * Define a aplicação do cosmético.
     *
     * @param aplicacao A aplicação do cosmético.
     */
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}
    /**
     * Define a função do cosmético.
     *
     * @param funcao A função do cosmético.
     */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
    /**
     * Define o tipo de pele para o qual o cosmético é indicado.
     *
     * @param tipoPele O tipo de pele para o qual o cosmético é indicado.
     */
	public void setTipoPele(String tipoPele) {
		this.tipoPele = tipoPele;
	}
	
    /**
     * Retorna uma representação em forma de String do objeto Cosmetico.
     *
     * @return Uma representação em forma de String do objeto Cosmetico.
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
