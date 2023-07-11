package Model;

import java.util.List;

public class Service {
	private ArticleDAOImpl impl;

	public Service(ArticleDAOImpl impl) {
		this.impl = impl;
	}
	
	public void remisePlat(List<Plat> lesPlats, double remise) {
		for(Plat unPlat : lesPlats) {
			unPlat.setPrixPlat(unPlat.getPrixPlat() * remise);
			impl.modifierPlat(unPlat);
		}
	}
}
