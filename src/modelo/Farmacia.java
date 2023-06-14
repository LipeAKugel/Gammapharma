package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Farmacia {

	// Atributos.
	private String nome;
	private String cnpj;
	private ArrayList<Filial> listaFiliais;
	
	public Farmacia(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		listaFiliais = new ArrayList<Filial>();
	}
	
	// Gets
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	
	// Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setlistaFiliais(ArrayList<Filial> lista) {
		listaFiliais = lista;
	}
	
	// Métodos.
	public boolean addFilial(Filial filial) {
		return listaFiliais.add(filial);
	}
	
	public boolean deletarFilial(Filial filial) {
		return listaFiliais.remove(filial);
	}
	
	public ArrayList<Filial> buscarFiliais(String cidade) {
		// Retorna uma lista com todas as filiais de uma determinada cidade.
		
		ArrayList<Filial> lista = new ArrayList<Filial>();
		
		// Loope por todas as filiais cadastradas.
		for (Filial filial : listaFiliais) {
			String filialCidade = filial.getEndereco().getCidade();
			
			// Se a cidade coincidir, adicione essa filial a lista.
			if (filialCidade.toLowerCase().equals(cidade.toLowerCase())) {
				lista.add(filial);
			}
		}
		
		return lista;
	}

	public ArrayList<Produto> produtosCadastrados() {
		// Retorna uma lista com todos os produtos cadastrados em todas as filiais.
		
		ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
		
		// Loope por todas as filiais cadastradas.
		for (Filial filial : listaFiliais) {
			// Adicione todos os produtos dessa filial à lista.
			produtosCadastrados.addAll(filial.getlistaProdutos());
		}
		
		return produtosCadastrados;
	}
	
	public ArrayList<Produto> buscarProdutos(String nome) {
		// Retorna uma lista com todos os produtos com certo nome.
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		for (Filial filial : listaFiliais) {
			for (Produto produto : filial.getlistaProdutos())  {
				if (produto.getNome().toLowerCase().equals(nome.toLowerCase())) {
					lista.add(produto);
				}
			}
		}
		
		return lista;
	}
	
	public void fillWithSomeData() {
		// Preencha com alguns dados.
		
		Endereco end01 = new Endereco("quadra 01","","123456","recanto","df");
		
		Filial filial01 = new Filial("Gammapharma Recanto","12345678",end01);
		
		Date data01 = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data01 = format.parse("20/12/2022");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Produto prod01 = new Medicamento("Paracetamol","","",data01,
										 1.0,5.0,"","","","");
		Produto prod02 = new Medicamento("Dipirona","","",data01,
				 1.0,5.0,"","","","");
		Produto prod03 = new Medicamento("Soro Fisiológico","","",data01,
				 1.0,5.0,"","","","");
		
		filial01.addProduto(prod01);
		filial01.addProduto(prod02);
		filial01.addProduto(prod03);
		
		this.addFilial(filial01);
	}
	
	// toString.
	public String toString() {
		return "Nome: " + nome + ", Cnpj: " + cnpj +
			   ", Num de filiais:" + listaFiliais.size();
	}
	
}
