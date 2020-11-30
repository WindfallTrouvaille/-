package movies.model.dao;


import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import movies.model.dbEntity.Category;
import movies.model.dbEntity.Movie;


public class Text {

	public static void main(String[] args) throws SQLException {
		//try {
			
			DBConnection.openConnection();
			//String sql = "SELECT * FROM MOVIE  ";
			
			List<Movie> movies = new ArrayList<Movie>();
			movies = MovieDAO.getAllMovies();
			System.out.println(movies.get(0).getTitle() + "\t" + movies.get(0).getIdcategory() + "\t" + movies.get(0).getPlot() + "\t" + movies
					.get(0).getRating() + "\t" + movies.get(0).getDate() + "\t" + movies.get(0).getImage());
			System.out.println(movies.get(1).getTitle()+ "\t" + movies.get(1).getIdcategory() + "\t" + movies.get(1).getPlot() + "\t" + movies
					.get(1).getRating() + "\t" + movies.get(1).getDate() + "\t" + movies.get(1).getImage());
			System.out.println(movies.get(2).getTitle()+ "\t" + movies.get(2).getIdcategory() + "\t" + movies.get(2).getPlot() + "\t" + movies
					.get(2).getRating() + "\t" + movies.get(2).getDate() + "\t" + movies.get(2).getImage());
			System.out.println(movies.get(3).getTitle()+ "\t" + movies.get(3).getIdcategory() + "\t" + movies.get(3).getPlot() + "\t" + movies
					.get(3).getRating() + "\t" + movies.get(3).getDate() + "\t" + movies.get(3).getImage());
			System.out.println(movies.get(4).getTitle()+ "\t" + movies.get(4).getIdcategory() + "\t" + movies.get(4).getPlot() + "\t" + movies
					.get(4).getRating() + "\t" + movies.get(4).getDate() + "\t" + movies.get(4).getImage());
			
			System.out.println("\n");
			
			List<Category> c = new ArrayList<Category>();
			c = CategoryDAO.getAllCategories();
			System.out.println(c.get(0).getIdcategory() + "\t" + c.get(0).getDescription());
			System.out.println(c.get(1).getIdcategory() + "\t" + c.get(1).getDescription());
			System.out.println(c.get(2).getIdcategory() + "\t" + c.get(2).getDescription());
			System.out.println(c.get(3).getIdcategory() + "\t" + c.get(3).getDescription());
			System.out.println(c.get(4).getIdcategory() + "\t" + c.get(4).getDescription());
			
			DBConnection.closeConnection();
	}
}