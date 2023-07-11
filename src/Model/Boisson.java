package Model;


public class Boisson {
	private int idBoisson;
	private String libelleBoisson;
	private double prixBoisson;
	
	public Boisson(int idBoisson ,String libelleBoisson , int prixBoisson) {
		this.idBoisson = idBoisson;
		this.libelleBoisson = libelleBoisson;
		this.prixBoisson = prixBoisson;
	}

	public int getIdBoisson() {
		return idBoisson;
	}
	public String getLibelleBoisson() {
		return libelleBoisson;
	}
	public double getPrixBoisson() {
		return prixBoisson;
	}
	
	
}
