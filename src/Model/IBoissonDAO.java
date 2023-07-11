package Model;

import java.util.List;

public interface IBoissonDAO {
	public void ajouerBoisson(Boisson maBoisson);
	public void supprimerBoisson(int id);
	public void modifierBoisson(Boisson maBoisson);
	public Boisson getBoisson(int id);
	public List<Boisson> getAllBoisson();	
}
