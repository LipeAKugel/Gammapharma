import java.util.ArrayList;

public class SistemaFarmacia {
	
	ArrayList<Produto> listaProdutos;
	ArrayList<Filial> listaFiliais;
	
	public SistemaFarmacia () {
		listaProdutos = new ArrayList<Produto>();
		listaFiliais = new ArrayList<Filial>();
	}
	
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public void deletarProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	public ArrayList<Produto> listarProdutos() {
		return listaProdutos;
	}
	
	public void addFilial(Filial filial) {
		listaFiliais.add(filial);
	}
	
	public void deletarFilial(Filial filial) {
		listaFiliais.remove(filial);
	}
	
	public ArrayList<Filial> listarFiliais() {
		return listaFiliais;
	}
}
