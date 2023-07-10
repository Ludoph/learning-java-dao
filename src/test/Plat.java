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


	public void setIdPlat(int idPlat) {
		this.idPlat = idPlat;
	}


	public String getLibellePlat() {
		return libellePlat;
	}


	public void setLibellePlat(String libellePlat) {
		this.libellePlat = libellePlat;
	}


	public double getPrixPlat() {
		return prixPlat;
	}


	public void setPrixPlat(double prixPlat) {
		this.prixPlat = prixPlat;
	}


	@Override
	public String toString() {
		return "Plat [idPlat= " + idPlat + ", libellePlat= " + libellePlat + ", prixPlat= " + prixPlat + "]" + "\n";
	}
	
}
