
public class Suplemento {
	
	private double peso; // kilograma.
	private String fabricante;
	private String modoUso;
	private String principiosAtivos[];
	private double qntd; // unidades, gramas ou ml.
	
	// Construtores.
	public Suplemento(double peso, String fab, String modoUso,
					  String pAtivos[], double qntd) {
		this.peso = peso;
		fabricante = fab;
		this.modoUso = modoUso;
		principiosAtivos = pAtivos;
		this.qntd = qntd;
	}
	
	// Gets.
	public double getPeso() {
		return peso;
	}
	public String getFabricante() {
		return fabricante;
	}
	public String getModoUso() {
		return modoUso;
	}
	public double getQntd() {
		return qntd;
	}
	
	// Sets.
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setFabricante(String fab) {
		fabricante = fab;
	}
	public void setModoUso(String modoUso) {
		this.modoUso = modoUso;
	}
	public void setQntd(double qntd) {
		this.qntd = qntd;
	}
}
