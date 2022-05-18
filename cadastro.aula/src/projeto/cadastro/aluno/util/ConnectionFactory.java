package projeto.cadastro.aluno.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

import projeto.cadastro.aluno.util.*;

public class ConnectionFactory {
	
	
	
	public static Connection getConnection() throws Exception{
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/DBLeitor";
			String login ="root";
			String senha = "";
			
			
			return DriverManager.getConnection(url,login,senha);
			
						
		}
		catch (Exception erro) {
			
			
			throw new Exception (erro.getMessage());
			
		}
	}
		
		public static void main(String arg[]) {
			
			try {
				
				Connection conn = ConnectionFactory.getConnection();
				JOptionPane.showMessageDialog(null,"Foi!");
				
				
			}
			catch (Exception erro) {
				
				erro.printStackTrace();
			}			
		}
}
