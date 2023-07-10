package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ArticleDAOImpl implements IArticleDAO {

	ArrayList<Plat>mesPlats = new ArrayList<Plat>();

	static Connection conn = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbName = "snack_mounir"; 
			String dbUserName = "root"; 
			String dbPassword = "root"; 
			String connectionString = "jdbc:mysql://localhost:8889/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword ;
			conn = DriverManager.getConnection(connectionString);
			
			
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
		public void ajouterPlat(Plat monPlat) {
			PreparedStatement stmtAddPlat;
			try {
				stmtAddPlat = conn.prepareStatement("INSERT INTO articles VALUES ()");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		@Override
		public void supprimerPlat(int id) {
			PreparedStatement stmtDeletePlat;
			try {
				stmtDeletePlat = conn.prepareStatement("DELETE FROM articles WHERE 'id'= ?");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		@Override
		public void modifierPlat(Plat monPlat) {
			PreparedStatement stmtUpPlat;
			try {
				stmtUpPlat = conn.prepareStatement("UPDATE INTO articles VALUES ()");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		@Override
		public void getPlat(int id) {
			try {
				Statement stmtPlat = conn.createStatement();
				String getPlat = "SELECT articles FROM articles WHERE 'id'= ?";
				ResultSet res = stmtPlat.executeQuery(getPlat);	
				System.out.println(res.getInt("id") + res.getString("libelle") +res.getInt("prix") );
           
				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
	
		@Override
		public void getAllPlat() {
			try {
				Statement stmt = conn.createStatement();
				String sql = "SELECT * FROM articles";
				ResultSet res = stmt.executeQuery(sql);	
				while(res.next()) {
					Plat plat = new Plat(res.getInt("id"),res.getString("libelle") ,res.getInt("prix") );
	        	   	mesPlats.add(plat);				
	        	   	}
				for (Plat monPlat : mesPlats) {
            		System.out.printf("%d\t%s\t\t% .2f\n",
	        			   monPlat.getIdPlat(),
	        			   monPlat.getLibellePlat(),
	        			   monPlat.getPrixPlat()
		   );
           }
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 
		}

}
