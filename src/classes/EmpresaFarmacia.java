package classes;

import java.util.ArrayList;

public class EmpresaFarmacia {

	protected String nome;
	protected String cnpj;
	private ArrayList<Filial> listaFiliais;
	
	public EmpresaFarmacia(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		listaFiliais = new ArrayList<Filial>();
	}
	
	// Gets.
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public ArrayList<Filial> getlistaFiliais() {
		return listaFiliais;
	}
	
	// Sets.
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
	public void addFilial(Filial filial) {
		listaFiliais.add(filial);
	}
	
	public void deletarFilial(Filial filial) {
		listaFiliais.remove(filial);
	}
	
	public String consultarFiliais() {
		
		String saida = "****** Filiais cadastradas ******\n";
		
		int qntd = listaFiliais.size();
		
		for (int i = 0;i<qntd; i++) {
			saida += "\n" + listaFiliais.get(i).getNome();
		}
		
		return saida;
		
	}
	
	// toString.
	public String toString() {
		return "Nome: " + nome + ", Cnpj: " + cnpj +
			   ", Num de filiais:" + listaFiliais.size();
	}
}
