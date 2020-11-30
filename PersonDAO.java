package movies.model.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import movies.model.dbEntity.Person;

public class PersonDAO {
	private static Connection conn = null;
	private static Statement stmt = null;
	
	public static List<Person> getAllPerson()
	{
		List<Person> pm = new ArrayList<Person>();
		
		try {
			conn = DBConnection.openConnection();
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from person");
			
			while(rs.next())
			{
				Person p = new Person();
				
				p.setIdperson(rs.getInt("idperson"));
				p.setName(rs.getString("name"));
				p.setRole(rs.getString("role"));
				p.setDateOfBirth(rs.getInt("dateOfBirth"));
				p.setPhoto(rs.getString("photo"));
				
				pm.add(p);
			}
			rs.close();
			stmt.close();
			DBConnection.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ":" + e.getMessage());
		}
		return pm;
	}
}