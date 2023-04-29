package classes;

import java.util.Date;

public class Medicamento extends Produto {
	
	//Atributos
	private String modoUso;
	private String quantidade;
	private String dosagem;
	private String efeitosColaterais;
	
	//Construtor
	public Medicamento(String nome, String marca, String fab, Date val, double peso,
			           double preco, String efeitosColaterais, String dosagem, 
			           String quantidade, String modoUso) {
		super(nome, marca, fab, val, peso, preco);
		this.modoUso = modoUso;
		this.quantidade = quantidade;
		this.dosagem = dosagem;
		this.efeitosColaterais = efeitosColaterais;
	}
	
	//Gets
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
	
	//Sets
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
}
