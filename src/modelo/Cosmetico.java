package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cosmetico extends Produto{
	
	//Atributos
	private String aplicacao;
	private String funcao;
	private String tipoPele;
	
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
	public String getAplicacao() {
		return aplicacao;
	}
	public String getFuncao() {
		return funcao;
	}
	public String getTipoPele() {
		return tipoPele;
	}
	
	//Sets
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public void setTipoPele(String tipoPele) {
		this.tipoPele = tipoPele;
	}
	
	// toString.
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		String saida = "Nome: " + nome + ", Marca: " + marca + ", Validade: " +
					   formato.format(validade) + ", Preço: R$" + preco +
					   ", Aplicação: " + aplicacao + ", Função: " + funcao;
				
		return saida;
	}
}
