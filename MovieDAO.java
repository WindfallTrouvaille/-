package movies.model.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import movies.model.dbEntity.Movie;

public class MovieDAO {
	private static Connection conn = null;
	private static Statement stmt = null;
	
	public static List<Movie> getAllMovies()
	{
		List<Movie> movies = new ArrayList<Movie>();
		try {
			conn = DBConnection.openConnection();
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from movie");
			while(rs.next())
			{
				Movie m = new Movie();
				
				m.setIdmovie(rs.getInt("idmovie"));
				m.setIdcategory(rs.getInt("idcategory"));
				m.setDate(rs.getInt("date"));
				m.setTitle(rs.getString("title"));
				m.setPlot(rs.getString("plot"));
				m.setImage(rs.getString("image"));
				m.setRating(rs.getDouble("rating"));
				
				movies.add(m);
			}
			rs.close();
			stmt.close();
			DBConnection.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ":" + e.getMessage());
		}
		return movies;
	}
}
