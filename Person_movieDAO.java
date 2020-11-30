package movies.model.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import movies.model.dbEntity.Person_movie;

public class Person_movieDAO {
	private static Connection conn = null;
	private static Statement stmt = null;
	
	public static List<Person_movie> getAllPerson_movie() {
		List<Person_movie> ps = new ArrayList<Person_movie>();
		
		try {
			conn = DBConnection.openConnection();
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from person_movie");
			
			while(rs.next())
			{
				Person_movie p = new Person_movie();
				
				p.setIdmovie(rs.getInt("idmovie"));
				p.setIdperson(rs.getInt("idperson"));
				p.setIdperson_movie(rs.getInt("idperson_movie"));
				
				ps.add(p);
			}
			conn.close();
			stmt.close();
			DBConnection.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ":" + e.getMessage());
		}
		return ps;
	}
}
