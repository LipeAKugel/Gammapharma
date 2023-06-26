package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * A classe Medicamento representa uma categoria de produto.
 * Herda características da classe Produto e adiciona informações específicas para a herança de Medicamento.
 */
public class Medicamento extends Produto {
	
	//Atributos
	private String modoUso;
	private String quantidade;
	private String dosagem;
	private String efeitosColaterais;
	
	//Construtor
	/**
     * Construtor da classe Medicamento.
     *
     * @param nome              O nome do medicamento.
     * @param marca             A marca do medicamento.
     * @param fab               O fabricante do medicamento.
     * @param val               A data de validade do medicamento.
     * @param peso              O peso do medicamento.
     * @param preco             O preço do medicamento.
     * @param modoUso           O modo de uso do medicamento.
     * @param quantidade        A quantidade disponível do medicamento.
     * @param dosagem           A dosagem do medicamento.
     * @param efeitosColaterais Os efeitos colaterais do medicamento.
     */
	public Medicamento(String nome, String marca, String fab, Date val, double peso,
			           double preco, String modoUso, String quantidade, 
			           String dosagem, String efeitosColaterais) {
		super(nome, marca, fab, val, peso, preco);
		this.modoUso = modoUso;
		this.quantidade = quantidade;
		this.dosagem = dosagem;
		this.efeitosColaterais = efeitosColaterais;
	}
	
	//Gets
	/**
     * Obtém o modo de uso do medicamento.
     *
     * @return O modo de uso.
     */
	public String getModoUso() {
		return modoUso;
	}
	/**
     * Obtém a quantidade do medicamento.
     *
     * @return A quantidade.
     */
	public String getQuantidade() {
		return quantidade;
	}
	/**
     * Obtém a dosagem do medicamento.
     *
     * @return A dosagem.
     */
	public String getDosagem() {
		return dosagem;
	}
	/**
     * Obtém os efeitos colaterais do medicamento.
    *
    * @return Os efeitos colaterais.
    */
	public String getEfeitosColaterais() {
		return efeitosColaterais;
	}
	//Sets
	/**
     * Define o modo de uso do medicamento.
     *
     * @param modoUso.
     */
	public void setModoUso(String modoUso) {
		this.modoUso = modoUso;
	}
	/**
     * Define a quantidade do medicamento.
     *
     * @param quantidade.
     */
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	/**
     * Define a dosagem do medicamento.
     *
     * @param dosagem.
     */
	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}
	/**
     * Define os efeitos colaterais do medicamento.
     *
     * @param efeitosColaterais.
     */
	public void setEfeitosColaterais(String efeitosColaterais) {
		this.efeitosColaterais = efeitosColaterais;
	}
	
	// toString.
	/**
     * Retorna uma representação em formato de String do medicamento.
     *
     * @return Uma String contendo o nome, a marca, a validade, o preço,
     * o modo de uso e a quantidade de medicamento.
     */
    @Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		String saida = "Nome: " + nome + ", Marca: " + marca + ", Validade: " +
					   formato.format(validade) + ", Preço: R$" + preco +
					   ", Modo de Uso: " + modoUso + ", Quantidade: " + quantidade;
				
		return saida;
	}
}
