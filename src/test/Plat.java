package test;

public class Plat {
		
	private int id;
	private String libelle;
	private double prix;
	public Plat(int id ,String libelle , int prix) {
		this.id =id;
		this.libelle = libelle;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public String getLibelle() {
		return libelle;
	}
	public double getPrix() {
		return prix;
	}
	
	
	
}
