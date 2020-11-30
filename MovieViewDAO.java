package movies.model.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import movies.model.dbEntity.MovieView;

public class MovieViewDAO {
	private static Connection conn = null;
	private static Statement stmt = null;
	
	public static List<MovieView> getAllMovieViews()
	{
		List<MovieView> movie = new ArrayList<MovieView>();
		try {
			conn = DBConnection.openConnection();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from movieview");
			while(rs.next())
			{
				MovieView movieview = new MovieView();
				
				movieview.setIdmovie(rs.getInt("idmvie"));
				movieview.setTitle(rs.getString("title"));
				movieview.setPlot(rs.getString("plot"));
				movieview.setImage(rs.getString("image"));
				movieview.setPersonName(rs.getString("personname"));
				
				movie.add(movieview);
			}
			rs.close();
			stmt.close();
			DBConnection.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ":" + e.getMessage());
		}
		return movie;
	}
}
