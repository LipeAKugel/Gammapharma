package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * A classe Medicamento representa uma categoria de produto que herda características
 * da classe Produto. Ela adiciona informações específicas para medicamentos,
 * como modo de uso, quantidade, dosagem e efeitos colaterais. 
 * @author Felipe Amorim e João Vitor
 * @since 2023
 * @version 1.0
 */
public class Medicamento extends Produto {
	
	private String modoUso;
	private String quantidade;
	private String dosagem;
	private String efeitosColaterais;
	
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
	
	public String getModoUso() {
		return modoUso;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public String getDosagem() {
		return dosagem;
	}

	public String getEfeitosColaterais() {
		return efeitosColaterais;
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

	public void setEfeitosColaterais(String efeitosColaterais) {
		this.efeitosColaterais = efeitosColaterais;
	}
	/**
     * @return Uma representação em forma de String do medicamento que contém:
     * nome, marca, validade, preço, modo de uso e a quantidade do medicamento.
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
