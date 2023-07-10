package test;

public class Plat {
	private int idPlat;
	private String libellePlat;
	private double prixPlat;
	
	public Plat(int idPlat ,String libellePlat , int prixPlat) {
		this.idPlat = idPlat;
		this.libellePlat = libellePlat;
		this.prixPlat = prixPlat;
	}
	
	public int getIdPlat() {
		return idPlat;
	}
	public String getLibellePlat() {
		return libellePlat;
	}
	public double getPrixPlat() {
		return prixPlat;
	}
	
	
}
