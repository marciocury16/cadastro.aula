
package projeto.cadastro.aluno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import projeto.cadastro.aluno.model.*;
import projeto.cadastro.aluno.util.*;

public class LeitorDao {
	
	
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	private Leitor leitor;
	
	public LeitorDao() throws Exception {
		
		try {
			conn = ConnectionFactory.getConnection();
		}
		catch(Exception e) 
		{
			throw new Exception ("Erro: " + e.getMessage());
		}
	}
	
public void salvar1(Leitor leitor) throws Exception {
		/*  Botao salvar do menu "aluno", criaçao do novo banco de dados com PK e CE, realizado apenas no botao salvar desse menu. */
	
	
		try {
			
			String sql = "INSERT INTO dadosPessoais (RGM, nomeAluno, nascAluno,"
					+ "     CPF, emailAluno, endAluno, munAluno,"
					+ "		ufAluno, celAluno)"
					+ "     values(?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
			
			ps = conn.prepareStatement(sql);
			ps.setInt        (1, leitor.getRGM());
			ps.setString     (2, leitor.getNomeAluno());
			ps.setString     (3,leitor.getNascAluno());
			ps.setInt     	 (4, leitor.getCPF());
			ps.setString     (5, leitor.getEmailAluno());
			ps.setString     (6, leitor.getEndAluno());
			ps.setString     (7, leitor.getMunAluno());
			ps.setNString    (8, leitor.getUfAluno());
			ps.setInt        (9,leitor.getCelAluno());
			
			
			ps.executeUpdate();
			
		}
		catch(Exception e) {
			throw new Exception ("Erro: " + e.getMessage());
		 }
		}	
	
public void salvar2(Leitor leitor) throws Exception {
	
	/*  Botao salvar do menu "notas e faltas com alteraçao no banco de dados."  */
	
	try {
		
		String sql = "INSERT INTO curso (cursoAluno ,campusAluno,perAluno, discAluno,semAluno,notaAluno,falAluno)"
				+ "     values(?, ?, ?, ?, ?, ?, ?)" ;
		
		ps = conn.prepareStatement(sql);
		
		ps.setString     (1, leitor.getCursoAluno());
		ps.setString     (2, leitor.getCampusAluno());
		ps.setNString    (3, leitor.getPerAluno());
		ps.setNString    (4, leitor.getDiscAluno());
		ps.setNString    (5, leitor.getSemAluno());
		ps.setNString    (6,leitor.getNotaAluno());
		ps.setInt        (7, leitor.getFalAluno());
		
		ps.executeUpdate();
		
	}
	catch(Exception e) {
		throw new Exception ("Erro: " + e.getMessage());
	 }
	}	

public void excluir(int RGM) throws Exception {
	try {
		String sql = "DELETE FROM cursoCompleto " + "WHERE RGM=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, RGM);
		ps.executeUpdate();
		
	
		
	} catch (Exception erro) {
		
		throw new Exception("Erro " + erro.getMessage());
		
	}

}

public void alterar(Leitor leitor) throws Exception {
	try {
		String sql = "UPDATE cursoCompleto SET RGM=?,nomeAluno =?, nascAluno=?,"
				+ "     CPF=?, emailAluno=?, endAluno=?, munAluno=?,"
				+ "		ufAluno=?, celAluno=?, cursoAluno=?, campusAluno=?,"
				+ "     perAluno=?, discAluno=?,semAluno=?, notaAluno=?, falAluno=? WHERE RGM=?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt          (1, leitor.getRGM());
		ps.setString       (2, leitor.getNomeAluno());
		ps.setString       (3,leitor.getNascAluno());
		ps.setInt       (4, leitor.getCPF());
		ps.setString       (5, leitor.getEmailAluno());
		ps.setString       (6, leitor.getEndAluno());
		ps.setString       (7, leitor.getMunAluno());
		ps.setNString      (8, leitor.getUfAluno());
		ps.setInt          (9,leitor.getCelAluno());
		ps.setString       (10, leitor.getCursoAluno());
		ps.setString       (11, leitor.getCampusAluno());
		ps.setNString      (12, leitor.getPerAluno());
		ps.setNString      (13, leitor.getDiscAluno());
		ps.setNString      (14, leitor.getSemAluno());
		ps.setNString      (15,leitor.getNotaAluno());
		ps.setInt          (16, leitor.getFalAluno());
		ps.setInt          (17, leitor.getRGM());
		
		ps.executeUpdate();
		
		
	} catch (Exception erro) {
		throw new Exception("Erro " + erro.getMessage());
	}
}





public Leitor consultar(int RGM) throws Exception {

	try {

		leitor = new Leitor();

		String sql = "SELECT * FROM cursoCompleto WHERE RGM=? ";

		ps = conn.prepareStatement(sql);
		ps.setInt(1, RGM);
		rs = ps.executeQuery();

		
		while (rs.next()) {

			
			leitor.setRGM         (rs.getInt(1));
			leitor.setNomeAluno   (rs.getString(2));
			leitor.setNascAluno   (rs.getString(3));
			leitor.setCPF         (rs.getInt(4));
			leitor.setEmailAluno  (rs.getString(5));
			leitor.setEndAluno    (rs.getString(6));
			leitor.setMunAluno    (rs.getString(7));
			leitor.setUfAluno     (rs.getString(8));
			leitor.setCelAluno    (rs.getInt(9));
			leitor.setCursoAluno  (rs.getString(10));
			leitor.setCampusAluno (rs.getString(11));
			leitor.setPerAluno    (rs.getString(12));
			leitor.setDiscAluno   (rs.getString(13));
			leitor.setSemAluno    (rs.getString(14));
			leitor.setNotaAluno   (rs.getString(15));
			leitor.setFalAluno    (rs.getInt(16));
			

			
		}

		return leitor;

	} catch (Exception e) {
		
		
		throw new Exception("Erro: " + e.getMessage());
	}

}


public Leitor consulta1(int RGM) throws Exception {
	
	// botao consultar de notas e faltas;

	try {

		leitor = new Leitor();

		String sql = "SELECT * FROM cursoCompleto WHERE RGM=? ";

		ps = conn.prepareStatement(sql);
		ps.setInt(1, RGM);
		rs = ps.executeQuery();

		
		while (rs.next()) {

			
			leitor.setRGM         (rs.getInt(1));
			leitor.setNomeAluno   (rs.getString(2));
			leitor.setNascAluno   (rs.getString(3));
			leitor.setCPF         (rs.getInt(4));
			leitor.setEmailAluno  (rs.getString(5));
			leitor.setEndAluno    (rs.getString(6));
			leitor.setMunAluno    (rs.getString(7));
			leitor.setUfAluno     (rs.getString(8));
			leitor.setCelAluno    (rs.getInt(9));
			leitor.setCursoAluno  (rs.getString(10));
			leitor.setCampusAluno (rs.getString(11));
			leitor.setPerAluno    (rs.getString(12));
			leitor.setDiscAluno   (rs.getString(13));
			leitor.setSemAluno    (rs.getString(14));
			leitor.setNotaAluno   (rs.getString(15));
			leitor.setFalAluno    (rs.getInt(16));
			

			
		}

		return leitor;

	} catch (Exception e) {
		
		
		throw new Exception("Erro: " + e.getMessage());
	}
}
}
