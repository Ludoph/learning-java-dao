package Model;

public class Plat {
	private int idPlat;
	private String libellePlat;
	private double prixPlat;
	
	public Plat(int idPlat ,String libellePlat , double prixPlat) {
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
