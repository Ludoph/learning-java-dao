package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		ArrayList<Plat> mesPlats = new ArrayList<Plat>();
		
		Connection conn = null;
		
		
		try {
			//start setup connexion
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            String dbName = "snack_mounir"; 
            String dbUserName = "root"; 
            String dbPassword = "root"; 
            String connectionString = "jdbc:mysql://localhost:8889/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword ;
            conn = DriverManager.getConnection(connectionString);

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM articles";
            ResultSet res = stmt.executeQuery(sql);
            
            while(res.next()) {
            	 Plat plat = new Plat(res.getInt("id"),res.getString("libelle") ,res.getInt("prix") );
	        	   	mesPlats.add(plat);
            }
            System.out.println(mesPlats);
            System.out.printf("ID\tLibéllé\t\tPrix\n\n");
            for (Plat monPlat : mesPlats) {
            		System.out.printf("%d\t%s\t\t% .2f\n",
	        			   monPlat.getIdPlat(),
	        			   monPlat.getLibellePlat(),
	        			   monPlat.getPrixPlat()
		   );
           }
            
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
