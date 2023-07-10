package test;

public interface IArticleDAO {
	
	public void ajouterPlat(Plat monPlat);
	public void supprimerPlat(int id);
	public void modifierPlat(Plat monPlat);
	public void getPlat(int id);
	public void getAllPlat();
	
	
}
