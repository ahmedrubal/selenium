package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
   static String host ="localhost";
   static String port="3306";
	public static void main(String[] args) throws SQLException {
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+ host + ":" +port+"/world","root","root");
		Statement stm = connect.createStatement();
		ResultSet rs = stm.executeQuery("select*from ahmed");
		while(rs.next()) {
			String get = rs.getString("NAME");
			System.out.println(get);
		}
	

	}

}
