package test;

public class Main {
	
	public static void main(String[] args) {
		
		Service monService = new Service(new ArticleDAOImpl()); 
		ArticleDAOImpl impl = new ArticleDAOImpl();
		monService.remisePlat(impl.getAllPlat(), 1.20);
		
	
	}
}
