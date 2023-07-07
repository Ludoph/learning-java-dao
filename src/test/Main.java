package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("hello");
		
		Connection conn = null;
		
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String dbName = "snack_mounir"; 
            String dbUserName = "root"; 
            String dbPassword = "root"; 
            String connectionString = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
            conn = DriverManager.getConnection(connectionString);

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM articles";
            ResultSet res = stmt.executeQuery(sql);
            
            while(res.next()) {
            		int id = res.getInt("id");
            		String libelle = res.getString("libelle");
            		int prix = res.getInt("prix");
            		
            		System.out.printf("%d\t%s\t\t%d\n", 
            				id,
            				libelle,
            				prix);
            				
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
