package Model;

import java.util.List;

public class GestionnaireArticle  {
	private ArticleDAOImpl impl;

	public GestionnaireArticle(ArticleDAOImpl impl) {
		this.impl = impl;
	}
	public double calculerPrixTotal(List<Plat> lesPlats) {
		double prixTotal = 0.0;
		for (Plat unPlat : lesPlats) {
			prixTotal += unPlat.getPrixPlat();
		}
		return prixTotal;
	}
}
