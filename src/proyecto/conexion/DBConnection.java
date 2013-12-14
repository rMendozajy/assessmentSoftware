package proyecto.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static final String MYSQL = "jdbc:mysql://localhost/pruebadb?user=root&password=root";
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");			
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();			
		}
	}
	
	public static Connection getConnection(String urlconnection ){
		Connection conexion = null;

		try {
			conexion = DriverManager.getConnection(urlconnection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conexion; 
	}
	
	public static void closeConnection(Connection cnx){
		try {
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static void closeStatement(Statement stm){
		try {
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
