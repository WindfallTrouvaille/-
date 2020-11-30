package movies.model.dao;

import java.util.ArrayList;
import java.util.List;

import movies.model.dbEntity.Person;
import movies.model.dbEntity.Person_movie;

public class Text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection.openConnection();
		
		List<Person_movie> pm = new ArrayList<Person_movie>();
		pm = Person_movieDAO.getAllPerson_movie();
		System.out.println(pm.get(0).getIdperson_movie() + "\t" + pm.get(0).getIdperson() + "\t" + pm.get(0).getIdmovie());
		System.out.println(pm.get(1).getIdperson_movie() + "\t" + pm.get(1).getIdperson() + "\t" + pm.get(1).getIdmovie());
		System.out.println(pm.get(2).getIdperson_movie() + "\t" + pm.get(2).getIdperson() + "\t" + pm.get(2).getIdmovie());
		System.out.println(pm.get(3).getIdperson_movie() + "\t" + pm.get(3).getIdperson() + "\t" + pm.get(3).getIdmovie());
		System.out.println(pm.get(4).getIdperson_movie() + "\t" + pm.get(4).getIdperson() + "\t" + pm.get(4).getIdmovie());
		
		System.out.println("\n");
		
		List<Person> p = new ArrayList<Person>();
		p = PersonDAO.getAllPerson();
		System.out.println(p.get(0).getIdperson() + "\t" + p.get(0).getName() + "\t" + p.get(0).getRole() + "\t" + p.get(0).getDateOfBirth() + "\t" + p.get(0).getPhoto());
		System.out.println(p.get(1).getIdperson() + "\t" + p.get(1).getName() + "\t" + p.get(1).getRole() + "\t" + p.get(1).getDateOfBirth() + "\t" + p.get(1).getPhoto());
		System.out.println(p.get(2).getIdperson() + "\t" + p.get(2).getName() + "\t" + p.get(2).getRole() + "\t" + p.get(2).getDateOfBirth() + "\t" + p.get(2).getPhoto());
		System.out.println(p.get(3).getIdperson() + "\t" + p.get(3).getName() + "\t" + p.get(3).getRole() + "\t" + p.get(3).getDateOfBirth() + "\t" + p.get(3).getPhoto());
		System.out.println(p.get(4).getIdperson() + "\t" + p.get(4).getName() + "\t" + p.get(4).getRole() + "\t\t" + p.get(4).getDateOfBirth() + "\t" + p.get(4).getPhoto());
		DBConnection.closeConnection();
	}

}
