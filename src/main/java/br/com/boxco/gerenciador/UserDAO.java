package br.com.boxco.gerenciador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	private Connection connection;
	
		public UserDAO(Connection connection) {
		this.connection = connection;
		
	}
	
	public void salvaConta(UserCredentials conta) throws ClassNotFoundException, SQLException {
		  
		PreparedStatement ps=connection.prepareStatement(  
		"insert into user values(?,?,?)");  

		ps.setString(1,conta.getName());  
		ps.setString(2,conta.getUseremail());  
		ps.setString(3,conta.getPassword());  
		          
		int i=ps.executeUpdate();  
		if(i>0) { 
		System.out.println("You are successfully registered...");  
		}else {
			System.out.println("Failure, something went wrong..."); 
		}
	}
	
	public void logaConta(String mail,String pass) throws SQLException {
		
//		String liam ,ssap;
		
		PreparedStatement ps = connection.prepareStatement("select * from user where email = ? and password = ?");
		ps.setString(1,mail);
		ps.setString(2,pass);
		ResultSet rs = ps.executeQuery();

		if(rs.next()){
            
            System.out.println("Login is successful");
        }
        else{
        	System.out.println( "Incorrect username or password");
        }
		
		
	}
	
}
