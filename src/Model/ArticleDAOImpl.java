package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOImpl implements IArticleDAO {

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
				stmtAddPlat = conn.prepareStatement("INSERT INTO articles (libelle, prix) VALUES (?,?)");
				stmtAddPlat.setString(1, monPlat.getLibellePlat());
				stmtAddPlat.setDouble(2, monPlat.getPrixPlat());
				int nbInserted =  stmtAddPlat.executeUpdate();
				System.out.println(nbInserted);
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		@Override
		public void supprimerPlat(int id) {
			PreparedStatement stmtDeletePlat;
			try {
				stmtDeletePlat = conn.prepareStatement("DELETE FROM articles WHERE id = ?");
				stmtDeletePlat.setInt(1, id);
				int nbInserted =  stmtDeletePlat.executeUpdate();
				System.out.println(nbInserted);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		@Override
		public void modifierPlat(Plat monPlat) {
			PreparedStatement stmtUpPlat;
			try {
				stmtUpPlat = conn.prepareStatement("UPDATE articles SET libelle = ?, prix = ? WHERE id = ? ");
				stmtUpPlat.setString(1, monPlat.getLibellePlat());
				stmtUpPlat.setDouble(2, monPlat.getPrixPlat());
				stmtUpPlat.setInt(3, monPlat.getIdPlat());
				int nbInserted =  stmtUpPlat.executeUpdate();
				System.out.println(nbInserted);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		@Override
		public Plat getPlat(int id) {
			
			PreparedStatement stmtPlat;
			Plat newPlat = null;
			try {
				stmtPlat = conn.prepareStatement("SELECT * FROM articles WHERE id= ?");
				stmtPlat.setInt(1, id);
				ResultSet res = stmtPlat.executeQuery();
				if(res.next()) {
					newPlat = new Plat(res.getInt("id"), res.getString("libelle"), res.getDouble("prix"));
				}
           
				
			} catch (SQLException e) {
				e.printStackTrace();
			}		
			return newPlat;
					
		}
	
		@Override
		public  List <Plat> getAllPlat() {
			List<Plat> mesPlats = new ArrayList<Plat>();
			
			PreparedStatement stmtPlat;
			try {
				stmtPlat = conn.prepareStatement("SELECT * FROM articles");
				
				ResultSet res = stmtPlat.executeQuery();	
				while(res.next()) {
	        	   	mesPlats.add(new Plat(res.getInt("id"),res.getString("libelle") ,res.getInt("prix") ));				
	        	   	}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return mesPlats;
			 
		}

}
