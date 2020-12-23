import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) throws SQLException{
        System.out.print("Hello, world!");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            //通过DriverManager获取数据库的连接
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String passwd = "137694zqm";
            conn = DriverManager.getConnection(url, user, passwd);

            //通过Connection对象获取Statement对象
            stmt = conn.createStatement();

            //使用Statement执行SQL语句
            rs = stmt.executeQuery("select * from student");

            //操作结果集
            System.out.println("id" + "\t" + "username" + "\t" + "sex" + "\t" + "birthday");
            while(rs.next())
            {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String sex = rs.getString("sex");
                Date birthday = rs.getDate("birthday");
                System.out.println(id + "\t" + username + "\t" + sex + "\t" + birthday);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(rs != null)
            {
                rs.close();
            }
            if(stmt != null)
            {
                stmt.close();
            }
            if(conn != null)
            {
                conn.close();
            }
        }
    }
}
