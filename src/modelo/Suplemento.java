package modelo;

import java.text.SimpleDateFormat;
import java.util.*;

public class Suplemento extends Produto {
	
	//Atributos
	private String modoUso;
	private String quantidade;
	private String dosagem;
	private String indicacao;
	private String principioAtivo;
	
	//Construtor
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
	//Metodos
	//gets
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
	
	//sets
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
	
	// toString.
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		String saida = "Nome: " + nome + ", Marca: " + marca + ", Validade: " +
					   formato.format(validade) + ", Preço: R$" + preco +
					   ", Modo de Uso: " + modoUso + ", Indicação: " + indicacao;
				
		return saida;
	}
}
