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
            String sql = "SELECT * FROM boissons";
            ResultSet res = stmt.executeQuery(sql);
            
            while(res.next()) {
            	 Plat plat = new Plat(res.getInt("id"),res.getString("libelle") ,res.getInt("prix") );
	        	   	mesPlats.add(plat);
            }
            for (Plat monPlat : mesPlats) {
	        	   System.out.printf("%d\t%s\t% .2f\n",
	        			   monPlat.getId(),
	        			   monPlat.getLibelle(),
	        			   monPlat.getPrix()
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
