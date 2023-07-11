package test;

import java.util.List;

public interface IArticleDAO {
	
	public void ajouterPlat(Plat monPlat);
	public void supprimerPlat(int id);
	public void modifierPlat(Plat monPlat);
	public Plat getPlat(int id);
	public List<Plat> getAllPlat();
	
	
}
