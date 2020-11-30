package movies.model.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import movies.model.dbEntity.Category;

public class CategoryDAO {
	private static Connection conn = null;
	private static Statement stmt = null;
	
	public static List<Category> getAllCategories()
	{
		List<Category> categories = new ArrayList<Category>();
		
		try {
			conn = DBConnection.openConnection();
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from category");
			while(rs.next())
			{
				Category c = new Category();
				
				c.setIdcategory(rs.getInt("idcategory"));
				c.setDescription(rs.getString("description"));
				
				categories.add(c);
			}
			rs.close();
			stmt.close();
			DBConnection.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName() + ":" + e.getMessage());
		}
		return categories;
	}
}
